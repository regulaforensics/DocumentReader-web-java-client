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

/** Status */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class Status {
  public static final String SERIALIZED_NAME_OVERALL_STATUS = "overallStatus";

  @SerializedName(SERIALIZED_NAME_OVERALL_STATUS)
  @javax.annotation.Nonnull
  private CheckResult overallStatus;

  public static final String SERIALIZED_NAME_OPTICAL = "optical";

  @SerializedName(SERIALIZED_NAME_OPTICAL)
  @javax.annotation.Nonnull
  private CheckResult optical;

  public static final String SERIALIZED_NAME_PORTRAIT = "portrait";

  @SerializedName(SERIALIZED_NAME_PORTRAIT)
  @javax.annotation.Nonnull
  private CheckResult portrait;

  public static final String SERIALIZED_NAME_RFID = "rfid";

  @SerializedName(SERIALIZED_NAME_RFID)
  @javax.annotation.Nonnull
  private CheckResult rfid;

  public static final String SERIALIZED_NAME_STOP_LIST = "stopList";

  @SerializedName(SERIALIZED_NAME_STOP_LIST)
  @javax.annotation.Nonnull
  private CheckResult stopList;

  public static final String SERIALIZED_NAME_DETAILS_R_F_I_D = "detailsRFID";

  @SerializedName(SERIALIZED_NAME_DETAILS_R_F_I_D)
  @javax.annotation.Nullable
  private DetailsRFID detailsRFID;

  public static final String SERIALIZED_NAME_DETAILS_OPTICAL = "detailsOptical";

  @SerializedName(SERIALIZED_NAME_DETAILS_OPTICAL)
  @javax.annotation.Nonnull
  private DetailsOptical detailsOptical;

  public Status() {}

  public Status overallStatus(@javax.annotation.Nonnull CheckResult overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

  /**
   * Get overallStatus
   *
   * @return overallStatus
   */
  @javax.annotation.Nonnull
  public CheckResult getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(@javax.annotation.Nonnull CheckResult overallStatus) {
    this.overallStatus = overallStatus;
  }

  public Status optical(@javax.annotation.Nonnull CheckResult optical) {
    this.optical = optical;
    return this;
  }

  /**
   * Get optical
   *
   * @return optical
   */
  @javax.annotation.Nonnull
  public CheckResult getOptical() {
    return optical;
  }

  public void setOptical(@javax.annotation.Nonnull CheckResult optical) {
    this.optical = optical;
  }

  public Status portrait(@javax.annotation.Nonnull CheckResult portrait) {
    this.portrait = portrait;
    return this;
  }

  /**
   * Get portrait
   *
   * @return portrait
   */
  @javax.annotation.Nonnull
  public CheckResult getPortrait() {
    return portrait;
  }

  public void setPortrait(@javax.annotation.Nonnull CheckResult portrait) {
    this.portrait = portrait;
  }

  public Status rfid(@javax.annotation.Nonnull CheckResult rfid) {
    this.rfid = rfid;
    return this;
  }

  /**
   * Get rfid
   *
   * @return rfid
   */
  @javax.annotation.Nonnull
  public CheckResult getRfid() {
    return rfid;
  }

  public void setRfid(@javax.annotation.Nonnull CheckResult rfid) {
    this.rfid = rfid;
  }

  public Status stopList(@javax.annotation.Nonnull CheckResult stopList) {
    this.stopList = stopList;
    return this;
  }

  /**
   * Get stopList
   *
   * @return stopList
   */
  @javax.annotation.Nonnull
  public CheckResult getStopList() {
    return stopList;
  }

  public void setStopList(@javax.annotation.Nonnull CheckResult stopList) {
    this.stopList = stopList;
  }

  public Status detailsRFID(@javax.annotation.Nullable DetailsRFID detailsRFID) {
    this.detailsRFID = detailsRFID;
    return this;
  }

  /**
   * Get detailsRFID
   *
   * @return detailsRFID
   */
  @javax.annotation.Nullable
  public DetailsRFID getDetailsRFID() {
    return detailsRFID;
  }

  public void setDetailsRFID(@javax.annotation.Nullable DetailsRFID detailsRFID) {
    this.detailsRFID = detailsRFID;
  }

  public Status detailsOptical(@javax.annotation.Nonnull DetailsOptical detailsOptical) {
    this.detailsOptical = detailsOptical;
    return this;
  }

  /**
   * Get detailsOptical
   *
   * @return detailsOptical
   */
  @javax.annotation.Nonnull
  public DetailsOptical getDetailsOptical() {
    return detailsOptical;
  }

  public void setDetailsOptical(@javax.annotation.Nonnull DetailsOptical detailsOptical) {
    this.detailsOptical = detailsOptical;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.overallStatus, status.overallStatus)
        && Objects.equals(this.optical, status.optical)
        && Objects.equals(this.portrait, status.portrait)
        && Objects.equals(this.rfid, status.rfid)
        && Objects.equals(this.stopList, status.stopList)
        && Objects.equals(this.detailsRFID, status.detailsRFID)
        && Objects.equals(this.detailsOptical, status.detailsOptical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        overallStatus, optical, portrait, rfid, stopList, detailsRFID, detailsOptical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    optical: ").append(toIndentedString(optical)).append("\n");
    sb.append("    portrait: ").append(toIndentedString(portrait)).append("\n");
    sb.append("    rfid: ").append(toIndentedString(rfid)).append("\n");
    sb.append("    stopList: ").append(toIndentedString(stopList)).append("\n");
    sb.append("    detailsRFID: ").append(toIndentedString(detailsRFID)).append("\n");
    sb.append("    detailsOptical: ").append(toIndentedString(detailsOptical)).append("\n");
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
    openapiFields.add("overallStatus");
    openapiFields.add("optical");
    openapiFields.add("portrait");
    openapiFields.add("rfid");
    openapiFields.add("stopList");
    openapiFields.add("detailsRFID");
    openapiFields.add("detailsOptical");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("overallStatus");
    openapiRequiredFields.add("optical");
    openapiRequiredFields.add("portrait");
    openapiRequiredFields.add("rfid");
    openapiRequiredFields.add("stopList");
    openapiRequiredFields.add("detailsOptical");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Status
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!Status.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in Status is not found in the empty JSON string",
                Status.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!Status.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `Status` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : Status.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `overallStatus`
    CheckResult.validateJsonElement(jsonObj.get("overallStatus"));
    // validate the required field `optical`
    CheckResult.validateJsonElement(jsonObj.get("optical"));
    // validate the required field `portrait`
    CheckResult.validateJsonElement(jsonObj.get("portrait"));
    // validate the required field `rfid`
    CheckResult.validateJsonElement(jsonObj.get("rfid"));
    // validate the required field `stopList`
    CheckResult.validateJsonElement(jsonObj.get("stopList"));
    // validate the optional field `detailsRFID`
    if (jsonObj.get("detailsRFID") != null && !jsonObj.get("detailsRFID").isJsonNull()) {
      DetailsRFID.validateJsonElement(jsonObj.get("detailsRFID"));
    }
    // validate the required field `detailsOptical`
    DetailsOptical.validateJsonElement(jsonObj.get("detailsOptical"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!Status.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'Status' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<Status> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(Status.class));

      return (TypeAdapter<T>)
          new TypeAdapter<Status>() {
            @Override
            public void write(JsonWriter out, Status value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public Status read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of Status given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Status
   * @throws IOException if the JSON string is invalid with respect to Status
   */
  public static Status fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Status.class);
  }

  /**
   * Convert an instance of Status to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
