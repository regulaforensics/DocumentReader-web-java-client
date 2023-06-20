package com.regula.documentreader.webclient.model.ext;

import com.google.gson.Gson;
import com.regula.documentreader.webclient.model.ContainerList;
import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessRequest;
import com.regula.documentreader.webclient.model.ProcessSystemInfo;
import java.util.Collections;
import java.util.List;

public class RecognitionRequest extends ProcessRequest {

  public RecognitionRequest() {
    this(null, Collections.<ProcessRequestImage>emptyList());
  }

  public RecognitionRequest(ProcessParams params, ProcessRequestImage image) {
    this(params, Collections.singletonList(image));
  }

  public RecognitionRequest(ProcessParams params, byte[] image) {
    this(params, new ProcessRequestImage(image));
  }

  public RecognitionRequest(ProcessParams params, List<ProcessRequestImage> images) {
    withProcessParam(params);
    for (ProcessRequestImage image : images) {
      addListItem(image);
    }
    withSystemInfo(new ProcessSystemInfo());
  }

  public RecognitionRequest(ProcessParams params, ContainerList containerList) {
    withProcessParam(params);
    withContainerList(containerList);
    withSystemInfo(new ProcessSystemInfo());
  }

  public String json() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
