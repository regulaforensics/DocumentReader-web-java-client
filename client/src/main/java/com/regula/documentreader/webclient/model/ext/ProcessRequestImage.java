package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.model.ImageData;

public class ProcessRequestImage
    extends com.regula.documentreader.webclient.model.ProcessRequestImage {

  public ProcessRequestImage() {}

  public ProcessRequestImage(byte[] image) {
    if (image == null) {
      throw new ApiException("No image provided");
    }
    this.setImageData(new ImageData().withImage(image));
  }

  public ProcessRequestImage(byte[] image, Integer lightIndex) {
    this(image);
    this.setLightIndex(lightIndex);
  }
}
