package com.regula.documentreader.webclient.model.changed;

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
import com.regula.documentreader.webclient.model.AuthenticityCheckResultItem;
import com.regula.documentreader.webclient.model.AuthenticityResultType;
import com.regula.documentreader.webclient.model.CheckResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** AuthenticityCheckResult */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class AuthenticityCheckResult {
  public static final String SERIALIZED_NAME_TYPE = "Type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private AuthenticityResultType type;

  public static final String SERIALIZED_NAME_RESULT = "Result";

  @SerializedName(SERIALIZED_NAME_RESULT)
  @javax.annotation.Nonnull
  private CheckResult result;

  public static final String SERIALIZED_NAME_COUNT = "Count";

  @SerializedName(SERIALIZED_NAME_COUNT)
  @javax.annotation.Nullable
  private Integer count;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  @javax.annotation.Nonnull
  private List<AuthenticityCheckResultItem> list;

  public AuthenticityCheckResult() {}

  public AuthenticityCheckResult type(@javax.annotation.Nonnull AuthenticityResultType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nonnull
  public AuthenticityResultType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull AuthenticityResultType type) {
    this.type = type;
  }

  public AuthenticityCheckResult result(@javax.annotation.Nonnull CheckResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   *
   * @return result
   */
  @javax.annotation.Nonnull
  public CheckResult getResult() {
    return result;
  }

  public void setResult(@javax.annotation.Nonnull CheckResult result) {
    this.result = result;
  }

  public AuthenticityCheckResult count(@javax.annotation.Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Count of items in List
   *
   * @return count
   */
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(@javax.annotation.Nullable Integer count) {
    this.count = count;
  }

  public AuthenticityCheckResult list(
      @javax.annotation.Nonnull List<AuthenticityCheckResultItem> list) {
    this.list = list;
    return this;
  }

  public AuthenticityCheckResult addListItem(AuthenticityCheckResultItem listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @javax.annotation.Nonnull
  public List<AuthenticityCheckResultItem> getList() {
    return list;
  }

  public void setList(@javax.annotation.Nonnull List<AuthenticityCheckResultItem> list) {
    this.list = list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticityCheckResult authenticityCheckResult = (AuthenticityCheckResult) o;
    return Objects.equals(this.type, authenticityCheckResult.type)
        && Objects.equals(this.result, authenticityCheckResult.result)
        && Objects.equals(this.count, authenticityCheckResult.count)
        && Objects.equals(this.list, authenticityCheckResult.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, result, count, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticityCheckResult {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
    openapiFields.add("Result");
    openapiFields.add("Count");
    openapiFields.add("List");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Result");
    openapiRequiredFields.add("List");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticityCheckResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!AuthenticityCheckResult.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in AuthenticityCheckResult is not found in the empty JSON string",
                AuthenticityCheckResult.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!AuthenticityCheckResult.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `AuthenticityCheckResult` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : AuthenticityCheckResult.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `Type`
    AuthenticityResultType.validateJsonElement(jsonObj.get("Type"));
    // validate the required field `Result`
    CheckResult.validateJsonElement(jsonObj.get("Result"));
    // ensure the json data is an array
    if (!jsonObj.get("List").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `List` to be an array in the JSON string but got `%s`",
              jsonObj.get("List").toString()));
    }

    JsonArray jsonArraylist = jsonObj.getAsJsonArray("List");
    // validate the required field `List` (array)
    for (int i = 0; i < jsonArraylist.size(); i++) {
      AuthenticityCheckResultItem.validateJsonElement(jsonArraylist.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AuthenticityCheckResult.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AuthenticityCheckResult' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<AuthenticityCheckResult> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(AuthenticityCheckResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<AuthenticityCheckResult>() {
            @Override
            public void write(JsonWriter out, AuthenticityCheckResult value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public AuthenticityCheckResult read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticityCheckResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticityCheckResult
   * @throws IOException if the JSON string is invalid with respect to AuthenticityCheckResult
   */
  public static AuthenticityCheckResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticityCheckResult.class);
  }

  /**
   * Convert an instance of AuthenticityCheckResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
