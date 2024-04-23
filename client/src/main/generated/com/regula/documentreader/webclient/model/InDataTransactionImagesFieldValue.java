/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** InDataTransactionImagesFieldValue */
public class InDataTransactionImagesFieldValue {
  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  private Integer light;

  public static final String SERIALIZED_NAME_LIST_IDX = "listIdx";

  @SerializedName(SERIALIZED_NAME_LIST_IDX)
  private Integer listIdx;

  public static final String SERIALIZED_NAME_PAGE_IDX = "pageIdx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  private Integer pageIdx;

  public static final String SERIALIZED_NAME_URL = "url";

  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public InDataTransactionImagesFieldValue withLight(Integer light) {
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

  public InDataTransactionImagesFieldValue withListIdx(Integer listIdx) {
    this.listIdx = listIdx;
    return this;
  }

  /**
   * Get listIdx
   *
   * @return listIdx
   */
  @javax.annotation.Nullable
  public Integer getListIdx() {
    return listIdx;
  }

  public void setListIdx(Integer listIdx) {
    this.listIdx = listIdx;
  }

  public InDataTransactionImagesFieldValue withPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * Page index of the image from input list
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

  public InDataTransactionImagesFieldValue withUrl(String url) {
    this.url = url;
    return this;
  }

  /**
   * Image url
   *
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InDataTransactionImagesFieldValue inDataTransactionImagesFieldValue =
        (InDataTransactionImagesFieldValue) o;
    return Objects.equals(this.light, inDataTransactionImagesFieldValue.light)
        && Objects.equals(this.listIdx, inDataTransactionImagesFieldValue.listIdx)
        && Objects.equals(this.pageIdx, inDataTransactionImagesFieldValue.pageIdx)
        && Objects.equals(this.url, inDataTransactionImagesFieldValue.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(light, listIdx, pageIdx, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InDataTransactionImagesFieldValue {\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    listIdx: ").append(toIndentedString(listIdx)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
