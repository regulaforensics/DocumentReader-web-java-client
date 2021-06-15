/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

public class DocumentTypeRecognitionResult {

  /** Document type determined. The first element in candidates array is recognition result */
  public static final int OK = 0;

  /** Document type was not determined. Ongoing processing is not possible */
  public static final int UNKNOWN = 15;

  /**
   * To determine document type user should provide more images with different light sources (UV,
   * for example)
   */
  public static final int NEED_MORE_IMAGES = 29;
}
