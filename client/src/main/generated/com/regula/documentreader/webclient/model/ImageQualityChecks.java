/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.5.0
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

/** ImageQualityChecks */
public class ImageQualityChecks {
  public static final String SERIALIZED_NAME_RESULT = "result";

  @SerializedName(SERIALIZED_NAME_RESULT)
  private Integer result;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ImageQualityCheck> list = null;

  public ImageQualityChecks withResult(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   *
   * @return result
   */
  @javax.annotation.Nullable
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public ImageQualityChecks withList(List<ImageQualityCheck> list) {
    this.list = list;
    return this;
  }

  public ImageQualityChecks addListItem(ImageQualityCheck listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ImageQualityCheck>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @javax.annotation.Nullable
  public List<ImageQualityCheck> getList() {
    return list;
  }

  public void setList(List<ImageQualityCheck> list) {
    this.list = list;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageQualityChecks imageQualityChecks = (ImageQualityChecks) o;
    return Objects.equals(this.result, imageQualityChecks.result)
        && Objects.equals(this.list, imageQualityChecks.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageQualityChecks {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
