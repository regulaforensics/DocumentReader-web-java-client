package com.regulaforensics.docreader.client.model.ext;

import com.regulaforensics.docreader.client.model.ProcessParams;
import java.util.Collections;
import java.util.List;

public class RecognitionRequest extends com.regulaforensics.docreader.client.model.ProcessRequest {

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
