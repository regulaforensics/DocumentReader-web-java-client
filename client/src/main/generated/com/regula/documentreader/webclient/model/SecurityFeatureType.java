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

public class SecurityFeatureType {

  /** Blank element */
  public static final int BLANK = 0;

  /** Personalization element */
  public static final int FILL = 1;

  /** Photo */
  public static final int PHOTO = 2;

  /** MRZ */
  public static final int MRZ = 3;

  /** False luminescence */
  public static final int FALSE_LUMINESCENCE = 4;

  /** Hologram (static) */
  public static final int HOLO_SIMPLE = 5;

  /** Hologram (static verify) */
  public static final int HOLO_VERIFY_STATIC = 6;

  /** Hologram (static verify multiple) */
  public static final int HOLO_VERIFY_MULTI_STATIC = 7;

  /** Hologram (dynamic verify) */
  public static final int HOLO_VERIFY_DYNAMIC = 8;

  /** Pattern (non-interrupted) */
  public static final int PATTERN_NOT_INTERRUPTED = 9;

  /** Pattern (non-shifted) */
  public static final int PATTERN_NOT_SHIFTED = 10;

  /** Pattern (same colors) */
  public static final int PATTERN_SAME_COLORS = 11;

  /** Pattern (IR invisible) */
  public static final int PATTERN_IR_INVISIBLE = 12;

  /** Photo size */
  public static final int PHOTO_SIZE_CHECK = 13;

  /** Main vs ghost portrait comparison */
  public static final int PORTRAIT_COMPARISON_VS_GHOST = 14;

  /** Main vs RFID portrait comparison */
  public static final int PORTRAIT_COMPARISON_VS_RFID = 15;

  /** Main vs other page portrait comparison */
  public static final int PORTRAIT_COMPARISON_VS_VISUAL = 16;

  /** Barcode */
  public static final int BARCODE = 17;

  /** Pattern (different line thickness) */
  public static final int PATTERN_DIFFERENT_LINES_THICKNESS = 18;

  /** Main vs live camera portrait comparison */
  public static final int PORTRAIT_COMPARISON_VS_CAMERA = 19;

  /** RFID vs live camera portrait comparison */
  public static final int PORTRAIT_COMPARISON_RFID_VS_CAMERA = 20;

  /** Ghost photo */
  public static final int GHOST_PHOTO = 21;

  /** Clear ghost photo */
  public static final int CLEAR_GHOST_PHOTO = 22;

  /** Invisible object */
  public static final int INVISIBLE_OBJECT = 23;

  /** Low contrast object */
  public static final int LOW_CONTRAST_OBJECT = 24;

  /** Photo color check */
  public static final int PHOTO_COLOR = 25;

  /** Photo squareness */
  public static final int PHOTO_SHAPE = 26;

  /** Photo corners shape */
  public static final int PHOTO_CORNERS = 27;

  /** OCR */
  public static final int OCR = 28;

  /** External vs main portrait comparison */
  public static final int PORTRAIT_COMPARISON_EXT_VS_VISUAL = 29;

  /** External vs RFID portrait comparison */
  public static final int PORTRAIT_COMPARISON_EXT_VS_RFID = 30;

  /** External vs live camera portrait comparison */
  public static final int PORTRAIT_COMPARISON_EXT_VS_CAMERA = 31;

  /** Portrait Depth */
  public static final int LIVENESS_DEPTH = 32;

  /** Micro text */
  public static final int MICRO_TEXT = 33;

  /** Fluorescent Object */
  public static final int FLUORESCENT_OBJECT = 34;

  /** Facial landmarks check */
  public static final int LANDMARK_CHECK = 35;

  /** Facial image presence */
  public static final int FACE_PRESENCE = 36;

  /** Facial image absence */
  public static final int FACE_ABSENCE = 38;

  /** Liveness screen capture. Deprecated. LIVENESS_ELECTRONIC_DEVICE is used instead. */
  public static final int LIVENESS_SCREEN_CAPTURE = 39;

  /** Liveness electronic device */
  public static final int LIVENESS_ELECTRONIC_DEVICE = 40;

  /** Liveness OVI */
  public static final int LIVENESS_OVI = 41;

  /** Barcode size check */
  public static final int BARCODE_SIZE_CHECK = 42;

  /** LASINK */
  public static final int LASINK = 43;

  /** Liveness MLI */
  public static final int LIVENESS_MLI = 44;

  /** Liveness barcode background */
  public static final int LIVENESS_BARCODE_BACKGROUND = 45;

  /** Visual zone portrait image vs. image from barcode */
  public static final int PORTRAIT_COMPARISON_VS_BARCODE = 46;

  /** Image from barcode vs. image from RFID */
  public static final int PORTRAIT_COMPARISON_RFID_VS_BARCODE = 47;

  /** Image from barcode vs. external source image */
  public static final int PORTRAIT_COMPARISON_EXT_VS_BARCODE = 48;

  /** Image from barcode vs. photo from camera */
  public static final int PORTRAIT_COMPARISON_BARCODE_VS_CAMERA = 49;

  /** Digital signature check */
  public static final int CHECK_DIGITAL_SIGNATURE = 50;

  /** Contact chip check */
  public static final int CONTACT_CHIP_CLASSIFICATION = 51;

  /** Head position check */
  public static final int HEAD_POSITION_CHECK = 52;

  /** Black and white copy check */
  public static final int LIVENESS_BLACK_AND_WHITE_COPY_CHECK = 53;
}
