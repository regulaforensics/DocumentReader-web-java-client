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

package com.regula.documentreader.webclient;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody extends ResponseBody {

  private final ResponseBody responseBody;
  private final ApiCallback callback;
  private BufferedSource bufferedSource;

  public ProgressResponseBody(ResponseBody responseBody, ApiCallback callback) {
    this.responseBody = responseBody;
    this.callback = callback;
  }

  @Override
  public MediaType contentType() {
    return responseBody.contentType();
  }

  @Override
  public long contentLength() {
    return responseBody.contentLength();
  }

  @Override
  public BufferedSource source() {
    if (bufferedSource == null) {
      bufferedSource = Okio.buffer(source(responseBody.source()));
    }
    return bufferedSource;
  }

  private Source source(Source source) {
    return new ForwardingSource(source) {
      long totalBytesRead = 0L;

      @Override
      public long read(Buffer sink, long byteCount) throws IOException {
        long bytesRead = super.read(sink, byteCount);
        // read() returns the number of bytes read, or -1 if this source is exhausted.
        totalBytesRead += bytesRead != -1 ? bytesRead : 0;
        callback.onDownloadProgress(totalBytesRead, responseBody.contentLength(), bytesRead == -1);
        return bytesRead;
      }
    };
  }
}
