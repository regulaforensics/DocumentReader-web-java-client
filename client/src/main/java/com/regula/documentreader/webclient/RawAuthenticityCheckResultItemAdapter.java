package com.regula.documentreader.webclient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class RawAuthenticityCheckResultItemAdapter
    extends TypeAdapter<RawAuthenticityCheckResultItem> {
  private final Gson gson = new Gson();

  @Override
  public void write(JsonWriter out, RawAuthenticityCheckResultItem value) {
    this.gson.toJson(value.getRaw(), out);
  }

  @Override
  public RawAuthenticityCheckResultItem read(JsonReader in) {
    RawAuthenticityCheckResultItem rawAuthenticityCheckResultItem =
        new RawAuthenticityCheckResultItem();

    JsonObject raw = this.gson.fromJson(in, JsonObject.class);
    rawAuthenticityCheckResultItem.withRaw(raw);

    return rawAuthenticityCheckResultItem;
  }
}
