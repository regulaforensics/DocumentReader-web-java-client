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

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ProcessRequest */
public class ProcessRequest {
  public static final String SERIALIZED_NAME_LCID_FILTER = "lcidFilter";

  @SerializedName(SERIALIZED_NAME_LCID_FILTER)
  private List<Integer> lcidFilter = null;

  public static final String SERIALIZED_NAME_PROCESS_PARAM = "processParam";

  @SerializedName(SERIALIZED_NAME_PROCESS_PARAM)
  private ProcessParams processParam;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ProcessRequestImage> list = null;

  public static final String SERIALIZED_NAME_TAG = "tag";

  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TENANT = "tenant";

  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_ENV = "env";

  @SerializedName(SERIALIZED_NAME_ENV)
  private String env;

  public static final String SERIALIZED_NAME_LIVE_PORTRAIT = "livePortrait";

  @SerializedName(SERIALIZED_NAME_LIVE_PORTRAIT)
  private String livePortrait;

  public static final String SERIALIZED_NAME_EXT_PORTRAIT = "extPortrait";

  @SerializedName(SERIALIZED_NAME_EXT_PORTRAIT)
  private String extPortrait;

  public static final String SERIALIZED_NAME_CONTAINER_LIST = "ContainerList";

  @SerializedName(SERIALIZED_NAME_CONTAINER_LIST)
  private ContainerList containerList;

  public static final String SERIALIZED_NAME_SYSTEM_INFO = "systemInfo";

  @SerializedName(SERIALIZED_NAME_SYSTEM_INFO)
  private ProcessSystemInfo systemInfo;

  public static final String SERIALIZED_NAME_PASS_BACK_OBJECT = "passBackObject";

  @SerializedName(SERIALIZED_NAME_PASS_BACK_OBJECT)
  private Map<String, Object> passBackObject = null;

  public ProcessRequest withLcidFilter(List<Integer> lcidFilter) {
    this.lcidFilter = lcidFilter;
    return this;
  }

  public ProcessRequest addLcidFilterItem(Integer lcidFilterItem) {
    if (this.lcidFilter == null) {
      this.lcidFilter = new ArrayList<Integer>();
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
  public List<Integer> getLcidFilter() {
    return lcidFilter;
  }

  public void setLcidFilter(List<Integer> lcidFilter) {
    this.lcidFilter = lcidFilter;
  }

  public ProcessRequest withProcessParam(ProcessParams processParam) {
    this.processParam = processParam;
    return this;
  }

  /**
   * Get processParam
   *
   * @return processParam
   */
  public ProcessParams getProcessParam() {
    return processParam;
  }

  public void setProcessParam(ProcessParams processParam) {
    this.processParam = processParam;
  }

  public ProcessRequest withList(List<ProcessRequestImage> list) {
    this.list = list;
    return this;
  }

  public ProcessRequest addListItem(ProcessRequestImage listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ProcessRequestImage>();
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

  public void setList(List<ProcessRequestImage> list) {
    this.list = list;
  }

  public ProcessRequest withTag(String tag) {
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

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ProcessRequest withTenant(String tenant) {
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

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public ProcessRequest withEnv(String env) {
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

  public void setEnv(String env) {
    this.env = env;
  }

  public ProcessRequest withLivePortrait(String livePortrait) {
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

  public void setLivePortrait(String livePortrait) {
    this.livePortrait = livePortrait;
  }

  public ProcessRequest withExtPortrait(String extPortrait) {
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

  public void setExtPortrait(String extPortrait) {
    this.extPortrait = extPortrait;
  }

  public ProcessRequest withContainerList(ContainerList containerList) {
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

  public void setContainerList(ContainerList containerList) {
    this.containerList = containerList;
  }

  public ProcessRequest withSystemInfo(ProcessSystemInfo systemInfo) {
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

  public void setSystemInfo(ProcessSystemInfo systemInfo) {
    this.systemInfo = systemInfo;
  }

  public ProcessRequest withPassBackObject(Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
    return this;
  }

  public ProcessRequest putPassBackObjectItem(String key, Object passBackObjectItem) {
    if (this.passBackObject == null) {
      this.passBackObject = new HashMap<String, Object>();
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

  public void setPassBackObject(Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
        && Objects.equals(this.passBackObject, processRequest.passBackObject);
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
        passBackObject);
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
