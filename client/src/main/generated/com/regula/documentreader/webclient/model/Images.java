/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.2.0
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

/** Images */
public class Images {
  public static final String SERIALIZED_NAME_AVAILABLE_SOURCE_LIST = "availableSourceList";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_SOURCE_LIST)
  private List<ImagesAvailableSource> availableSourceList = new ArrayList<ImagesAvailableSource>();

  public static final String SERIALIZED_NAME_FIELD_LIST = "fieldList";

  @SerializedName(SERIALIZED_NAME_FIELD_LIST)
  private List<com.regula.documentreader.webclient.model.ext.ImagesField> fieldList =
      new ArrayList<com.regula.documentreader.webclient.model.ext.ImagesField>();

  public Images withAvailableSourceList(List<ImagesAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
    return this;
  }

  /**
   * Get availableSourceList
   *
   * @return availableSourceList
   */
  public List<ImagesAvailableSource> getAvailableSourceList() {
    return availableSourceList;
  }

  public void setAvailableSourceList(List<ImagesAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
  }

  public Images withFieldList(
      List<com.regula.documentreader.webclient.model.ext.ImagesField> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  /**
   * Get fieldList
   *
   * @return fieldList
   */
  public List<com.regula.documentreader.webclient.model.ext.ImagesField> getFieldList() {
    return fieldList;
  }

  public void setFieldList(
      List<com.regula.documentreader.webclient.model.ext.ImagesField> fieldList) {
    this.fieldList = fieldList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Images images = (Images) o;
    return Objects.equals(this.availableSourceList, images.availableSourceList)
        && Objects.equals(this.fieldList, images.fieldList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableSourceList, fieldList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Images {\n");
    sb.append("    availableSourceList: ")
        .append(toIndentedString(availableSourceList))
        .append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
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
