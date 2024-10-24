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

public class Scenario {

  /** Processing scenario for obtaining MRZ data */
  public static final String MRZ = "Mrz";

  /** Processing scenario for obtaining barcode data */
  public static final String BARCODE = "Barcode";

  /** Processing scenario for detecting document boundaries */
  public static final String LOCATE = "Locate";

  /** Processing scenario for obtaining visual zone OCR results */
  public static final String OCR = "Ocr";

  /** Processing scenario for document type recognition */
  public static final String DOCTYPE = "DocType";

  /** Processing scenario for obtaining MRZ and/or barcode data */
  public static final String MRZ_OR_BARCODE = "MrzOrBarcode";

  /** Processing scenario for detecting document boundaries and/or obtaining MRZ data */
  public static final String MRZ_OR_LOCATE = "MrzOrLocate";

  /** Processing scenario for detecting document boundaries and obtaining MRZ data */
  public static final String MRZ_AND_LOCATE = "MrzAndLocate";

  /** Processing scenario for detecting the document boundaries and obtaining barcode data */
  public static final String BARCODE_AND_LOCATE = "BarcodeAndLocate";

  /** Processing scenario for obtaining MRZ data or visual zone OCR results */
  public static final String MRZ_OR_OCR = "MrzOrOcr";

  /** Processing scenario for obtaining MRZ or barcode or visual zone OCR results */
  public static final String MRZ_OR_BARCODE_OR_OCR = "MrzOrBarcodeOrOcr";

  /**
   * Processing scenario for detecting document boundaries and obtaining MRZ data or visual zone OCR
   * results
   */
  public static final String LOCATE_VISUAL_AND_MRZ_OR_OCR = "LocateVisual_And_MrzOrOcr";

  /** Processing scenario for obtaining all document data */
  public static final String FULL_PROCESS = "FullProcess";

  /** Processing scenario for obtaining all document data and document authentication */
  public static final String FULL_AUTH = "FullAuth";

  /** Processing scenario for obtaining data from registration stamps */
  public static final String RUS_STAMP = "RusStamp";

  /** Processing scenario for obtaining OCR results of any image */
  public static final String OCR_FREE = "OcrFree";

  /** Processing scenario for obtaining bank card data */
  public static final String CREDIT_CARD = "CreditCard";

  /** Scenario for obtaining an original image without any processing */
  public static final String CAPTURE = "Capture";
}
