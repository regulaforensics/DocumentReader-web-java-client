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

/** Document data sources */
@JsonAdapter(Source.Adapter.class)
public enum Source {

  /** Machine readable zone (MRZ) */
  MRZ("MRZ"),

  /** Visual zone */
  VISUAL("VISUAL"),

  /** Barcode */
  BARCODE("BARCODE"),

  /** RFID */
  RFID("RFID"),

  /** Magnetic */
  MAGNETIC("MAGNETIC"),

  /** External */
  EXTERNAL("EXTERNAL");

  private String value;

  Source(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Source fromValue(String value) {
    for (Source b : Source.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Source> {
    @Override
    public void write(final JsonWriter jsonWriter, final Source enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Source read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Source.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Source.fromValue(value);
  }
}
