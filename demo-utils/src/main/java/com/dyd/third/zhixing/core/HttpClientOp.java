package com.dyd.third.zhixing.core;

import org.apache.http.Header;

import java.util.concurrent.Future;

public interface HttpClientOp {
  public String get(String url) throws Exception;

  public String get(String url, Header[] headers) throws Exception;

  public String get(String url, String[] params) throws Exception;

  public String get(String url, Header[] headers, String[] params) throws Exception;;

  public String post(String url, String[] params) throws Exception;

  public String post(String url, Header[] headers, String[] params) throws Exception;

  public String post(String url, String content) throws Exception;

  public String post(String url, Header[] headers, String content) throws Exception;

  public Future<String> asynGet(String url, HttpCallback cb);

  public Future<String> asynGet(String url, Header[] headers, HttpCallback cb);

  public Future<String> asynGet(String url, String[] params, HttpCallback cb);

  public Future<String> asynGet(String url, Header[] headers, String[] params, HttpCallback cb);

  public Future<String> asynPost(String url, String[] params, HttpCallback cb);

  public Future<String> asynPost(String url, Header[] headers, String[] params, HttpCallback cb);

  public Future<String> asynPost(String url, String content, HttpCallback cb);

  public Future<String> asynPost(String url, Header[] headers, String content, HttpCallback cb);
}
