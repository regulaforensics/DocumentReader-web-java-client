package com.regula.documentreader.webclient.validation;

import com.regula.documentreader.webclient.api.DocumentReaderApi;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;
import com.regula.documentreader.webclient.util.TestResourceUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApiValidationTest {

  private DocumentReaderApi documentReaderApi;

  @BeforeEach
  void setUp() {
    documentReaderApi = new DocumentReaderApi("http://nightly-api.regula.local");
  }

  @Test
  public void validateAllRequests() throws IOException, URISyntaxException {
    final String requestsFolderPath = "requests";

    List<String> requestFilePaths =
        TestResourceUtils.getResourceFilePaths(requestsFolderPath, ApiValidationTest.class);
    Assertions.assertFalse(
        requestFilePaths.isEmpty(), "No JSON request files found in " + requestsFolderPath);

    System.out.println("Found " + requestFilePaths.size() + " request files for testing.");

    for (String filePath : requestFilePaths) {
      System.out.println("Request Testing: " + filePath);

      byte[] requestBytes;
      try (InputStream is =
          TestResourceUtils.getResourceAsStream(filePath, ApiValidationTest.class)) {
        if (is == null) {
          System.err.println("Couldn't read the file: " + filePath);
          Assertions.fail("Couldn't read the request file: " + filePath);
          continue;
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = is.read(data, 0, data.length)) != -1) {
          buffer.write(data, 0, nRead);
        }
        buffer.flush();
        requestBytes = buffer.toByteArray();
      }

      ProcessParams currentProcessParams = null;
      try {
        RecognitionResponse response =
            documentReaderApi.process(requestBytes, currentProcessParams);

        Assertions.assertNotNull(
            response, "The response should not be null for the file: " + filePath);

        System.out.println("Success: Request " + filePath + " processed.");

      } catch (Exception e) {
        System.err.println("Request processing ERROR " + filePath + ": " + e.getMessage());
        e.printStackTrace();
        Assertions.fail("Request processing ERROR " + filePath, e);
      }
      System.out.println("------------------------------------");
    }
  }
}
