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
import java.util.List;
import java.util.Objects;

/** DocumentTypesCandidatesList */
public class DocumentTypesCandidatesList {
  public static final String SERIALIZED_NAME_REC_RESULT = "RecResult";

  @SerializedName(SERIALIZED_NAME_REC_RESULT)
  private Integer recResult;

  public static final String SERIALIZED_NAME_CANDIDATES = "Candidates";

  @SerializedName(SERIALIZED_NAME_CANDIDATES)
  private List<OneCandidate> candidates = null;

  public DocumentTypesCandidatesList withRecResult(Integer recResult) {
    this.recResult = recResult;
    return this;
  }

  /**
   * Get recResult
   *
   * @return recResult
   */
  @javax.annotation.Nullable
  public Integer getRecResult() {
    return recResult;
  }

  public void setRecResult(Integer recResult) {
    this.recResult = recResult;
  }

  public DocumentTypesCandidatesList withCandidates(List<OneCandidate> candidates) {
    this.candidates = candidates;
    return this;
  }

  public DocumentTypesCandidatesList addCandidatesItem(OneCandidate candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<OneCandidate>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

  /**
   * Get candidates
   *
   * @return candidates
   */
  @javax.annotation.Nullable
  public List<OneCandidate> getCandidates() {
    return candidates;
  }

  public void setCandidates(List<OneCandidate> candidates) {
    this.candidates = candidates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypesCandidatesList documentTypesCandidatesList = (DocumentTypesCandidatesList) o;
    return Objects.equals(this.recResult, documentTypesCandidatesList.recResult)
        && Objects.equals(this.candidates, documentTypesCandidatesList.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recResult, candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypesCandidatesList {\n");
    sb.append("    recResult: ").append(toIndentedString(recResult)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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
