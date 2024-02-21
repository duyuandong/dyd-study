package com.dyd.third.zhixing.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class HttpClient implements HttpClientOp {
  private Log log = LogFactory.getLog(HttpClient.class);
  private RequestConfig config;

  @Override
  public String get(String url) throws Exception {
    return get(url, null, null);
  }

  @Override
  public String get(String url, Header[] headers) throws Exception {
    return get(url, headers, null);
  }

  @Override
  public String get(String url, String[] params) throws Exception {
    return get(url, null, params);
  }

  @Override
  public String get(String url, Header[] headers, String[] params) throws Exception {
    return execute(url, headers, Arrays.toString(params), genGet(url, headers, params));
  }

  @Override
  public String post(String url, String[] params) throws Exception {
    String text = post(url, null, params);
    return text;
  }

  @Override
  public String post(String url, Header[] headers, String[] params) throws Exception {
    return execute(url, headers, Arrays.toString(params), genPost(url, headers, params));
  }

  @Override
  public String post(String url, String content) throws Exception {
    String text = post(url, null, content);
    return text;
  }

  @Override
  public String post(String url, Header[] headers, String content) throws Exception {
    return execute(url, headers, content, genPost(url, headers, content));
  }

  @Override
  public Future<String> asynGet(String url, HttpCallback cb) {
    return asynGet(url, null, null, cb);
  }

  @Override
  public Future<String> asynGet(String url, Header[] headers, HttpCallback cb) {
    return asynGet(url, headers, null, cb);
  }

  @Override
  public Future<String> asynGet(String url, String[] params, HttpCallback cb) {
    return asynGet(url, null, params, cb);
  }

  @Override
  public Future<String> asynGet(String url, Header[] headers, String[] params, HttpCallback cb) {
    return asynExecute(url, headers, Arrays.toString(params), genGet(url, headers, params), cb);
  }

  @Override
  public Future<String> asynPost(String url, String[] params, HttpCallback cb) {
    return asynPost(url, null, params, cb);
  }

  @Override
  public Future<String> asynPost(String url, Header[] headers, String[] params, HttpCallback cb) {
    return asynExecute(url, headers, Arrays.toString(params), genPost(url, headers, params), cb);
  }

  @Override
  public Future<String> asynPost(String url, String content, HttpCallback cb) {
    return asynPost(url, null, content, cb);
  }

  @Override
  public Future<String> asynPost(String url, Header[] headers, String content, HttpCallback cb) {
    try {
      return asynExecute(url, headers, content, genPost(url, headers, content), cb);
    } catch (Exception ex) {
      cb.onCallback(null, ex);
      return null;
    }
  }

  public RequestConfig getConfig() {
    return config;
  }

  public void setConfig(RequestConfig config) {
    this.config = config;
  }

  private HttpGet genGet(String url, Header[] headers, final String[] params) {
    if (params != null && params.length > 0) {
      int len = params.length;
      if (!url.contains("?")) {
        url += "?";
      }
      for (int i = 0; i < len; i += 2) {
        String key = params[0 + i];
        String value = params[1 + i];
        url += (url.endsWith("&") ? "" : "&") + key + "=" + value;
      }
    }
    HttpGet g = new HttpGet(url);
    if (null != headers) {
      g.setHeaders(headers);
    }
    if (this.config != null) {
      g.setConfig(this.config);
    }
    return g;
  }

  private HttpPost genPost(String url, Header[] headers, String[] params) {
    List<NameValuePair> list = new ArrayList<NameValuePair>();
    HttpPost post = new HttpPost(url);
    int len = params.length;
    for (int i = 0; i < len; i += 2) {
      String key = params[0 + i];
      String value = params[1 + i];
      list.add(new BasicNameValuePair(key, value));
    }
    post.setEntity(new UrlEncodedFormEntity(list, Charset.forName("UTF-8")));
    if (null != headers) {
      post.setHeaders(headers);
    }
    if (this.config != null) {
      post.setConfig(this.config);
    }
    return post;
  }

  private HttpPost genPost(String url, Header[] headers, String content) throws Exception {
    HttpPost post = new HttpPost(url);
    StringEntity entity = new StringEntity(content, Charset.forName("UTF-8"));
    post.setEntity(entity);
    if (null != headers) {
      post.setHeaders(headers);
    }
    if (this.config != null) {
      post.setConfig(this.config);
    }
    return post;
  }

  private String execute(String url, Header[] headers, String body, HttpUriRequest request)
      throws Exception {
    CloseableHttpClient client = HttpClients.createDefault();
    CloseableHttpResponse resp = null;
    HttpEntity entity = null;
    String text = null;
    try {
      resp = client.execute(request);
      StatusLine status = resp.getStatusLine();
      if (status.getStatusCode() != 200) {
        throw new Exception("StatusCode:" + status.getStatusCode());
      }
      entity = resp.getEntity();
      text = EntityUtils.toString(entity);
    } catch (Exception ex) {
      log.error(
          String.format(
              "Http %s：%s, %s, %s", request.getMethod(), url, body, Arrays.toString(headers)),
          ex);
      throw ex;
    } finally {
      try {
        if (resp != null) {
          resp.close();
        }
        client.close();
      } catch (Exception ex) {
      }
    }
    return text;
  }

  private Future<String> asynExecute(
      final String url,
      final Header[] headers,
      final String body,
      final HttpUriRequest request,
      final HttpCallback cb) {
    final CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
    client.start();
    final Future<HttpResponse> respFuture =
        client.execute(
            request,
            cb == null
                ? null
                : new FutureCallback<HttpResponse>() {

                  @Override
                  public void cancelled() {
                    try {
                      client.close();
                    } catch (IOException e) {
                    }
                    log.info(
                        String.format(
                            "Cancelled Http %s：%s, %s, %s",
                            request.getMethod(), url, body, Arrays.toString(headers)));
                    cb.onCallback(null, null);
                  }

                  @Override
                  public void completed(HttpResponse resp) {
                    HttpEntity entity = resp.getEntity();
                    try {
                      client.close();
                      if (resp instanceof CloseableHttpResponse) {
                        ((CloseableHttpResponse) resp).close();
                      }
                    } catch (IOException ex) {
                    }
                    try {
                      StatusLine status = resp.getStatusLine();
                      if (status.getStatusCode() != 200) {
                        cb.onCallback(null, new Exception("StatusCode:" + status.getStatusCode()));
                      } else {
                        String text = EntityUtils.toString(entity);
                        cb.onCallback(text, null);
                      }
                    } catch (Exception ex) {
                      log.error(
                          String.format("Http Get：%s, %s, %s", url, body, Arrays.toString(headers)),
                          ex);
                      cb.onCallback(null, ex);
                    }
                  }

                  @Override
                  public void failed(Exception ex) {
                    try {
                      client.close();
                    } catch (IOException e) {
                    }
                    log.error(
                        String.format("Http Get：%s, %s, %s", url, body, Arrays.toString(headers)),
                        ex);
                    cb.onCallback(null, ex);
                  }
                });

    return new Future<String>() {

      @Override
      public boolean cancel(boolean flag) {
        boolean result = respFuture.cancel(flag);
        if (client != null) {
          try {
            client.close();
          } catch (IOException e) {
          }
        }
        return result;
      }

      @Override
      public String get() throws InterruptedException, ExecutionException {
        HttpResponse resp = respFuture.get();
        if (resp != null) {
          try {
            StatusLine status = resp.getStatusLine();
            if (status.getStatusCode() != 200) {
              throw new Exception("StatusCode:" + status.getStatusCode());
            } else {
              return EntityUtils.toString(resp.getEntity());
            }
          } catch (Exception ex) {
            log.error(
                String.format("Http Get：%s, %s, %s", url, body, Arrays.toString(headers)), ex);
            throw new ExecutionException("EntityUtils.toString(resp.getEntity())", ex);
          } finally {
            try {
              if (resp instanceof CloseableHttpResponse) {
                ((CloseableHttpResponse) resp).close();
              }
              client.close();
            } catch (IOException e) {
            }
          }
        } else {
          try {
            client.close();
          } catch (IOException e) {
          }
        }
        return null;
      }

      @Override
      public String get(long times, TimeUnit timeUnit)
          throws InterruptedException, ExecutionException, TimeoutException {
        HttpResponse resp = respFuture.get(times, timeUnit);
        if (resp != null) {
          try {
            StatusLine status = resp.getStatusLine();
            if (status.getStatusCode() != 200) {
              throw new Exception("StatusCode:" + status.getStatusCode());
            } else {
              return EntityUtils.toString(resp.getEntity());
            }
          } catch (Exception ex) {
            log.error(
                String.format("Http Get：%s, %s, %s", url, body, Arrays.toString(headers)), ex);
            throw new ExecutionException("EntityUtils.toString(resp.getEntity())", ex);
          } finally {
            try {
              if (resp instanceof CloseableHttpResponse) {
                ((CloseableHttpResponse) resp).close();
              }
              client.close();
            } catch (IOException e) {
            }
          }
        } else {
          try {
            client.close();
          } catch (IOException e) {
          }
        }
        return null;
      }

      @Override
      public boolean isCancelled() {
        return respFuture.isCancelled();
      }

      @Override
      public boolean isDone() {
        return respFuture.isDone();
      }
    };
  }
}
