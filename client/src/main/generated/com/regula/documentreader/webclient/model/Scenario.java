/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.8.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class Scenario {

  public static final String MRZ = "Mrz";

  public static final String BARCODE = "Barcode";

  public static final String LOCATE = "Locate";

  public static final String OCR = "Ocr";

  public static final String DOCTYPE = "DocType";

  public static final String MRZ_OR_BARCODE = "MrzOrBarcode";

  public static final String MRZ_OR_LOCATE = "MrzOrLocate";

  public static final String MRZ_AND_LOCATE = "MrzAndLocate";

  public static final String MRZ_OR_OCR = "MrzOrOcr";

  public static final String MRZ_OR_BARCODE_OR_OCR = "MrzOrBarcodeOrOcr";

  public static final String LOCATE_VISUAL_AND_MRZ_OR_OCR = "LocateVisual_And_MrzOrOcr";

  public static final String FULL_PROCESS = "FullProcess";

  public static final String FULL_AUTH = "FullAuth";

  public static final String ID3RUS = "Id3Rus";

  public static final String RUS_STAMP = "RusStamp";

  public static final String OCR_FREE = "OcrFree";

  public static final String CREDIT_CARD = "CreditCard";

  public static final String CAPTURE = "Capture";
}
