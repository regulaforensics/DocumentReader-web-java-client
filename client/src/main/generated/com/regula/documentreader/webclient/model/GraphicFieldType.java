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

public class GraphicFieldType {

  /** Document holder photo */
  public static final int PORTRAIT = 201;

  /** Fingerprint of document holder */
  public static final int FINGERPRINT = 202;

  /** Image of the iris of document holder */
  public static final int EYE = 203;

  /** Signature of document holder */
  public static final int SIGNATURE = 204;

  /** Barcode image */
  public static final int BAR_CODE = 205;

  /** Image of document confirming owner citizenship */
  public static final int PROOF_OF_CITIZENSHIP = 206;

  /**
   * Cropped and rotated with perspective compensation (front side) of a document. Single input
   * image can contain multiple document side/pages, which will be returned as separated results.
   * Most coordinates in other types defined on that image.
   */
  public static final int DOCUMENT_FRONT = 207;

  /** Image of the rear side of the document */
  public static final int DOCUMENT_REAR = 208;

  /** Area with dynamic color change */
  public static final int COLOR_DYNAMIC = 209;

  /** Additional Portrait */
  public static final int GHOST_PORTRAIT = 210;

  /** Stamp */
  public static final int STAMP = 211;

  /** Undefined image type */
  public static final int OTHER = 250;

  /** Fingerprint (thumb, left hand) */
  public static final int FINGER_LEFT_THUMB = 300;

  /** Fingerprint (index, left hand) */
  public static final int FINGER_LEFT_INDEX = 301;

  /** Fingerprint (middle, left hand) */
  public static final int FINGER_LEFT_MIDDLE = 302;

  /** Fingerprint (ring, left hand) */
  public static final int FINGER_LEFT_RING = 303;

  /** Fingerprint (little, left hand) */
  public static final int FINGER_LEFT_LITTLE = 304;

  /** Fingerprint (thumb, right hand) */
  public static final int FINGER_RIGHT_THUMB = 305;

  /** Fingerprint (index, right hand) */
  public static final int FINGER_RIGHT_INDEX = 306;

  /** Fingerprint (middle, right hand) */
  public static final int FINGER_RIGHT_MIDDLE = 307;

  /** Fingerprint (ring, right hand) */
  public static final int FINGER_RIGHT_RING = 308;

  /** Fingerprint (little, right hand) */
  public static final int FINGER_RIGHT_LITTLE = 309;

  /** Fingerprint (four without thumb on right hand) */
  public static final int FINGER_RIGHT_FOUR_FINGERS = 313;

  /** Fingerprint (four without thumb on left hand */
  public static final int FINGER_LEFT_FOUR_FINGERS = 314;

  /** Fingerprint (two thumbs) */
  public static final int FINGER_TWO_THUMBS = 315;
}
