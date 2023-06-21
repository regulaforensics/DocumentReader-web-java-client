package com.regula.documentreader.webclient.model.ext;

import com.google.gson.Gson;
import com.regula.documentreader.webclient.model.*;
import com.regula.documentreader.webclient.model.ext.authenticity.Authenticity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class RecognitionResponse {
  private final ProcessResponse originalResponse;
  private final Gson gson;

  public RecognitionResponse(ProcessResponse originalResponse) {
    this.gson = new Gson();
    this.originalResponse = originalResponse;
  }

  public ProcessResponse getOriginalResponse() {
    return originalResponse;
  }

  public String json() {
    return this.gson.toJson(this.originalResponse);
  }

  @Nullable
  public Status status() {
    StatusResult result = resultByType(Result.STATUS);
    if (result != null) {
      return result.getStatus();
    }
    return null;
  }

  @Nullable
  public Text text() {
    TextResult result = resultByType(Result.TEXT);
    if (result != null) {
      return result.getText();
    }
    return null;
  }

  @Nullable
  public Images images() {
    ImagesResult result = resultByType(Result.IMAGES);
    if (result != null) {
      return result.getImages();
    }
    return null;
  }

  @Nullable
  public Authenticity authenticity() {
    return authenticity(0);
  }

  @Nullable
  public Authenticity authenticity(int page_idx) {
    AuthenticityResult result = getResult(Result.AUTHENTICITY, page_idx);
    if (result != null) {
      return result.getAuthenticityCheckList();
    }
    return null;
  }

  @Nullable
  public ImageQualityCheckList imageQualityChecks() {
    return imageQualityChecks(0);
  }

  @Nullable
  public ImageQualityCheckList imageQualityChecks(int page_idx) {
    ImageQualityResult result = getResult(Result.IMAGE_QUALITY, page_idx);
    if (result != null) {
      return result.getImageQualityCheckList();
    }
    return null;
  }

  public OneCandidate documentType() {
    int defaultPageIdx = 1;
    return documentType(defaultPageIdx);
  }

  public OneCandidate documentType(int pageIdx) {
    ChosenDocumentTypeResult result = getResult(Result.DOCUMENT_TYPE, pageIdx);
    if (result != null) {
      return result.getOneCandidate();
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

  public <R> R getResult(int type, int page_idx) {
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type && item.getPageIdx() == page_idx) {
        return (R) item;
      }
    }
    return null;
  }

  public <R> List<R> resultsByType(int type) {
    List<R> results = new ArrayList<>();
    for (ResultItem item : originalResponse.getContainerList().getList()) {
      if (item.getResultType() == type) {
        results.add((R) item);
      }
    }
    return results;
  }
}
