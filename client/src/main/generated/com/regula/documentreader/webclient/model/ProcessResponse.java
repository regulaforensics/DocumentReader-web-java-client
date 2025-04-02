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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ProcessResponse */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class ProcessResponse {
  public static final String SERIALIZED_NAME_CHIP_PAGE = "ChipPage";

  @SerializedName(SERIALIZED_NAME_CHIP_PAGE)
  @javax.annotation.Nonnull
  private RfidLocation chipPage;

  public static final String SERIALIZED_NAME_CORE_LIB_RESULT_CODE = "CoreLibResultCode";

  @SerializedName(SERIALIZED_NAME_CORE_LIB_RESULT_CODE)
  @javax.annotation.Nullable
  private Integer coreLibResultCode;

  public static final String SERIALIZED_NAME_PROCESSING_FINISHED = "ProcessingFinished";

  @SerializedName(SERIALIZED_NAME_PROCESSING_FINISHED)
  @javax.annotation.Nonnull
  private ProcessingStatus processingFinished;

  public static final String SERIALIZED_NAME_CONTAINER_LIST = "ContainerList";

  @SerializedName(SERIALIZED_NAME_CONTAINER_LIST)
  @javax.annotation.Nonnull
  private ContainerList containerList;

  public static final String SERIALIZED_NAME_TRANSACTION_INFO = "TransactionInfo";

  @SerializedName(SERIALIZED_NAME_TRANSACTION_INFO)
  @javax.annotation.Nonnull
  private TransactionInfo transactionInfo;

  public static final String SERIALIZED_NAME_LOG = "log";

  @SerializedName(SERIALIZED_NAME_LOG)
  @javax.annotation.Nullable
  private String log;

  public static final String SERIALIZED_NAME_PASS_BACK_OBJECT = "passBackObject";

  @SerializedName(SERIALIZED_NAME_PASS_BACK_OBJECT)
  @javax.annotation.Nullable
  private Map<String, Object> passBackObject;

  public static final String SERIALIZED_NAME_MORE_PAGES_AVAILABLE = "morePagesAvailable";

  @SerializedName(SERIALIZED_NAME_MORE_PAGES_AVAILABLE)
  @javax.annotation.Nonnull
  private Integer morePagesAvailable;

  public static final String SERIALIZED_NAME_ELAPSED_TIME = "elapsedTime";

  @SerializedName(SERIALIZED_NAME_ELAPSED_TIME)
  @javax.annotation.Nonnull
  private Integer elapsedTime;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, Object> metadata;

  public ProcessResponse() {}

  public ProcessResponse chipPage(@javax.annotation.Nonnull RfidLocation chipPage) {
    this.chipPage = chipPage;
    return this;
  }

  /**
   * Get chipPage
   *
   * @return chipPage
   */
  @javax.annotation.Nonnull
  public RfidLocation getChipPage() {
    return chipPage;
  }

  public void setChipPage(@javax.annotation.Nonnull RfidLocation chipPage) {
    this.chipPage = chipPage;
  }

  public ProcessResponse coreLibResultCode(@javax.annotation.Nullable Integer coreLibResultCode) {
    this.coreLibResultCode = coreLibResultCode;
    return this;
  }

  /**
   * Get coreLibResultCode
   *
   * @return coreLibResultCode
   */
  @javax.annotation.Nullable
  public Integer getCoreLibResultCode() {
    return coreLibResultCode;
  }

  public void setCoreLibResultCode(@javax.annotation.Nullable Integer coreLibResultCode) {
    this.coreLibResultCode = coreLibResultCode;
  }

  public ProcessResponse processingFinished(
      @javax.annotation.Nonnull ProcessingStatus processingFinished) {
    this.processingFinished = processingFinished;
    return this;
  }

  /**
   * Get processingFinished
   *
   * @return processingFinished
   */
  @javax.annotation.Nonnull
  public ProcessingStatus getProcessingFinished() {
    return processingFinished;
  }

  public void setProcessingFinished(@javax.annotation.Nonnull ProcessingStatus processingFinished) {
    this.processingFinished = processingFinished;
  }

  public ProcessResponse containerList(@javax.annotation.Nonnull ContainerList containerList) {
    this.containerList = containerList;
    return this;
  }

  /**
   * Get containerList
   *
   * @return containerList
   */
  @javax.annotation.Nonnull
  public ContainerList getContainerList() {
    return containerList;
  }

  public void setContainerList(@javax.annotation.Nonnull ContainerList containerList) {
    this.containerList = containerList;
  }

  public ProcessResponse transactionInfo(
      @javax.annotation.Nonnull TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   *
   * @return transactionInfo
   */
  @javax.annotation.Nonnull
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(@javax.annotation.Nonnull TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public ProcessResponse log(@javax.annotation.Nullable String log) {
    this.log = log;
    return this;
  }

  /**
   * Base64 encoded transaction processing log
   *
   * @return log
   */
  @javax.annotation.Nullable
  public String getLog() {
    return log;
  }

  public void setLog(@javax.annotation.Nullable String log) {
    this.log = log;
  }

  public ProcessResponse passBackObject(
      @javax.annotation.Nullable Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
    return this;
  }

  public ProcessResponse putPassBackObjectItem(String key, Object passBackObjectItem) {
    if (this.passBackObject == null) {
      this.passBackObject = new HashMap<>();
    }
    this.passBackObject.put(key, passBackObjectItem);
    return this;
  }

  /**
   * Free-form object provided in request. See passBackObject property of ProcessRequest.
   *
   * @return passBackObject
   */
  @javax.annotation.Nullable
  public Map<String, Object> getPassBackObject() {
    return passBackObject;
  }

  public void setPassBackObject(@javax.annotation.Nullable Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
  }

  public ProcessResponse morePagesAvailable(@javax.annotation.Nonnull Integer morePagesAvailable) {
    this.morePagesAvailable = morePagesAvailable;
    return this;
  }

  /**
   * Get morePagesAvailable
   *
   * @return morePagesAvailable
   */
  @javax.annotation.Nonnull
  public Integer getMorePagesAvailable() {
    return morePagesAvailable;
  }

  public void setMorePagesAvailable(@javax.annotation.Nonnull Integer morePagesAvailable) {
    this.morePagesAvailable = morePagesAvailable;
  }

  public ProcessResponse elapsedTime(@javax.annotation.Nonnull Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * Time the document processing has taken, ms.
   *
   * @return elapsedTime
   */
  @javax.annotation.Nonnull
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(@javax.annotation.Nonnull Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public ProcessResponse metadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public ProcessResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessResponse processResponse = (ProcessResponse) o;
    return Objects.equals(this.chipPage, processResponse.chipPage)
        && Objects.equals(this.coreLibResultCode, processResponse.coreLibResultCode)
        && Objects.equals(this.processingFinished, processResponse.processingFinished)
        && Objects.equals(this.containerList, processResponse.containerList)
        && Objects.equals(this.transactionInfo, processResponse.transactionInfo)
        && Objects.equals(this.log, processResponse.log)
        && Objects.equals(this.passBackObject, processResponse.passBackObject)
        && Objects.equals(this.morePagesAvailable, processResponse.morePagesAvailable)
        && Objects.equals(this.elapsedTime, processResponse.elapsedTime)
        && Objects.equals(this.metadata, processResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chipPage,
        coreLibResultCode,
        processingFinished,
        containerList,
        transactionInfo,
        log,
        passBackObject,
        morePagesAvailable,
        elapsedTime,
        metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessResponse {\n");
    sb.append("    chipPage: ").append(toIndentedString(chipPage)).append("\n");
    sb.append("    coreLibResultCode: ").append(toIndentedString(coreLibResultCode)).append("\n");
    sb.append("    processingFinished: ").append(toIndentedString(processingFinished)).append("\n");
    sb.append("    containerList: ").append(toIndentedString(containerList)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    passBackObject: ").append(toIndentedString(passBackObject)).append("\n");
    sb.append("    morePagesAvailable: ").append(toIndentedString(morePagesAvailable)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("ChipPage");
    openapiFields.add("CoreLibResultCode");
    openapiFields.add("ProcessingFinished");
    openapiFields.add("ContainerList");
    openapiFields.add("TransactionInfo");
    openapiFields.add("log");
    openapiFields.add("passBackObject");
    openapiFields.add("morePagesAvailable");
    openapiFields.add("elapsedTime");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ChipPage");
    openapiRequiredFields.add("ProcessingFinished");
    openapiRequiredFields.add("ContainerList");
    openapiRequiredFields.add("TransactionInfo");
    openapiRequiredFields.add("morePagesAvailable");
    openapiRequiredFields.add("elapsedTime");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProcessResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ProcessResponse.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ProcessResponse is not found in the empty JSON string",
                ProcessResponse.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ProcessResponse.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ProcessResponse` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ProcessResponse.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // validate the required field `ChipPage`
    RfidLocation.validateJsonElement(jsonObj.get("ChipPage"));
    // validate the required field `ProcessingFinished`
    ProcessingStatus.validateJsonElement(jsonObj.get("ProcessingFinished"));
    // validate the required field `ContainerList`
    ContainerList.validateJsonElement(jsonObj.get("ContainerList"));
    // validate the required field `TransactionInfo`
    TransactionInfo.validateJsonElement(jsonObj.get("TransactionInfo"));
    if ((jsonObj.get("log") != null && !jsonObj.get("log").isJsonNull())
        && !jsonObj.get("log").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `log` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("log").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ProcessResponse.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ProcessResponse' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ProcessResponse> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ProcessResponse.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ProcessResponse>() {
            @Override
            public void write(JsonWriter out, ProcessResponse value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ProcessResponse read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ProcessResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProcessResponse
   * @throws IOException if the JSON string is invalid with respect to ProcessResponse
   */
  public static ProcessResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessResponse.class);
  }

  /**
   * Convert an instance of ProcessResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
