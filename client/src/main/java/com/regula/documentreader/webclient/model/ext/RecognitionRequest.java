package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.model.ProcessParams;
import com.regula.documentreader.webclient.model.ProcessRequest;
import java.util.Collections;
import java.util.List;

public class RecognitionRequest extends ProcessRequest {

  public RecognitionRequest() {}

  public RecognitionRequest(ProcessParams params, List<ProcessRequestImage> images) {
    withProcessParam(params);
    for (ProcessRequestImage image : images) {
      addListItem(image);
    }
  }

  public RecognitionRequest(ProcessParams params, ProcessRequestImage image) {
    this(params, Collections.singletonList(image));
  }

  public RecognitionRequest(ProcessParams params, byte[] image) {
    this(params, new ProcessRequestImage(image));
  }
}
