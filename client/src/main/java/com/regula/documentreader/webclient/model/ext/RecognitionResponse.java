package com.regula.documentreader.webclient.model.ext;

import com.google.gson.Gson;
import com.regula.documentreader.webclient.Base64;
import com.regula.documentreader.webclient.model.*;
import com.regula.documentreader.webclient.model.ext.authenticity.Authenticity;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
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
      return (Text) result.getText();
    }
    return null;
  }

  @Nullable
  public String GetLog() {
    String logBase64 = this.originalResponse.getLog();
    if (logBase64 == null) {
      return null;
    }

    byte[] buffer = Base64.decode(logBase64);
    Inflater inflater = new Inflater();
    inflater.setInput(buffer);
    byte[] decompressedBuffer = new byte[1024];
    StringBuilder logText = new StringBuilder();

    try {
      while (!inflater.finished()) {
        int count = inflater.inflate(decompressedBuffer);
        logText.append(new String(decompressedBuffer, 0, count, StandardCharsets.UTF_8));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      inflater.end();
    }

    return logText.toString();
  }

  @Nullable
  public Images images() {
    ImagesResult result = resultByType(Result.IMAGES);
    if (result != null) {
      return (Images) result.getImages();
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
      return (Authenticity) result.getAuthenticityCheckList();
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

  public <R> R resultByType(Result type) {
    for (ContainerListListInner item : originalResponse.getContainerList().getList()) {
      switch (type) {
        case STATUS:
          return (R) item.getStatusResult();
        case TEXT:
          return (R) item.getTextResult();
        case IMAGES:
          return (R) item.getImagesResult();
        case DOCUMENT_TYPE:
          return (R) item.getChosenDocumentTypeResult();
        case AUTHENTICITY:
          return (R) item.getAuthenticityResult();
        case IMAGE_QUALITY:
          return (R) item.getImageQualityResult();
        default:
          return null; // TODO ?
      }
    }
    return null;
  }

  public <R> R getResult(Result type, int page_idx) {
    for (ContainerListListInner item : originalResponse.getContainerList().getList()) {
      switch (type) {
        case STATUS:
          if (item.getStatusResult().getPageIdx() == page_idx) return (R) item.getStatusResult();
          break;
        case TEXT:
          if (item.getTextResult().getPageIdx() == page_idx) return (R) item.getTextResult();
          break;
        case IMAGES:
          if (item.getImagesResult().getPageIdx() == page_idx) return (R) item.getImagesResult();
          break;
        case DOCUMENT_TYPE:
          if (item.getChosenDocumentTypeResult().getPageIdx() == page_idx)
            return (R) item.getChosenDocumentTypeResult();
          break;
        case AUTHENTICITY:
          if (item.getAuthenticityResult().getPageIdx() == page_idx)
            return (R) item.getAuthenticityResult();
          break;
        case IMAGE_QUALITY:
          if (item.getImageQualityResult().getPageIdx() == page_idx)
            return (R) item.getImageQualityResult();
          break;
        default:
          return null; // TODO ?
      }
    }
    return null;
  }

  public <R> List<R> resultsByType(Result type) {
    List<R> results = new ArrayList<>();
    for (ContainerListListInner item : originalResponse.getContainerList().getList()) {
      switch (type) {
        case STATUS:
          results.add((R) item.getStatusResult());
          break;
        case TEXT:
          results.add((R) item.getTextResult());
        case IMAGES:
          results.add((R) item.getImagesResult());
        case DOCUMENT_TYPE:
          results.add((R) item.getChosenDocumentTypeResult());
        case AUTHENTICITY:
          results.add((R) item.getAuthenticityResult());
        case IMAGE_QUALITY:
          results.add((R) item.getImageQualityResult());
        default:
          break;
      }
    }
    return results;
  }
}
