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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** AuthenticityCheckList */
public class AuthenticityCheckList {
  public static final String SERIALIZED_NAME_COUNT = "Count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<AuthenticityCheckResult> list = new ArrayList<AuthenticityCheckResult>();

  public AuthenticityCheckList withCount(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Count of items in List
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

  public AuthenticityCheckList withList(List<AuthenticityCheckResult> list) {
    this.list = list;
    return this;
  }

  public AuthenticityCheckList addListItem(AuthenticityCheckResult listItem) {
    this.list.add(listItem);
    return this;
  }

  /**
   * Authenticity Check
   *
   * @return list
   */
  public List<AuthenticityCheckResult> getList() {
    return list;
  }

  public void setList(List<AuthenticityCheckResult> list) {
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
    AuthenticityCheckList authenticityCheckList = (AuthenticityCheckList) o;
    return Objects.equals(this.count, authenticityCheckList.count)
        && Objects.equals(this.list, authenticityCheckList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticityCheckList {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
