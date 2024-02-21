package com.dyd.third;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/** Created by jackzhong on 2015/12/26. */
public final class SignatureUtils {

  // 日志
  public static final Logger logger = LoggerFactory.getLogger(SignatureUtils.class);

  public static final String CHARSET = "UTF-8";
  public static final String MD5 = "MD5";

  public static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

  public static byte[] toBytes(String string) {
    try {
      return string.getBytes(CHARSET);
    } catch (UnsupportedEncodingException e) {
      throw new IllegalStateException("UTF-8 encoding not supported by platform", e);
    }
  }

  public static String encodeHex(byte[] bytes) {
    char[] hexChars = new char[bytes.length * 2];
    for (int j = 0; j < bytes.length; j++) {
      int v = bytes[j] & 0xFF;
      hexChars[j * 2] = HEX_CHARS[v >>> 4];
      hexChars[j * 2 + 1] = HEX_CHARS[v & 0x0F];
    }
    return new String(hexChars);
  }

  public static synchronized String salt32Md5(String data) {
    try {
      MessageDigest digest = MessageDigest.getInstance(MD5);
      digest.update(toBytes(data));
      return encodeHex(digest.digest());
    } catch (NoSuchAlgorithmException nsae) {
      throw new IllegalStateException(nsae);
    }
  }

  public static String signature(String jsonStr, String appSecret) {
    if (StringUtils.isEmpty(jsonStr)) {
      return null;
    }
    return salt32Md5(jsonStr + "|" + appSecret);
  }

  /**
   * 生成签名
   *
   * @param obj
   * @return
   */
  public static String getSign(Object obj) {

    String result = "";
    try {
      List<Map.Entry<String, Object>> infoIds = null;
      if (obj instanceof Map) {
        Map map = (Map) obj;
        infoIds = new ArrayList<Map.Entry<String, Object>>(map.entrySet());
        // 对所有传入参数按照字段名的 ASCII 码从小到大排序（字典序）
        Collections.sort(
            infoIds,
            new Comparator<Map.Entry<String, Object>>() {
              @Override
              public int compare(Map.Entry<String, Object> o1, Map.Entry<String, Object> o2) {
                return (o1.getKey()).toString().compareTo(o2.getKey());
              }
            });
      }

      // 构造签名键值对的格式
      StringBuilder sb = new StringBuilder();
      for (Map.Entry<String, Object> item : infoIds) {
        if (item.getKey() != null || item.getKey() != "") {
          String key = item.getKey();
          Object val = item.getValue();
          if (val instanceof JSONObject || val instanceof JSONArray) {
            val = ((JSONObject) val).toJSONString();
          } else {
            val = val.toString();
          }
          if (!(val == "" || val == null)) {
            sb.append(key + "=" + val + "&");
          }
        }
      }
      if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
      }
      result = sb.toString();
    } catch (Exception e) {
      return "";
    }
    return result;
  }
}
