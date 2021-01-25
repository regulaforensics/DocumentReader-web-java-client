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

/** Checked fragment coordinates */
public class AreaContainer {
  public static final String SERIALIZED_NAME_COUNT = "Count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<RectangleCoordinates> list = null;

  public static final String SERIALIZED_NAME_POINTS = "Points";

  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<PointsContainer> points = null;

  public AreaContainer withCount(Integer count) {
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

  public AreaContainer withList(List<RectangleCoordinates> list) {
    this.list = list;
    return this;
  }

  public AreaContainer addListItem(RectangleCoordinates listItem) {
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

  public AreaContainer withPoints(List<PointsContainer> points) {
    this.points = points;
    return this;
  }

  public AreaContainer addPointsItem(PointsContainer pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<PointsContainer>();
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
  public List<PointsContainer> getPoints() {
    return points;
  }

  public void setPoints(List<PointsContainer> points) {
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
    AreaContainer areaContainer = (AreaContainer) o;
    return Objects.equals(this.count, areaContainer.count)
        && Objects.equals(this.list, areaContainer.list)
        && Objects.equals(this.points, areaContainer.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaContainer {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
