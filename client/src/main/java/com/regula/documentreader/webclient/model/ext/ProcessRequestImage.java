package com.regula.documentreader.webclient.model.ext;

import com.regula.documentreader.webclient.ApiException;
import com.regula.documentreader.webclient.Base64;
import com.regula.documentreader.webclient.model.ImageData;

import javax.annotation.Nullable;

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

  @Override
  public ProcessRequestImage withImageData(ImageData imageData) {
    com.regula.documentreader.webclient.model.ProcessRequestImage image = super.withImageData(imageData);
    return (ProcessRequestImage) image;
  }

  @Override
  public ImageData getImageData() {
    return super.getImageData();
  }

  @Override
  public void setImageData(ImageData imageData) {
    super.setImageData(imageData);
  }

  @Override
  public ProcessRequestImage withLight(Integer light) {
    com.regula.documentreader.webclient.model.ProcessRequestImage image = super.withLight(light);
    return (ProcessRequestImage) image;
  }

  @Nullable
  @Override
  public Integer getLight() {
    return super.getLight();
  }

  @Override
  public void setLight(Integer light) {
    super.setLight(light);
  }

  @Override
  public ProcessRequestImage withPageIdx(Integer pageIdx) {
    com.regula.documentreader.webclient.model.ProcessRequestImage image = super.withPageIdx(pageIdx);
    return (ProcessRequestImage) image;
  }

  @Nullable
  @Override
  public Integer getPageIdx() {
    return super.getPageIdx();
  }

  @Override
  public void setPageIdx(Integer pageIdx) {
    super.setPageIdx(pageIdx);
  }
}
