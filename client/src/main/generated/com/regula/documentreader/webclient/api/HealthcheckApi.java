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

package com.regula.documentreader.webclient.api;

import com.google.gson.reflect.TypeToken;
import com.regula.documentreader.webclient.ApiCallback;
import com.regula.documentreader.webclient.ApiClient;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.ApiResponse;
import com.regula.documentreader.webclient.Configuration;
import com.regula.documentreader.webclient.Pair;
import com.regula.documentreader.webclient.model.DeviceInfo;
import com.regula.documentreader.webclient.model.Healthcheck;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthcheckApi {
  private ApiClient localVarApiClient;
  private int localHostIndex;
  private String localCustomBaseUrl;

  public HealthcheckApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HealthcheckApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public int getHostIndex() {
    return localHostIndex;
  }

  public void setHostIndex(int hostIndex) {
    this.localHostIndex = hostIndex;
  }

  public String getCustomBaseUrl() {
    return localCustomBaseUrl;
  }

  public void setCustomBaseUrl(String customBaseUrl) {
    this.localCustomBaseUrl = customBaseUrl;
  }

  /**
   * Build call for healthz
   *
   * @param xRequestID (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call healthzCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/healthz";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    if (xRequestID != null) {
      localVarHeaderParams.put("X-RequestID", localVarApiClient.parameterToString(xRequestID));
    }

    if (headers != null) {
      for (String key : headers.keySet()) {
        localVarHeaderParams.put(key, headers.get(key));
      }
    }
    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call healthzValidateBeforeCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    return healthzCall(xRequestID, headers, _callback);
  }

  /**
   * Server health check
   *
   * @param xRequestID (optional)
   * @return Healthcheck
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info. </td><td>  -  </td></tr>
   * </table>
   */
  public Healthcheck healthz(String xRequestID, HashMap<String, String> headers)
      throws ApiException {
    ApiResponse<Healthcheck> localVarResp = healthzWithHttpInfo(xRequestID, headers);
    return localVarResp.getData();
  }

  /**
   * Server health check
   *
   * @param xRequestID (optional)
   * @return ApiResponse&lt;Healthcheck&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Healthcheck> healthzWithHttpInfo(
      String xRequestID, HashMap<String, String> headers) throws ApiException {
    okhttp3.Call localVarCall = healthzValidateBeforeCall(xRequestID, headers, null);
    Type localVarReturnType = new TypeToken<Healthcheck>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Server health check (asynchronously)
   *
   * @param xRequestID (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call healthzAsync(
      String xRequestID, HashMap<String, String> headers, final ApiCallback<Healthcheck> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = healthzValidateBeforeCall(xRequestID, headers, _callback);
    Type localVarReturnType = new TypeToken<Healthcheck>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for ping
   *
   * @param xRequestID (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info </td><td>  -  </td></tr>
   * </table>
   *
   * @deprecated
   */
  @Deprecated
  public okhttp3.Call pingCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/ping";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    if (xRequestID != null) {
      localVarHeaderParams.put("X-RequestID", localVarApiClient.parameterToString(xRequestID));
    }

    if (headers != null) {
      for (String key : headers.keySet()) {
        localVarHeaderParams.put(key, headers.get(key));
      }
    }
    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @Deprecated
  @SuppressWarnings("rawtypes")
  private okhttp3.Call pingValidateBeforeCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    return pingCall(xRequestID, headers, _callback);
  }

  /**
   * Server health check
   *
   * @param xRequestID (optional)
   * @return DeviceInfo
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info </td><td>  -  </td></tr>
   * </table>
   *
   * @deprecated
   */
  @Deprecated
  public DeviceInfo ping(String xRequestID, HashMap<String, String> headers) throws ApiException {
    ApiResponse<DeviceInfo> localVarResp = pingWithHttpInfo(xRequestID, headers);
    return localVarResp.getData();
  }

  /**
   * Server health check
   *
   * @param xRequestID (optional)
   * @return ApiResponse&lt;DeviceInfo&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info </td><td>  -  </td></tr>
   * </table>
   *
   * @deprecated
   */
  @Deprecated
  public ApiResponse<DeviceInfo> pingWithHttpInfo(
      String xRequestID, HashMap<String, String> headers) throws ApiException {
    okhttp3.Call localVarCall = pingValidateBeforeCall(xRequestID, headers, null);
    Type localVarReturnType = new TypeToken<DeviceInfo>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Server health check (asynchronously)
   *
   * @param xRequestID (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Device info </td><td>  -  </td></tr>
   * </table>
   *
   * @deprecated
   */
  @Deprecated
  public okhttp3.Call pingAsync(
      String xRequestID, HashMap<String, String> headers, final ApiCallback<DeviceInfo> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = pingValidateBeforeCall(xRequestID, headers, _callback);
    Type localVarReturnType = new TypeToken<DeviceInfo>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readyz
   *
   * @param xRequestID (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> The license is valid. </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> The license is not valid. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readyzCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    String basePath = null;
    // Operation Servers
    String[] localBasePaths = new String[] {};

    // Determine Base Path to Use
    if (localCustomBaseUrl != null) {
      basePath = localCustomBaseUrl;
    } else if (localBasePaths.length > 0) {
      basePath = localBasePaths[localHostIndex];
    } else {
      basePath = null;
    }

    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/api/readyz";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    if (localVarContentType != null) {
      localVarHeaderParams.put("Content-Type", localVarContentType);
    }

    if (xRequestID != null) {
      localVarHeaderParams.put("X-RequestID", localVarApiClient.parameterToString(xRequestID));
    }

    if (headers != null) {
      for (String key : headers.keySet()) {
        localVarHeaderParams.put(key, headers.get(key));
      }
    }
    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
        basePath,
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call readyzValidateBeforeCall(
      String xRequestID, HashMap<String, String> headers, final ApiCallback _callback)
      throws ApiException {
    return readyzCall(xRequestID, headers, _callback);
  }

  /**
   * License health check
   *
   * @param xRequestID (optional)
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> The license is valid. </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> The license is not valid. </td><td>  -  </td></tr>
   * </table>
   */
  public void readyz(String xRequestID, HashMap<String, String> headers) throws ApiException {
    readyzWithHttpInfo(xRequestID, headers);
  }

  /**
   * License health check
   *
   * @param xRequestID (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> The license is valid. </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> The license is not valid. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Void> readyzWithHttpInfo(String xRequestID, HashMap<String, String> headers)
      throws ApiException {
    okhttp3.Call localVarCall = readyzValidateBeforeCall(xRequestID, headers, null);
    return localVarApiClient.execute(localVarCall);
  }

  /**
   * License health check (asynchronously)
   *
   * @param xRequestID (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table border="1">
   * <caption>Response Details</caption>
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> The license is valid. </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> The license is not valid. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call readyzAsync(
      String xRequestID, HashMap<String, String> headers, final ApiCallback<Void> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = readyzValidateBeforeCall(xRequestID, headers, _callback);
    localVarApiClient.executeAsync(localVarCall, _callback);
    return localVarCall;
  }
}
