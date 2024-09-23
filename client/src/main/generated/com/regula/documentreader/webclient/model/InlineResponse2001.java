/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.2.0
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

/** InlineResponse2001 */
public class InlineResponse2001 {
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

  public static final String SERIALIZED_NAME_MORE_PAGES_AVAILABLE = "morePagesAvailable";

  @SerializedName(SERIALIZED_NAME_MORE_PAGES_AVAILABLE)
  private Integer morePagesAvailable;

  public static final String SERIALIZED_NAME_ELAPSED_TIME = "elapsedTime";

  @SerializedName(SERIALIZED_NAME_ELAPSED_TIME)
  private Integer elapsedTime;

  public static final String SERIALIZED_NAME_CORE_LIB_RESULT_CODE = "CoreLibResultCode";

  @SerializedName(SERIALIZED_NAME_CORE_LIB_RESULT_CODE)
  private Integer coreLibResultCode;

  public InlineResponse2001 withChipPage(Integer chipPage) {
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

  public InlineResponse2001 withProcessingFinished(Integer processingFinished) {
    this.processingFinished = processingFinished;
    return this;
  }

  /**
   * Get processingFinished
   *
   * @return processingFinished
   */
  @javax.annotation.Nullable
  public Integer getProcessingFinished() {
    return processingFinished;
  }

  public void setProcessingFinished(Integer processingFinished) {
    this.processingFinished = processingFinished;
  }

  public InlineResponse2001 withContainerList(ContainerList containerList) {
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

  public InlineResponse2001 withTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   *
   * @return transactionInfo
   */
  @javax.annotation.Nullable
  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public InlineResponse2001 withLog(String log) {
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

  public InlineResponse2001 withPassBackObject(Map<String, Object> passBackObject) {
    this.passBackObject = passBackObject;
    return this;
  }

  public InlineResponse2001 putPassBackObjectItem(String key, Object passBackObjectItem) {
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

  public InlineResponse2001 withMorePagesAvailable(Integer morePagesAvailable) {
    this.morePagesAvailable = morePagesAvailable;
    return this;
  }

  /**
   * Get morePagesAvailable
   *
   * @return morePagesAvailable
   */
  @javax.annotation.Nullable
  public Integer getMorePagesAvailable() {
    return morePagesAvailable;
  }

  public void setMorePagesAvailable(Integer morePagesAvailable) {
    this.morePagesAvailable = morePagesAvailable;
  }

  public InlineResponse2001 withElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * Time the document processing has taken, ms.
   *
   * @return elapsedTime
   */
  @javax.annotation.Nullable
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public InlineResponse2001 withCoreLibResultCode(Integer coreLibResultCode) {
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

  public void setCoreLibResultCode(Integer coreLibResultCode) {
    this.coreLibResultCode = coreLibResultCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.chipPage, inlineResponse2001.chipPage)
        && Objects.equals(this.processingFinished, inlineResponse2001.processingFinished)
        && Objects.equals(this.containerList, inlineResponse2001.containerList)
        && Objects.equals(this.transactionInfo, inlineResponse2001.transactionInfo)
        && Objects.equals(this.log, inlineResponse2001.log)
        && Objects.equals(this.passBackObject, inlineResponse2001.passBackObject)
        && Objects.equals(this.morePagesAvailable, inlineResponse2001.morePagesAvailable)
        && Objects.equals(this.elapsedTime, inlineResponse2001.elapsedTime)
        && Objects.equals(this.coreLibResultCode, inlineResponse2001.coreLibResultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chipPage,
        processingFinished,
        containerList,
        transactionInfo,
        log,
        passBackObject,
        morePagesAvailable,
        elapsedTime,
        coreLibResultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    chipPage: ").append(toIndentedString(chipPage)).append("\n");
    sb.append("    processingFinished: ").append(toIndentedString(processingFinished)).append("\n");
    sb.append("    containerList: ").append(toIndentedString(containerList)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    passBackObject: ").append(toIndentedString(passBackObject)).append("\n");
    sb.append("    morePagesAvailable: ").append(toIndentedString(morePagesAvailable)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    coreLibResultCode: ").append(toIndentedString(coreLibResultCode)).append("\n");
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
