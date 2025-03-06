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

/**
 * Structure is used to describe the contents of a single LDS application and their analysis within
 * the context of the communication session with electronic document
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class RfidApplication {
  public static final String SERIALIZED_NAME_TYPE = "Type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private RfidApplicationType type;

  public static final String SERIALIZED_NAME_STATUS = "Status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private RFIDErrorCodes status;

  public static final String SERIALIZED_NAME_APPLICATION_I_D = "ApplicationID";

  @SerializedName(SERIALIZED_NAME_APPLICATION_I_D)
  @javax.annotation.Nonnull
  private String applicationID;

  public static final String SERIALIZED_NAME_VERSION = "Version";

  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nonnull
  private String version;

  public static final String SERIALIZED_NAME_UNICODE_VERSION = "UnicodeVersion";

  @SerializedName(SERIALIZED_NAME_UNICODE_VERSION)
  @javax.annotation.Nonnull
  private String unicodeVersion;

  public static final String SERIALIZED_NAME_DATA_HASH_ALGORITHM = "DataHashAlgorithm";

  @SerializedName(SERIALIZED_NAME_DATA_HASH_ALGORITHM)
  @javax.annotation.Nonnull
  private String dataHashAlgorithm;

  public static final String SERIALIZED_NAME_FILES = "Files";

  @SerializedName(SERIALIZED_NAME_FILES)
  @javax.annotation.Nonnull
  private List<RfidDataFile> files;

  public RfidApplication() {}

  public RfidApplication type(@javax.annotation.Nonnull RfidApplicationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nonnull
  public RfidApplicationType getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull RfidApplicationType type) {
    this.type = type;
  }

  public RfidApplication status(@javax.annotation.Nonnull RFIDErrorCodes status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @javax.annotation.Nonnull
  public RFIDErrorCodes getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull RFIDErrorCodes status) {
    this.status = status;
  }

  public RfidApplication applicationID(@javax.annotation.Nonnull String applicationID) {
    this.applicationID = applicationID;
    return this;
  }

  /**
   * Application identifier
   *
   * @return applicationID
   */
  @javax.annotation.Nonnull
  public String getApplicationID() {
    return applicationID;
  }

  public void setApplicationID(@javax.annotation.Nonnull String applicationID) {
    this.applicationID = applicationID;
  }

  public RfidApplication version(@javax.annotation.Nonnull String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the application
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

  public RfidApplication unicodeVersion(@javax.annotation.Nonnull String unicodeVersion) {
    this.unicodeVersion = unicodeVersion;
    return this;
  }

  /**
   * Unicode version for application
   *
   * @return unicodeVersion
   */
  @javax.annotation.Nonnull
  public String getUnicodeVersion() {
    return unicodeVersion;
  }

  public void setUnicodeVersion(@javax.annotation.Nonnull String unicodeVersion) {
    this.unicodeVersion = unicodeVersion;
  }

  public RfidApplication dataHashAlgorithm(@javax.annotation.Nonnull String dataHashAlgorithm) {
    this.dataHashAlgorithm = dataHashAlgorithm;
    return this;
  }

  /**
   * Algorithm for calculating hash values for files for the procedure of PA
   *
   * @return dataHashAlgorithm
   */
  @javax.annotation.Nonnull
  public String getDataHashAlgorithm() {
    return dataHashAlgorithm;
  }

  public void setDataHashAlgorithm(@javax.annotation.Nonnull String dataHashAlgorithm) {
    this.dataHashAlgorithm = dataHashAlgorithm;
  }

  public RfidApplication files(@javax.annotation.Nonnull List<RfidDataFile> files) {
    this.files = files;
    return this;
  }

  public RfidApplication addFilesItem(RfidDataFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * List of containers to store information about the read files of the application
   *
   * @return files
   */
  @javax.annotation.Nonnull
  public List<RfidDataFile> getFiles() {
    return files;
  }

  public void setFiles(@javax.annotation.Nonnull List<RfidDataFile> files) {
    this.files = files;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidApplication rfidApplication = (RfidApplication) o;
    return Objects.equals(this.type, rfidApplication.type)
        && Objects.equals(this.status, rfidApplication.status)
        && Objects.equals(this.applicationID, rfidApplication.applicationID)
        && Objects.equals(this.version, rfidApplication.version)
        && Objects.equals(this.unicodeVersion, rfidApplication.unicodeVersion)
        && Objects.equals(this.dataHashAlgorithm, rfidApplication.dataHashAlgorithm)
        && Objects.equals(this.files, rfidApplication.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type, status, applicationID, version, unicodeVersion, dataHashAlgorithm, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidApplication {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    applicationID: ").append(toIndentedString(applicationID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    unicodeVersion: ").append(toIndentedString(unicodeVersion)).append("\n");
    sb.append("    dataHashAlgorithm: ").append(toIndentedString(dataHashAlgorithm)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("ApplicationID");
    openapiFields.add("Version");
    openapiFields.add("UnicodeVersion");
    openapiFields.add("DataHashAlgorithm");
    openapiFields.add("Files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Status");
    openapiRequiredFields.add("ApplicationID");
    openapiRequiredFields.add("Version");
    openapiRequiredFields.add("UnicodeVersion");
    openapiRequiredFields.add("DataHashAlgorithm");
    openapiRequiredFields.add("Files");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RfidApplication
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!RfidApplication.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in RfidApplication is not found in the empty JSON string",
                RfidApplication.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!RfidApplication.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `RfidApplication` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : RfidApplication.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `Type`
    RfidApplicationType.validateJsonElement(jsonObj.get("Type"));
    // validate the required field `Status`
    RFIDErrorCodes.validateJsonElement(jsonObj.get("Status"));
    if (!jsonObj.get("ApplicationID").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ApplicationID` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("ApplicationID").toString()));
    }
    if (!jsonObj.get("Version").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Version` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("Version").toString()));
    }
    if (!jsonObj.get("UnicodeVersion").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `UnicodeVersion` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("UnicodeVersion").toString()));
    }
    if (!jsonObj.get("DataHashAlgorithm").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `DataHashAlgorithm` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("DataHashAlgorithm").toString()));
    }
    // ensure the json data is an array
    if (!jsonObj.get("Files").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `Files` to be an array in the JSON string but got `%s`",
              jsonObj.get("Files").toString()));
    }

    JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("Files");
    // validate the required field `Files` (array)
    for (int i = 0; i < jsonArrayfiles.size(); i++) {
      RfidDataFile.validateJsonElement(jsonArrayfiles.get(i));
    }
    ;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!RfidApplication.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'RfidApplication' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<RfidApplication> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(RfidApplication.class));

      return (TypeAdapter<T>)
          new TypeAdapter<RfidApplication>() {
            @Override
            public void write(JsonWriter out, RfidApplication value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public RfidApplication read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of RfidApplication given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RfidApplication
   * @throws IOException if the JSON string is invalid with respect to RfidApplication
   */
  public static RfidApplication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RfidApplication.class);
  }

  /**
   * Convert an instance of RfidApplication to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
