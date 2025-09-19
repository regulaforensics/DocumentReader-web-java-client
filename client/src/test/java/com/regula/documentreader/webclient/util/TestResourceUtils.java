package com.regula.documentreader.webclient.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

public class TestResourceUtils {

  private TestResourceUtils() {
    throw new IllegalStateException("Utility class");
  }

  public static List<String> getResourceFilePaths(String path, Class<?> contextClass)
      throws IOException, URISyntaxException {
    URL resourceUrl = contextClass.getClassLoader().getResource(path);
    if (resourceUrl == null) {
      System.err.println("The resource folder was not found: " + path);
      return Collections.emptyList();
    }

    if ("file".equals(resourceUrl.getProtocol())) {
      return Files.walk(Paths.get(resourceUrl.toURI()))
          .filter(Files::isRegularFile)
          .filter(p -> p.toString().toLowerCase().endsWith(".json"))
          .map(p -> path + "/" + p.getFileName().toString())
          .collect(Collectors.toList());
    }

    if ("jar".equals(resourceUrl.getProtocol())) {
      String jarPath = resourceUrl.getPath().substring(5, resourceUrl.getPath().indexOf("!"));
      try (JarFile jar = new JarFile(jarPath)) {
        return jar.stream()
            .map(java.util.jar.JarEntry::getName)
            .filter(name -> name.startsWith(path + "/") && name.toLowerCase().endsWith(".json"))
            .collect(Collectors.toList());
      }
    }
    throw new UnsupportedOperationException("Couldn't read resources from " + resourceUrl);
  }

  public static InputStream getResourceAsStream(String resource, Class<?> contextClass) {
    InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
    return in == null ? contextClass.getResourceAsStream(resource) : in;
  }
}
