package com.dyd.test;

import com.google.common.base.Splitter;

import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.guavaTest
 * @date ：Created in 2023/3/10 11:44
 * @description：
 * @modified By：
 * @version:
 */
public class guavaTest {

  public static void main(String[] args) {
    //
    // System.out.println(guavaTest.splitStr("1", '-'));
    /*int array = 23768;
    int[] result = new int[array];
    Random random = new Random(0);
    for (int i = 0; i < 100; ++i) {
      result[i] = random.nextInt() % 256;
    }
    int sum = 0;
    for (int i = 0; i < 100000; ++i) {
      for (int j = 0; j < array; ++j) {
        //
        int t = (result[j] - 128) >> 31;
        sum += ~t & result[j];
      }
    }*/
    long sum = 1;
    for (int i = 0; i < 8; i++) {
      sum = sum * 2;
    }
    System.out.println(sum);
    System.out.println((129 - 128) >> 8);
    System.out.println(~-1 & 127);
    System.out.println(-11 >> 6);

    System.out.println(Math.negateExact(2 / 1));

    String huize = "HUIZEV8_2";
    String huize2 = "huizev8";

    System.out.println(huize.indexOf("HUIZEV8_2") >= 0);

    System.out.println(huize2.toUpperCase());
  }
  // 切割字符串
  public static List<String> splitStr(String str, Character chart) {
    return Splitter.on(chart).splitToList(str);
  }

  // 去除空串与空格

}
