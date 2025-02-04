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

/** 0 - result is negative; 1 - result is positive; 2 - сheck was not performed */
@JsonAdapter(CheckResult.Adapter.class)
public enum CheckResult {

  /** Check was performed and result is NEGATIVE */
  ERROR(0),

  /** Check was performed and result is POSITIVE */
  OK(1),

  /** Check was NOT PERFORMED */
  WAS_NOT_DONE(2);

  private Integer value;

  CheckResult(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CheckResult fromValue(Integer value) {
    for (CheckResult b : CheckResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CheckResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final CheckResult enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CheckResult read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CheckResult.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    CheckResult.fromValue(value);
  }
}
