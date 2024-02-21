package com.dyd.third.bosigao;

import java.security.MessageDigest;
import java.util.*;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.third.bosigao.SignUtils
 * @date ：Created in 2022/9/8 14:07
 * @description：
 * @modified By：
 * @version:
 */
public class SignUtils {
  public static void main(String[] args) {
    // 忽略大小写按Key排序
    Comparator<String> comparator =
        new Comparator<String>() {
          public int compare(String a, String b) {
            return a.toLowerCase().compareTo(b.toLowerCase());
          }
        };
    SortedMap<String, String> map = new TreeMap<String, String>(comparator);
    map.put("BusinessCode", "MonthCarGetDetail_002");
    map.put("PlateNumber", "粤BFC8311");
    map.put("SignType", "SHA1");
    map.put("CompanyID", "5713831726460572114");
    map.put("ParkingID", "4613901876730916727");
    // 博思高提供的AccessCode
    map.put("AccessCode", "50202212-84f0-11e8-8d22-00163e0c01c9");
    // 获取签名结果2194c47b963e2327cc6510ae7a13f53284e8bfe0
    // 获取签名结果2194c47b963e2327cc6510ae7a13f53284e8bfe0
    String signResult = Signature(map);
    System.out.println(signResult);
  }

  public static String Signature(SortedMap<String, String> paramMap) {
    ArrayList<String> list = new ArrayList<>();
    for (Map.Entry<String, String> stringStringEntry : paramMap.entrySet()) {
      String key = stringStringEntry.getKey();
      String value = stringStringEntry.getValue();
      list.add(key + "=" + value);
    }
    String arrstring = String.join("&", list);
    System.out.println(arrstring);
    String sign = "";
    try {
      sign = shaEncode(arrstring);
    } catch (Exception e) {
      sign = "";
    }
    return sign;
  }

  private static String shaEncode(String inStr) throws Exception {
    MessageDigest sha = null;
    try {
      sha = MessageDigest.getInstance("SHA");
    } catch (Exception e) {
      System.out.println(e.toString());
      e.printStackTrace();
      return "";
    }
    byte[] byteArray = inStr.getBytes("UTF-8");
    byte[] md5Bytes = sha.digest(byteArray);
    StringBuffer hexValue = new StringBuffer();
    for (int i = 0; i < md5Bytes.length; i++) {
      int val = ((int) md5Bytes[i]) & 0xff;
      if (val < 16) {
        hexValue.append("0");
      }
      hexValue.append(Integer.toHexString(val));
    }
    return hexValue.toString().replace("-", "").toLowerCase();
  }
}
