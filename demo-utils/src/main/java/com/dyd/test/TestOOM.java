package com.dyd.test;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.TestOOM
 * @date ：Created in 2023/2/9 17:04
 * @description：
 * @modified By：
 * @version:
 */
public class TestOOM {
  private static List<Object> list = new ArrayList<>();

  private int aoc = 0;

  public static void main(String[] args) {
    // testStrongReference();
    /*  Integer a = -1;
    Integer b = 123213;
    System.out.println((a == null || a <= 0) && b != null);*/

    int[] array = new int[] {5, 2, 1, 3, 4, 0};
    Arrays.sort(array, 0, 3);
    for (int i : array) {
      System.out.println(i + ",");
    }
    System.out.println("===================================");
    Integer[] arrayInt = new Integer[] {23, 60, 84, 9};
    String[] strArray = new String[arrayInt.length];
    final int[] a = {0};
    Arrays.stream(arrayInt)
        .forEach(
            i -> {
              strArray[a[0]] = String.valueOf(i);
              a[0]++;
            });
    final int[] k = {0};
    System.out.println("==================================");
    Arrays.sort(
        strArray,
        (x, y) -> {
          /*long sx = 10, sy = 10;
          while (sx <= x) {
            sx *= 10;
          }
          while (sy <= y) {
            sy *= 10;
          }
          return (int) (-sy * x - y + sx * y + x);*/
          /*return y - x;*/
          /* System.out.println(
          "["
              + x
              + ","
              + y
              + "]"
              + "  "
              + Arrays.stream(strArray).collect(Collectors.joining(",")));*/
          k[0]++;
          return (x + y).compareTo(y + x);
        });
    System.out.println(k[0]);
    System.out.println(Arrays.stream(strArray).collect(Collectors.joining(",")));
  }

  private static void testStrongReference() {
    // 当 new byte为 1M 时，程序运行正常
    // byte[] buff = new byte[1024 * 1024 * 20];
    byte[] buff = null;
    for (int i = 0; i < 10; i++) {
      buff = new byte[1024 * 1024 * 10];
      SoftReference<byte[]> sr = new SoftReference<>(buff);
      list.add(sr);
    }
    System.gc(); // 主动通知垃圾回收

    for (int i = 0; i < list.size(); i++) {
      Object obj = ((SoftReference) list.get(i)).get();
      System.out.println(obj);
    }
    System.out.println("buff: " + buff.toString());
  }

  private synchronized void getNum() {
    aoc++;
  }
}
