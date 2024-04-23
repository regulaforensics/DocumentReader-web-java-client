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
import com.regula.documentreader.webclient.model.InlineResponse200;
import com.regula.documentreader.webclient.model.InlineResponse2001;
import com.regula.documentreader.webclient.model.TransactionProcessGetResponse;
import com.regula.documentreader.webclient.model.TransactionProcessRequest;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
  private ApiClient localVarApiClient;

  public TransactionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TransactionApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for apiV2TagTagIdDelete
   *
   * @param tagId Tag id (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 204 </td><td> Transactions deleted </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TagTagIdDeleteCall(Integer tagId, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/api/v2/tag/{tag_id}"
            .replaceAll("\\{" + "tagId" + "\\}", localVarApiClient.escapeString(tagId.toString()));

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
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
        localVarPath,
        "DELETE",
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
  private okhttp3.Call apiV2TagTagIdDeleteValidateBeforeCall(
      Integer tagId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'tagId' is set
    if (tagId == null) {
      throw new ApiException(
          "Missing the required parameter 'tagId' when calling apiV2TagTagIdDelete(Async)");
    }

    okhttp3.Call localVarCall = apiV2TagTagIdDeleteCall(tagId, _callback);
    return localVarCall;
  }

  /**
   * Delete Reprocess transactions by tag
   *
   * @param tagId Tag id (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 204 </td><td> Transactions deleted </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public Object apiV2TagTagIdDelete(Integer tagId) throws ApiException {
    ApiResponse<Object> localVarResp = apiV2TagTagIdDeleteWithHttpInfo(tagId);
    return localVarResp.getData();
  }

  /**
   * Delete Reprocess transactions by tag
   *
   * @param tagId Tag id (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 204 </td><td> Transactions deleted </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> apiV2TagTagIdDeleteWithHttpInfo(Integer tagId) throws ApiException {
    okhttp3.Call localVarCall = apiV2TagTagIdDeleteValidateBeforeCall(tagId, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Delete Reprocess transactions by tag (asynchronously)
   *
   * @param tagId Tag id (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 204 </td><td> Transactions deleted </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TagTagIdDeleteAsync(Integer tagId, final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = apiV2TagTagIdDeleteValidateBeforeCall(tagId, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for apiV2TransactionTransactionIdFileGet
   *
   * @param transactionId Transaction id (required)
   * @param name File name (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Binary file </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdFileGetCall(
      Integer transactionId, String name, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/api/v2/transaction/{transaction_id}/file"
            .replaceAll(
                "\\{" + "transactionId" + "\\}",
                localVarApiClient.escapeString(transactionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (name != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/octet-stream"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
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
  private okhttp3.Call apiV2TransactionTransactionIdFileGetValidateBeforeCall(
      Integer transactionId, String name, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(
          "Missing the required parameter 'transactionId' when calling apiV2TransactionTransactionIdFileGet(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling apiV2TransactionTransactionIdFileGet(Async)");
    }

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdFileGetCall(transactionId, name, _callback);
    return localVarCall;
  }

  /**
   * Get Reprocess transaction file
   *
   * @param transactionId Transaction id (required)
   * @param name File name (required)
   * @return File
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Binary file </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
   * </table>
   */
  public File apiV2TransactionTransactionIdFileGet(Integer transactionId, String name)
      throws ApiException {
    ApiResponse<File> localVarResp =
        apiV2TransactionTransactionIdFileGetWithHttpInfo(transactionId, name);
    return localVarResp.getData();
  }

  /**
   * Get Reprocess transaction file
   *
   * @param transactionId Transaction id (required)
   * @param name File name (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Binary file </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<File> apiV2TransactionTransactionIdFileGetWithHttpInfo(
      Integer transactionId, String name) throws ApiException {
    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdFileGetValidateBeforeCall(transactionId, name, null);
    Type localVarReturnType = new TypeToken<File>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get Reprocess transaction file (asynchronously)
   *
   * @param transactionId Transaction id (required)
   * @param name File name (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Binary file </td><td>  -  </td></tr>
   * <tr><td> 404 </td><td> File not found </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdFileGetAsync(
      Integer transactionId, String name, final ApiCallback<File> _callback) throws ApiException {

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdFileGetValidateBeforeCall(transactionId, name, _callback);
    Type localVarReturnType = new TypeToken<File>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for apiV2TransactionTransactionIdGet
   *
   * @param transactionId Transaction id (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Reprocess transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdGetCall(
      Integer transactionId, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/api/v2/transaction/{transaction_id}"
            .replaceAll(
                "\\{" + "transactionId" + "\\}",
                localVarApiClient.escapeString(transactionId.toString()));

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
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
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
  private okhttp3.Call apiV2TransactionTransactionIdGetValidateBeforeCall(
      Integer transactionId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(
          "Missing the required parameter 'transactionId' when calling apiV2TransactionTransactionIdGet(Async)");
    }

    okhttp3.Call localVarCall = apiV2TransactionTransactionIdGetCall(transactionId, _callback);
    return localVarCall;
  }

  /**
   * Get Reprocess transaction data
   *
   * @param transactionId Transaction id (required)
   * @return TransactionProcessGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Reprocess transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public TransactionProcessGetResponse apiV2TransactionTransactionIdGet(Integer transactionId)
      throws ApiException {
    ApiResponse<TransactionProcessGetResponse> localVarResp =
        apiV2TransactionTransactionIdGetWithHttpInfo(transactionId);
    return localVarResp.getData();
  }

  /**
   * Get Reprocess transaction data
   *
   * @param transactionId Transaction id (required)
   * @return ApiResponse&lt;TransactionProcessGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Reprocess transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<TransactionProcessGetResponse> apiV2TransactionTransactionIdGetWithHttpInfo(
      Integer transactionId) throws ApiException {
    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdGetValidateBeforeCall(transactionId, null);
    Type localVarReturnType = new TypeToken<TransactionProcessGetResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get Reprocess transaction data (asynchronously)
   *
   * @param transactionId Transaction id (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Reprocess transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdGetAsync(
      Integer transactionId, final ApiCallback<TransactionProcessGetResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdGetValidateBeforeCall(transactionId, _callback);
    Type localVarReturnType = new TypeToken<TransactionProcessGetResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for apiV2TransactionTransactionIdProcessPost
   *
   * @param transactionId Transaction id (required)
   * @param transactionProcessRequest (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction Process result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdProcessPostCall(
      Integer transactionId,
      TransactionProcessRequest transactionProcessRequest,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = transactionProcessRequest;

    // create path and map variables
    String localVarPath =
        "/api/v2/transaction/{transaction_id}/process"
            .replaceAll(
                "\\{" + "transactionId" + "\\}",
                localVarApiClient.escapeString(transactionId.toString()));

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
  private okhttp3.Call apiV2TransactionTransactionIdProcessPostValidateBeforeCall(
      Integer transactionId,
      TransactionProcessRequest transactionProcessRequest,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(
          "Missing the required parameter 'transactionId' when calling apiV2TransactionTransactionIdProcessPost(Async)");
    }

    // verify the required parameter 'transactionProcessRequest' is set
    if (transactionProcessRequest == null) {
      throw new ApiException(
          "Missing the required parameter 'transactionProcessRequest' when calling apiV2TransactionTransactionIdProcessPost(Async)");
    }

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdProcessPostCall(
            transactionId, transactionProcessRequest, _callback);
    return localVarCall;
  }

  /**
   * Reprocess
   *
   * @param transactionId Transaction id (required)
   * @param transactionProcessRequest (required)
   * @return InlineResponse200
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction Process result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public InlineResponse200 apiV2TransactionTransactionIdProcessPost(
      Integer transactionId, TransactionProcessRequest transactionProcessRequest)
      throws ApiException {
    ApiResponse<InlineResponse200> localVarResp =
        apiV2TransactionTransactionIdProcessPostWithHttpInfo(
            transactionId, transactionProcessRequest);
    return localVarResp.getData();
  }

  /**
   * Reprocess
   *
   * @param transactionId Transaction id (required)
   * @param transactionProcessRequest (required)
   * @return ApiResponse&lt;InlineResponse200&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction Process result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<InlineResponse200> apiV2TransactionTransactionIdProcessPostWithHttpInfo(
      Integer transactionId, TransactionProcessRequest transactionProcessRequest)
      throws ApiException {
    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdProcessPostValidateBeforeCall(
            transactionId, transactionProcessRequest, null);
    Type localVarReturnType = new TypeToken<InlineResponse200>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Reprocess (asynchronously)
   *
   * @param transactionId Transaction id (required)
   * @param transactionProcessRequest (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction Process result </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdProcessPostAsync(
      Integer transactionId,
      TransactionProcessRequest transactionProcessRequest,
      final ApiCallback<InlineResponse200> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdProcessPostValidateBeforeCall(
            transactionId, transactionProcessRequest, _callback);
    Type localVarReturnType = new TypeToken<InlineResponse200>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for apiV2TransactionTransactionIdResultsGet
   *
   * @param transactionId Transaction id (required)
   * @param withImages With base64 images or url (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdResultsGetCall(
      Integer transactionId, Boolean withImages, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/api/v2/transaction/{transaction_id}/results"
            .replaceAll(
                "\\{" + "transactionId" + "\\}",
                localVarApiClient.escapeString(transactionId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (withImages != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("withImages", withImages));
    }

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
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {};
    return localVarApiClient.buildCall(
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
  private okhttp3.Call apiV2TransactionTransactionIdResultsGetValidateBeforeCall(
      Integer transactionId, Boolean withImages, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(
          "Missing the required parameter 'transactionId' when calling apiV2TransactionTransactionIdResultsGet(Async)");
    }

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdResultsGetCall(transactionId, withImages, _callback);
    return localVarCall;
  }

  /**
   * Get Reprocess transaction result
   *
   * @param transactionId Transaction id (required)
   * @param withImages With base64 images or url (optional)
   * @return InlineResponse2001
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public InlineResponse2001 apiV2TransactionTransactionIdResultsGet(
      Integer transactionId, Boolean withImages) throws ApiException {
    ApiResponse<InlineResponse2001> localVarResp =
        apiV2TransactionTransactionIdResultsGetWithHttpInfo(transactionId, withImages);
    return localVarResp.getData();
  }

  /**
   * Get Reprocess transaction result
   *
   * @param transactionId Transaction id (required)
   * @param withImages With base64 images or url (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<InlineResponse2001> apiV2TransactionTransactionIdResultsGetWithHttpInfo(
      Integer transactionId, Boolean withImages) throws ApiException {
    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdResultsGetValidateBeforeCall(transactionId, withImages, null);
    Type localVarReturnType = new TypeToken<InlineResponse2001>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get Reprocess transaction result (asynchronously)
   *
   * @param transactionId Transaction id (required)
   * @param withImages With base64 images or url (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> Transaction data </td><td>  -  </td></tr>
   * <tr><td> 400 </td><td> Bad request. Check your input data. </td><td>  -  </td></tr>
   * <tr><td> 403 </td><td> Bad license. Either server or request does not contain valid license. </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call apiV2TransactionTransactionIdResultsGetAsync(
      Integer transactionId, Boolean withImages, final ApiCallback<InlineResponse2001> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        apiV2TransactionTransactionIdResultsGetValidateBeforeCall(
            transactionId, withImages, _callback);
    Type localVarReturnType = new TypeToken<InlineResponse2001>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
