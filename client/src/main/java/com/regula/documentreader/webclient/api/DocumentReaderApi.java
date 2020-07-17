package com.regula.documentreader.webclient.api;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ext.RecognitionResponse;

public class DocumentReaderApi extends DefaultApi {

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
