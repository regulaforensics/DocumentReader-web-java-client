/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Raw data from BarCodes */
public class DocBarCodeInfo {
  public static final String SERIALIZED_NAME_DOC_BAR_CODE_INFO = "DocBarCodeInfo";

  @SerializedName(SERIALIZED_NAME_DOC_BAR_CODE_INFO)
  private DocBarCodeInfoFieldsList docBarCodeInfo;

  public static final String SERIALIZED_NAME_BUF_LENGTH = "buf_length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  private Integer bufLength;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  private Integer light;

  public static final String SERIALIZED_NAME_LIST_IDX = "list_idx";

  @SerializedName(SERIALIZED_NAME_LIST_IDX)
  private Integer listIdx;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  private Integer pageIdx;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";

  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private Integer resultType = 0;

  public DocBarCodeInfo withDocBarCodeInfo(DocBarCodeInfoFieldsList docBarCodeInfo) {
    this.docBarCodeInfo = docBarCodeInfo;
    return this;
  }

  /**
   * Get docBarCodeInfo
   *
   * @return docBarCodeInfo
   */
  public DocBarCodeInfoFieldsList getDocBarCodeInfo() {
    return docBarCodeInfo;
  }

  public void setDocBarCodeInfo(DocBarCodeInfoFieldsList docBarCodeInfo) {
    this.docBarCodeInfo = docBarCodeInfo;
  }

  public DocBarCodeInfo withBufLength(Integer bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Get bufLength
   *
   * @return bufLength
   */
  @javax.annotation.Nullable
  public Integer getBufLength() {
    return bufLength;
  }

  public void setBufLength(Integer bufLength) {
    this.bufLength = bufLength;
  }

  public DocBarCodeInfo withLight(Integer light) {
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

  public DocBarCodeInfo withListIdx(Integer listIdx) {
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

  public DocBarCodeInfo withPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * Get pageIdx
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

  public DocBarCodeInfo withResultType(Integer resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return resultType
   */
  public Integer getResultType() {
    return resultType;
  }

  public void setResultType(Integer resultType) {
    this.resultType = resultType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocBarCodeInfo docBarCodeInfo = (DocBarCodeInfo) o;
    return Objects.equals(this.docBarCodeInfo, docBarCodeInfo.docBarCodeInfo)
        && Objects.equals(this.bufLength, docBarCodeInfo.bufLength)
        && Objects.equals(this.light, docBarCodeInfo.light)
        && Objects.equals(this.listIdx, docBarCodeInfo.listIdx)
        && Objects.equals(this.pageIdx, docBarCodeInfo.pageIdx)
        && Objects.equals(this.resultType, docBarCodeInfo.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docBarCodeInfo, bufLength, light, listIdx, pageIdx, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocBarCodeInfo {\n");
    sb.append("    docBarCodeInfo: ").append(toIndentedString(docBarCodeInfo)).append("\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    listIdx: ").append(toIndentedString(listIdx)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
