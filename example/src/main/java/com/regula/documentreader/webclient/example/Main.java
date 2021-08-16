package com.regula.documentreader.webclient.example;


import com.google.gson.reflect.TypeToken;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.JSON;
import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.model.CheckResult;
import com.regula.documentreader.webclient.model.LexicalAnalysisResult;
import com.regula.documentreader.webclient.model.Light;
import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.Scenario;
import com.regula.documentreader.webclient.model.SecurityFeatureType;
import com.regula.documentreader.webclient.model.Source;
import com.regula.documentreader.webclient.model.ext.ProcessRequestImage;
import com.regula.documentreader.webclient.model.ext.RecognitionParams;
import com.regula.documentreader.webclient.model.ext.RecognitionRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Type;
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

        var responseAsBytes = readFile("response.json");
        var serde = new JSON();
        Type responseType = new TypeToken<ProcessResponse>() {
        }.getType();
        ProcessResponse originalResponse = serde.deserialize(new String(responseAsBytes), responseType);
        RecognitionResponse response = new RecognitionResponse(originalResponse);


        System.out.println("-----------------------------------------------------------------");

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
