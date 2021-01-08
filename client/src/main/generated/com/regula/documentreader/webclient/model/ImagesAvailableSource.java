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
import java.util.Objects;

/** ImagesAvailableSource */
public class ImagesAvailableSource {
  public static final String SERIALIZED_NAME_CONTAINER_TYPE = "containerType";

  @SerializedName(SERIALIZED_NAME_CONTAINER_TYPE)
  private Integer containerType = 0;

  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public ImagesAvailableSource withContainerType(Integer containerType) {
    this.containerType = containerType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return containerType
   */
  @javax.annotation.Nullable
  public Integer getContainerType() {
    return containerType;
  }

  public void setContainerType(Integer containerType) {
    this.containerType = containerType;
  }

  public ImagesAvailableSource withSource(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesAvailableSource imagesAvailableSource = (ImagesAvailableSource) o;
    return Objects.equals(this.containerType, imagesAvailableSource.containerType)
        && Objects.equals(this.source, imagesAvailableSource.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerType, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesAvailableSource {\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
