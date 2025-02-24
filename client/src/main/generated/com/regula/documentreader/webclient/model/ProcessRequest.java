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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ProcessRequest */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0")
public class ProcessRequest {
  public static final String SERIALIZED_NAME_LCID_FILTER = "lcidFilter";

  @SerializedName(SERIALIZED_NAME_LCID_FILTER)
  @javax.annotation.Nullable
  private List<LCID> lcidFilter;

  public static final String SERIALIZED_NAME_PROCESS_PARAM = "processParam";

  @SerializedName(SERIALIZED_NAME_PROCESS_PARAM)
  @javax.annotation.Nonnull
  private ProcessParams processParam;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  @javax.annotation.Nullable
  private List<ProcessRequestImage> list;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nullable
  private String tag;

  public static final String SERIALIZED_NAME_TENANT = "tenant";

  @SerializedName(SERIALIZED_NAME_TENANT)
  @javax.annotation.Nullable
  private String tenant;

  public static final String SERIALIZED_NAME_ENV = "env";

  @SerializedName(SERIALIZED_NAME_ENV)
  @javax.annotation.Nullable
  private String env;

  public static final String SERIALIZED_NAME_LIVE_PORTRAIT = "livePortrait";

  @SerializedName(SERIALIZED_NAME_LIVE_PORTRAIT)
  @javax.annotation.Nullable
  private String livePortrait;

  public static final String SERIALIZED_NAME_EXT_PORTRAIT = "extPortrait";

  @SerializedName(SERIALIZED_NAME_EXT_PORTRAIT)
  @javax.annotation.Nullable
  private String extPortrait;

  public static final String SERIALIZED_NAME_CONTAINER_LIST = "ContainerList";

  @SerializedName(SERIALIZED_NAME_CONTAINER_LIST)
  @javax.annotation.Nullable
  private ContainerList containerList;

  public static final String SERIALIZED_NAME_SYSTEM_INFO = "systemInfo";

  @SerializedName(SERIALIZED_NAME_SYSTEM_INFO)
  @javax.annotation.Nullable
  private ProcessSystemInfo systemInfo;

  public static final String SERIALIZED_NAME_PASS_BACK_OBJECT = "passBackObject";

  @SerializedName(SERIALIZED_NAME_PASS_BACK_OBJECT)
  @javax.annotation.Nullable
  private Map<String, Object> passBackObject;

  public static final String SERIALIZED_NAME_DTC = "dtc";

  @SerializedName(SERIALIZED_NAME_DTC)
  @javax.annotation.Nullable
  private String dtc;

  public static final String SERIALIZED_NAME_IMAGE_URLS = "ImageUrls";

  @SerializedName(SERIALIZED_NAME_IMAGE_URLS)
  @javax.annotation.Nullable
  private List<String> imageUrls;

  public ProcessRequest() {}

  public ProcessRequest lcidFilter(@javax.annotation.Nullable List<LCID> lcidFilter) {
    this.lcidFilter = lcidFilter;
    return this;
  }

  public ProcessRequest addLcidFilterItem(LCID lcidFilterItem) {
    if (this.lcidFilter == null) {
      this.lcidFilter = new ArrayList<>();
    }
    this.lcidFilter.add(lcidFilterItem);
    return this;
  }

  /**
   * The list of LCID types to recognize. If empty, values with all LCID types will be extracted.
   * Empty by default.
   *
   * @return lcidFilter
   */
  @javax.annotation.Nullable
  public List<LCID> getLcidFilter() {
    return lcidFilter;
  }

  public void setLcidFilter(@javax.annotation.Nullable List<LCID> lcidFilter) {
    this.lcidFilter = lcidFilter;
  }

  public ProcessRequest processParam(@javax.annotation.Nonnull ProcessParams processParam) {
    this.processParam = processParam;
    return this;
  }

  /**
   * Get processParam
   *
   * @return processParam
   */
  @javax.annotation.Nonnull
  public ProcessParams getProcessParam() {
    return processParam;
  }

  public void setProcessParam(@javax.annotation.Nonnull ProcessParams processParam) {
    this.processParam = processParam;
  }

  public ProcessRequest list(@javax.annotation.Nullable List<ProcessRequestImage> list) {
    this.list = list;
    return this;
  }

  public ProcessRequest addListItem(ProcessRequestImage listItem) {
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
  @javax.annotation.Nullable
  public List<ProcessRequestImage> getList() {
    return list;
  }

  public void setList(@javax.annotation.Nullable List<ProcessRequestImage> list) {
    this.list = list;
  }

  public ProcessRequest tag(@javax.annotation.Nullable String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Session ID
   *
   * @return tag
   */
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }

  public void setTag(@javax.annotation.Nullable String tag) {
    this.tag = tag;
  }

  public ProcessRequest tenant(@javax.annotation.Nullable String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * Customer name
   *
   * @return tenant
   */
  @javax.annotation.Nullable
  public String getTenant() {
    return tenant;
  }

  public void setTenant(@javax.annotation.Nullable String tenant) {
    this.tenant = tenant;
  }

  public ProcessRequest env(@javax.annotation.Nullable String env) {
    this.env = env;
    return this;
  }

  /**
   * Environment type
   *
   * @return env
   */
  @javax.annotation.Nullable
  public String getEnv() {
    return env;
  }

  public void setEnv(@javax.annotation.Nullable String env) {
    this.env = env;
  }

  public ProcessRequest livePortrait(@javax.annotation.Nullable String livePortrait) {
    this.livePortrait = livePortrait;
    return this;
  }

  /**
   * Live portrait photo
   *
   * @return livePortrait
   */
  @javax.annotation.Nullable
  public String getLivePortrait() {
    return livePortrait;
  }

  public void setLivePortrait(@javax.annotation.Nullable String livePortrait) {
    this.livePortrait = livePortrait;
  }

  public ProcessRequest extPortrait(@javax.annotation.Nullable String extPortrait) {
    this.extPortrait = extPortrait;
    return this;
  }

  /**
   * Portrait photo from an external source
   *
   * @return extPortrait
   */
  @javax.annotation.Nullable
  public String getExtPortrait() {
    return extPortrait;
  }

  public void setExtPortrait(@javax.annotation.Nullable String extPortrait) {
    this.extPortrait = extPortrait;
  }

  public ProcessRequest containerList(@javax.annotation.Nullable ContainerList containerList) {
    this.containerList = containerList;
    return this;
  }

  /**
   * Get containerList
   *
   * @return containerList
   */
  @javax.annotation.Nullable
  public ContainerList getContainerList() {
    return containerList;
  }

  public void setContainerList(@javax.annotation.Nullable ContainerList containerList) {
    this.containerList = containerList;
  }

  public ProcessRequest systemInfo(@javax.annotation.Nullable ProcessSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
    return this;
  }

  /**
   * Get systemInfo
   *
   * @return systemInfo
   */
  @javax.annotation.Nullable
  public ProcessSystemInfo getSystemInfo() {
    return systemInfo;
  }

  public void setSystemInfo(@javax.annotation.Nullable ProcessSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
  }

  public ProcessRequest passBackObject(
      @javax.annotation.Nullable Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
    return this;
  }

  public ProcessRequest putPassBackObjectItem(String key, Object passBackObjectItem) {
    if (this.passBackObject == null) {
      this.passBackObject = new HashMap<>();
    }
    this.passBackObject.put(key, passBackObjectItem);
    return this;
  }

  /**
   * Free-form object to be included in response. Must be object, not list or simple value. Do not
   * affect document processing. Use it freely to pass your app params. Stored in process logs.
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

  public ProcessRequest dtc(@javax.annotation.Nullable String dtc) {
    this.dtc = dtc;
    return this;
  }

  /**
   * Digital Travel Credential (DTC-VC) data in base64 format for processing
   *
   * @return dtc
   */
  @javax.annotation.Nullable
  public String getDtc() {
    return dtc;
  }

  public void setDtc(@javax.annotation.Nullable String dtc) {
    this.dtc = dtc;
  }

  public ProcessRequest imageUrls(@javax.annotation.Nullable List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public ProcessRequest addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

  /**
   * URLs to the document images for processing.
   *
   * @return imageUrls
   */
  @javax.annotation.Nullable
  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(@javax.annotation.Nullable List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequest processRequest = (ProcessRequest) o;
    return Objects.equals(this.lcidFilter, processRequest.lcidFilter)
        && Objects.equals(this.processParam, processRequest.processParam)
        && Objects.equals(this.list, processRequest.list)
        && Objects.equals(this.tag, processRequest.tag)
        && Objects.equals(this.tenant, processRequest.tenant)
        && Objects.equals(this.env, processRequest.env)
        && Objects.equals(this.livePortrait, processRequest.livePortrait)
        && Objects.equals(this.extPortrait, processRequest.extPortrait)
        && Objects.equals(this.containerList, processRequest.containerList)
        && Objects.equals(this.systemInfo, processRequest.systemInfo)
        && Objects.equals(this.passBackObject, processRequest.passBackObject)
        && Objects.equals(this.dtc, processRequest.dtc)
        && Objects.equals(this.imageUrls, processRequest.imageUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lcidFilter,
        processParam,
        list,
        tag,
        tenant,
        env,
        livePortrait,
        extPortrait,
        containerList,
        systemInfo,
        passBackObject,
        dtc,
        imageUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequest {\n");
    sb.append("    lcidFilter: ").append(toIndentedString(lcidFilter)).append("\n");
    sb.append("    processParam: ").append(toIndentedString(processParam)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    livePortrait: ").append(toIndentedString(livePortrait)).append("\n");
    sb.append("    extPortrait: ").append(toIndentedString(extPortrait)).append("\n");
    sb.append("    containerList: ").append(toIndentedString(containerList)).append("\n");
    sb.append("    systemInfo: ").append(toIndentedString(systemInfo)).append("\n");
    sb.append("    passBackObject: ").append(toIndentedString(passBackObject)).append("\n");
    sb.append("    dtc: ").append(toIndentedString(dtc)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
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
    openapiFields.add("lcidFilter");
    openapiFields.add("processParam");
    openapiFields.add("List");
    openapiFields.add("tag");
    openapiFields.add("tenant");
    openapiFields.add("env");
    openapiFields.add("livePortrait");
    openapiFields.add("extPortrait");
    openapiFields.add("ContainerList");
    openapiFields.add("systemInfo");
    openapiFields.add("passBackObject");
    openapiFields.add("dtc");
    openapiFields.add("ImageUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("processParam");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProcessRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    if (jsonElement == null) {
      if (!ProcessRequest.openapiRequiredFields
          .isEmpty()) { // has required fields but JSON element is null
        throw new IllegalArgumentException(
            String.format(
                "The required field(s) %s in ProcessRequest is not found in the empty JSON string",
                ProcessRequest.openapiRequiredFields.toString()));
      }
    }

    Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
    // check to see if the JSON string contains additional fields
    for (Map.Entry<String, JsonElement> entry : entries) {
      if (!ProcessRequest.openapiFields.contains(entry.getKey())) {
        throw new IllegalArgumentException(
            String.format(
                "The field `%s` in the JSON string is not defined in the `ProcessRequest` properties. JSON: %s",
                entry.getKey(), jsonElement.toString()));
      }
    }

    // check to make sure all required properties/fields are present in the JSON string
    for (String requiredField : ProcessRequest.openapiRequiredFields) {
      if (jsonElement.getAsJsonObject().get(requiredField) == null) {
        throw new IllegalArgumentException(
            String.format(
                "The required field `%s` is not found in the JSON string: %s",
                requiredField, jsonElement.toString()));
      }
    }
    JsonObject jsonObj = jsonElement.getAsJsonObject();
    // ensure the optional json data is an array if present
    if (jsonObj.get("lcidFilter") != null
        && !jsonObj.get("lcidFilter").isJsonNull()
        && !jsonObj.get("lcidFilter").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `lcidFilter` to be an array in the JSON string but got `%s`",
              jsonObj.get("lcidFilter").toString()));
    }
    // validate the required field `processParam`
    ProcessParams.validateJsonElement(jsonObj.get("processParam"));
    if (jsonObj.get("List") != null && !jsonObj.get("List").isJsonNull()) {
      JsonArray jsonArraylist = jsonObj.getAsJsonArray("List");
      if (jsonArraylist != null) {
        // ensure the json data is an array
        if (!jsonObj.get("List").isJsonArray()) {
          throw new IllegalArgumentException(
              String.format(
                  "Expected the field `List` to be an array in the JSON string but got `%s`",
                  jsonObj.get("List").toString()));
        }

        // validate the optional field `List` (array)
        for (int i = 0; i < jsonArraylist.size(); i++) {
          ProcessRequestImage.validateJsonElement(jsonArraylist.get(i));
        }
        ;
      }
    }
    if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull())
        && !jsonObj.get("tag").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `tag` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("tag").toString()));
    }
    if ((jsonObj.get("tenant") != null && !jsonObj.get("tenant").isJsonNull())
        && !jsonObj.get("tenant").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `tenant` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("tenant").toString()));
    }
    if ((jsonObj.get("env") != null && !jsonObj.get("env").isJsonNull())
        && !jsonObj.get("env").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `env` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("env").toString()));
    }
    if ((jsonObj.get("livePortrait") != null && !jsonObj.get("livePortrait").isJsonNull())
        && !jsonObj.get("livePortrait").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `livePortrait` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("livePortrait").toString()));
    }
    if ((jsonObj.get("extPortrait") != null && !jsonObj.get("extPortrait").isJsonNull())
        && !jsonObj.get("extPortrait").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `extPortrait` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("extPortrait").toString()));
    }
    // validate the optional field `ContainerList`
    if (jsonObj.get("ContainerList") != null && !jsonObj.get("ContainerList").isJsonNull()) {
      ContainerList.validateJsonElement(jsonObj.get("ContainerList"));
    }
    // validate the optional field `systemInfo`
    if (jsonObj.get("systemInfo") != null && !jsonObj.get("systemInfo").isJsonNull()) {
      ProcessSystemInfo.validateJsonElement(jsonObj.get("systemInfo"));
    }
    if ((jsonObj.get("dtc") != null && !jsonObj.get("dtc").isJsonNull())
        && !jsonObj.get("dtc").isJsonPrimitive()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `dtc` to be a primitive type in the JSON string but got `%s`",
              jsonObj.get("dtc").toString()));
    }
    // ensure the optional json data is an array if present
    if (jsonObj.get("ImageUrls") != null
        && !jsonObj.get("ImageUrls").isJsonNull()
        && !jsonObj.get("ImageUrls").isJsonArray()) {
      throw new IllegalArgumentException(
          String.format(
              "Expected the field `ImageUrls` to be an array in the JSON string but got `%s`",
              jsonObj.get("ImageUrls").toString()));
    }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!ProcessRequest.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'ProcessRequest' and its subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<ProcessRequest> thisAdapter =
          gson.getDelegateAdapter(this, TypeToken.get(ProcessRequest.class));

      return (TypeAdapter<T>)
          new TypeAdapter<ProcessRequest>() {
            @Override
            public void write(JsonWriter out, ProcessRequest value) throws IOException {
              JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
              elementAdapter.write(out, obj);
            }

            @Override
            public ProcessRequest read(JsonReader in) throws IOException {
              JsonElement jsonElement = elementAdapter.read(in);
              validateJsonElement(jsonElement);
              return thisAdapter.fromJsonTree(jsonElement);
            }
          }.nullSafe();
    }
  }

  /**
   * Create an instance of ProcessRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProcessRequest
   * @throws IOException if the JSON string is invalid with respect to ProcessRequest
   */
  public static ProcessRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessRequest.class);
  }

  /**
   * Convert an instance of ProcessRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
