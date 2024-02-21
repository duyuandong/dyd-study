package com.dyd.test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.IntegerUtils
 * @date ：Created in 2022/3/26 14:30
 * @description：
 * @modified By：
 * @version:
 */
public class IntegerUtils {
  public static void main(String[] args) {
    int a = 10002922;
    Integer b = 128;
    System.out.println(a);
    System.out.println(b);
    System.out.println(11 / 10);

    HashMap<String, Long> objectObjectHashMap = new HashMap<>();
    Long ac = 123214124124L;
    // objectObjectHashMap.put("aaa", ac);
    System.out.println(objectObjectHashMap.get("aaa") + "");
    ArrayList<Object> list = Lists.newArrayListWithCapacity(1);
    System.out.println(JSON.toJSONString(list.stream().collect(Collectors.toSet())));
  }
}
