package com.dyd.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.Test
 * @date ：Created in 2021/7/1 11:10
 * @description：
 * @modified By：
 * @version:
 */
public class Test {

  private Integer id;

  private Double rate;

  private List<MeterAttr> meterAttrList;

  public Test(Integer id, Double rate, List<MeterAttr> meterAttrList) {
    this.id = id;
    this.rate = rate;
    this.meterAttrList = meterAttrList;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public List<MeterAttr> getMeterAttrList() {
    return meterAttrList;
  }

  public void setMeterAttrList(List<MeterAttr> meterAttrList) {
    this.meterAttrList = meterAttrList;
  }

  public static boolean isNumeric(String str) {
    Pattern pattern = Pattern.compile("[0-9]*");
    Matcher isNum = pattern.matcher(str);
    if (!isNum.matches()) {
      return false;
    }
    return true;
  }

  public static String isIp(String ipUrl) {
    String regex =
        "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])"
            + "(\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)){3}$";
    // 判断IP地址是否与正则表达式匹配。
    if (ipUrl.matches(regex)) {
      return ipUrl + "\n是一个合法的IP地址。";
    } else {
      return ipUrl + "\n不是一个合法的IP地址。";
    }
  }

  public static void main(String[] args) {
    System.out.println(isNumeric("222a"));
    System.out.println(isIp("192.168.1.38"));
    System.out.println(isIp("www.beta.com"));

    Integer aa = 78912;
    String bb = "78912";
    Long cc = 78912L;
    System.out.println(aa.equals(bb));
    System.out.println(aa == cc.intValue());
    HashSet<String> a = new HashSet<>();
    a.add("123");
    System.out.println(a.contains(""));
  }
}
