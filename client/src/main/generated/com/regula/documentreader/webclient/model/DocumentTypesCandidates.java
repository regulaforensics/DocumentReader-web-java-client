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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** DocumentTypesCandidates */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class DocumentTypesCandidates {
  public static final String SERIALIZED_NAME_REC_RESULT = "RecResult";

  @SerializedName(SERIALIZED_NAME_REC_RESULT)
  @javax.annotation.Nullable
  private DocumentTypeRecognitionResult recResult;

  public static final String SERIALIZED_NAME_CANDIDATES = "Candidates";

  @SerializedName(SERIALIZED_NAME_CANDIDATES)
  @javax.annotation.Nullable
  private List<OneCandidate> candidates = new ArrayList<>();

  public DocumentTypesCandidates() {}

  public DocumentTypesCandidates recResult(
      @javax.annotation.Nullable DocumentTypeRecognitionResult recResult) {
    this.recResult = recResult;
    return this;
  }

  /**
   * Get recResult
   *
   * @return recResult
   */
  @javax.annotation.Nullable
  public DocumentTypeRecognitionResult getRecResult() {
    return recResult;
  }

  public void setRecResult(@javax.annotation.Nullable DocumentTypeRecognitionResult recResult) {
    this.recResult = recResult;
  }

  public DocumentTypesCandidates candidates(
      @javax.annotation.Nullable List<OneCandidate> candidates) {
    this.candidates = candidates;
    return this;
  }

  public DocumentTypesCandidates addCandidatesItem(OneCandidate candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Get candidates
   *
   * @return candidates
   */
  @javax.annotation.Nullable
  public List<OneCandidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(@javax.annotation.Nullable List<OneCandidate> candidates) {
    this.candidates = candidates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypesCandidates documentTypesCandidates = (DocumentTypesCandidates) o;
    return Objects.equals(this.recResult, documentTypesCandidates.recResult)
        && Objects.equals(this.candidates, documentTypesCandidates.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recResult, candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypesCandidates {\n");
    sb.append("    recResult: ").append(toIndentedString(recResult)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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
    openapiFields.add("RecResult");
    openapiFields.add("Candidates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentTypesCandidates
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!DocumentTypesCandidates.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in DocumentTypesCandidates is not found in the empty JSON string",
                DocumentTypesCandidates.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!DocumentTypesCandidates.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `DocumentTypesCandidates` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the optional field `RecResult`
    if (jsonObj.get("RecResult") != null && !jsonObj.get("RecResult").isJsonNull()) {
      DocumentTypeRecognitionResult.validateJsonElement(jsonObj.get("RecResult"));
    }
    if (jsonObj.get("Candidates") != null && !jsonObj.get("Candidates").isJsonNull()) {
      JsonArray jsonArraycandidates = jsonObj.getAsJsonArray("Candidates");
      if (jsonArraycandidates != null) {
        // ensure the json data is an array
        if (!jsonObj.get("Candidates").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `Candidates` to be an array in the JSON string but got `%s`",
                  jsonObj.get("Candidates").toString()));
        }

        // validate the optional field `Candidates` (array)
        for (int i = 0; i < jsonArraycandidates.size(); i++) {
          OneCandidate.validateJsonElement(jsonArraycandidates.get(i));
        }
        ;
      }
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!DocumentTypesCandidates.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'DocumentTypesCandidates' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<DocumentTypesCandidates> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(DocumentTypesCandidates.class));

      return (TypeAdapter<T>)
          new TypeAdapter<DocumentTypesCandidates>() {
            @Override
            public void write(JsonWriter out, DocumentTypesCandidates value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public DocumentTypesCandidates read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentTypesCandidates given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentTypesCandidates
   * @throws IOException if the JSON string is invalid with respect to DocumentTypesCandidates
   */
  public static DocumentTypesCandidates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentTypesCandidates.class);
  }

  /**
   * Convert an instance of DocumentTypesCandidates to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
