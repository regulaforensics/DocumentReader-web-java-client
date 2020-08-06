package com.regula.documentreader.webclient.api;

import com.regula.documentreader.webclient.ApiClient;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;
import okio.ByteString;

public class DocumentReaderApi extends DefaultApi {

  private String license;

  public DocumentReaderApi() {
    super();
  }

  public DocumentReaderApi(String basePath) {
    this(basePath, false, false);
  }

  public DocumentReaderApi(String basePath, boolean debugging) {
    this(basePath, debugging, false);
  }

  public DocumentReaderApi(String basePath, boolean debugging, boolean verifyingSsl) {
    super();

    ApiClient apiCLient = this.getApiClient();
    apiCLient.setBasePath(basePath);
    apiCLient.setDebugging(debugging);
    apiCLient.setVerifyingSsl(verifyingSsl);
  }

  public DocumentReaderApi(ApiClient apiClient) {
    super(apiClient);
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
    return new RecognitionResponse(super.apiProcess(processRequest));
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
