package com.regula.documentreader.webclient.api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.regula.documentreader.webclient.ApiClient;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.Configuration;
import com.regula.documentreader.webclient.Pair;
import com.regula.documentreader.webclient.model.DeviceInfo;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import okio.ByteString;

public class DocumentReaderApi {

  private final DefaultApi defaultApi;
  private final ProcessApi processApi;

  private String license;

  public DocumentReaderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentReaderApi(ApiClient apiClient) {
    this.defaultApi = new DefaultApi(apiClient);
    this.processApi = new ProcessApi(apiClient);
  }

  public DocumentReaderApi(String basePath) {
    this(basePath, false, false);
  }

  public DocumentReaderApi(String basePath, boolean debugging) {
    this(basePath, debugging, false);
  }

  public DocumentReaderApi(String basePath, boolean debugging, boolean verifyingSsl) {
    this(getApiClient(basePath, debugging, verifyingSsl));
  }

  private static ApiClient getApiClient(String basePath, boolean debugging, boolean verifyingSsl) {
    ApiClient apiCLient = Configuration.getDefaultApiClient();
    apiCLient.setBasePath(basePath);
    apiCLient.setDebugging(debugging);
    apiCLient.setVerifyingSsl(verifyingSsl);
    return apiCLient;
  }

  /**
   * Server health check
   *
   * @return DeviceInfo
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DeviceInfo ping() throws ApiException {
    return defaultApi.ping();
  }

  /**
   * Reads list of documents and return extracted data
   *
   * @param processRequest (required)
   * @return ProcessResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public RecognitionResponse process(ProcessRequest processRequest) {
    processRequest.getSystemInfo().withLicense(this.license);
    ProcessResponse response = processApi.apiProcess(processRequest);
    return new RecognitionResponse(response);
  }

  public RecognitionResponse process(byte[] processRequest, ProcessParams processParams) {
    if (processParams != null) {
      Gson converter = processApi.getApiClient().getJSON().getGson();
      JsonObject parsedProcessRequest =
          converter.fromJson(new String(processRequest), JsonObject.class);
      JsonElement params = converter.toJsonTree(processParams);
      parsedProcessRequest.add("processParam", params);
      processRequest = converter.toJson(parsedProcessRequest).getBytes();
    }

    ApiClient client = processApi.getApiClient();
    okhttp3.Call apiCall = newProcessCall(processRequest);
    Type respType = new TypeToken<ProcessResponse>() {}.getType();
    return new RecognitionResponse((ProcessResponse) client.execute(apiCall, respType).getData());
  }

  private okhttp3.Call newProcessCall(byte[] processRequest) {
    return processApi
        .getApiClient()
        .buildCall(
            "/api/process",
            "POST",
            new ArrayList<Pair>(),
            new ArrayList<Pair>(),
            processRequest,
            new HashMap<String, String>(),
            new HashMap<String, String>(),
            new HashMap<String, Object>(),
            new String[] {},
            null);
  }

  public DocumentReaderApi withLicense(String license) {
    this.license = license;
    return this;
  }

  public String getLicense() {
    return this.license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public void setLicense(byte[] license) {
    this.license = ByteString.of(license).base64();
  }
}
