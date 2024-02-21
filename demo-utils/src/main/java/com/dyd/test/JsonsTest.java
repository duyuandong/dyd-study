package com.dyd.test;

import com.alibaba.fastjson.JSONObject;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.JsonsTest
 * @date ：Created in 2022/4/24 10:07
 * @description：
 * @modified By：
 * @version:
 */
public class JsonsTest {
  public static void main(String[] args) {
    JSONObject jsonOne = new JSONObject();
    JSONObject jsonTwo = new JSONObject();

    jsonOne.put("name", "kewen");
    jsonOne.put("age", "24");

    jsonTwo.put("hobbit", "Dota");
    jsonTwo.put("hobbit2", "wow");

    String s = jsonTwo.toJSONString();
    JSONObject jsonObject = JSONObject.parseObject(s);

    jsonOne.putAll(jsonObject);

    System.out.println(jsonOne.toString());
  }
}
