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

/**
 * Enumeration contains a set of constants that define the type of authentication or secure data
 * access procedure
 */
@JsonAdapter(RfidAccessControlProcedureType.Adapter.class)
public enum RfidAccessControlProcedureType {

  /** Type is not defined */
  UNDEFINED(0),

  /** BAC/BAP */
  BAC(1),

  /** PACE */
  PACE(2),

  /** CA */
  CA(3),

  /** TA */
  TA(4),

  /** AA */
  AA(5),

  /** RI */
  RI(6),

  /** Card info */
  CARD_INFO(10);

  private Integer value;

  RfidAccessControlProcedureType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RfidAccessControlProcedureType fromValue(Integer value) {
    for (RfidAccessControlProcedureType b : RfidAccessControlProcedureType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RfidAccessControlProcedureType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RfidAccessControlProcedureType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RfidAccessControlProcedureType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return RfidAccessControlProcedureType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    RfidAccessControlProcedureType.fromValue(value);
  }
}
