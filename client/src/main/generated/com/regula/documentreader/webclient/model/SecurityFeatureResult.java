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

/** SecurityFeatureResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class SecurityFeatureResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "ElementType";

  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  @javax.annotation.Nonnull
  private SecurityFeatureType elementType;

  public static final String SERIALIZED_NAME_ELEMENT_RECT = "ElementRect";

  @SerializedName(SERIALIZED_NAME_ELEMENT_RECT)
  @javax.annotation.Nonnull
  private RectangleCoordinates elementRect;

  public static final String SERIALIZED_NAME_VISIBILITY = "Visibility";

  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  @javax.annotation.Nonnull
  private Visibility visibility;

  public static final String SERIALIZED_NAME_CRITICAL_FLAG = "CriticalFlag";

  @SerializedName(SERIALIZED_NAME_CRITICAL_FLAG)
  @javax.annotation.Nonnull
  private Critical criticalFlag;

  public static final String SERIALIZED_NAME_AREA_LIST = "AreaList";

  @SerializedName(SERIALIZED_NAME_AREA_LIST)
  @javax.annotation.Nullable
  private AreaContainer areaList;

  public static final String SERIALIZED_NAME_RESERVED2 = "Reserved2";

  @SerializedName(SERIALIZED_NAME_RESERVED2)
  @javax.annotation.Nullable
  private Integer reserved2;

  public SecurityFeatureResult() {}

  public SecurityFeatureResult elementType(
      @javax.annotation.Nonnull SecurityFeatureType elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @javax.annotation.Nonnull
  public SecurityFeatureType getElementType() {
    return elementType;
  }

  public void setElementType(@javax.annotation.Nonnull SecurityFeatureType elementType) {
    this.elementType = elementType;
  }

  public SecurityFeatureResult elementRect(
      @javax.annotation.Nonnull RectangleCoordinates elementRect) {
    this.elementRect = elementRect;
    return this;
  }

  /**
   * Get elementRect
   *
   * @return elementRect
   */
  @javax.annotation.Nonnull
  public RectangleCoordinates getElementRect() {
    return elementRect;
  }

  public void setElementRect(@javax.annotation.Nonnull RectangleCoordinates elementRect) {
    this.elementRect = elementRect;
  }

  public SecurityFeatureResult visibility(@javax.annotation.Nonnull Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   *
   * @return visibility
   */
  @javax.annotation.Nonnull
  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(@javax.annotation.Nonnull Visibility visibility) {
    this.visibility = visibility;
  }

  public SecurityFeatureResult criticalFlag(@javax.annotation.Nonnull Critical criticalFlag) {
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

  public SecurityFeatureResult areaList(@javax.annotation.Nullable AreaContainer areaList) {
    this.areaList = areaList;
    return this;
  }

  /**
   * Get areaList
   *
   * @return areaList
   */
  @javax.annotation.Nullable
  public AreaContainer getAreaList() {
    return areaList;
  }

  public void setAreaList(@javax.annotation.Nullable AreaContainer areaList) {
    this.areaList = areaList;
  }

  public SecurityFeatureResult reserved2(@javax.annotation.Nullable Integer reserved2) {
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
    SecurityFeatureResult securityFeatureResult = (SecurityFeatureResult) o;
    return Objects.equals(this.elementType, securityFeatureResult.elementType)
        && Objects.equals(this.elementRect, securityFeatureResult.elementRect)
        && Objects.equals(this.visibility, securityFeatureResult.visibility)
        && Objects.equals(this.criticalFlag, securityFeatureResult.criticalFlag)
        && Objects.equals(this.areaList, securityFeatureResult.areaList)
        && Objects.equals(this.reserved2, securityFeatureResult.reserved2)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elementType, elementRect, visibility, criticalFlag, areaList, reserved2, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFeatureResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    elementRect: ").append(toIndentedString(elementRect)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    criticalFlag: ").append(toIndentedString(criticalFlag)).append("\n");
    sb.append("    areaList: ").append(toIndentedString(areaList)).append("\n");
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
    openapiFields.add("ElementType");
    openapiFields.add("ElementRect");
    openapiFields.add("Visibility");
    openapiFields.add("CriticalFlag");
    openapiFields.add("AreaList");
    openapiFields.add("Reserved2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ElementType");
    openapiRequiredFields.add("ElementRect");
    openapiRequiredFields.add("Visibility");
    openapiRequiredFields.add("CriticalFlag");
    openapiRequiredFields.add("Type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SecurityFeatureResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!SecurityFeatureResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in SecurityFeatureResult is not found in the empty JSON string",
                SecurityFeatureResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!SecurityFeatureResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `SecurityFeatureResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : SecurityFeatureResult.openapiRequiredFields) {
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
      if (!SecurityFeatureResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'SecurityFeatureResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SecurityFeatureResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(SecurityFeatureResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<SecurityFeatureResult>() {
            @Override
            public void write(JsonWriter out, SecurityFeatureResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public SecurityFeatureResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of SecurityFeatureResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SecurityFeatureResult
   * @throws IOException if the JSON string is invalid with respect to SecurityFeatureResult
   */
  public static SecurityFeatureResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityFeatureResult.class);
  }

  /**
   * Convert an instance of SecurityFeatureResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
