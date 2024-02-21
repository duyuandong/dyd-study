package com.dyd.test.poi;

import java.util.*;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.poi.JoinTest
 * @date ：Created in 2023/3/30 16:43
 * @description：
 * @modified By：
 * @version:
 */
public class JoinTest {
  public static void main(String[] args) {
    //
    String filePath = "D:\\dydwx\\sdydwx.xlsx";

    // 所有一级
    List<String> mapOneList = new ArrayList<String>();
    mapOneList.add("广东省");
    mapOneList.add("湖北省");
    mapOneList.add("安徽省");
    // 一二级关系map
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    map.put("广东省", Arrays.asList("广州市", "佛山市"));
    map.put("湖北省", Arrays.asList("武汉市", "荆州市"));
    map.put("广州市", Arrays.asList("白云区", "越秀区"));
    map.put("佛山市", Arrays.asList("顺德区", "南海区"));
    map.put("安徽省", Arrays.asList("合肥市", "芜湖市"));
    map.put("合肥市", Arrays.asList("肥东县", "肥西县"));
    map.put("肥东县", Arrays.asList("西山镇", "店埠"));
    map.put("西山镇", Arrays.asList("西山镇123", "店埠123"));
    // 第2行第3列插入5级联动
    try {
      ExcelUtils.export(filePath, mapOneList, map, 2, 3, 5);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
