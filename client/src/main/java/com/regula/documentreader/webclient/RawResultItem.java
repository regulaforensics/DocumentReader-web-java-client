package com.regula.documentreader.webclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.regula.documentreader.webclient.model.ResultItem;
import java.util.Objects;
import javax.annotation.Nullable;

@JsonAdapter(RawResultItemAdapter.class)
public class RawResultItem extends ResultItem {
  private JsonObject raw;

  public RawResultItem withRaw(JsonObject raw) {
    this.raw = raw;

    JsonElement member = raw.get(ResultItem.SERIALIZED_NAME_BUF_LENGTH);
    if (member != null) {
      this.withBufLength(member.getAsInt());
    }
    member = raw.get(ResultItem.SERIALIZED_NAME_LIGHT);
    if (member != null) {
      this.withLight(member.getAsInt());
    }
    member = raw.get(ResultItem.SERIALIZED_NAME_LIST_IDX);
    if (member != null) {
      this.withListIdx(member.getAsInt());
    }
    member = raw.get(ResultItem.SERIALIZED_NAME_PAGE_IDX);
    if (member != null) {
      this.withPageIdx(member.getAsInt());
    }
    member = raw.get(ResultItem.SERIALIZED_NAME_RESULT_TYPE);
    if (member != null) {
      this.withResultType(member.getAsInt());
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
    RawResultItem rawResultItem = (RawResultItem) o;
    return Objects.equals(raw, rawResultItem.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawResultItem {\n");
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

  @Override
  public RawResultItem withBufLength(Integer bufLength) {
    ResultItem item = super.withBufLength(bufLength);
    return (RawResultItem) item;
  }

  @Nullable
  @Override
  public Integer getBufLength() {
    return super.getBufLength();
  }

  @Override
  public void setBufLength(Integer bufLength) {
    super.setBufLength(bufLength);
  }

  @Override
  public RawResultItem withLight(Integer light) {
    ResultItem item = super.withLight(light);
    return (RawResultItem) item;
  }

  @Nullable
  @Override
  public Integer getLight() {
    return super.getLight();
  }

  @Override
  public void setLight(Integer light) {
    super.setLight(light);
  }

  @Override
  public RawResultItem withListIdx(Integer listIdx) {
    ResultItem item = super.withListIdx(listIdx);
    return (RawResultItem) item;
  }

  @Nullable
  @Override
  public Integer getListIdx() {
    return super.getListIdx();
  }

  @Override
  public void setListIdx(Integer listIdx) {
    super.setListIdx(listIdx);
  }

  @Override
  public RawResultItem withPageIdx(Integer pageIdx) {
    ResultItem item = super.withPageIdx(pageIdx);
    return (RawResultItem) item;
  }

  @Nullable
  @Override
  public Integer getPageIdx() {
    return super.getPageIdx();
  }

  @Override
  public void setPageIdx(Integer pageIdx) {
    super.setPageIdx(pageIdx);
  }

  @Override
  public RawResultItem withResultType(Integer resultType) {
    ResultItem item = super.withResultType(resultType);
    return (RawResultItem) item;
  }

  @Override
  public Integer getResultType() {
    return super.getResultType();
  }

  @Override
  public void setResultType(Integer resultType) {
    super.setResultType(resultType);
  }
}
