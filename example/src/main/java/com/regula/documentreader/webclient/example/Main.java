package com.regula.documentreader.webclient.example;


import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.model.*;
import com.regula.documentreader.webclient.model.ext.RecognitionParams;
import com.regula.documentreader.webclient.model.ext.RecognitionRequest;
import com.regula.documentreader.webclient.model.ext.ProcessRequestImage;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

import java.io.IOException;

import java.util.List;

import static com.regula.documentreader.webclient.model.TextFieldType.DOCUMENT_NUMBER;

public class Main {
    public static final String API_BASE_PATH = "API_BASE_PATH";
    public static final String TEST_LICENSE = "TEST_LICENSE";

    
    public static void main(String[] args) throws IOException, ApiException {

        var apiBaseUrl = System.getenv(API_BASE_PATH);
        if (apiBaseUrl == null) {
            apiBaseUrl = "http://localhost:8080";
        }
        var license = System.getenv(TEST_LICENSE); // optional, used here only for smoke test purpouses
        

        byte[] imageBytes = readFile("australia_passport.jpg");
        var image = new ProcessRequestImage(imageBytes, Light.WHITE);

        var requestParams = new RecognitionParams()
                .withScenario(Scenario.FULL_PROCESS)
                .withResultTypeOutput(Result.STATUS, Result.TEXT, Result.LEXICAL_ANALYSIS, 37);

        RecognitionRequest request = new RecognitionRequest(requestParams, List.of(image));

        var api = new DocumentReaderApi(apiBaseUrl);
        api.setLicense(license); // used here only for smoke test purpouses, most of clinets will attach transaction on server side

        RecognitionResponse response = api.process(request);

        var status = response.status();
        var docOverallStatus = status.getComplete() == CheckResult.OK ? "valid" : "not valid";
        var docOpticalTextStatus = status.getDetailsOptical().getText();

        var docNumberField = response.text().getField(DOCUMENT_NUMBER);
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

        // how to get low lvl individual results
        LexicalAnalysisResult lexResult = response.resultByType(Result.LEXICAL_ANALYSIS);
    }

    private static byte[] readFile(String filePath) throws IOException {
        var classLoader = Main.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath).readAllBytes();
    }
}
