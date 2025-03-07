package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.Base64;
import com.regula.documentreader.webclient.model.ImageData;
import com.regula.documentreader.webclient.model.Light;

public class ProcessRequestImage
    extends com.regula.documentreader.webclient.model.ProcessRequestImage {

  public ProcessRequestImage() {}

  public ProcessRequestImage(byte[] image) {
    if (image == null) {
      throw new ApiException("No image provided");
    }

    String base64Image = Base64.encode(image);
    this.setImageData(new ImageData().image(base64Image));
  }

  public ProcessRequestImage(byte[] image, Light light) {
    this(image);
    this.setLight(light);
  }

  public ProcessRequestImage(byte[] image, Light light, Integer pageIdx) {
    this(image, light);
    this.setPageIdx(pageIdx);
  }

  public ProcessRequestImage withImageData(ImageData imageData) {
    this.setImageData(imageData);
    return this;
  }

  public ProcessRequestImage withLight(Light light) {
    this.setLight(light);
    return this;
  }

  public ProcessRequestImage withPageIdx(Integer pageIdx) {
    this.setPageIdx(pageIdx);
    return this;
  }
}
