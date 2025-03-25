/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.auth;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.Pair;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface Authentication {
  /**
   * Apply authentication settings to header and query params.
   *
   * @param queryParams List of query parameters
   * @param headerParams Map of header parameters
   * @param cookieParams Map of cookie parameters
   * @param payload HTTP request body
   * @param method HTTP method
   * @param uri URI
   * @throws ApiException if failed to update the parameters
   */
  void applyToParams(
      List<Pair> queryParams,
      Map<String, String> headerParams,
      Map<String, String> cookieParams,
      String payload,
      String method,
      URI uri)
      throws ApiException;
}
