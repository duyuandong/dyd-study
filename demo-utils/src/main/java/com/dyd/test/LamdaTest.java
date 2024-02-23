package com.dyd.test;

import com.dyd.pojo.Student;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.LamdaTest
 * @date ：Created in 2022/2/18 17:48
 * @description：
 * @modified By：
 * @version:
 */
public class LamdaTest {

  public static void main(String[] args) {

    List<Student> dataList = getDataLists();

    // 排序
    TreeMap<Integer, Student> collect =
        dataList.stream()
            .collect(
                Collectors.toMap(
                    Student::getAge, Function.identity(), (k1, k2) -> k2, TreeMap::new));
    System.out.println(collect);
    // 过滤
    List<Student> collect1 =
        dataList.stream()
            .filter(i -> !"banana".equalsIgnoreCase(i.getLikeFood()))
            .collect(Collectors.toList());
    System.out.println(collect1);
  }

  public static List<Student> getDataLists() {
    return Lists.newArrayList(
        new Student("小明", 32, true, 1.83F, "apple"),
        new Student("小粉", 18, false, 1.70F, "banana"),
        new Student("小红", 20, true, 1.58F, "apple"),
        new Student("小陈", 26, false, 1.63F, "watermelon"),
        new Student("小向", 45, true, 1.73F, "orange"));
  }

  public static Map<Integer, Student> getDataMaps() {
    Map<Integer, Student> maps = Maps.newHashMap();
    return maps;
  }
}
