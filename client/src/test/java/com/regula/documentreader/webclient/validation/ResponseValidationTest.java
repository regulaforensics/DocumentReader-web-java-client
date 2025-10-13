package com.regula.documentreader.webclient.validation;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.util.TestResourceUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseValidationTest {

  @Test
  public void validateAllJsonSamples() throws IOException, URISyntaxException {
    final String resourceFolderPath = "responses";

    List<String> jsonFilePaths =
        TestResourceUtils.getResourceFilePaths(resourceFolderPath, ResponseValidationTest.class);
    AtomicInteger failureCount = new AtomicInteger(0);
    List<String> failedFiles = new ArrayList<>();

    System.out.println(jsonFilePaths.size() + " files found for validation");
    System.out.println("--- Start validation ---");

    for (String path : jsonFilePaths) {
      System.out.println("File validation: " + path);
      try (InputStream is =
          TestResourceUtils.getResourceAsStream(path, ResponseValidationTest.class)) {
        if (is == null) {
          System.err.println("Error: can't read the file " + path);
          failureCount.incrementAndGet();
          failedFiles.add(path + " (not found)");
          continue;
        }

        String jsonContent =
            new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));

        JsonElement jsonElement = JsonParser.parseString(jsonContent);

        ProcessResponse.fromJson(jsonContent);
      } catch (JsonSyntaxException e) {
        System.err.println(
            "Critical error: file " + path + " contains invalid JSON. " + e.getMessage());
        failureCount.incrementAndGet();
        failedFiles.add(path + " (JSON syntax error)");
      } catch (Exception e) {
        System.err.println("Validation error in " + path + ": " + e.getMessage());
        e.printStackTrace();
        failureCount.incrementAndGet();
        failedFiles.add(path + " -> " + e.getMessage());
      }
    }

    System.out.println("--- Validation end ---");
    int failures = failureCount.get();
    if (failures > 0) {
      System.err.println("\nProblems found in " + failures + " files:");
      failedFiles.forEach(System.err::println);
      Assertions.fail(
          "Critical errors have been found in " + failures + " JSON files. See the log above.");
    } else {
      System.out.println(
          "\nAll files have been successfully processed (check the log for warnings from the validator).");
    }
  }
}
