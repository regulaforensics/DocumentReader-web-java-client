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
    comments = "Generator version: 7.11.0")
public class AuthenticityCheckResultListInner extends AbstractOpenApiSchema {
  private static final Logger log =
      Logger.getLogger(AuthenticityCheckResultListInner.class.getName());

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AuthenticityCheckResultListInner.class.isAssignableFrom(type.getRawType())) {
        return null; // this class only serializes 'AuthenticityCheckResultListInner' and its
                     // subtypes
      }
      final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
      final TypeAdapter<SecurityFeatureResult> adapterSecurityFeatureResult =
          gson.getDelegateAdapter(this, TypeToken.get(SecurityFeatureResult.class));
      final TypeAdapter<IdentResult> adapterIdentResult =
          gson.getDelegateAdapter(this, TypeToken.get(IdentResult.class));
      final TypeAdapter<FiberResult> adapterFiberResult =
          gson.getDelegateAdapter(this, TypeToken.get(FiberResult.class));
      final TypeAdapter<OCRSecurityTextResult> adapterOCRSecurityTextResult =
          gson.getDelegateAdapter(this, TypeToken.get(OCRSecurityTextResult.class));
      final TypeAdapter<PhotoIdentResult> adapterPhotoIdentResult =
          gson.getDelegateAdapter(this, TypeToken.get(PhotoIdentResult.class));

      return (TypeAdapter<T>)
          new TypeAdapter<AuthenticityCheckResultListInner>() {
            @Override
            public void write(JsonWriter out, AuthenticityCheckResultListInner value)
                throws IOException {
              if (value == null || value.getActualInstance() == null) {
                elementAdapter.write(out, null);
                return;
              }

              // check if the actual instance is of the type `SecurityFeatureResult`
              if (value.getActualInstance() instanceof SecurityFeatureResult) {
                JsonElement element =
                    adapterSecurityFeatureResult.toJsonTree(
                        (SecurityFeatureResult) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              // check if the actual instance is of the type `IdentResult`
              if (value.getActualInstance() instanceof IdentResult) {
                JsonElement element =
                    adapterIdentResult.toJsonTree((IdentResult) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              // check if the actual instance is of the type `FiberResult`
              if (value.getActualInstance() instanceof FiberResult) {
                JsonElement element =
                    adapterFiberResult.toJsonTree((FiberResult) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              // check if the actual instance is of the type `OCRSecurityTextResult`
              if (value.getActualInstance() instanceof OCRSecurityTextResult) {
                JsonElement element =
                    adapterOCRSecurityTextResult.toJsonTree(
                        (OCRSecurityTextResult) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              // check if the actual instance is of the type `PhotoIdentResult`
              if (value.getActualInstance() instanceof PhotoIdentResult) {
                JsonElement element =
                    adapterPhotoIdentResult.toJsonTree(
                        (PhotoIdentResult) value.getActualInstance());
                elementAdapter.write(out, element);
                return;
              }
              throw new IOException(
                  "Failed to serialize as the type doesn't match oneOf schemas: FiberResult, IdentResult, OCRSecurityTextResult, PhotoIdentResult, SecurityFeatureResult");
            }

            @Override
            public AuthenticityCheckResultListInner read(JsonReader in) throws IOException {
              Object deserialized = null;
              JsonElement jsonElement = elementAdapter.read(in);

              int match = 0;
              ArrayList<String> errorMessages = new ArrayList<>();
              TypeAdapter actualAdapter = elementAdapter;

              // deserialize SecurityFeatureResult
              try {
                // validate the JSON object to see if any exception is thrown
                SecurityFeatureResult.validateJsonElement(jsonElement);
                actualAdapter = adapterSecurityFeatureResult;
                match++;
                log.log(Level.FINER, "Input data matches schema 'SecurityFeatureResult'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for SecurityFeatureResult failed with `%s`.",
                        e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'SecurityFeatureResult'", e);
              }
              // deserialize IdentResult
              try {
                // validate the JSON object to see if any exception is thrown
                IdentResult.validateJsonElement(jsonElement);
                actualAdapter = adapterIdentResult;
                match++;
                log.log(Level.FINER, "Input data matches schema 'IdentResult'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for IdentResult failed with `%s`.", e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'IdentResult'", e);
              }
              // deserialize FiberResult
              try {
                // validate the JSON object to see if any exception is thrown
                FiberResult.validateJsonElement(jsonElement);
                actualAdapter = adapterFiberResult;
                match++;
                log.log(Level.FINER, "Input data matches schema 'FiberResult'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for FiberResult failed with `%s`.", e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'FiberResult'", e);
              }
              // deserialize OCRSecurityTextResult
              try {
                // validate the JSON object to see if any exception is thrown
                OCRSecurityTextResult.validateJsonElement(jsonElement);
                actualAdapter = adapterOCRSecurityTextResult;
                match++;
                log.log(Level.FINER, "Input data matches schema 'OCRSecurityTextResult'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for OCRSecurityTextResult failed with `%s`.",
                        e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'OCRSecurityTextResult'", e);
              }
              // deserialize PhotoIdentResult
              try {
                // validate the JSON object to see if any exception is thrown
                PhotoIdentResult.validateJsonElement(jsonElement);
                actualAdapter = adapterPhotoIdentResult;
                match++;
                log.log(Level.FINER, "Input data matches schema 'PhotoIdentResult'");
              } catch (Exception e) {
                // deserialization failed, continue
                errorMessages.add(
                    String.format(
                        "Deserialization for PhotoIdentResult failed with `%s`.", e.getMessage()));
                log.log(Level.FINER, "Input data does not match schema 'PhotoIdentResult'", e);
              }

              if (match == 1) {
                AuthenticityCheckResultListInner ret = new AuthenticityCheckResultListInner();
                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                return ret;
              }

              throw new IOException(
                  String.format(
                      "Failed deserialization for AuthenticityCheckResultListInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
                      match, errorMessages, jsonElement.toString()));
            }
          }.nullSafe();
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

  public AuthenticityCheckResultListInner() {
    super("oneOf", Boolean.FALSE);
  }

  public AuthenticityCheckResultListInner(Object o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("SecurityFeatureResult", SecurityFeatureResult.class);
    schemas.put("IdentResult", IdentResult.class);
    schemas.put("FiberResult", FiberResult.class);
    schemas.put("OCRSecurityTextResult", OCRSecurityTextResult.class);
    schemas.put("PhotoIdentResult", PhotoIdentResult.class);
  }

  @Override
  public Map<String, Class<?>> getSchemas() {
    return AuthenticityCheckResultListInner.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: FiberResult, IdentResult, OCRSecurityTextResult,
   * PhotoIdentResult, SecurityFeatureResult
   *
   * <p>It could be an instance of the 'oneOf' schemas.
   */
  @Override
  public void setActualInstance(Object instance) {
    if (instance instanceof SecurityFeatureResult) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof IdentResult) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof FiberResult) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof OCRSecurityTextResult) {
      super.setActualInstance(instance);
      return;
    }

    if (instance instanceof PhotoIdentResult) {
      super.setActualInstance(instance);
      return;
    }

    throw new RuntimeException(
        "Invalid instance type. Must be FiberResult, IdentResult, OCRSecurityTextResult, PhotoIdentResult, SecurityFeatureResult");
  }

  /**
   * Get the actual instance, which can be the following: FiberResult, IdentResult,
   * OCRSecurityTextResult, PhotoIdentResult, SecurityFeatureResult
   *
   * @return The actual instance (FiberResult, IdentResult, OCRSecurityTextResult, PhotoIdentResult,
   *     SecurityFeatureResult)
   */
  @SuppressWarnings("unchecked")
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `SecurityFeatureResult`. If the actual instance is not
   * `SecurityFeatureResult`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `SecurityFeatureResult`
   * @throws ClassCastException if the instance is not `SecurityFeatureResult`
   */
  public SecurityFeatureResult getSecurityFeatureResult() throws ClassCastException {
    return (SecurityFeatureResult) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IdentResult`. If the actual instance is not `IdentResult`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `IdentResult`
   * @throws ClassCastException if the instance is not `IdentResult`
   */
  public IdentResult getIdentResult() throws ClassCastException {
    return (IdentResult) super.getActualInstance();
  }

  /**
   * Get the actual instance of `FiberResult`. If the actual instance is not `FiberResult`, the
   * ClassCastException will be thrown.
   *
   * @return The actual instance of `FiberResult`
   * @throws ClassCastException if the instance is not `FiberResult`
   */
  public FiberResult getFiberResult() throws ClassCastException {
    return (FiberResult) super.getActualInstance();
  }

  /**
   * Get the actual instance of `OCRSecurityTextResult`. If the actual instance is not
   * `OCRSecurityTextResult`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `OCRSecurityTextResult`
   * @throws ClassCastException if the instance is not `OCRSecurityTextResult`
   */
  public OCRSecurityTextResult getOCRSecurityTextResult() throws ClassCastException {
    return (OCRSecurityTextResult) super.getActualInstance();
  }

  /**
   * Get the actual instance of `PhotoIdentResult`. If the actual instance is not
   * `PhotoIdentResult`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `PhotoIdentResult`
   * @throws ClassCastException if the instance is not `PhotoIdentResult`
   */
  public PhotoIdentResult getPhotoIdentResult() throws ClassCastException {
    return (PhotoIdentResult) super.getActualInstance();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to
   *     AuthenticityCheckResultListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SecurityFeatureResult
    try {
      SecurityFeatureResult.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format(
              "Deserialization for SecurityFeatureResult failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with IdentResult
    try {
      IdentResult.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for IdentResult failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with FiberResult
    try {
      FiberResult.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for FiberResult failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with OCRSecurityTextResult
    try {
      OCRSecurityTextResult.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format(
              "Deserialization for OCRSecurityTextResult failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PhotoIdentResult
    try {
      PhotoIdentResult.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(
          String.format("Deserialization for PhotoIdentResult failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(
          String.format(
              "The JSON string is invalid for AuthenticityCheckResultListInner with oneOf schemas: FiberResult, IdentResult, OCRSecurityTextResult, PhotoIdentResult, SecurityFeatureResult. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s",
              validCount, errorMessages, jsonElement.toString()));
    }
  }

  /**
   * Create an instance of AuthenticityCheckResultListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticityCheckResultListInner
   * @throws IOException if the JSON string is invalid with respect to
   *     AuthenticityCheckResultListInner
   */
  public static AuthenticityCheckResultListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticityCheckResultListInner.class);
  }

  /**
   * Convert an instance of AuthenticityCheckResultListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
