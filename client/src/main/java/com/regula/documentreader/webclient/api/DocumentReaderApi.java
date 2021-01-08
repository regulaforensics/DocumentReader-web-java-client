package com.regula.documentreader.webclient.api;

import com.regula.documentreader.webclient.ApiClient;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.Configuration;
import com.regula.documentreader.webclient.model.DeviceInfo;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;
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
    return new RecognitionResponse(processApi.apiProcess(processRequest));
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
