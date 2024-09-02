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

/** PointArray */
public class PointArray {
  public static final String SERIALIZED_NAME_POINTS_LIST = "PointsList";

  @SerializedName(SERIALIZED_NAME_POINTS_LIST)
  private List<Point> pointsList = null;

  public PointArray withPointsList(List<Point> pointsList) {
    this.pointsList = pointsList;
    return this;
  }

  public PointArray addPointsListItem(Point pointsListItem) {
    if (this.pointsList == null) {
      this.pointsList = new ArrayList<Point>();
    }
    this.pointsList.add(pointsListItem);
    return this;
  }

  /**
   * Get pointsList
   *
   * @return pointsList
   */
  @javax.annotation.Nullable
  public List<Point> getPointsList() {
    return pointsList;
  }

  public void setPointsList(List<Point> pointsList) {
    this.pointsList = pointsList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointArray pointArray = (PointArray) o;
    return Objects.equals(this.pointsList, pointArray.pointsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointArray {\n");
    sb.append("    pointsList: ").append(toIndentedString(pointsList)).append("\n");
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
