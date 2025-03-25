/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.   # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/** VisualExtendedFieldItem */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class VisualExtendedFieldItem {
  public static final String SERIALIZED_NAME_FIELD_TYPE = "FieldType";

  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  @javax.annotation.Nonnull
  private Integer fieldType;

  public static final String SERIALIZED_NAME_W_FIELD_TYPE = "wFieldType";

  @SerializedName(SERIALIZED_NAME_W_FIELD_TYPE)
  @javax.annotation.Nonnull
  private TextFieldType wFieldType;

  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";

  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  @javax.annotation.Nonnull
  private String fieldName;

  public static final String SERIALIZED_NAME_STRINGS_COUNT = "StringsCount";

  @SerializedName(SERIALIZED_NAME_STRINGS_COUNT)
  @javax.annotation.Nonnull
  private BigDecimal stringsCount;

  public static final String SERIALIZED_NAME_STRINGS_RESULT = "StringsResult";

  @SerializedName(SERIALIZED_NAME_STRINGS_RESULT)
  @javax.annotation.Nonnull
  private List<StringRecognitionResult> stringsResult;

  public static final String SERIALIZED_NAME_BUF_LENGTH = "Buf_Length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  @javax.annotation.Nonnull
  private BigDecimal bufLength;

  public static final String SERIALIZED_NAME_BUF_TEXT = "Buf_Text";

  @SerializedName(SERIALIZED_NAME_BUF_TEXT)
  @javax.annotation.Nonnull
  private String bufText;

  public static final String SERIALIZED_NAME_FIELD_MASK = "FieldMask";

  @SerializedName(SERIALIZED_NAME_FIELD_MASK)
  @javax.annotation.Nullable
  private String fieldMask;

  public static final String SERIALIZED_NAME_VALIDITY = "Validity";

  @SerializedName(SERIALIZED_NAME_VALIDITY)
  @javax.annotation.Nullable
  private Integer validity;

  public static final String SERIALIZED_NAME_IN_COMPARISON = "InComparison";

  @SerializedName(SERIALIZED_NAME_IN_COMPARISON)
  @javax.annotation.Nullable
  private Integer inComparison;

  public static final String SERIALIZED_NAME_W_L_C_I_D = "wLCID";

  @SerializedName(SERIALIZED_NAME_W_L_C_I_D)
  @javax.annotation.Nullable
  private Integer wLCID;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  @javax.annotation.Nullable
  private Integer reserved2;

  public static final String SERIALIZED_NAME_RESERVED3 = "Reserved3";

  @SerializedName(SERIALIZED_NAME_RESERVED3)
  @javax.annotation.Nullable
  private Integer reserved3;

  public VisualExtendedFieldItem() {}

  public VisualExtendedFieldItem fieldType(@javax.annotation.Nonnull Integer fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   *
   * @return fieldType
   */
  @javax.annotation.Nonnull
  public Integer getFieldType() {
    return fieldType;
  }

  public void setFieldType(@javax.annotation.Nonnull Integer fieldType) {
    this.fieldType = fieldType;
  }

  public VisualExtendedFieldItem wFieldType(@javax.annotation.Nonnull TextFieldType wFieldType) {
    this.wFieldType = wFieldType;
    return this;
  }

  /**
   * Get wFieldType
   *
   * @return wFieldType
   */
  @javax.annotation.Nonnull
  public TextFieldType getwFieldType() {
    return wFieldType;
  }

  public void setwFieldType(@javax.annotation.Nonnull TextFieldType wFieldType) {
    this.wFieldType = wFieldType;
  }

  public VisualExtendedFieldItem fieldName(@javax.annotation.Nonnull String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field symbolic name (null-terminated string)
   *
   * @return fieldName
   */
  @javax.annotation.Nonnull
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(@javax.annotation.Nonnull String fieldName) {
    this.fieldName = fieldName;
  }

  public VisualExtendedFieldItem stringsCount(@javax.annotation.Nonnull BigDecimal stringsCount) {
    this.stringsCount = stringsCount;
    return this;
  }

  /**
   * Number of StringsResult array elements
   *
   * @return stringsCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getStringsCount() {
    return stringsCount;
  }

  public void setStringsCount(@javax.annotation.Nonnull BigDecimal stringsCount) {
    this.stringsCount = stringsCount;
  }

  public VisualExtendedFieldItem stringsResult(
      @javax.annotation.Nonnull List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
    return this;
  }

  public VisualExtendedFieldItem addStringsResultItem(StringRecognitionResult stringsResultItem) {
    if (this.stringsResult == null) {
      this.stringsResult = new ArrayList<>();
    }
    this.stringsResult.add(stringsResultItem);
    return this;
  }

  /**
   * Array of recognizing probabilities for a each line of text field. Only for Result.VISUAL_TEXT
   * and Result.MRZ_TEXT results.
   *
   * @return stringsResult
   */
  @javax.annotation.Nonnull
  public List<StringRecognitionResult> getStringsResult() {
    return stringsResult;
  }

  public void setStringsResult(
      @javax.annotation.Nonnull List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
  }

  public VisualExtendedFieldItem bufLength(@javax.annotation.Nonnull BigDecimal bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Buf_Text text string length
   *
   * @return bufLength
   */
  @javax.annotation.Nonnull
  public BigDecimal getBufLength() {
    return bufLength;
  }

  public void setBufLength(@javax.annotation.Nonnull BigDecimal bufLength) {
    this.bufLength = bufLength;
  }

  public VisualExtendedFieldItem bufText(@javax.annotation.Nonnull String bufText) {
    this.bufText = bufText;
    return this;
  }

  /**
   * Text field data in UTF8 format. Results of reading different lines of a multi-line field are
   * separated by &#39;^&#39;
   *
   * @return bufText
   */
  @javax.annotation.Nonnull
  public String getBufText() {
    return bufText;
  }

  public void setBufText(@javax.annotation.Nonnull String bufText) {
    this.bufText = bufText;
  }

  public VisualExtendedFieldItem fieldMask(@javax.annotation.Nullable String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  /**
   * Get fieldMask
   *
   * @return fieldMask
   */
  @javax.annotation.Nullable
  public String getFieldMask() {
    return fieldMask;
  }

  public void setFieldMask(@javax.annotation.Nullable String fieldMask) {
    this.fieldMask = fieldMask;
  }

  public VisualExtendedFieldItem validity(@javax.annotation.Nullable Integer validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   *
   * @return validity
   */
  @javax.annotation.Nullable
  public Integer getValidity() {
    return validity;
  }

  public void setValidity(@javax.annotation.Nullable Integer validity) {
    this.validity = validity;
  }

  public VisualExtendedFieldItem inComparison(@javax.annotation.Nullable Integer inComparison) {
    this.inComparison = inComparison;
    return this;
  }

  /**
   * Get inComparison
   *
   * @return inComparison
   */
  @javax.annotation.Nullable
  public Integer getInComparison() {
    return inComparison;
  }

  public void setInComparison(@javax.annotation.Nullable Integer inComparison) {
    this.inComparison = inComparison;
  }

  public VisualExtendedFieldItem wLCID(@javax.annotation.Nullable Integer wLCID) {
    this.wLCID = wLCID;
    return this;
  }

  /**
   * Get wLCID
   *
   * @return wLCID
   */
  @javax.annotation.Nullable
  public Integer getwLCID() {
    return wLCID;
  }

  public void setwLCID(@javax.annotation.Nullable Integer wLCID) {
    this.wLCID = wLCID;
  }

  public VisualExtendedFieldItem reserved2(@javax.annotation.Nullable Integer reserved2) {
    this.reserved2 = reserved2;
    return this;
  }

  /**
   * Get reserved2
   *
   * @return reserved2
   */
  @javax.annotation.Nullable
  public Integer getReserved2() {
    return reserved2;
  }

  public void setReserved2(@javax.annotation.Nullable Integer reserved2) {
    this.reserved2 = reserved2;
  }

  public VisualExtendedFieldItem reserved3(@javax.annotation.Nullable Integer reserved3) {
    this.reserved3 = reserved3;
    return this;
  }

  /**
   * Get reserved3
   *
   * @return reserved3
   */
  @javax.annotation.Nullable
  public Integer getReserved3() {
    return reserved3;
  }

  public void setReserved3(@javax.annotation.Nullable Integer reserved3) {
    this.reserved3 = reserved3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisualExtendedFieldItem visualExtendedFieldItem = (VisualExtendedFieldItem) o;
    return Objects.equals(this.fieldType, visualExtendedFieldItem.fieldType)
        && Objects.equals(this.wFieldType, visualExtendedFieldItem.wFieldType)
        && Objects.equals(this.fieldName, visualExtendedFieldItem.fieldName)
        && Objects.equals(this.stringsCount, visualExtendedFieldItem.stringsCount)
        && Objects.equals(this.stringsResult, visualExtendedFieldItem.stringsResult)
        && Objects.equals(this.bufLength, visualExtendedFieldItem.bufLength)
        && Objects.equals(this.bufText, visualExtendedFieldItem.bufText)
        && Objects.equals(this.fieldMask, visualExtendedFieldItem.fieldMask)
        && Objects.equals(this.validity, visualExtendedFieldItem.validity)
        && Objects.equals(this.inComparison, visualExtendedFieldItem.inComparison)
        && Objects.equals(this.wLCID, visualExtendedFieldItem.wLCID)
        && Objects.equals(this.reserved2, visualExtendedFieldItem.reserved2)
        && Objects.equals(this.reserved3, visualExtendedFieldItem.reserved3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fieldType,
        wFieldType,
        fieldName,
        stringsCount,
        stringsResult,
        bufLength,
        bufText,
        fieldMask,
        validity,
        inComparison,
        wLCID,
        reserved2,
        reserved3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisualExtendedFieldItem {\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    wFieldType: ").append(toIndentedString(wFieldType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    stringsCount: ").append(toIndentedString(stringsCount)).append("\n");
    sb.append("    stringsResult: ").append(toIndentedString(stringsResult)).append("\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    bufText: ").append(toIndentedString(bufText)).append("\n");
    sb.append("    fieldMask: ").append(toIndentedString(fieldMask)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    inComparison: ").append(toIndentedString(inComparison)).append("\n");
    sb.append("    wLCID: ").append(toIndentedString(wLCID)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
    sb.append("    reserved3: ").append(toIndentedString(reserved3)).append("\n");
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
    openapiFields.add("FieldType");
    openapiFields.add("wFieldType");
    openapiFields.add("FieldName");
    openapiFields.add("StringsCount");
    openapiFields.add("StringsResult");
    openapiFields.add("Buf_Length");
    openapiFields.add("Buf_Text");
    openapiFields.add("FieldMask");
    openapiFields.add("Validity");
    openapiFields.add("InComparison");
    openapiFields.add("wLCID");
    openapiFields.add("Reserved2");
    openapiFields.add("Reserved3");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FieldType");
    openapiRequiredFields.add("wFieldType");
    openapiRequiredFields.add("FieldName");
    openapiRequiredFields.add("StringsCount");
    openapiRequiredFields.add("StringsResult");
    openapiRequiredFields.add("Buf_Length");
    openapiRequiredFields.add("Buf_Text");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VisualExtendedFieldItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!VisualExtendedFieldItem.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in VisualExtendedFieldItem is not found in the empty JSON string",
                VisualExtendedFieldItem.openapiRequiredFields.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `wFieldType`
    TextFieldType.validateJsonElement(jsonObj.get("wFieldType"));
    if (!jsonObj.get("FieldName").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `FieldName` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("FieldName").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("StringsResult").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `StringsResult` to be an array in the JSON string but got `%s`",
              jsonObj.get("StringsResult").toString()));
    }

    JsonArray jsonArraystringsResult = jsonObj.getAsJsonArray("StringsResult");
    // validate the required field `StringsResult` (array)
    for (int i = 0; i < jsonArraystringsResult.size(); i++) {
      StringRecognitionResult.validateJsonElement(jsonArraystringsResult.get(i));
    }
    ;
    if (!jsonObj.get("Buf_Text").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Buf_Text` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Buf_Text").toString()));
    }
    if ((jsonObj.get("FieldMask") != null && !jsonObj.get("FieldMask").isJsonNull())
        && !jsonObj.get("FieldMask").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `FieldMask` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("FieldMask").toString()));
    }
  }

  /**
   * Create an instance of VisualExtendedFieldItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VisualExtendedFieldItem
   * @throws IOException if the JSON string is invalid with respect to VisualExtendedFieldItem
   */
  public static VisualExtendedFieldItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VisualExtendedFieldItem.class);
  }

  /**
   * Convert an instance of VisualExtendedFieldItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
