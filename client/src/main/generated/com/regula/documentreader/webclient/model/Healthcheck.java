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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Healthcheck */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class Healthcheck {
  public static final String SERIALIZED_NAME_APP = "app";

  @SerializedName(SERIALIZED_NAME_APP)
  @javax.annotation.Nonnull
  private String app;

  public static final String SERIALIZED_NAME_LICENSE_ID = "licenseId";

  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  @javax.annotation.Nonnull
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TYPE = "licenseType";

  @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
  @javax.annotation.Nonnull
  private String licenseType;

  public static final String SERIALIZED_NAME_LICENSE_SERIAL = "licenseSerial";

  @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
  @javax.annotation.Nonnull
  private String licenseSerial;

  public static final String SERIALIZED_NAME_LICENSE_VALID_UNTIL = "licenseValidUntil";

  @SerializedName(SERIALIZED_NAME_LICENSE_VALID_UNTIL)
  @javax.annotation.Nonnull
  private OffsetDateTime licenseValidUntil;

  public static final String SERIALIZED_NAME_SCENARIOS = "scenarios";

  @SerializedName(SERIALIZED_NAME_SCENARIOS)
  @javax.annotation.Nonnull
  private List<String> scenarios = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERSION = "version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private String version;

  public static final String SERIALIZED_NAME_DOCUMENTS_DATABASE = "documentsDatabase";

  @SerializedName(SERIALIZED_NAME_DOCUMENTS_DATABASE)
  @javax.annotation.Nullable
  private HealthcheckDocumentsDatabase documentsDatabase;

  public Healthcheck() {}

  public Healthcheck app(@javax.annotation.Nonnull String app) {
    this.app = app;
    return this;
  }

  /**
   * Application name.
   *
   * @return app
   */
  @javax.annotation.Nonnull
  public String getApp() {
    return app;
  }

  public void setApp(@javax.annotation.Nonnull String app) {
    this.app = app;
  }

  public Healthcheck licenseId(@javax.annotation.Nonnull String licenseId) {
    this.licenseId = licenseId;
    return this;
  }

  /**
   * Unique license identifier.
   *
   * @return licenseId
   */
  @javax.annotation.Nonnull
  public String getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(@javax.annotation.Nonnull String licenseId) {
    this.licenseId = licenseId;
  }

  public Healthcheck licenseType(@javax.annotation.Nonnull String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * License type.
   *
   * @return licenseType
   */
  @javax.annotation.Nonnull
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(@javax.annotation.Nonnull String licenseType) {
    this.licenseType = licenseType;
  }

  public Healthcheck licenseSerial(@javax.annotation.Nonnull String licenseSerial) {
    this.licenseSerial = licenseSerial;
    return this;
  }

  /**
   * License serial number.
   *
   * @return licenseSerial
   */
  @javax.annotation.Nonnull
  public String getLicenseSerial() {
    return licenseSerial;
  }

  public void setLicenseSerial(@javax.annotation.Nonnull String licenseSerial) {
    this.licenseSerial = licenseSerial;
  }

  public Healthcheck licenseValidUntil(@javax.annotation.Nonnull OffsetDateTime licenseValidUntil) {
    this.licenseValidUntil = licenseValidUntil;
    return this;
  }

  /**
   * License validity date.
   *
   * @return licenseValidUntil
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getLicenseValidUntil() {
    return licenseValidUntil;
  }

  public void setLicenseValidUntil(@javax.annotation.Nonnull OffsetDateTime licenseValidUntil) {
    this.licenseValidUntil = licenseValidUntil;
  }

  public Healthcheck scenarios(@javax.annotation.Nonnull List<String> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  public Healthcheck addScenariosItem(String scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

  /**
   * List of supported scenarios.
   *
   * @return scenarios
   */
  @javax.annotation.Nonnull
  public List<String> getScenarios() {
    return scenarios;
  }

  public void setScenarios(@javax.annotation.Nonnull List<String> scenarios) {
    this.scenarios = scenarios;
  }

  public Healthcheck version(@javax.annotation.Nonnull String version) {
    this.version = version;
    return this;
  }

  /**
   * Product version.
   *
   * @return version
   */
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nonnull String version) {
    this.version = version;
  }

  public Healthcheck documentsDatabase(
      @javax.annotation.Nullable HealthcheckDocumentsDatabase documentsDatabase) {
    this.documentsDatabase = documentsDatabase;
    return this;
  }

  /**
   * Get documentsDatabase
   *
   * @return documentsDatabase
   */
  @javax.annotation.Nullable
  public HealthcheckDocumentsDatabase getDocumentsDatabase() {
    return documentsDatabase;
  }

  public void setDocumentsDatabase(
      @javax.annotation.Nullable HealthcheckDocumentsDatabase documentsDatabase) {
    this.documentsDatabase = documentsDatabase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Healthcheck healthcheck = (Healthcheck) o;
    return Objects.equals(this.app, healthcheck.app)
        && Objects.equals(this.licenseId, healthcheck.licenseId)
        && Objects.equals(this.licenseType, healthcheck.licenseType)
        && Objects.equals(this.licenseSerial, healthcheck.licenseSerial)
        && Objects.equals(this.licenseValidUntil, healthcheck.licenseValidUntil)
        && Objects.equals(this.scenarios, healthcheck.scenarios)
        && Objects.equals(this.version, healthcheck.version)
        && Objects.equals(this.documentsDatabase, healthcheck.documentsDatabase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        app,
        licenseId,
        licenseType,
        licenseSerial,
        licenseValidUntil,
        scenarios,
        version,
        documentsDatabase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Healthcheck {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
    sb.append("    licenseValidUntil: ").append(toIndentedString(licenseValidUntil)).append("\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    documentsDatabase: ").append(toIndentedString(documentsDatabase)).append("\n");
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
    openapiFields.add("app");
    openapiFields.add("licenseId");
    openapiFields.add("licenseType");
    openapiFields.add("licenseSerial");
    openapiFields.add("licenseValidUntil");
    openapiFields.add("scenarios");
    openapiFields.add("version");
    openapiFields.add("documentsDatabase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("licenseId");
    openapiRequiredFields.add("licenseType");
    openapiRequiredFields.add("licenseSerial");
    openapiRequiredFields.add("licenseValidUntil");
    openapiRequiredFields.add("scenarios");
    openapiRequiredFields.add("version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Healthcheck
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Healthcheck.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Healthcheck is not found in the empty JSON string",
                Healthcheck.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Healthcheck.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Healthcheck` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : Healthcheck.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    if (!jsonObj.get("app").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `app` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("app").toString()));
    }
    if (!jsonObj.get("licenseId").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `licenseId` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("licenseId").toString()));
    }
    if (!jsonObj.get("licenseType").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `licenseType` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("licenseType").toString()));
    }
    if (!jsonObj.get("licenseSerial").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `licenseSerial` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("licenseSerial").toString()));
    }
    // ensure the required json array is present
    if (jsonObj.get("scenarios") == null) {
      throw new IllegalArgumentException(
          "Expected the field `linkedContent` to be an array in the JSON string but got `null`");
    } else if (!jsonObj.get("scenarios").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `scenarios` to be an array in the JSON string but got `%s`",
              jsonObj.get("scenarios").toString()));
    }
    if (!jsonObj.get("version").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `version` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("version").toString()));
    }
    // validate the optional field `documentsDatabase`
    if (jsonObj.get("documentsDatabase") != null
        && !jsonObj.get("documentsDatabase").isJsonNull()) {
      HealthcheckDocumentsDatabase.validateJsonElement(jsonObj.get("documentsDatabase"));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Healthcheck.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Healthcheck' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Healthcheck> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Healthcheck.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Healthcheck>() {
            @Override
            public void write(JsonWriter out, Healthcheck value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Healthcheck read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Healthcheck given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Healthcheck
   * @throws IOException if the JSON string is invalid with respect to Healthcheck
   */
  public static Healthcheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Healthcheck.class);
  }

  /**
   * Convert an instance of Healthcheck to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
