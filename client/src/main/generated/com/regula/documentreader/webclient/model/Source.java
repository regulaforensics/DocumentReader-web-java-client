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

public class Source {

  /** Machine readable zone (MRZ) */
  public static final String MRZ = "MRZ";

  /** Visual zone */
  public static final String VISUAL = "VISUAL";

  /** Barcode */
  public static final String BARCODE = "BARCODE";

  /** RFID */
  public static final String RFID = "RFID";

  /** Magnetic */
  public static final String MAGNETIC = "MAGNETIC";

  /** External */
  public static final String EXTERNAL = "EXTERNAL";
}
