package com.dyd.third.zhixing.sdk;/*
package com.spring.demo.third.zhixing.sdk;

import com.spring.demo.third.zhixing.api.utils.EncodeUtils;
import com.spring.demo.third.zhixing.core.HttpClient;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.Header;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.message.BasicHeader;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiRequest {
  private static Logger log = Logger.getLogger("ApiRequest");
  private static Header acceptJson = new BasicHeader("accept", "application/json; charset=UTF-8");
  private static Header[] jsonHeaders = new Header[] {acceptJson};

  static {
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.ALL);
    log.addHandler(consoleHandler);
    log.setLevel(Level.ALL);
  }

  public static Result getRequest(
      String urlBase,
      String method,
      String appId,
      String secretKey,
      long parkId,
      boolean encrypt,
      boolean zip,
      String data)
      throws Exception {
    log.log(Level.FINEST, String.format("%s%s", urlBase, method));
    String[] params = generateParams(appId, secretKey, parkId, encrypt, zip, data, false);
    return parseResult(
        getHttpClient().get(String.format("%s%s", urlBase, method), jsonHeaders, params),
        secretKey);
  }

  public static Result postRequest(
      String urlBase,
      String method,
      String appId,
      String secretKey,
      long parkId,
      boolean encrypt,
      boolean zip,
      String data)
      throws Exception {
    log.log(Level.FINEST, String.format("%s%s", urlBase, method));
    String[] params = generateParams(appId, secretKey, parkId, encrypt, zip, data, false);
    return parseResult(
        getHttpClient().post(String.format("%s%s", urlBase, method), jsonHeaders, params),
        secretKey);
  }

  @SuppressWarnings("deprecation")
  private static String[] generateParams(
      String appId,
      String secretKey,
      long parkId,
      boolean encrypt,
      boolean zip,
      String data,
      boolean urlEncode)
      throws Exception {
    Map<String, String> m = new HashMap<String, String>();
    String contentData =
        data != null ? EncodeUtils.encodeContent(data, encrypt, zip, secretKey) : null;
    m.put(EncodeUtils.FIELD_APPID, appId);
    m.put(EncodeUtils.FIELD_TENANTID, String.valueOf(parkId));
    if (contentData != null) {
      m.put(EncodeUtils.FIELD_ENCRYPTCODE, encrypt ? "1" : "0");
      m.put(EncodeUtils.FIELD_ZIPCODE, zip ? "1" : "0");
      m.put(EncodeUtils.FIELD_CONTENT, contentData);
    } else {
      contentData = "";
      m.put(EncodeUtils.FIELD_ENCRYPTCODE, "0");
      m.put(EncodeUtils.FIELD_ZIPCODE, "0");
      m.put(EncodeUtils.FIELD_CONTENT, "");
    }
    m.put(EncodeUtils.FIELD_NONCE, "20220420222104490");
    m.put(EncodeUtils.FIELD_TIMESTAMP, String.valueOf("1652339919102"));
    String signature = EncodeUtils.generateSignature(m, secretKey);
    if (urlEncode) {
      signature = URLEncoder.encode(signature);
      contentData = URLEncoder.encode(contentData);
    }
    if (log.isLoggable(Level.FINEST)) {
      log.log(Level.FINEST, m.toString());
      log.log(Level.FINEST, signature);
    }
    return new String[] {
      EncodeUtils.FIELD_APPID,
      appId,
      EncodeUtils.FIELD_TENANTID,
      String.valueOf(parkId),
      EncodeUtils.FIELD_ENCRYPTCODE,
      m.get(EncodeUtils.FIELD_ENCRYPTCODE),
      EncodeUtils.FIELD_ZIPCODE,
      m.get(EncodeUtils.FIELD_ZIPCODE),
      EncodeUtils.FIELD_CONTENT,
      contentData,
      EncodeUtils.FIELD_NONCE,
      m.get(EncodeUtils.FIELD_NONCE),
      EncodeUtils.FIELD_TIMESTAMP,
      m.get(EncodeUtils.FIELD_TIMESTAMP),
      EncodeUtils.FIELD_SIGN,
      signature
    };
  }

  private static Result parseResult(String ret, String secretKey) throws Exception {
    log.log(Level.FINEST, ret);
    JsonParser jsonParser = new JsonParser();
    JsonObject jsonObj = jsonParser.parse(ret).getAsJsonObject();
    JsonObject status = jsonObj.get("responseStatus").getAsJsonObject();
    Result result = new Result();
    result.setCode(status.getAsJsonPrimitive("code").getAsString());
    result.setMessage(status.getAsJsonPrimitive("message").getAsString());
    if (jsonObj.has("responseData")) {
      JsonObject respData = jsonObj.get("responseData").getAsJsonObject();
      boolean isEncrypt = respData.get(EncodeUtils.FIELD_ENCRYPTCODE).getAsString().equals("1");
      boolean isZip = respData.get(EncodeUtils.FIELD_ZIPCODE).getAsString().equals("1");
      String content = respData.get(EncodeUtils.FIELD_CONTENT).getAsString();
      result.setData(EncodeUtils.decodeContent(content, isEncrypt, isZip, secretKey));
      log.log(Level.FINEST, result.getData());
    }
    return result;
  }

  private static HttpClient getHttpClient() {
    HttpClient client = new HttpClient();
    RequestConfig requestConfig =
        RequestConfig.custom()
            .setConnectTimeout(3000)
            .setConnectionRequestTimeout(2000)
            .setSocketTimeout(5000)
            .build();
    client.setConfig(requestConfig);
    return client;
  }

  private static String generateNonceStr() {
    return String.valueOf((int) (Integer.MAX_VALUE * Math.random()));
  }
}
*/
