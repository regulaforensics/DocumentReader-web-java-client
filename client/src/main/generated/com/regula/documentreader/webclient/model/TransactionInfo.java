/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 7.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** TransactionInfo */
public class TransactionInfo {
  public static final String SERIALIZED_NAME_COMPUTER_NAME = "ComputerName";

  @SerializedName(SERIALIZED_NAME_COMPUTER_NAME)
  private String computerName;

  public static final String SERIALIZED_NAME_DATE_TIME = "DateTime";

  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private String dateTime;

  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "TransactionID";

  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private String transactionID;

  public static final String SERIALIZED_NAME_USER_NAME = "UserName";

  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public TransactionInfo withComputerName(String computerName) {
    this.computerName = computerName;
    return this;
  }

  /**
   * Get computerName
   *
   * @return computerName
   */
  @javax.annotation.Nullable
  public String getComputerName() {
    return computerName;
  }

  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  public TransactionInfo withDateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   *
   * @return dateTime
   */
  @javax.annotation.Nullable
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public TransactionInfo withTransactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Get transactionID
   *
   * @return transactionID
   */
  @javax.annotation.Nullable
  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public TransactionInfo withUserName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   *
   * @return userName
   */
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfo transactionInfo = (TransactionInfo) o;
    return Objects.equals(this.computerName, transactionInfo.computerName)
        && Objects.equals(this.dateTime, transactionInfo.dateTime)
        && Objects.equals(this.transactionID, transactionInfo.transactionID)
        && Objects.equals(this.userName, transactionInfo.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computerName, dateTime, transactionID, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfo {\n");
    sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
