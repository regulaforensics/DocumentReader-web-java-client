package com.regula.documentreader.webclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.regula.documentreader.webclient.model.ResultItem;

import java.util.Objects;

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
}
