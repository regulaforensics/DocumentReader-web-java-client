/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.6.1
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

/** AreaArray */
public class AreaArray {
  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<RectangleCoordinates> list = null;

  public static final String SERIALIZED_NAME_POINTS = "Points";

  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<PointArray> points = null;

  public AreaArray withList(List<RectangleCoordinates> list) {
    this.list = list;
    return this;
  }

  public AreaArray addListItem(RectangleCoordinates listItem) {
    if (this.list == null) {
      this.list = new ArrayList<RectangleCoordinates>();
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
  public List<RectangleCoordinates> getList() {
    return list;
  }

  public void setList(List<RectangleCoordinates> list) {
    this.list = list;
  }

  public AreaArray withPoints(List<PointArray> points) {
    this.points = points;
    return this;
  }

  public AreaArray addPointsItem(PointArray pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<PointArray>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Get points
   *
   * @return points
   */
  @javax.annotation.Nullable
  public List<PointArray> getPoints() {
    return points;
  }

  public void setPoints(List<PointArray> points) {
    this.points = points;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaArray areaArray = (AreaArray) o;
    return Objects.equals(this.list, areaArray.list)
        && Objects.equals(this.points, areaArray.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaArray {\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
