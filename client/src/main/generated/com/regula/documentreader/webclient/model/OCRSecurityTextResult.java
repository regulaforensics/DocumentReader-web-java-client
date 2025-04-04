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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** OCRSecurityTextResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class OCRSecurityTextResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_CRITICAL_FLAG = "CriticalFlag";

  @SerializedName(SERIALIZED_NAME_CRITICAL_FLAG)
  @javax.annotation.Nonnull
  private Critical criticalFlag;

  public static final String SERIALIZED_NAME_LIGHT_TYPE = "LightType";

  @SerializedName(SERIALIZED_NAME_LIGHT_TYPE)
  @javax.annotation.Nonnull
  private Light lightType;

  public static final String SERIALIZED_NAME_FIELD_RECT = "FieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  @javax.annotation.Nonnull
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_ETALON_RESULT_TYPE = "EtalonResultType";

  @SerializedName(SERIALIZED_NAME_ETALON_RESULT_TYPE)
  @javax.annotation.Nonnull
  private Integer etalonResultType;

  public static final String SERIALIZED_NAME_ETALON_FIELD_TYPE = "EtalonFieldType";

  @SerializedName(SERIALIZED_NAME_ETALON_FIELD_TYPE)
  @javax.annotation.Nonnull
  private Integer etalonFieldType;

  public static final String SERIALIZED_NAME_ETALON_LIGHT_TYPE = "EtalonLightType";

  @SerializedName(SERIALIZED_NAME_ETALON_LIGHT_TYPE)
  @javax.annotation.Nonnull
  private Integer etalonLightType;

  public static final String SERIALIZED_NAME_ETALON_FIELD_RECT = "EtalonFieldRect";

  @SerializedName(SERIALIZED_NAME_ETALON_FIELD_RECT)
  @javax.annotation.Nonnull
  private RectangleCoordinates etalonFieldRect;

  public static final String SERIALIZED_NAME_SECURITY_TEXT_RESULT_O_C_R = "SecurityTextResultOCR";

  @SerializedName(SERIALIZED_NAME_SECURITY_TEXT_RESULT_O_C_R)
  @javax.annotation.Nonnull
  private String securityTextResultOCR;

  public static final String SERIALIZED_NAME_ETALON_RESULT_O_C_R = "EtalonResultOCR";

  @SerializedName(SERIALIZED_NAME_ETALON_RESULT_O_C_R)
  @javax.annotation.Nonnull
  private String etalonResultOCR;

  public static final String SERIALIZED_NAME_RESERVED1 = "Reserved1";

  @SerializedName(SERIALIZED_NAME_RESERVED1)
  @javax.annotation.Nullable
  private Integer reserved1;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  @javax.annotation.Nullable
  private Integer reserved2;

  public OCRSecurityTextResult() {}

  public OCRSecurityTextResult criticalFlag(@javax.annotation.Nonnull Critical criticalFlag) {
    this.criticalFlag = criticalFlag;
    return this;
  }

  /**
   * Get criticalFlag
   *
   * @return criticalFlag
   */
  @javax.annotation.Nonnull
  public Critical getCriticalFlag() {
    return criticalFlag;
  }

  public void setCriticalFlag(@javax.annotation.Nonnull Critical criticalFlag) {
    this.criticalFlag = criticalFlag;
  }

  public OCRSecurityTextResult lightType(@javax.annotation.Nonnull Light lightType) {
    this.lightType = lightType;
    return this;
  }

  /**
   * Get lightType
   *
   * @return lightType
   */
  @javax.annotation.Nonnull
  public Light getLightType() {
    return lightType;
  }

  public void setLightType(@javax.annotation.Nonnull Light lightType) {
    this.lightType = lightType;
  }

  public OCRSecurityTextResult fieldRect(@javax.annotation.Nonnull RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
    return this;
  }

  /**
   * Get fieldRect
   *
   * @return fieldRect
   */
  @javax.annotation.Nonnull
  public RectangleCoordinates getFieldRect() {
    return fieldRect;
  }

  public void setFieldRect(@javax.annotation.Nonnull RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
  }

  public OCRSecurityTextResult etalonResultType(
      @javax.annotation.Nonnull Integer etalonResultType) {
    this.etalonResultType = etalonResultType;
    return this;
  }

  /**
   * Get etalonResultType
   *
   * @return etalonResultType
   */
  @javax.annotation.Nonnull
  public Integer getEtalonResultType() {
    return etalonResultType;
  }

  public void setEtalonResultType(@javax.annotation.Nonnull Integer etalonResultType) {
    this.etalonResultType = etalonResultType;
  }

  public OCRSecurityTextResult etalonFieldType(@javax.annotation.Nonnull Integer etalonFieldType) {
    this.etalonFieldType = etalonFieldType;
    return this;
  }

  /**
   * Get etalonFieldType
   *
   * @return etalonFieldType
   */
  @javax.annotation.Nonnull
  public Integer getEtalonFieldType() {
    return etalonFieldType;
  }

  public void setEtalonFieldType(@javax.annotation.Nonnull Integer etalonFieldType) {
    this.etalonFieldType = etalonFieldType;
  }

  public OCRSecurityTextResult etalonLightType(@javax.annotation.Nonnull Integer etalonLightType) {
    this.etalonLightType = etalonLightType;
    return this;
  }

  /**
   * Get etalonLightType
   *
   * @return etalonLightType
   */
  @javax.annotation.Nonnull
  public Integer getEtalonLightType() {
    return etalonLightType;
  }

  public void setEtalonLightType(@javax.annotation.Nonnull Integer etalonLightType) {
    this.etalonLightType = etalonLightType;
  }

  public OCRSecurityTextResult etalonFieldRect(
      @javax.annotation.Nonnull RectangleCoordinates etalonFieldRect) {
    this.etalonFieldRect = etalonFieldRect;
    return this;
  }

  /**
   * Get etalonFieldRect
   *
   * @return etalonFieldRect
   */
  @javax.annotation.Nonnull
  public RectangleCoordinates getEtalonFieldRect() {
    return etalonFieldRect;
  }

  public void setEtalonFieldRect(@javax.annotation.Nonnull RectangleCoordinates etalonFieldRect) {
    this.etalonFieldRect = etalonFieldRect;
  }

  public OCRSecurityTextResult securityTextResultOCR(
      @javax.annotation.Nonnull String securityTextResultOCR) {
    this.securityTextResultOCR = securityTextResultOCR;
    return this;
  }

  /**
   * Get securityTextResultOCR
   *
   * @return securityTextResultOCR
   */
  @javax.annotation.Nonnull
  public String getSecurityTextResultOCR() {
    return securityTextResultOCR;
  }

  public void setSecurityTextResultOCR(@javax.annotation.Nonnull String securityTextResultOCR) {
    this.securityTextResultOCR = securityTextResultOCR;
  }

  public OCRSecurityTextResult etalonResultOCR(@javax.annotation.Nonnull String etalonResultOCR) {
    this.etalonResultOCR = etalonResultOCR;
    return this;
  }

  /**
   * Get etalonResultOCR
   *
   * @return etalonResultOCR
   */
  @javax.annotation.Nonnull
  public String getEtalonResultOCR() {
    return etalonResultOCR;
  }

  public void setEtalonResultOCR(@javax.annotation.Nonnull String etalonResultOCR) {
    this.etalonResultOCR = etalonResultOCR;
  }

  public OCRSecurityTextResult reserved1(@javax.annotation.Nullable Integer reserved1) {
    this.reserved1 = reserved1;
    return this;
  }

  /**
   * Get reserved1
   *
   * @return reserved1
   */
  @javax.annotation.Nullable
  public Integer getReserved1() {
    return reserved1;
  }

  public void setReserved1(@javax.annotation.Nullable Integer reserved1) {
    this.reserved1 = reserved1;
  }

  public OCRSecurityTextResult reserved2(@javax.annotation.Nullable Integer reserved2) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRSecurityTextResult ocRSecurityTextResult = (OCRSecurityTextResult) o;
    return Objects.equals(this.criticalFlag, ocRSecurityTextResult.criticalFlag)
        && Objects.equals(this.lightType, ocRSecurityTextResult.lightType)
        && Objects.equals(this.fieldRect, ocRSecurityTextResult.fieldRect)
        && Objects.equals(this.etalonResultType, ocRSecurityTextResult.etalonResultType)
        && Objects.equals(this.etalonFieldType, ocRSecurityTextResult.etalonFieldType)
        && Objects.equals(this.etalonLightType, ocRSecurityTextResult.etalonLightType)
        && Objects.equals(this.etalonFieldRect, ocRSecurityTextResult.etalonFieldRect)
        && Objects.equals(this.securityTextResultOCR, ocRSecurityTextResult.securityTextResultOCR)
        && Objects.equals(this.etalonResultOCR, ocRSecurityTextResult.etalonResultOCR)
        && Objects.equals(this.reserved1, ocRSecurityTextResult.reserved1)
        && Objects.equals(this.reserved2, ocRSecurityTextResult.reserved2)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        criticalFlag,
        lightType,
        fieldRect,
        etalonResultType,
        etalonFieldType,
        etalonLightType,
        etalonFieldRect,
        securityTextResultOCR,
        etalonResultOCR,
        reserved1,
        reserved2,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRSecurityTextResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    criticalFlag: ").append(toIndentedString(criticalFlag)).append("\n");
    sb.append("    lightType: ").append(toIndentedString(lightType)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    etalonResultType: ").append(toIndentedString(etalonResultType)).append("\n");
    sb.append("    etalonFieldType: ").append(toIndentedString(etalonFieldType)).append("\n");
    sb.append("    etalonLightType: ").append(toIndentedString(etalonLightType)).append("\n");
    sb.append("    etalonFieldRect: ").append(toIndentedString(etalonFieldRect)).append("\n");
    sb.append("    securityTextResultOCR: ")
        .append(toIndentedString(securityTextResultOCR))
        .append("\n");
    sb.append("    etalonResultOCR: ").append(toIndentedString(etalonResultOCR)).append("\n");
    sb.append("    reserved1: ").append(toIndentedString(reserved1)).append("\n");
    sb.append("    reserved2: ").append(toIndentedString(reserved2)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("ElementResult");
    openapiFields.add("ElementDiagnose");
    openapiFields.add("PercentValue");
    openapiFields.add("CriticalFlag");
    openapiFields.add("LightType");
    openapiFields.add("FieldRect");
    openapiFields.add("EtalonResultType");
    openapiFields.add("EtalonFieldType");
    openapiFields.add("EtalonLightType");
    openapiFields.add("EtalonFieldRect");
    openapiFields.add("SecurityTextResultOCR");
    openapiFields.add("EtalonResultOCR");
    openapiFields.add("Reserved1");
    openapiFields.add("Reserved2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CriticalFlag");
    openapiRequiredFields.add("LightType");
    openapiRequiredFields.add("FieldRect");
    openapiRequiredFields.add("EtalonResultType");
    openapiRequiredFields.add("EtalonFieldType");
    openapiRequiredFields.add("EtalonLightType");
    openapiRequiredFields.add("EtalonFieldRect");
    openapiRequiredFields.add("SecurityTextResultOCR");
    openapiRequiredFields.add("EtalonResultOCR");
    openapiRequiredFields.add("Type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OCRSecurityTextResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!OCRSecurityTextResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in OCRSecurityTextResult is not found in the empty JSON string",
                OCRSecurityTextResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!OCRSecurityTextResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `OCRSecurityTextResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : OCRSecurityTextResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!OCRSecurityTextResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'OCRSecurityTextResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<OCRSecurityTextResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(OCRSecurityTextResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<OCRSecurityTextResult>() {
            @Override
            public void write(JsonWriter out, OCRSecurityTextResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public OCRSecurityTextResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of OCRSecurityTextResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OCRSecurityTextResult
   * @throws IOException if the JSON string is invalid with respect to OCRSecurityTextResult
   */
  public static OCRSecurityTextResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCRSecurityTextResult.class);
  }

  /**
   * Convert an instance of OCRSecurityTextResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
