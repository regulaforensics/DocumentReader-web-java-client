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

public class Result {

  /**
   * Contains cropped and rotated with perspective compensation image of document. Single input
   * image can contain multiple document side/pages, which will be returned as separated results.
   * Most of coordinates in other types defined on that image
   */
  public static final int DOCUMENT_IMAGE = 1;

  /** Contains image quality check results */
  public static final int IMAGE_QUALITY = 30;

  /** Contains check statuses with details, grouped by source */
  public static final int STATUS = 33;

  /**
   * Contains document textual fields from all sources (mrz, rfid, visual, barcode) with validity
   * and cross-source compare checks
   */
  public static final int TEXT = 36;

  /** Contains images from all document sources (mrz, rfid, visual, barcode) */
  public static final int IMAGES = 37;

  /** Contains MRZ OCR results */
  public static final int MRZ_TEXT = 3;

  /** Contains Visual zone OCR results */
  public static final int VISUAL_TEXT = 17;

  /** Contains barcode parsing result with text fields */
  public static final int BARCODE_TEXT = 18;

  /** Contains RFID parsing result with text fields */
  public static final int RFID_TEXT = 102;

  /**
   * Contains lexical data analysis results that allow you to compare MRZ OCR results, Visual zone
   * OCR results, barcodes and RFID chip data for an additional assessment of the authenticity of
   * the document (this is an old format, better use TEXT type)
   */
  public static final int LEXICAL_ANALYSIS = 15;

  /** Contains cropped graphic fields from Visual zone */
  public static final int VISUAL_GRAPHICS = 6;

  /** Contains barcode parsing result with graphic fields */
  public static final int BARCODE_GRAPHICS = 19;

  /** Contains RFID parsing result with graphic fields */
  public static final int RFID_GRAPHICS = 103;

  /** Contains list of document type candidates with their probabilities and descriptions */
  public static final int DOCUMENT_TYPE_CANDIDATES = 8;

  /** Contains description of determined document type, if any */
  public static final int DOCUMENT_TYPE = 9;

  /** Contains result of document authenticity checks */
  public static final int AUTHENTICITY = 20;

  /** Contains information about document position on the input image, its center, angle, etc */
  public static final int DOCUMENT_POSITION = 85;

  /** Contains raw information about barcodes on the input image */
  public static final int BARCODES = 5;

  /** Contains license */
  public static final int LICENSE = 50;

  /** Contains encrypted ResultContainerList */
  public static final int ENCRYPTED_RCL = 49;
}
