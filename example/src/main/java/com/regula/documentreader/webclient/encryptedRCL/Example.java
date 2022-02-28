package com.regula.documentreader.webclient.encryptedRCL;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.example.Main;
import com.regula.documentreader.webclient.model.*;
import com.regula.documentreader.webclient.model.ext.*;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Base64;

import static com.regula.documentreader.webclient.model.GraphicFieldType.DOCUMENT_FRONT;
import static com.regula.documentreader.webclient.model.GraphicFieldType.PORTRAIT;
import static com.regula.documentreader.webclient.model.TextFieldType.DOCUMENT_NUMBER;

public class Example {
    public static final String API_BASE_PATH = "API_BASE_PATH";
    public static final String TEST_LICENSE = "TEST_LICENSE";

    public static void main(String[] args) throws IOException, UnsupportedEncodingException {

        var apiBaseUrl = System.getenv(API_BASE_PATH);
        if (apiBaseUrl == null) {
            apiBaseUrl = "https://api.regulaforensics.com";
        }
        var licenseFromEnv = System.getenv(TEST_LICENSE); // optional, used here only for smoke test purposes
        var licenseFromFile = readFile("regula.license");

        byte[] licenseBase64 = readFile("license.bin");
        byte[] encryptedRCLBase64 = readFile("encrypted-rcl.bin");

        var license = new ProcessRequestLicense(licenseBase64, 0, 0, 0);
        var encryptedRCL = new EncryptedRCLRequest(encryptedRCLBase64, 0, 0, 0);

        var containerList = new ContainerList();
        containerList.setList(List.of(license, encryptedRCL));

        var requestParams = new RecognitionParams()
                .withScenario(Scenario.FULL_PROCESS)
                .withDoublePageSpread(true)
                .withMeasureSystem(0)
                .withDateFormat("M/d/yyyy")
                .withAlreadyCropped(true);

        RecognitionRequest request = new RecognitionRequest(
                requestParams, containerList);

        var api = new DocumentReaderApi(apiBaseUrl);
        if (licenseFromEnv != null) api.setLicense(licenseFromEnv);
        if (licenseFromFile != null) api.setLicense(licenseFromFile);

        var info = api.ping();
        System.out.println("-----------------------------------------------------------------");
        System.out.format("Web API version %s%n", info.getVersion());

        RecognitionResponse response = api.process(request);
        // to send raw request(ex encrypted one) with overriding processing params here use next api
        // RecognitionResponse response = api.process(request, requestParams);

        var status = response.status();
        var docOverallStatus = status.getOverallStatus() == CheckResult.OK ? "valid" : "not valid";
        var docOpticalTextStatus = status.getDetailsOptical().getText();

        var docNumberField = response.text().getField(DOCUMENT_NUMBER);
        var docNumberFieldByName = response.text().getField("Document Number");

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
        System.exit(0);
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
