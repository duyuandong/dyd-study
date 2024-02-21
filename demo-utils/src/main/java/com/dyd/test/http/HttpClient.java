package com.dyd.test.http;

import java.io.IOException;
import java.util.concurrent.*;

public class HttpClient {
  private ExecutorService executorService = Executors.newFixedThreadPool(10);

  public String get(String url) throws Exception {
    Future<String> future =
        executorService.submit(
            () -> {
              // 执行http请求，返回响应结果
              String response = executeHttp(url);
              return response;
            });

    try {
      // 设置超时时间为5秒
      String response = future.get(5, TimeUnit.SECONDS);
      return response;
    } catch (TimeoutException e) {
      // 超时异常处理
      future.cancel(true);
      throw new Exception("Http request timeout");
    } catch (ExecutionException e) {
      // 执行异常处理
      Throwable cause = e.getCause();
      if (cause instanceof IOException) {
        // 网络异常处理
        throw new Exception("Http request failed due to network error");
      } else {
        // 其他异常处理
        throw new Exception("Http request failed due to unknown error");
      }
    }
  }

  private String executeHttp(String url) throws IOException {
    // 发送http请求
    // ...
    return "http response";
  }
}
