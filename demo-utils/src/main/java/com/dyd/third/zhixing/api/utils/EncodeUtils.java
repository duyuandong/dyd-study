package com.dyd.third.zhixing.api.utils;/*
package com.spring.demo.third.zhixing.api.utils;

import com.alibaba.fastjson.JSONObject;
import com.spring.demo.third.zhixing.core.ParkException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class EncodeUtils {
  private static Log log = LogFactory.getLog(EncodeUtils.class);
  public static final String FIELD_APPID = "AppId";
  public static final String FIELD_TIMESTAMP = "Timestamp";
  public static final String FIELD_NONCE = "Nonce";
  public static final String FIELD_ENCRYPTCODE = "encryptCode";
  public static final String FIELD_ZIPCODE = "zipCode";
  public static final String FIELD_CONTENT = "content";
  public static final String FIELD_TENANTID = "ParkId";
  public static final String FIELD_SIGN = "Signature";

  public static JsonParser jsonParser = new JsonParser();
  public static Gson gson = new Gson();

  public static String generateSignature(final Map<String, String> data, String secretKey)
      throws Exception {
    boolean flag = false;
    StringBuilder sb = new StringBuilder();
    Set<String> keySet = data.keySet();
    String[] keyArray = keySet.toArray(new String[keySet.size()]);
    Arrays.sort(keyArray);
    for (String k : keyArray) {
      if (k.equals(FIELD_SIGN)) {
        continue;
      }
      if (data.get(k).trim().length() > 0) {
        // 参数值为空，则不参与签名
        if (!flag) {
          flag = true;
        } else {
          sb.append("&");
        }
        sb.append(k).append("=").append(data.get(k).trim());
      }
    }
    String signature = HMACSHA1(sb.toString(), secretKey);
    log.debug("signature:" + signature);
    return signature;
  }

  public static Map<String, String> getRequestParams(HttpServletRequest request) throws Exception {
    Enumeration<String> parameterNames = request.getParameterNames();
    Map<String, String> map = new HashMap<String, String>();
    while (parameterNames.hasMoreElements()) {
      String name = parameterNames.nextElement();
      String value = request.getParameter(name);
      map.put(name, value);
      if (log.isDebugEnabled()) {
        log.debug(String.format("%s=%s", name, value));
      }
    }
    return map;
  }

  public static boolean isSignatureValid(Map<String, String> data, String key) throws Exception {
    if (!data.containsKey(FIELD_SIGN)) {
      return false;
    }
    String sign = data.get(FIELD_SIGN);
    return generateSignature(data, key).equals(sign);
  }

  public static boolean checkParams(Map<String, String> data) {
    return data.containsKey(FIELD_APPID)
        && data.containsKey(FIELD_TIMESTAMP)
        && data.containsKey(FIELD_NONCE)
        && data.containsKey(FIELD_ENCRYPTCODE)
        && data.containsKey(FIELD_ZIPCODE)
        && data.containsKey(FIELD_TENANTID)
        && data.containsKey(FIELD_SIGN);
  }

  public static JsonObject decodeContent(Map<String, String> data, String secretKey)
      throws Exception {
    if (!data.containsKey(FIELD_CONTENT)) {
      throw new ParkException("EmptyContent", "没有参数内容");
    }
    boolean isEncrypt = data.get(FIELD_ENCRYPTCODE).equals("1");
    boolean isZip = data.get(FIELD_ZIPCODE).equals("1");
    String content = data.get(FIELD_CONTENT);
    if (StringUtils.isEmpty(content)) {
      return null;
    }
    return jsonParser.parse(decodeContent(content, isEncrypt, isZip, secretKey)).getAsJsonObject();
  }

  public static String decodeContent(
      String content, boolean isEncrypt, boolean isZip, String secretKey) throws Exception {
    byte[] contentData = Base64.decodeBase64(content);
    if (isZip) {
      contentData = GZipUtils.decompress(contentData);
    }
    if (isEncrypt) {
      contentData = decrypt(contentData, secretKey.substring(0, 24));
    }
    String jsonData = new String(contentData, "UTF-8");
    log.debug("data:" + jsonData);
    return jsonData;
  }

  public static String encodeContent(
      JsonObject json, boolean encrypt, boolean zip, String secretKey) throws Exception {
    return encodeContent(gson.toJson(json), encrypt, zip, secretKey);
  }

  public static String encodeContent(String content, boolean encrypt, boolean zip, String secretKey)
      throws Exception {
    byte[] contentData = content.getBytes("UTF-8");
    if (log.isDebugEnabled()) {
      log.debug(String.format("content %s", content));
    }
    if (encrypt) {
      contentData = encrypt(contentData, secretKey.substring(0, 24));
    }
    if (zip) {
      contentData = GZipUtils.compress(contentData);
    }
    return Base64.encodeBase64String(contentData);
  }

  private static byte[] encrypt(byte[] data, String key) throws Exception {
    SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "DESede");
    Cipher cipher = Cipher.getInstance("DESede");
    cipher.init(Cipher.ENCRYPT_MODE, secret_key);
    return cipher.doFinal(data);
  }

  private static byte[] decrypt(byte[] data, String key) throws Exception {
    SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "DESede");
    Cipher cipher = Cipher.getInstance("DESede");
    cipher.init(Cipher.DECRYPT_MODE, secret_key);
    return cipher.doFinal(data);
  }

  private static String HMACSHA1(String data, String key) throws Exception {
    Mac sha1HMAC = Mac.getInstance("HmacSHA1");
    SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA1");
    sha1HMAC.init(secret_key);
    byte[] array = sha1HMAC.doFinal(data.getBytes("UTF-8"));
    return Base64.encodeBase64String(array);
  }

  public static void main(String[] args) {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("mchId", "0");
    String str = jsonObject.toString();
    try {
      String s = encodeContent(str, false, false, "946ee6a83398bcf1b2f2e749bcae2d77");
      System.out.println(s);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
*/
