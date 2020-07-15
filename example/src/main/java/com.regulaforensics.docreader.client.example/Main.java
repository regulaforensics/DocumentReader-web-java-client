package com.regulaforensics.docreader.client.example;


import com.regulaforensics.docreader.client.ApiException;
import com.regulaforensics.docreader.client.api.DocumentReaderApi;
import com.regulaforensics.docreader.client.model.Source;
import com.regulaforensics.docreader.client.model.TextFieldType;
import com.regulaforensics.docreader.client.model.ext.RecognitionParams;
import com.regulaforensics.docreader.client.model.Result;
import com.regulaforensics.docreader.client.model.Scenario;
import com.regulaforensics.docreader.client.model.ext.RecognitionRequest;
import com.regulaforensics.docreader.client.model.ext.ProcessRequestImage;
import com.regulaforensics.docreader.client.model.ext.RecognitionResponse;

import java.io.IOException;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ApiException {

        byte[] imageBytes = readFile("australia_passport.jpg");
        var image = new ProcessRequestImage(imageBytes);

        var requestParams = new RecognitionParams()
                .withScenario(Scenario.FULL_PROCESS)
                .withResultTypeOutput(Result.TEXT, Result.LEXICAL_ANALYSIS);

        RecognitionRequest request = new RecognitionRequest(requestParams, List.of(image));

        var api = new DocumentReaderApi();
        RecognitionResponse response = api.process(request);

        System.out.println(response.text().getField(TextFieldType.DOCUMENT_NUMBER).getValue(Source.MRZ));
        System.out.println(response.text().getFieldValue(TextFieldType.DOCUMENT_NUMBER));
        System.out.println(response.getOriginalResponse().getContainerList().getList().size());
    }

    private static byte[] readFile(String filePath) throws IOException {
        var classLoader = Main.class.getClassLoader();
        return classLoader.getResourceAsStream(filePath).readAllBytes();
    }
}