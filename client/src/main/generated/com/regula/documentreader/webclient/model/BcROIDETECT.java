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

/** BcROIDETECT */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class BcROIDETECT {
  public static final String SERIALIZED_NAME_BOTTOM = "bottom";

  @SerializedName(SERIALIZED_NAME_BOTTOM)
  @javax.annotation.Nonnull
  private Integer bottom;

  public static final String SERIALIZED_NAME_LEFT = "left";

  @SerializedName(SERIALIZED_NAME_LEFT)
  @javax.annotation.Nonnull
  private Integer left;

  public static final String SERIALIZED_NAME_RIGHT = "right";

  @SerializedName(SERIALIZED_NAME_RIGHT)
  @javax.annotation.Nonnull
  private Integer right;

  public static final String SERIALIZED_NAME_TOP = "top";

  @SerializedName(SERIALIZED_NAME_TOP)
  @javax.annotation.Nonnull
  private Integer top;

  public BcROIDETECT() {}

  public BcROIDETECT bottom(@javax.annotation.Nonnull Integer bottom) {
    this.bottom = bottom;
    return this;
  }

  /**
   * Get bottom
   *
   * @return bottom
   */
  @javax.annotation.Nonnull
  public Integer getBottom() {
    return bottom;
  }

  public void setBottom(@javax.annotation.Nonnull Integer bottom) {
    this.bottom = bottom;
  }

  public BcROIDETECT left(@javax.annotation.Nonnull Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Get left
   *
   * @return left
   */
  @javax.annotation.Nonnull
  public Integer getLeft() {
    return left;
  }

  public void setLeft(@javax.annotation.Nonnull Integer left) {
    this.left = left;
  }

  public BcROIDETECT right(@javax.annotation.Nonnull Integer right) {
    this.right = right;
    return this;
  }

  /**
   * Get right
   *
   * @return right
   */
  @javax.annotation.Nonnull
  public Integer getRight() {
    return right;
  }

  public void setRight(@javax.annotation.Nonnull Integer right) {
    this.right = right;
  }

  public BcROIDETECT top(@javax.annotation.Nonnull Integer top) {
    this.top = top;
    return this;
  }

  /**
   * Get top
   *
   * @return top
   */
  @javax.annotation.Nonnull
  public Integer getTop() {
    return top;
  }

  public void setTop(@javax.annotation.Nonnull Integer top) {
    this.top = top;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BcROIDETECT bcROIDETECT = (BcROIDETECT) o;
    return Objects.equals(this.bottom, bcROIDETECT.bottom)
        && Objects.equals(this.left, bcROIDETECT.left)
        && Objects.equals(this.right, bcROIDETECT.right)
        && Objects.equals(this.top, bcROIDETECT.top);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bottom, left, right, top);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BcROIDETECT {\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
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
    openapiFields.add("bottom");
    openapiFields.add("left");
    openapiFields.add("right");
    openapiFields.add("top");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bottom");
    openapiRequiredFields.add("left");
    openapiRequiredFields.add("right");
    openapiRequiredFields.add("top");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BcROIDETECT
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!BcROIDETECT.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in BcROIDETECT is not found in the empty JSON string",
                BcROIDETECT.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!BcROIDETECT.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `BcROIDETECT` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : BcROIDETECT.openapiRequiredFields) {
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
      if (!BcROIDETECT.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'BcROIDETECT' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<BcROIDETECT> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(BcROIDETECT.class));

      return (TypeAdapter<T>)
          new TypeAdapter<BcROIDETECT>() {
            @Override
            public void write(JsonWriter out, BcROIDETECT value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public BcROIDETECT read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of BcROIDETECT given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BcROIDETECT
   * @throws IOException if the JSON string is invalid with respect to BcROIDETECT
   */
  public static BcROIDETECT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BcROIDETECT.class);
  }

  /**
   * Convert an instance of BcROIDETECT to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
