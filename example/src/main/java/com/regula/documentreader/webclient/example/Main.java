package com.regula.documentreader.webclient.example;


import static com.regula.documentreader.webclient.model.TextFieldType.DOCUMENT_NUMBER;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.LexicalAnalysisResult;
import com.regula.documentreader.webclient.model.Light;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.Scenario;
import com.regula.documentreader.webclient.model.Source;
import com.regula.documentreader.webclient.model.TextField;
import com.regula.documentreader.webclient.model.ext.ProcessRequestImage;
import com.regula.documentreader.webclient.model.ext.RecognitionParams;
import com.regula.documentreader.webclient.model.ext.RecognitionRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.annotation.Nullable;

public class Main {
    public static final String API_BASE_PATH = "API_BASE_PATH";
    public static final String TEST_LICENSE = "TEST_LICENSE";

    public static void main(String[] args) throws IOException, ApiException {

        var apiBaseUrl = System.getenv(API_BASE_PATH);
        if (apiBaseUrl == null) {
            apiBaseUrl = "https://api.regulaforensics.com";
        }
        var licenseFromEnv = System.getenv(TEST_LICENSE); // optional, used here only for smoke test purposes
        var licenseFromFile = readFile("regula.license");


        byte[] whitePage0 = readFile("WHITE.jpg");

        var whitePageRequestImage = new ProcessRequestImage(whitePage0, Light.WHITE, 0);

        var requestParams = new RecognitionParams()
                .withScenario(Scenario.FULL_PROCESS)
//                    .withResultTypeOutput(
//                            // actual results
//                            Result.STATUS, Result.TEXT, Result.IMAGES,
//                            Result.DOCUMENT_TYPE, Result.DOCUMENT_TYPE_CANDIDATES, Result.IMAGE_QUALITY,
//                            Result.DOCUMENT_POSITION,
//                            // legacy results
//                            Result.MRZ_TEXT, Result.VISUAL_TEXT, Result.BARCODE_TEXT, Result.RFID_TEXT,
//                            Result.VISUAL_GRAPHICS, Result.BARCODE_GRAPHICS, Result.RFID_GRAPHICS,
//                            Result.LEXICAL_ANALYSIS
//                    )
                .withAlreadyCropped(true);

        RecognitionRequest request = new RecognitionRequest(
                requestParams, List.of(whitePageRequestImage)
        );


        String finalApiBaseUrl = apiBaseUrl;

        new Thread(() -> {
            var api = new DocumentReaderApi(finalApiBaseUrl);

            // Uncomment one of the lines below if you want to transfer the license with each request
//                if (licenseFromEnv != null) api.setLicense(licenseFromEnv);
//                if (licenseFromFile != null) api.setLicense(licenseFromFile);

            var info = api.health();
            System.out.println();
            System.out.format(
                    "-----------------------------------------------------------------" + "\n"
                            + "Web API version: " + info.getVersion() + "\n"
                            + "-----------------------------------------------------------------");
            RecognitionResponse response = api.process(request);
            var requestJson = request.json();
            var responseJson = response.json();

            // to send raw request(ex encrypted one) with overriding processing params here use next api
            // RecognitionResponse response = api.process(request, requestParams);

            var status = response.status();
            var docOverallStatus = status.getOverallStatus() == CheckResult.OK ? "valid" : "not valid";
            var docOpticalTextStatus = status.getDetailsOptical().getText();

            var docType = response.documentType() == null ? "Unknown" : response.documentType().getDocumentName();

            var docNumberField = response.text().getField(DOCUMENT_NUMBER);
            var docNumberFieldByName = response.text().getField("Document Number");

            var docNumberVisual = docNumberField.getValue(Source.VISUAL);
            var docNumberMrz = docNumberField.getValue(Source.MRZ);
            var docNumberVisualValidity = docNumberField.sourceValidity(Source.VISUAL);
            var docNumberMrzValidity = docNumberField.sourceValidity(Source.MRZ);
            var docNumberMrzVisualMatching = docNumberField.crossSourceComparison(Source.MRZ, Source.VISUAL);

//                var docAuthenticity = response.authenticity();

//                var docIRB900 = docAuthenticity.irB900Checks();
//                var docIRB900Blank = docIRB900.checksByElement(SecurityFeatureType.BLANK);

//                var docImagePattern = docAuthenticity.imagePatternChecks();
//                var docImagePatternBlank = docImagePattern.checksByElement(SecurityFeatureType.BLANK);

            System.out.format("-----------------------------------------------------------------" + "\n"
                    + "Document Type: " + docType + "\n"
                    + "Document Overall Status: " + docOverallStatus + "\n"
                    + "Document Number Visual: " + docNumberVisual + "\n"
                    + "Document Number MRZ: " + docNumberMrz + "\n"
                    + "Validity Of Document Number Visual: " + docNumberVisualValidity + "\n"
                    + "Validity Of Document Number MRZ: " + docNumberMrzValidity + "\n"
                    + "MRZ-Visual values comparison: " + docNumberMrzVisualMatching + "\n"
                    + "-----------------------------------------------------------------");

            if (response.text() != null) {
                for (TextField field : response.text().getFieldList()) {
                    System.out.format(
                            "Field: " + " "
                                    + field.getFieldName() + " "
                                    + "Value: " + " "
                                    + field.getValueList().get(0).getValue() + " "
                                    + "Source: " + field.getValueList().get(0).getSource()
                                    + "\n");
                }
                System.out.format("---------------------------------------------------------------");
            } else {
                System.out.format("                       NO TEXT DATA");
                System.out.format("---------------------------------------------------------------");
            }

//                var documentImage = response.images().getField(DOCUMENT_FRONT).getValue();
//                var portraitField = response.images().getField(PORTRAIT);
//                var portraitFromVisual = portraitField.getValue(Source.VISUAL);
//                saveFile("document-image.jpg", documentImage);
//                saveFile("portrait.jpg", portraitFromVisual);

            // how to get low lvl individual results
            LexicalAnalysisResult lexResult = response.resultByType(Result.LEXICAL_ANALYSIS);

        }).start();
    }

    @Nullable
    private static byte[] readFile(String filePath) throws IOException {
        var inputStream = Main.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream != null) {
            return inputStream.readAllBytes();
        }
        return null;
    }

    private static void saveFile(String filePath, byte[] data) throws IOException {
        Files.write(Path.of(filePath), data);
    }
}
