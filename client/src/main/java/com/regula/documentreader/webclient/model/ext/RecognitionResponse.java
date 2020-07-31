package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ImagesResult;
import com.regula.documentreader.webclient.model.ProcessResponse;
import com.regula.documentreader.webclient.model.RawImageResult;
import com.regula.documentreader.webclient.model.Result;
import com.regula.documentreader.webclient.model.ResultItem;
import com.regula.documentreader.webclient.model.Status;
import com.regula.documentreader.webclient.model.StatusResult;
import com.regula.documentreader.webclient.model.TextResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class RecognitionResponse {
  private final ProcessResponse originalResponse;

  public RecognitionResponse(ProcessResponse originalResponse) {
    this.originalResponse = originalResponse;
  }

  public ProcessResponse getOriginalResponse() {
    return originalResponse;
  }

  private List<byte[]> normalizedInputImages() {
    List<RawImageResult> results = resultsByType(Result.RAW_IMAGE);
    if (results != null) {
      List<byte[]> images = new ArrayList<>();
      for (RawImageResult r : results) {
        images.add(r.getRawImageContainer().getImage());
      }
      return images;
    }
    return Collections.emptyList();
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
      return result.getImages().withNormalizedInputImages(normalizedInputImages());
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
