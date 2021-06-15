/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** ProcessResponse */
public class ProcessResponse {
  public static final String SERIALIZED_NAME_CHIP_PAGE = "ChipPage";

  @SerializedName(SERIALIZED_NAME_CHIP_PAGE)
  private Integer chipPage;

  public static final String SERIALIZED_NAME_PROCESSING_FINISHED = "ProcessingFinished";

  @SerializedName(SERIALIZED_NAME_PROCESSING_FINISHED)
  private Integer processingFinished;

  public static final String SERIALIZED_NAME_CONTAINER_LIST = "ContainerList";

  @SerializedName(SERIALIZED_NAME_CONTAINER_LIST)
  private ContainerList containerList;

  public static final String SERIALIZED_NAME_TRANSACTION_INFO = "TransactionInfo";

  @SerializedName(SERIALIZED_NAME_TRANSACTION_INFO)
  private TransactionInfo transactionInfo;

  public static final String SERIALIZED_NAME_LOG = "log";

  @SerializedName(SERIALIZED_NAME_LOG)
  private String log;

  public static final String SERIALIZED_NAME_PASS_BACK_OBJECT = "passBackObject";

  @SerializedName(SERIALIZED_NAME_PASS_BACK_OBJECT)
  private Map<String, Object> passBackObject = null;

  public ProcessResponse withChipPage(Integer chipPage) {
    this.chipPage = chipPage;
    return this;
  }

  /**
   * Get chipPage
   *
   * @return chipPage
   */
  @javax.annotation.Nullable
  public Integer getChipPage() {
    return chipPage;
  }

  public void setChipPage(Integer chipPage) {
    this.chipPage = chipPage;
  }

  public ProcessResponse withProcessingFinished(Integer processingFinished) {
    this.processingFinished = processingFinished;
    return this;
  }

  /**
   * Get processingFinished
   *
   * @return processingFinished
   */
  public Integer getProcessingFinished() {
    return processingFinished;
  }

  public void setProcessingFinished(Integer processingFinished) {
    this.processingFinished = processingFinished;
  }

  public ProcessResponse withContainerList(ContainerList containerList) {
    this.containerList = containerList;
    return this;
  }

  /**
   * Get containerList
   *
   * @return containerList
   */
  public ContainerList getContainerList() {
    return containerList;
  }

  public void setContainerList(ContainerList containerList) {
    this.containerList = containerList;
  }

  public ProcessResponse withTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   *
   * @return transactionInfo
   */
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public ProcessResponse withLog(String log) {
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

  public void setLog(String log) {
    this.log = log;
  }

  public ProcessResponse withPassBackObject(Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
    return this;
  }

  public ProcessResponse putPassBackObjectItem(String key, Object passBackObjectItem) {
    if (this.passBackObject == null) {
      this.passBackObject = new HashMap<String, Object>();
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
    ProcessResponse processResponse = (ProcessResponse) o;
    return Objects.equals(this.chipPage, processResponse.chipPage)
        && Objects.equals(this.processingFinished, processResponse.processingFinished)
        && Objects.equals(this.containerList, processResponse.containerList)
        && Objects.equals(this.transactionInfo, processResponse.transactionInfo)
        && Objects.equals(this.log, processResponse.log)
        && Objects.equals(this.passBackObject, processResponse.passBackObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chipPage, processingFinished, containerList, transactionInfo, log, passBackObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessResponse {\n");
    sb.append("    chipPage: ").append(toIndentedString(chipPage)).append("\n");
    sb.append("    processingFinished: ").append(toIndentedString(processingFinished)).append("\n");
    sb.append("    containerList: ").append(toIndentedString(containerList)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
