package com.regulaforensics.docreader.client.api;

import com.regulaforensics.docreader.client.ApiException;
import com.regulaforensics.docreader.client.model.ProcessRequest;
import com.regulaforensics.docreader.client.model.ext.RecognitionResponse;

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
