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

/** Location of data in RFID chip */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidOrigin {
  public static final String SERIALIZED_NAME_DG = "dg";

  @SerializedName(SERIALIZED_NAME_DG)
  @javax.annotation.Nonnull
  private Integer dg;

  public static final String SERIALIZED_NAME_DG_TAG = "dgTag";

  @SerializedName(SERIALIZED_NAME_DG_TAG)
  @javax.annotation.Nonnull
  private Integer dgTag;

  public static final String SERIALIZED_NAME_TAG_ENTRY = "tagEntry";

  @SerializedName(SERIALIZED_NAME_TAG_ENTRY)
  @javax.annotation.Nonnull
  private Integer tagEntry;

  public static final String SERIALIZED_NAME_ENTRY_VIEW = "entryView";

  @SerializedName(SERIALIZED_NAME_ENTRY_VIEW)
  @javax.annotation.Nonnull
  private Integer entryView;

  public RfidOrigin() {}

  public RfidOrigin dg(@javax.annotation.Nonnull Integer dg) {
    this.dg = dg;
    return this;
  }

  /**
   * Source data group file
   *
   * @return dg
   */
  @javax.annotation.Nonnull
  public Integer getDg() {
    return dg;
  }

  public void setDg(@javax.annotation.Nonnull Integer dg) {
    this.dg = dg;
  }

  public RfidOrigin dgTag(@javax.annotation.Nonnull Integer dgTag) {
    this.dgTag = dgTag;
    return this;
  }

  /**
   * Index of the source record of the image with biometric information in the information data
   * group
   *
   * @return dgTag
   */
  @javax.annotation.Nonnull
  public Integer getDgTag() {
    return dgTag;
  }

  public void setDgTag(@javax.annotation.Nonnull Integer dgTag) {
    this.dgTag = dgTag;
  }

  public RfidOrigin tagEntry(@javax.annotation.Nonnull Integer tagEntry) {
    this.tagEntry = tagEntry;
    return this;
  }

  /**
   * Index of the template in the record with biometric data
   *
   * @return tagEntry
   */
  @javax.annotation.Nonnull
  public Integer getTagEntry() {
    return tagEntry;
  }

  public void setTagEntry(@javax.annotation.Nonnull Integer tagEntry) {
    this.tagEntry = tagEntry;
  }

  public RfidOrigin entryView(@javax.annotation.Nonnull Integer entryView) {
    this.entryView = entryView;
    return this;
  }

  /**
   * Index of the variant of the biometric data template
   *
   * @return entryView
   */
  @javax.annotation.Nonnull
  public Integer getEntryView() {
    return entryView;
  }

  public void setEntryView(@javax.annotation.Nonnull Integer entryView) {
    this.entryView = entryView;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidOrigin rfidOrigin = (RfidOrigin) o;
    return Objects.equals(this.dg, rfidOrigin.dg)
        && Objects.equals(this.dgTag, rfidOrigin.dgTag)
        && Objects.equals(this.tagEntry, rfidOrigin.tagEntry)
        && Objects.equals(this.entryView, rfidOrigin.entryView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dg, dgTag, tagEntry, entryView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidOrigin {\n");
    sb.append("    dg: ").append(toIndentedString(dg)).append("\n");
    sb.append("    dgTag: ").append(toIndentedString(dgTag)).append("\n");
    sb.append("    tagEntry: ").append(toIndentedString(tagEntry)).append("\n");
    sb.append("    entryView: ").append(toIndentedString(entryView)).append("\n");
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
    openapiFields.add("dg");
    openapiFields.add("dgTag");
    openapiFields.add("tagEntry");
    openapiFields.add("entryView");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dg");
    openapiRequiredFields.add("dgTag");
    openapiRequiredFields.add("tagEntry");
    openapiRequiredFields.add("entryView");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidOrigin
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidOrigin.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidOrigin is not found in the empty JSON string",
                RfidOrigin.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidOrigin.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidOrigin` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidOrigin.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidOrigin.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidOrigin' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidOrigin> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidOrigin.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidOrigin>() {
            @Override
            public void write(JsonWriter out, RfidOrigin value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidOrigin read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidOrigin given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidOrigin
   * @throws IOException if the JSON string is invalid with respect to RfidOrigin
   */
  public static RfidOrigin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidOrigin.class);
  }

  /**
   * Convert an instance of RfidOrigin to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
