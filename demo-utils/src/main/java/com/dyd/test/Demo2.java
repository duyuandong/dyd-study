package com.dyd.test;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.Demo2
 * @date ：Created in 2021/8/10 15:22
 * @description：
 * @modified By：
 * @version:
 */
public class Demo2 {
  public static void main(String[] args) {
    List<Map<String, Object>> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("distance", 18 + i);
      map.put("name", "zhangsan");
      map.put("age", 9);

      list.add(map);
    }
    // 降序测试
    Collections.sort(
        list,
        new Comparator<Map<String, Object>>() {

          @Override
          public int compare(Map<String, Object> o1, Map<String, Object> o2) {
            Integer map1 = Integer.valueOf(o1.get("distance").toString());
            Integer map2 = Integer.valueOf(o2.get("distance").toString());
            return map1.compareTo(map2);
          }
        });
    System.out.println(list);

    // 厂商实体类
    String val = "{\"appId\":\"1232142\",\"vendorVal\":\"HUIZE:1.0\"}";
    JSONObject jsonObject = JSONObject.parseObject(val);
    System.out.println(jsonObject.toString());

    BigDecimal value = new BigDecimal("12.0000000000");
    BigDecimal noZeros = value.stripTrailingZeros();
    String result = noZeros.toPlainString();
    System.out.println("result: " + result);
  }
}
