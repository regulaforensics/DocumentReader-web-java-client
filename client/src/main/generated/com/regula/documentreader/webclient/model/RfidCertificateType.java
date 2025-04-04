/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.6.0
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
 * Enumeration contains a set of constants that define the type of certificate used in the procedure
 * of document security object digital signature verification
 */
@JsonAdapter(RfidCertificateType.Adapter.class)
public enum RfidCertificateType {

  /** Type is not defined */
  UNDEFINED(0),

  /** CSCA */
  CSCA(1),

  /** CSCA-link */
  CSCA_LINK(2),

  /** DS */
  DS(3),

  /** Master List signer */
  MLS(4),

  /** Deviaton List signer */
  DEV_LS(5),

  /** Defect List signer */
  DEF_LS(6),

  /** Black List signer */
  BLS(7);

  private Integer value;

  RfidCertificateType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RfidCertificateType fromValue(Integer value) {
    for (RfidCertificateType b : RfidCertificateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RfidCertificateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final RfidCertificateType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RfidCertificateType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return RfidCertificateType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    RfidCertificateType.fromValue(value);
  }
}
