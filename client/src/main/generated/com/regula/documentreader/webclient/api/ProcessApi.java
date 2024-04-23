/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.1.2
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
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ProcessResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessApi {
  private ApiClient localVarApiClient;

  public ProcessApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for apiProcess
   *
   * @param processRequest (required)
   * @param xRequestID (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Document reading result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiProcessCall(
      ProcessRequest processRequest, String xRequestID, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = processRequest;

    // create path and map variables
    String localVarPath = "/api/process";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    if (xRequestID != null) {
      localVarHeaderParams.put("X-RequestID", localVarApiClient.parameterToString(xRequestID));
    }

    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
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
  private okhttp3.Call apiProcessValidateBeforeCall(
      ProcessRequest processRequest, String xRequestID, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'processRequest' is set
    if (processRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'processRequest' when calling apiProcess(Async)");
    }

    okhttp3.Call localVarCall = apiProcessCall(processRequest, xRequestID, _callback);
    return localVarCall;
  }

  /**
   * Process list of documents images and return extracted data
   *
   * @param processRequest (required)
   * @param xRequestID (optional)
   * @return ProcessResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Document reading result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ProcessResponse apiProcess(ProcessRequest processRequest, String xRequestID)
      throws ApiException {
    ApiResponse<ProcessResponse> localVarResp = apiProcessWithHttpInfo(processRequest, xRequestID);
    return localVarResp.getData();
  }

  /**
   * Process list of documents images and return extracted data
   *
   * @param processRequest (required)
   * @param xRequestID (optional)
   * @return ApiResponse&lt;ProcessResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Document reading result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<ProcessResponse> apiProcessWithHttpInfo(
      ProcessRequest processRequest, String xRequestID) throws ApiException {
    okhttp3.Call localVarCall = apiProcessValidateBeforeCall(processRequest, xRequestID, null);
    Type localVarReturnType = new TypeToken<ProcessResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Process list of documents images and return extracted data (asynchronously)
   *
   * @param processRequest (required)
   * @param xRequestID (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Document reading result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiProcessAsync(
      ProcessRequest processRequest,
      String xRequestID,
      final ApiCallback<ProcessResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = apiProcessValidateBeforeCall(processRequest, xRequestID, _callback);
    Type localVarReturnType = new TypeToken<ProcessResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
