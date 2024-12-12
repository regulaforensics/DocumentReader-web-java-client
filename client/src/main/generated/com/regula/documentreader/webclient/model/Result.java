/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class Result {

  /**
   * Contains cropped and rotated with perspective compensation image of document. Single input
   * image can contain multiple document side/pages, which will be returned as separated results.
   * Most of coordinates in other types defined on that image
   */
  public static final int DOCUMENT_IMAGE = 1;

  /** Contains MRZ OCR results */
  public static final int MRZ_TEXT = 3;

  /** Contains raw information about barcodes on the input image */
  public static final int BARCODES = 5;

  /** Contains cropped graphic fields from Visual zone */
  public static final int VISUAL_GRAPHICS = 6;

  /** Contains list of document type candidates with their probabilities and descriptions */
  public static final int DOCUMENT_TYPE_CANDIDATES = 8;

  /** Contains description of determined document type, if any */
  public static final int DOCUMENT_TYPE = 9;

  /**
   * Contains lexical data analysis results that allow you to compare MRZ OCR results, Visual zone
   * OCR results, barcodes and RFID chip data for an additional assessment of the authenticity of
   * the document (this is an old format, better use TEXT type)
   */
  public static final int LEXICAL_ANALYSIS = 15;

  /** Contains raw uncropped images */
  public static final int RAW_UNCROPPED_IMAGE = 16;

  /** Contains Visual zone OCR results */
  public static final int VISUAL_TEXT = 17;

  /** Contains barcode parsing result with text fields */
  public static final int BARCODE_TEXT = 18;

  /** Contains barcode parsing result with graphic fields */
  public static final int BARCODE_GRAPHICS = 19;

  /** Contains result of document authenticity checks */
  public static final int AUTHENTICITY = 20;

  /** Contains image quality check results */
  public static final int IMAGE_QUALITY = 30;

  /** Contains check statuses with details, grouped by source */
  public static final int STATUS = 33;

  /** Contains result of portraits comparison */
  public static final int PORTRAIT_COMPARISON = 34;

  /**
   * Contains document textual fields from all sources (mrz, rfid, visual, barcode) with validity
   * and cross-source compare checks
   */
  public static final int TEXT = 36;

  /** Contains images from all document sources (mrz, rfid, visual, barcode) */
  public static final int IMAGES = 37;

  /** Contains result of fingerprints comparison */
  public static final int FINGERPRINT_COMPARISON = 39;

  /** Contains encrypted ResultContainerList */
  public static final int ENCRYPTED_RCL = 49;

  /** Contains license */
  public static final int LICENSE = 50;

  /** Contains information about document position on the input image, its center, angle, etc */
  public static final int DOCUMENT_POSITION = 85;

  /** Contains RFID raw data */
  public static final int RFID_RAW_DATA = 101;

  /** Contains RFID text results */
  public static final int RFID_TEXT = 102;

  /** Contains RFID graphic results */
  public static final int RFID_GRAPHICS = 103;

  /** Contains RFID binary data */
  public static final int RFID_BINARY_DATA = 104;

  /** Contains RFID original graphics data */
  public static final int RFID_ORIGINAL_GRAPHICS = 105;

  /** Digital Travel Credential data */
  public static final int DTC_VC = 109;
}
