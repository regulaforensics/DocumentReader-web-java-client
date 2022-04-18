/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.3.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class AuthenticityResultType {

  public static final int UV_LUMINESCENCE = 1;

  public static final int IR_B900 = 2;

  public static final int IMAGE_PATTERN = 4;

  public static final int AXIAL_PROTECTION = 8;

  public static final int UV_FIBERS = 16;

  public static final int IR_VISIBILITY = 32;

  public static final int OCR_SECURITY_TEXT = 64;

  public static final int IPI = 128;

  public static final int PHOTO_EMBED_TYPE = 512;

  public static final int HOLOGRAMS = 4096;

  public static final int PHOTO_AREA = 8192;

  public static final int PORTRAIT_COMPARISON = 32768;

  public static final int BARCODE_FORMAT_CHECK = 65536;

  public static final int KINEGRAM = 131072;

  public static final int LETTER_SCREEN = 262144;
}
