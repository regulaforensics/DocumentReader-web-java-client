package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.model.ImageData;
import com.regula.documentreader.webclient.Base64;
public class ProcessRequestImage
    extends com.regula.documentreader.webclient.model.ProcessRequestImage {

  public ProcessRequestImage() {}

  public ProcessRequestImage(byte[] image) {
    if (image == null) {
      throw new ApiException("No image provided");
    }

    String base64Image = Base64.encode(image);
    this.setImageData(new ImageData().withImage(base64Image));
  }

  public ProcessRequestImage(byte[] image, Integer light) {
    this(image);
    this.setLight(light);
  }

  public ProcessRequestImage(byte[] image, Integer light, Integer pageIdx) {
    this(image, light);
    this.setPageIdx(pageIdx);
  }
}
