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
import java.util.List;
import java.util.Objects;

/** Contents of the identifier in binary form. Base64 encoded. */
public class RfidDistinguishedName {
  public static final String SERIALIZED_NAME_DATA = "Data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "FriendlyName";

  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private TrfFtString friendlyName;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";

  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<RfidAttributeName> attributes = new ArrayList<RfidAttributeName>();

  public RfidDistinguishedName withData(String data) {
    this.data = data;
    return this;
  }

  /**
   * Contents of the identifier in binary form. Base64 encoded.
   *
   * @return data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public RfidDistinguishedName withFriendlyName(TrfFtString friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   *
   * @return friendlyName
   */
  public TrfFtString getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(TrfFtString friendlyName) {
    this.friendlyName = friendlyName;
  }

  public RfidDistinguishedName withAttributes(List<RfidAttributeName> attributes) {
    this.attributes = attributes;
    return this;
  }

  public RfidDistinguishedName addAttributesItem(RfidAttributeName attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * List of individual attributes contained in the identifier
   *
   * @return attributes
   */
  public List<RfidAttributeName> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<RfidAttributeName> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidDistinguishedName rfidDistinguishedName = (RfidDistinguishedName) o;
    return Objects.equals(this.data, rfidDistinguishedName.data)
        && Objects.equals(this.friendlyName, rfidDistinguishedName.friendlyName)
        && Objects.equals(this.attributes, rfidDistinguishedName.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, friendlyName, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidDistinguishedName {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
