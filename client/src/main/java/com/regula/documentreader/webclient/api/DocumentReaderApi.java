package com.regula.documentreader.webclient.api;

import com.regula.documentreader.webclient.ApiClient;
import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

import javax.print.Doc;

public class DocumentReaderApi extends DefaultApi {

  public DocumentReaderApi() {
    super();
  }

  public DocumentReaderApi(String basePath) {
    super();

    ApiClient apiClient = this.getApiClient();
    apiClient.setBasePath(basePath);
  }

  public DocumentReaderApi(String basePath, boolean debugging) {
    super();

    ApiClient apiCLient = this.getApiClient();
    apiCLient.setBasePath(basePath);
    apiCLient.setDebugging(debugging);
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
    return new RecognitionResponse(super.apiProcess(processRequest));
  }
}
