/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class BarcodeType {

  /** Unknown type */
  public static final int UNKNOWN = 0;

  /** One-dimensional bar-code, ISO 15417 (ANSI/AIM BC4-1999 Code 128) */
  public static final int CODE128 = 1;

  /** One-dimensional bar-code, ISO 16388 (ANSI/AIM BC1-1995 Code 39) */
  public static final int CODE39 = 2;

  /** One-dimensional bar-code, EAN8, ISO 15418 */
  public static final int EAN8 = 3;

  /**
   * One-dimensional bar-code, Interleaved 2 of 5, ISO 16390 (ANSI/AIM BC2-1995 Interleaved 2 of 5)
   */
  public static final int ITF = 4;

  /** Two-dimensional bar-code, ISO 15438 (AIM USS PDF417) */
  public static final int PDF417 = 5;

  /** One-dimensional bar-code, Standard 2 of 5 (Industrial) */
  public static final int STF = 6;

  /** One-dimensional bar-code, Matrix 2 of 5 */
  public static final int MTF = 7;

  /** One-dimensional bar-code, IATA 2 of 5 (Airline) */
  public static final int IATA = 8;

  /** One-dimensional bar-code, (ANSI/AIM BC3-1995, USS - Codabar) */
  public static final int CODABAR = 9;

  /** One-dimensional bar-code, UPC-A */
  public static final int UPCA = 10;

  /** One-dimensional bar-code, (ANSI/AIM BC5-1995, USS - Code 93) */
  public static final int CODE93 = 11;

  /** One-dimensional bar-code, UPC-E */
  public static final int UPCE = 12;

  /** One-dimensional bar-code, EAN13, ISO 15418 */
  public static final int EAN13 = 13;

  /** Two-dimensional QRCODE bar-code */
  public static final int QRCODE = 14;

  /** Two-dimensional AZTEC bar-code */
  public static final int AZTEC = 15;

  /** Two-dimensional DATAMATRIX bar-code */
  public static final int DATAMATRIX = 16;

  /** Type for internal use, representing all 1D bar-codes */
  public static final int ALL_1D = 17;

  /** One-dimensional bar-code CODE11 */
  public static final int CODE11 = 18;

  /** JAB code */
  public static final int JABCODE = 19;

  /** For internal use */
  public static final int END = 20;
}
