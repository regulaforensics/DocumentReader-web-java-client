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
import java.util.UUID;

/** InlineResponse200 */
public class InlineResponse200 {
  public static final String SERIALIZED_NAME_OUT_DATA = "OutData";

  @SerializedName(SERIALIZED_NAME_OUT_DATA)
  private OutData outData;

  public static final String SERIALIZED_NAME_IN_DATA = "InData";

  @SerializedName(SERIALIZED_NAME_IN_DATA)
  private InData inData;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";

  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private UUID transactionId;

  public InlineResponse200 withOutData(OutData outData) {
    this.outData = outData;
    return this;
  }

  /**
   * Get outData
   *
   * @return outData
   */
  @javax.annotation.Nullable
  public OutData getOutData() {
    return outData;
  }

  public void setOutData(OutData outData) {
    this.outData = outData;
  }

  public InlineResponse200 withInData(InData inData) {
    this.inData = inData;
    return this;
  }

  /**
   * Get inData
   *
   * @return inData
   */
  @javax.annotation.Nullable
  public InData getInData() {
    return inData;
  }

  public void setInData(InData inData) {
    this.inData = inData;
  }

  public InlineResponse200 withTag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   *
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public InlineResponse200 withTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   *
   * @return transactionId
   */
  @javax.annotation.Nullable
  public UUID getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(UUID transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.outData, inlineResponse200.outData)
        && Objects.equals(this.inData, inlineResponse200.inData)
        && Objects.equals(this.tag, inlineResponse200.tag)
        && Objects.equals(this.transactionId, inlineResponse200.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outData, inData, tag, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    outData: ").append(toIndentedString(outData)).append("\n");
    sb.append("    inData: ").append(toIndentedString(inData)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
