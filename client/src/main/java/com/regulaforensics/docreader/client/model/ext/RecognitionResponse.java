package com.regulaforensics.docreader.client.model.ext;

import com.regulaforensics.docreader.client.model.ProcessResponse;
import com.regulaforensics.docreader.client.model.Result;
import com.regulaforensics.docreader.client.model.ResultItem;
import com.regulaforensics.docreader.client.model.TextResult;

public class RecognitionResponse {
  private final ProcessResponse originalResponse;

  public RecognitionResponse(ProcessResponse originalResponse) {
    this.originalResponse = originalResponse;
  }

  public ProcessResponse getOriginalResponse() {
    return originalResponse;
  }

  public Text text() {
    TextResult result = getResultItem(Result.TEXT);
    if (result != null) {
      return result.getText();
    }
    return null;
  }

  private <R> R getResultItem(int type) {
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type) {
        return (R) item;
      }
    }
    return null;
  }
}
