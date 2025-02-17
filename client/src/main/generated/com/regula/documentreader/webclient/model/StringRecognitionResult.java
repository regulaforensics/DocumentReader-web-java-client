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
import com.google.gson.JsonArray;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Describes single row recognition results in multi-line text field of a document */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class StringRecognitionResult {
  public static final String SERIALIZED_NAME_SYMBOLS_COUNT = "SymbolsCount";

  @SerializedName(SERIALIZED_NAME_SYMBOLS_COUNT)
  @javax.annotation.Nonnull
  private BigDecimal symbolsCount;

  public static final String SERIALIZED_NAME_STRING_RESULT = "StringResult";

  @SerializedName(SERIALIZED_NAME_STRING_RESULT)
  @javax.annotation.Nonnull
  private List<SymbolRecognitionResult> stringResult = new ArrayList<>();

  public static final String SERIALIZED_NAME_BUF_LENGTH = "Buf_Length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  @javax.annotation.Nullable
  private BigDecimal bufLength;

  public static final String SERIALIZED_NAME_BUF_TEXT = "Buf_Text";

  @SerializedName(SERIALIZED_NAME_BUF_TEXT)
  @javax.annotation.Nullable
  private String bufText;

  public StringRecognitionResult() {}

  public StringRecognitionResult symbolsCount(@javax.annotation.Nonnull BigDecimal symbolsCount) {
    this.symbolsCount = symbolsCount;
    return this;
  }

  /**
   * Number of StringResult array elements
   *
   * @return symbolsCount
   */
  @javax.annotation.Nonnull
  public BigDecimal getSymbolsCount() {
    return symbolsCount;
  }

  public void setSymbolsCount(@javax.annotation.Nonnull BigDecimal symbolsCount) {
    this.symbolsCount = symbolsCount;
  }

  public StringRecognitionResult stringResult(
      @javax.annotation.Nonnull List<SymbolRecognitionResult> stringResult) {
    this.stringResult = stringResult;
    return this;
  }

  public StringRecognitionResult addStringResultItem(SymbolRecognitionResult stringResultItem) {
    if (this.stringResult == null) {
      this.stringResult = new ArrayList<>();
    }
    this.stringResult.add(stringResultItem);
    return this;
  }

  /**
   * Array of recognition results for individual characters of a string
   *
   * @return stringResult
   */
  @javax.annotation.Nonnull
  public List<SymbolRecognitionResult> getStringResult() {
    return stringResult;
  }

  public void setStringResult(
      @javax.annotation.Nonnull List<SymbolRecognitionResult> stringResult) {
    this.stringResult = stringResult;
  }

  public StringRecognitionResult bufLength(@javax.annotation.Nullable BigDecimal bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Buf_Text text string length
   *
   * @return bufLength
   */
  @javax.annotation.Nullable
  public BigDecimal getBufLength() {
    return bufLength;
  }

  public void setBufLength(@javax.annotation.Nullable BigDecimal bufLength) {
    this.bufLength = bufLength;
  }

  public StringRecognitionResult bufText(@javax.annotation.Nullable String bufText) {
    this.bufText = bufText;
    return this;
  }

  /**
   * Text field data in UTF8 format. Results of reading different lines of a multi-line field are
   * separated by &#39;^&#39;
   *
   * @return bufText
   */
  @javax.annotation.Nullable
  public String getBufText() {
    return bufText;
  }

  public void setBufText(@javax.annotation.Nullable String bufText) {
    this.bufText = bufText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringRecognitionResult stringRecognitionResult = (StringRecognitionResult) o;
    return Objects.equals(this.symbolsCount, stringRecognitionResult.symbolsCount)
        && Objects.equals(this.stringResult, stringRecognitionResult.stringResult)
        && Objects.equals(this.bufLength, stringRecognitionResult.bufLength)
        && Objects.equals(this.bufText, stringRecognitionResult.bufText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolsCount, stringResult, bufLength, bufText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringRecognitionResult {\n");
    sb.append("    symbolsCount: ").append(toIndentedString(symbolsCount)).append("\n");
    sb.append("    stringResult: ").append(toIndentedString(stringResult)).append("\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    bufText: ").append(toIndentedString(bufText)).append("\n");
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
    openapiFields.add("SymbolsCount");
    openapiFields.add("StringResult");
    openapiFields.add("Buf_Length");
    openapiFields.add("Buf_Text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SymbolsCount");
    openapiRequiredFields.add("StringResult");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StringRecognitionResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!StringRecognitionResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in StringRecognitionResult is not found in the empty JSON string",
                StringRecognitionResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!StringRecognitionResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `StringRecognitionResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : StringRecognitionResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the json data is an array
    if (!jsonObj.get("StringResult").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `StringResult` to be an array in the JSON string but got `%s`",
              jsonObj.get("StringResult").toString()));
    }

    JsonArray jsonArraystringResult = jsonObj.getAsJsonArray("StringResult");
    // validate the required field `StringResult` (array)
    for (int i = 0; i < jsonArraystringResult.size(); i++) {
      SymbolRecognitionResult.validateJsonElement(jsonArraystringResult.get(i));
    }
    ;
    if ((jsonObj.get("Buf_Text") != null && !jsonObj.get("Buf_Text").isJsonNull())
        && !jsonObj.get("Buf_Text").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Buf_Text` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Buf_Text").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!StringRecognitionResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'StringRecognitionResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<StringRecognitionResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(StringRecognitionResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<StringRecognitionResult>() {
            @Override
            public void write(JsonWriter out, StringRecognitionResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public StringRecognitionResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of StringRecognitionResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StringRecognitionResult
   * @throws IOException if the JSON string is invalid with respect to StringRecognitionResult
   */
  public static StringRecognitionResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StringRecognitionResult.class);
  }

  /**
   * Convert an instance of StringRecognitionResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
