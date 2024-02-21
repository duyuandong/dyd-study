package com.dyd.third.zhixing.core;

/**
 * 异步Http请求回调
 *
 * @author Administrator
 */
public interface HttpCallback {
  public void onCallback(String result, Exception ex);
}
