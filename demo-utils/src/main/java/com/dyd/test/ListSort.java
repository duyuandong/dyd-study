package com.dyd.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Student {

  private String name;

  private double age;
  @IgnoreField private String sex;

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Student() {}

  public Student(String name, double age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }
}

public class ListSort {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student("abc", 12.124));
    students.add(new Student("bcd", 20.214));
    students.add(new Student("cde", 17.321));
    students.add(new Student("def", 25.145));
    students.add(new Student("efg", 15.145));

    students.sort((x, y) -> Double.compare(x.getAge(), y.getAge())); // 这方法需要jdk1.8以上

    for (Student stu : students) {
      System.out.println(stu);
    }

    TreeMap treeMap = new TreeMap();
    treeMap.put("lixin", "2222");
    treeMap.put("adsd", "233");
    System.out.println(JSON.toJSONString(treeMap));
  }
}
