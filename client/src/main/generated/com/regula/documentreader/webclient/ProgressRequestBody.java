/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.9.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {

  private final RequestBody requestBody;

  private final ApiCallback callback;

  public ProgressRequestBody(RequestBody requestBody, ApiCallback callback) {
    this.requestBody = requestBody;
    this.callback = callback;
  }

  @Override
  public MediaType contentType() {
    return requestBody.contentType();
  }

  @Override
  public long contentLength() throws IOException {
    return requestBody.contentLength();
  }

  @Override
  public void writeTo(BufferedSink sink) throws IOException {
    BufferedSink bufferedSink = Okio.buffer(sink(sink));
    requestBody.writeTo(bufferedSink);
    bufferedSink.flush();
  }

  private Sink sink(Sink sink) {
    return new ForwardingSink(sink) {

      long bytesWritten = 0L;
      long contentLength = 0L;

      @Override
      public void write(Buffer source, long byteCount) throws IOException {
        super.write(source, byteCount);
        if (contentLength == 0) {
          contentLength = contentLength();
        }

        bytesWritten += byteCount;
        callback.onUploadProgress(bytesWritten, contentLength, bytesWritten == contentLength);
      }
    };
  }
}
