/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;

/** Common fields for all result objects */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ResultItem {
  public static final String SERIALIZED_NAME_BUF_LENGTH = "buf_length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  @javax.annotation.Nullable
  private Integer bufLength;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  @javax.annotation.Nullable
  private Integer light;

  public static final String SERIALIZED_NAME_LIST_IDX = "list_idx";

  @SerializedName(SERIALIZED_NAME_LIST_IDX)
  @javax.annotation.Nullable
  private Integer listIdx;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  @javax.annotation.Nullable
  private Integer pageIdx;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";

  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  @javax.annotation.Nonnull
  protected Integer resultType = 0;

  public ResultItem() {}

  public ResultItem bufLength(@javax.annotation.Nullable Integer bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Get bufLength
   *
   * @return bufLength
   */
  @javax.annotation.Nullable
  public Integer getBufLength() {
    return bufLength;
  }

  public void setBufLength(@javax.annotation.Nullable Integer bufLength) {
    this.bufLength = bufLength;
  }

  public ResultItem light(@javax.annotation.Nullable Integer light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   *
   * @return light
   */
  @javax.annotation.Nullable
  public Integer getLight() {
    return light;
  }

  public void setLight(@javax.annotation.Nullable Integer light) {
    this.light = light;
  }

  public ResultItem listIdx(@javax.annotation.Nullable Integer listIdx) {
    this.listIdx = listIdx;
    return this;
  }

  /**
   * Get listIdx
   *
   * @return listIdx
   */
  @javax.annotation.Nullable
  public Integer getListIdx() {
    return listIdx;
  }

  public void setListIdx(@javax.annotation.Nullable Integer listIdx) {
    this.listIdx = listIdx;
  }

  public ResultItem pageIdx(@javax.annotation.Nullable Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * Get pageIdx
   *
   * @return pageIdx
   */
  @javax.annotation.Nullable
  public Integer getPageIdx() {
    return pageIdx;
  }

  public void setPageIdx(@javax.annotation.Nullable Integer pageIdx) {
    this.pageIdx = pageIdx;
  }

  public ResultItem resultType(@javax.annotation.Nonnull Integer resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return resultType
   */
  @javax.annotation.Nonnull
  public Integer getResultType() {
    return resultType;
  }

  public void setResultType(@javax.annotation.Nonnull Integer resultType) {
    this.resultType = resultType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultItem resultItem = (ResultItem) o;
    return Objects.equals(this.bufLength, resultItem.bufLength)
        && Objects.equals(this.light, resultItem.light)
        && Objects.equals(this.listIdx, resultItem.listIdx)
        && Objects.equals(this.pageIdx, resultItem.pageIdx)
        && Objects.equals(this.resultType, resultItem.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufLength, light, listIdx, pageIdx, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultItem {\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    listIdx: ").append(toIndentedString(listIdx)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("buf_length");
    openapiFields.add("light");
    openapiFields.add("list_idx");
    openapiFields.add("page_idx");
    openapiFields.add("result_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("result_type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ResultItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ResultItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ResultItem is not found in the empty JSON string",
                ResultItem.openapiRequiredFields.toString()));
      }
    }

    String discriminatorValue = jsonElement.getAsJsonObject().get("result_type").getAsString();
    switch (discriminatorValue) {
      case "1":
        DocumentImageResult.validateJsonElement(jsonElement);
        break;
      case "101":
        DocumentBinaryInfoResult.validateJsonElement(jsonElement);
        break;
      case "102":
        TextDataResult.validateJsonElement(jsonElement);
        break;
      case "103":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "104":
        DocumentBinaryInfoResult.validateJsonElement(jsonElement);
        break;
      case "105":
        RFIDGraphicsInfoResult.validateJsonElement(jsonElement);
        break;
      case "109":
        ByteArrayResult.validateJsonElement(jsonElement);
        break;
      case "15":
        LexicalAnalysisResult.validateJsonElement(jsonElement);
        break;
      case "16":
        DocumentImageResult.validateJsonElement(jsonElement);
        break;
      case "17":
        TextDataResult.validateJsonElement(jsonElement);
        break;
      case "18":
        TextDataResult.validateJsonElement(jsonElement);
        break;
      case "19":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "20":
        AuthenticityResult.validateJsonElement(jsonElement);
        break;
      case "26":
        TextDataResult.validateJsonElement(jsonElement);
        break;
      case "3":
        TextDataResult.validateJsonElement(jsonElement);
        break;
      case "30":
        ImageQualityResult.validateJsonElement(jsonElement);
        break;
      case "32":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "33":
        StatusResult.validateJsonElement(jsonElement);
        break;
      case "34":
        AuthenticityResult.validateJsonElement(jsonElement);
        break;
      case "35":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "36":
        TextResult.validateJsonElement(jsonElement);
        break;
      case "37":
        ImagesResult.validateJsonElement(jsonElement);
        break;
      case "38":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "39":
        AuthenticityResult.validateJsonElement(jsonElement);
        break;
      case "49":
        EncryptedRCLResult.validateJsonElement(jsonElement);
        break;
      case "5":
        DocBarCodeInfo.validateJsonElement(jsonElement);
        break;
      case "50":
        LicenseResult.validateJsonElement(jsonElement);
        break;
      case "6":
        GraphicsResult.validateJsonElement(jsonElement);
        break;
      case "61":
        MRZPositionResult.validateJsonElement(jsonElement);
        break;
      case "62":
        DocumentPositionResult.validateJsonElement(jsonElement);
        break;
      case "7":
        MRZTestQualityResult.validateJsonElement(jsonElement);
        break;
      case "8":
        DocumentTypesCandidatesResult.validateJsonElement(jsonElement);
        break;
      case "85":
        DocumentPositionResult.validateJsonElement(jsonElement);
        break;
      case "87":
        MRZDetectorResult.validateJsonElement(jsonElement);
        break;
      case "9":
        ChosenDocumentTypeResult.validateJsonElement(jsonElement);
        break;
      case "97":
        FaceDetectionResult.validateJsonElement(jsonElement);
        break;
      default:
        throw new IllegalArgumentException(
            String.format(
                "The value of the `result_type` field `%s` does not match any key defined in the discriminator's mapping.",
                discriminatorValue));
    }
  }

  /**
   * Create an instance of ResultItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResultItem
   * @throws IOException if the JSON string is invalid with respect to ResultItem
   */
  public static ResultItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResultItem.class);
  }

  /**
   * Convert an instance of ResultItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
