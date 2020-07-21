package com.regula.documentreader.webclient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class RawResultItemAdapter extends TypeAdapter<RawResultItem> {
    private final Gson gson = new Gson();

    @Override
    public void write(JsonWriter out, RawResultItem value) {
        this.gson.toJson(value.getRaw(), out);
    }

    @Override
    public RawResultItem read(JsonReader in) {
        RawResultItem rawResultItem = new RawResultItem();

        JsonObject raw = this.gson.fromJson(in, JsonObject.class);
        rawResultItem.withRaw(raw);

        return rawResultItem;
    }
}
