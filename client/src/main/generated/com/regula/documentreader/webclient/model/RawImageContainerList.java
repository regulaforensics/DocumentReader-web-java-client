/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** RawImageContainerList */
public class RawImageContainerList {
  public static final String SERIALIZED_NAME_COUNT = "Count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_IMAGES = "Images";

  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ImageData> images = null;

  public RawImageContainerList withCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   *
   * @return count
   */
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RawImageContainerList withImages(List<ImageData> images) {
    this.images = images;
    return this;
  }

  public RawImageContainerList addImagesItem(ImageData imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageData>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   *
   * @return images
   */
  @javax.annotation.Nullable
  public List<ImageData> getImages() {
    return images;
  }

  public void setImages(List<ImageData> images) {
    this.images = images;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawImageContainerList rawImageContainerList = (RawImageContainerList) o;
    return Objects.equals(this.count, rawImageContainerList.count)
        && Objects.equals(this.images, rawImageContainerList.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawImageContainerList {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
