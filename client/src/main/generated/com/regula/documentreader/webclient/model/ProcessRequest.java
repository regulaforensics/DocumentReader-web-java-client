/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.7.0
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
  public static final String SERIALIZED_NAME_PROCESS_PARAM = "processParam";

  @SerializedName(SERIALIZED_NAME_PROCESS_PARAM)
  private ProcessParams processParam;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ProcessRequestImage> list = new ArrayList<ProcessRequestImage>();

  public static final String SERIALIZED_NAME_SYSTEM_INFO = "systemInfo";

  @SerializedName(SERIALIZED_NAME_SYSTEM_INFO)
  private ProcessSystemInfo systemInfo;

  public static final String SERIALIZED_NAME_PASS_BACK_OBJECT = "passBackObject";

  @SerializedName(SERIALIZED_NAME_PASS_BACK_OBJECT)
  private Map<String, Object> passBackObject = null;

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
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<ProcessRequestImage> getList() {
    return list;
  }

  public void setList(List<ProcessRequestImage> list) {
    this.list = list;
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
    return Objects.equals(this.processParam, processRequest.processParam)
        && Objects.equals(this.list, processRequest.list)
        && Objects.equals(this.systemInfo, processRequest.systemInfo)
        && Objects.equals(this.passBackObject, processRequest.passBackObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processParam, list, systemInfo, passBackObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequest {\n");
    sb.append("    processParam: ").append(toIndentedString(processParam)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
