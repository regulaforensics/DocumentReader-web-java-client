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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.regula.documentreader.webclient.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class GraphicFieldsListPArrayFieldsInner extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(GraphicFieldsListPArrayFieldsInner.class.getName());

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!GraphicFieldsListPArrayFieldsInner.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'GraphicFieldsListPArrayFieldsInner' and its
        // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<GraphicFieldRect> adapterGraphicFieldRect =
          gson.getDelegateAdapter(this, TypeToken.get(GraphicFieldRect.class));
      final TypeAdapter<GraphicFieldRfid> adapterGraphicFieldRfid =
          gson.getDelegateAdapter(this, TypeToken.get(GraphicFieldRfid.class));

      return (TypeAdapter<T>)
          new TypeAdapter<GraphicFieldsListPArrayFieldsInner>() {
            @Override
            public void write(JsonWriter out, GraphicFieldsListPArrayFieldsInner value)
                throws IOException {
              if (value == null || value.getActualInstance() == null) {
                elementAdapter.write(out, null);
                return;
              }

              // check if the actual instance is of the type `GraphicFieldRect`
              if (value.getActualInstance() instanceof GraphicFieldRect) {
                JsonElement element =
                    adapterGraphicFieldRect.toJsonTree(
                        (GraphicFieldRect) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              // check if the actual instance is of the type `GraphicFieldRfid`
              if (value.getActualInstance() instanceof GraphicFieldRfid) {
                JsonElement element =
                    adapterGraphicFieldRfid.toJsonTree(
                        (GraphicFieldRfid) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              throw new IOException(
                  "Failed to serialize as the type doesn't match oneOf schemas: GraphicFieldRect, GraphicFieldRfid");
            }

            @Override
            public GraphicFieldsListPArrayFieldsInner read(JsonReader in) throws IOException {
              Object deserialized = null;
              JsonElement jsonElement = elementAdapter.read(in);

              int match = 0;
              ArrayList<String> errorMessages = new ArrayList<>();
              TypeAdapter actualAdapter = elementAdapter;

              // deserialize GraphicFieldRect
              try {
                // validate the JSON object to see if any exception is thrown
                GraphicFieldRect.validateJsonElement(jsonElement);
                actualAdapter = adapterGraphicFieldRect;
                match++;
                log.log(Level.FINER, "Input data matches schema 'GraphicFieldRect'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for GraphicFieldRect failed with `%s`.", e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'GraphicFieldRect'", e);
              }
              // deserialize GraphicFieldRfid
              try {
                // validate the JSON object to see if any exception is thrown
                GraphicFieldRfid.validateJsonElement(jsonElement);
                actualAdapter = adapterGraphicFieldRfid;
                match++;
                log.log(Level.FINER, "Input data matches schema 'GraphicFieldRfid'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for GraphicFieldRfid failed with `%s`.", e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'GraphicFieldRfid'", e);
              }

              if (match == 1) {
                GraphicFieldsListPArrayFieldsInner ret = new GraphicFieldsListPArrayFieldsInner();
                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                return ret;
              }

              throw new IOException(
                  String.format(
                      "Failed deserialization for GraphicFieldsListPArrayFieldsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
                      match, errorMessages, jsonElement.toString()));
            }
          }.nullSafe();
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

  public GraphicFieldsListPArrayFieldsInner() {
    super("oneOf", Boolean.FALSE);
  }

  public GraphicFieldsListPArrayFieldsInner(Object o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("GraphicFieldRect", GraphicFieldRect.class);
    schemas.put("GraphicFieldRfid", GraphicFieldRfid.class);
  }

  @Override
  public Map<String, Class<?>> getSchemas() {
    return GraphicFieldsListPArrayFieldsInner.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: GraphicFieldRect, GraphicFieldRfid
   *
   * <p>It could be an instance of the 'oneOf' schemas.
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance instanceof GraphicFieldRect) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof GraphicFieldRfid) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException("Invalid instance type. Must be GraphicFieldRect, GraphicFieldRfid");
  }

  /**
   * Get the actual instance, which can be the following: GraphicFieldRect, GraphicFieldRfid
   *
   * @return The actual instance (GraphicFieldRect, GraphicFieldRfid)
   */
  @SuppressWarnings("unchecked")
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `GraphicFieldRect`. If the actual instance is not
   * `GraphicFieldRect`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GraphicFieldRect`
   * @throws ClassCastException if the instance is not `GraphicFieldRect`
   */
  public GraphicFieldRect getGraphicFieldRect() throws ClassCastException {
    return (GraphicFieldRect) super.getActualInstance();
  }

  /**
   * Get the actual instance of `GraphicFieldRfid`. If the actual instance is not
   * `GraphicFieldRfid`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `GraphicFieldRfid`
   * @throws ClassCastException if the instance is not `GraphicFieldRfid`
   */
  public GraphicFieldRfid getGraphicFieldRfid() throws ClassCastException {
    return (GraphicFieldRfid) super.getActualInstance();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *     GraphicFieldsListPArrayFieldsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with GraphicFieldRect
    try {
      GraphicFieldRect.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for GraphicFieldRect failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GraphicFieldRfid
    try {
      GraphicFieldRfid.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for GraphicFieldRfid failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(
          String.format(
              "The JSON string is invalid for GraphicFieldsListPArrayFieldsInner with oneOf schemas: GraphicFieldRect, GraphicFieldRfid. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
              validCount, errorMessages, jsonElement.toString()));
    }
  }

  /**
   * Create an instance of GraphicFieldsListPArrayFieldsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GraphicFieldsListPArrayFieldsInner
   * @throws IOException if the JSON string is invalid with respect to
   *     GraphicFieldsListPArrayFieldsInner
   */
  public static GraphicFieldsListPArrayFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphicFieldsListPArrayFieldsInner.class);
  }

  /**
   * Convert an instance of GraphicFieldsListPArrayFieldsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
