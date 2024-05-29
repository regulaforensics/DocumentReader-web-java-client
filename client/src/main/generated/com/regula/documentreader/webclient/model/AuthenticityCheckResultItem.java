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
import java.util.Objects;

/** Common fields for all authenticity result objects */
public class AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_TYPE = "Type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  protected Integer type = 0;

  public static final String SERIALIZED_NAME_ELEMENT_RESULT = "ElementResult";

  @SerializedName(SERIALIZED_NAME_ELEMENT_RESULT)
  private Integer elementResult;

  public static final String SERIALIZED_NAME_ELEMENT_DIAGNOSE = "ElementDiagnose";

  @SerializedName(SERIALIZED_NAME_ELEMENT_DIAGNOSE)
  private Integer elementDiagnose;

  public AuthenticityCheckResultItem withType(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Same as authenticity result type, but used for safe parsing of not-described values:
   * https://docs.regulaforensics.com/develop/doc-reader-sdk/web-service/development/enums/authenticity-result-type/
   *
   * @return type
   */
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public AuthenticityCheckResultItem withElementResult(Integer elementResult) {
    this.elementResult = elementResult;
    return this;
  }

  /**
   * Get elementResult
   *
   * @return elementResult
   */
  @javax.annotation.Nullable
  public Integer getElementResult() {
    return elementResult;
  }

  public void setElementResult(Integer elementResult) {
    this.elementResult = elementResult;
  }

  public AuthenticityCheckResultItem withElementDiagnose(Integer elementDiagnose) {
    this.elementDiagnose = elementDiagnose;
    return this;
  }

  /**
   * Get elementDiagnose
   *
   * @return elementDiagnose
   */
  @javax.annotation.Nullable
  public Integer getElementDiagnose() {
    return elementDiagnose;
  }

  public void setElementDiagnose(Integer elementDiagnose) {
    this.elementDiagnose = elementDiagnose;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticityCheckResultItem authenticityCheckResultItem = (AuthenticityCheckResultItem) o;
    return Objects.equals(this.type, authenticityCheckResultItem.type)
        && Objects.equals(this.elementResult, authenticityCheckResultItem.elementResult)
        && Objects.equals(this.elementDiagnose, authenticityCheckResultItem.elementDiagnose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, elementResult, elementDiagnose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticityCheckResultItem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elementResult: ").append(toIndentedString(elementResult)).append("\n");
    sb.append("    elementDiagnose: ").append(toIndentedString(elementDiagnose)).append("\n");
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
