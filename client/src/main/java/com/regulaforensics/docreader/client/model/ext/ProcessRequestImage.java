package com.regulaforensics.docreader.client.model.ext;

import com.regulaforensics.docreader.client.model.ImageData;

public class ProcessRequestImage
    extends com.regulaforensics.docreader.client.model.ProcessRequestImage {

  public ProcessRequestImage() {}

  public ProcessRequestImage(byte[] image) {
    this.setImageData(new ImageData().withImage(image));
  }

  public ProcessRequestImage(byte[] image, Integer lightIndex) {
    this(image);
    this.setLightIndex(lightIndex);
  }
}
