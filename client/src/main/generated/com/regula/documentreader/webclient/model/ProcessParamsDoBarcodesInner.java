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

/** Enumeration contains the types of barcodes that can be processed */
@JsonAdapter(ProcessParamsDoBarcodesInner.Adapter.class)
public enum ProcessParamsDoBarcodesInner {

  /** Unknown */
  UNKNOWN("bct_unknown"),

  /** Code 128 */
  CODE128("bct_Code128"),

  /** Code 39 */
  CODE39("bct_Code39"),

  /** EAN-8 */
  EAN8("bct_EAN8"),

  /** ITF */
  ITF("bct_ITF"),

  /** PDF417 */
  PDF417("bct_PDF417"),

  /** STF */
  STF("bct_STF"),

  /** MTF */
  MTF("bct_MTF"),

  /** IATA */
  IATA("bct_IATA"),

  /** Codabar */
  CODABAR("bct_CODABAR"),

  /** UPC-A */
  UPCA("bct_UPCA"),

  /** Code 93 */
  CODE93("bct_CODE93"),

  /** UPC-E */
  UPCE("bct_UPCE"),

  /** EAN-13 */
  EAN13("bct_EAN13"),

  /** QR code */
  QRCODE("bct_QRCODE"),

  /** Aztec code */
  AZTEC("bct_AZTEC"),

  /** Datamatrix */
  DATAMATRIX("bct_DATAMATRIX"),

  /** All 1D barcodes */
  ALL_1D("bct_ALL_1D"),

  /** Code 11 */
  CODE11("bct_Code11"),

  /** JAB code */
  JABCODE("bct_JABCODE");

  private String value;

  ProcessParamsDoBarcodesInner(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProcessParamsDoBarcodesInner fromValue(String value) {
    for (ProcessParamsDoBarcodesInner b : ProcessParamsDoBarcodesInner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProcessParamsDoBarcodesInner> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProcessParamsDoBarcodesInner enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProcessParamsDoBarcodesInner read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProcessParamsDoBarcodesInner.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ProcessParamsDoBarcodesInner.fromValue(value);
  }
}
