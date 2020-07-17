package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.ResultItem;
import com.regula.documentreader.webclient.model.Status;
import com.regula.documentreader.webclient.model.StatusResult;
import com.regula.documentreader.webclient.model.TextResult;

public class RecognitionResponse {
  private final ProcessResponse originalResponse;

  public RecognitionResponse(ProcessResponse originalResponse) {
    this.originalResponse = originalResponse;
  }

  public ProcessResponse getOriginalResponse() {
    return originalResponse;
  }

  public Text text() {
    TextResult result = resultByType(Result.TEXT);
    if (result != null) {
      return result.getText();
    }
    return null;
  }

  public Status status() {
    StatusResult result = resultByType(Result.STATUS);
    if (result != null) {
      return result.getStatus();
    }
    return null;
  }

  public <R> R resultByType(int type) {
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type) {
        return (R) item;
      }
    }
    return null;
  }
}
