/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.9.0
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

/**
 * A search filter that can be applied if the \&quot;match+search\&quot; mode is enabled. May
 * include limit, threshold, group_ids. If the group_ids are specified, the search is performed only
 * in these groups. Find more information in the &lt;a
 * href&#x3D;\&quot;https://dev.regulaforensics.com/FaceSDK-web-openapi/#tag/search/operation/search\&quot;
 * target&#x3D;\&quot;_blank\&quot;&gt;OpenAPI documentation&lt;/a&gt;.
 */
public class FaceApiSearch {
  public static final String SERIALIZED_NAME_LIMIT = "limit";

  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";

  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Float threshold = null;

  public static final String SERIALIZED_NAME_GROUP_IDS = "group_ids";

  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<Integer> groupIds = null;

  public FaceApiSearch withLimit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum number of results to be returned.
   *
   * @return limit
   */
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public FaceApiSearch withThreshold(Float threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * The similarity threshold.
   *
   * @return threshold
   */
  @javax.annotation.Nullable
  public Float getThreshold() {
    return threshold;
  }

  public void setThreshold(Float threshold) {
    this.threshold = threshold;
  }

  public FaceApiSearch withGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public FaceApiSearch addGroupIdsItem(Integer groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<Integer>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * The groups where to conduct the search.
   *
   * @return groupIds
   */
  @javax.annotation.Nullable
  public List<Integer> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceApiSearch faceApiSearch = (FaceApiSearch) o;
    return Objects.equals(this.limit, faceApiSearch.limit)
        && Objects.equals(this.threshold, faceApiSearch.threshold)
        && Objects.equals(this.groupIds, faceApiSearch.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, threshold, groupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceApiSearch {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
