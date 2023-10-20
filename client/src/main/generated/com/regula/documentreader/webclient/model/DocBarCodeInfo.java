/*
 * Regula Document Reader Web
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

/** Raw data from BarCodes */
public class DocBarCodeInfo extends ResultItem {
  public static final String SERIALIZED_NAME_DOC_BAR_CODE_INFO = "DocBarCodeInfo";

  @SerializedName(SERIALIZED_NAME_DOC_BAR_CODE_INFO)
  private DocBarCodeInfoFieldsList docBarCodeInfo;

  public DocBarCodeInfo withDocBarCodeInfo(DocBarCodeInfoFieldsList docBarCodeInfo) {
    this.docBarCodeInfo = docBarCodeInfo;
    return this;
  }

  /**
   * Get docBarCodeInfo
   *
   * @return docBarCodeInfo
   */
  @javax.annotation.Nullable
  public DocBarCodeInfoFieldsList getDocBarCodeInfo() {
    return docBarCodeInfo;
  }

  public void setDocBarCodeInfo(DocBarCodeInfoFieldsList docBarCodeInfo) {
    this.docBarCodeInfo = docBarCodeInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocBarCodeInfo docBarCodeInfo = (DocBarCodeInfo) o;
    return Objects.equals(this.docBarCodeInfo, docBarCodeInfo.docBarCodeInfo) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docBarCodeInfo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocBarCodeInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    docBarCodeInfo: ").append(toIndentedString(docBarCodeInfo)).append("\n");
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
