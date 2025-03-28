/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** ProcessRequestImage */
public class ProcessRequestImage {
  public static final String SERIALIZED_NAME_IMAGE_DATA = "ImageData";

  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private ImageData imageData;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  private Integer light;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  private Integer pageIdx;

  public ProcessRequestImage withImageData(ImageData imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Get imageData
   *
   * @return imageData
   */
  @javax.annotation.Nullable
  public ImageData getImageData() {
    return imageData;
  }

  public void setImageData(ImageData imageData) {
    this.imageData = imageData;
  }

  public ProcessRequestImage withLight(Integer light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   *
   * @return light
   */
  @javax.annotation.Nullable
  public Integer getLight() {
    return light;
  }

  public void setLight(Integer light) {
    this.light = light;
  }

  public ProcessRequestImage withPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * page/image number
   *
   * @return pageIdx
   */
  @javax.annotation.Nullable
  public Integer getPageIdx() {
    return pageIdx;
  }

  public void setPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequestImage processRequestImage = (ProcessRequestImage) o;
    return Objects.equals(this.imageData, processRequestImage.imageData)
        && Objects.equals(this.light, processRequestImage.light)
        && Objects.equals(this.pageIdx, processRequestImage.pageIdx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageData, light, pageIdx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequestImage {\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
