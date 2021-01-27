package com.regula.documentreader.webclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.regula.documentreader.webclient.model.AuthenticityCheckResultItem;
import java.util.Objects;

@JsonAdapter(RawAuthenticityCheckResultItemAdapter.class)
public class RawAuthenticityCheckResultItem extends AuthenticityCheckResultItem {
  private JsonObject raw;

  public RawAuthenticityCheckResultItem withRaw(JsonObject raw) {
    this.raw = raw;

    JsonElement member = raw.get(AuthenticityCheckResultItem.SERIALIZED_NAME_TYPE);
    if (member != null) {
      this.withType(member.getAsInt());
    }
    member = raw.get(AuthenticityCheckResultItem.SERIALIZED_NAME_ELEMENT_RESULT);
    if (member != null) {
      this.withElementResult(member.getAsInt());
    }
    member = raw.get(AuthenticityCheckResultItem.SERIALIZED_NAME_ELEMENT_DIAGNOSE);
    if (member != null) {
      this.withElementDiagnose(member.getAsInt());
    }

    return this;
  }

  @javax.annotation.Nullable
  public JsonObject getRaw() {
    return this.raw;
  }

  public void setRaw(JsonObject raw) {
    this.withRaw(raw);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    RawAuthenticityCheckResultItem rawAuthenticityCheckResultItem =
        (RawAuthenticityCheckResultItem) o;
    return Objects.equals(raw, rawAuthenticityCheckResultItem.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawAuthenticityCheckResultItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
