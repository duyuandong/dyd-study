package com.dyd.test.http;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.http.httpClient2
 * @date ：Created in 2023/3/6 15:58
 * @description：
 * @modified By：
 * @version:
 */
public class httpClient2 {
  private ExecutorService executorService = Executors.newFixedThreadPool(10);

  public void get(String url, Consumer<String> callback, Consumer<Throwable> error) {
    CompletableFuture.supplyAsync(
            () -> {
              // 执行http请求，返回响应结果
              String response = null;
              try {
                response = executeHttp(url);
              } catch (IOException e) {
                e.printStackTrace();
              }
              return response;
            },
            executorService)
        .thenAccept(callback)
        .exceptionally(
            ex -> {
              error.accept(ex);
              return null;
            });
  }

  private String executeHttp(String url) throws IOException {
    // 发送http请求
    // ...
    return "http response";
  }
}
