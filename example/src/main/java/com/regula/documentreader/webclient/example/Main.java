package com.regula.documentreader.webclient.example;


import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.model.*;
import com.regula.documentreader.webclient.model.ext.RecognitionParams;
import com.regula.documentreader.webclient.model.ext.RecognitionRequest;
import com.regula.documentreader.webclient.model.ext.ProcessRequestImage;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

import javax.annotation.Nullable;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static com.regula.documentreader.webclient.model.GraphicFieldType.DOCUMENT_FRONT;
import static com.regula.documentreader.webclient.model.GraphicFieldType.PORTRAIT;
import static com.regula.documentreader.webclient.model.TextFieldType.DOCUMENT_NUMBER;

public class Main {
    public static final String API_BASE_PATH = "API_BASE_PATH";
    public static final String TEST_LICENSE = "TEST_LICENSE";


    public static void main(String[] args) throws IOException, ApiException {

        var apiBaseUrl = System.getenv(API_BASE_PATH);
        if (apiBaseUrl == null) {
            apiBaseUrl = "http://localhost:8080";
        }
        var licenseFromEnv = System.getenv(TEST_LICENSE); // optional, used here only for smoke test purposes
        var licenseFromFile = readFile("regula.license");


        byte[] imageBytes = readFile("australia_passport.jpg");
        var image = new ProcessRequestImage(imageBytes, Light.WHITE);

        var requestParams = new RecognitionParams()
                .withScenario(Scenario.FULL_PROCESS)
                .withResultTypeOutput(Result.STATUS, Result.TEXT, Result.IMAGES, Result.DOCUMENT_TYPE);

        RecognitionRequest request = new RecognitionRequest(requestParams, List.of(image));

        var api = new DocumentReaderApi(apiBaseUrl);
        if (licenseFromEnv != null) api.setLicense(licenseFromEnv);
        if (licenseFromFile != null) api.setLicense(licenseFromFile);

        RecognitionResponse response = api.process(request);

        var status = response.status();
        var docOverallStatus = status.getOverallStatus() == CheckResult.OK ? "valid" : "not valid";
        var docOpticalTextStatus = status.getDetailsOptical().getText();

        var docNumberField = response.text().getField(DOCUMENT_NUMBER);
        var docNumberFieldByName = response.text().getFieldByName("Document Number");

        if (docNumberField != docNumberFieldByName) {
            throw new RuntimeException("getField() and getFieldByName() must return the same result");
        }

        var docNumberVisual = docNumberField.getValue(Source.VISUAL);
        var docNumberMrz = docNumberField.getValue(Source.MRZ);
        var docNumberVisualValidity = docNumberField.sourceValidity(Source.VISUAL);
        var docNumberMrzValidity = docNumberField.sourceValidity(Source.MRZ);
        var docNumberMrzVisualMatching = docNumberField.crossSourceComparison(Source.MRZ, Source.VISUAL);


        System.out.println("-----------------------------------------------------------------");
        System.out.format("           Document Overall Status: %s%n", docOverallStatus);
        System.out.format("            Document Number Visual: %s%n", docNumberVisual);
        System.out.format("               Document Number MRZ: %s%n", docNumberMrz);
        System.out.format("Validity Of Document Number Visual: %s%n", docNumberVisualValidity);
        System.out.format("   Validity Of Document Number MRZ: %s%n", docNumberMrzValidity);
        System.out.format("      MRZ-Visual values comparison: %s%n", docNumberMrzVisualMatching);
        System.out.format("-----------------------------------------------------------------");

        var documentImage = response.images().getField(DOCUMENT_FRONT).getValue();
        var portraitField = response.images().getField(PORTRAIT);
        var portraitFromVisual = portraitField.getValue(Source.VISUAL);
        saveFile("document-image.jpg", documentImage);
        saveFile("portrait.jpg", portraitFromVisual);

        // how to get low lvl individual results
        LexicalAnalysisResult lexResult = response.resultByType(Result.LEXICAL_ANALYSIS);
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
