/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DocumentTypeRecognitionResult */
@JsonAdapter(DocumentTypeRecognitionResult.Adapter.class)
public enum DocumentTypeRecognitionResult {

  /** Document type determined. The first element in candidates array is recognition result */
  OK(0),

  /** Document type was not determined. Ongoing processing is not possible */
  UNKNOWN(15),

  /**
   * To determine document type user should provide more images with different light sources (UV,
   * for example)
   */
  NEED_MORE_IMAGES(29);

  private Integer value;

  DocumentTypeRecognitionResult(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentTypeRecognitionResult fromValue(Integer value) {
    for (DocumentTypeRecognitionResult b : DocumentTypeRecognitionResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentTypeRecognitionResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentTypeRecognitionResult enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentTypeRecognitionResult read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return DocumentTypeRecognitionResult.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    DocumentTypeRecognitionResult.fromValue(value);
  }
}
