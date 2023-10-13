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
import java.util.Objects;

/** Contains information about document position on the input image, its center, angle, etc */
public class DocumentPositionResult extends ResultItem {
  public static final String SERIALIZED_NAME_DOCUMENT_POSITION = "DocumentPosition";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_POSITION)
  private DocumentPosition documentPosition;

  public DocumentPositionResult withDocumentPosition(DocumentPosition documentPosition) {
    this.documentPosition = documentPosition;
    return this;
  }

  /**
   * Get documentPosition
   *
   * @return documentPosition
   */
  @javax.annotation.Nullable
  public DocumentPosition getDocumentPosition() {
    return documentPosition;
  }

  public void setDocumentPosition(DocumentPosition documentPosition) {
    this.documentPosition = documentPosition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPositionResult documentPositionResult = (DocumentPositionResult) o;
    return Objects.equals(this.documentPosition, documentPositionResult.documentPosition)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentPosition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPositionResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentPosition: ").append(toIndentedString(documentPosition)).append("\n");
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
