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

/** Information about one graphic field, which is a RFID */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class GraphicFieldRfid extends GraphicField {
  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_D_G = "RFID_OriginDG";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_D_G)
  @javax.annotation.Nonnull
  private RfidDataGroupTypeTag rfIDOriginDG;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_D_G_TAG = "RFID_OriginDGTag";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_D_G_TAG)
  @javax.annotation.Nonnull
  private Integer rfIDOriginDGTag;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY = "RFID_OriginTagEntry";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY)
  @javax.annotation.Nonnull
  private Integer rfIDOriginTagEntry;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_ENTRY_VIEW = "RFID_OriginEntryView";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_ENTRY_VIEW)
  @javax.annotation.Nonnull
  private Integer rfIDOriginEntryView;

  public GraphicFieldRfid() {}

  public GraphicFieldRfid rfIDOriginDG(
      @javax.annotation.Nonnull RfidDataGroupTypeTag rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
    return this;
  }

  /**
   * Get rfIDOriginDG
   *
   * @return rfIDOriginDG
   */
  @javax.annotation.Nonnull
  public RfidDataGroupTypeTag getRfIDOriginDG() {
    return rfIDOriginDG;
  }

  public void setRfIDOriginDG(@javax.annotation.Nonnull RfidDataGroupTypeTag rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
  }

  public GraphicFieldRfid rfIDOriginDGTag(@javax.annotation.Nonnull Integer rfIDOriginDGTag) {
    this.rfIDOriginDGTag = rfIDOriginDGTag;
    return this;
  }

  /**
   * Index of the source record of the image with biometric information in the information data
   * group. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginDGTag
   */
  @javax.annotation.Nonnull
  public Integer getRfIDOriginDGTag() {
    return rfIDOriginDGTag;
  }

  public void setRfIDOriginDGTag(@javax.annotation.Nonnull Integer rfIDOriginDGTag) {
    this.rfIDOriginDGTag = rfIDOriginDGTag;
  }

  public GraphicFieldRfid rfIDOriginTagEntry(@javax.annotation.Nonnull Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
    return this;
  }

  /**
   * Index of the template in the record with biometric data. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginTagEntry
   */
  @javax.annotation.Nonnull
  public Integer getRfIDOriginTagEntry() {
    return rfIDOriginTagEntry;
  }

  public void setRfIDOriginTagEntry(@javax.annotation.Nonnull Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
  }

  public GraphicFieldRfid rfIDOriginEntryView(
      @javax.annotation.Nonnull Integer rfIDOriginEntryView) {
    this.rfIDOriginEntryView = rfIDOriginEntryView;
    return this;
  }

  /**
   * Index of the variant of the biometric data template. Only for Result.RFID_GRAPHICS result.
   *
   * @return rfIDOriginEntryView
   */
  @javax.annotation.Nonnull
  public Integer getRfIDOriginEntryView() {
    return rfIDOriginEntryView;
  }

  public void setRfIDOriginEntryView(@javax.annotation.Nonnull Integer rfIDOriginEntryView) {
    this.rfIDOriginEntryView = rfIDOriginEntryView;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicFieldRfid graphicFieldRfid = (GraphicFieldRfid) o;
    return Objects.equals(this.rfIDOriginDG, graphicFieldRfid.rfIDOriginDG)
        && Objects.equals(this.rfIDOriginDGTag, graphicFieldRfid.rfIDOriginDGTag)
        && Objects.equals(this.rfIDOriginTagEntry, graphicFieldRfid.rfIDOriginTagEntry)
        && Objects.equals(this.rfIDOriginEntryView, graphicFieldRfid.rfIDOriginEntryView)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        rfIDOriginDG, rfIDOriginDGTag, rfIDOriginTagEntry, rfIDOriginEntryView, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicFieldRfid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rfIDOriginDG: ").append(toIndentedString(rfIDOriginDG)).append("\n");
    sb.append("    rfIDOriginDGTag: ").append(toIndentedString(rfIDOriginDGTag)).append("\n");
    sb.append("    rfIDOriginTagEntry: ").append(toIndentedString(rfIDOriginTagEntry)).append("\n");
    sb.append("    rfIDOriginEntryView: ")
        .append(toIndentedString(rfIDOriginEntryView))
        .append("\n");
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
    openapiFields.add("FieldName");
    openapiFields.add("image");
    openapiFields.add("RFID_OriginDG");
    openapiFields.add("RFID_OriginDGTag");
    openapiFields.add("RFID_OriginTagEntry");
    openapiFields.add("RFID_OriginEntryView");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RFID_OriginDG");
    openapiRequiredFields.add("RFID_OriginDGTag");
    openapiRequiredFields.add("RFID_OriginTagEntry");
    openapiRequiredFields.add("RFID_OriginEntryView");
    openapiRequiredFields.add("FieldType");
    openapiRequiredFields.add("FieldName");
    openapiRequiredFields.add("image");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GraphicFieldRfid
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!GraphicFieldRfid.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in GraphicFieldRfid is not found in the empty JSON string",
                GraphicFieldRfid.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!GraphicFieldRfid.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `GraphicFieldRfid` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : GraphicFieldRfid.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `RFID_OriginDG`
    RfidDataGroupTypeTag.validateJsonElement(jsonObj.get("RFID_OriginDG"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GraphicFieldRfid.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GraphicFieldRfid' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GraphicFieldRfid> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(GraphicFieldRfid.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GraphicFieldRfid>() {
            @Override
            public void write(JsonWriter out, GraphicFieldRfid value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public GraphicFieldRfid read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of GraphicFieldRfid given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GraphicFieldRfid
   * @throws IOException if the JSON string is invalid with respect to GraphicFieldRfid
   */
  public static GraphicFieldRfid fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphicFieldRfid.class);
  }

  /**
   * Convert an instance of GraphicFieldRfid to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
