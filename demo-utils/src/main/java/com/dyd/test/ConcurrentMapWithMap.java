package com.dyd.test;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class ConcurrentMapWithMap {

  private static Map<String, Long> mapWordCounts = new HashMap<>();
  private static ConcurrentMap<String, Long> concurrentMapWordCounts = new ConcurrentHashMap<>();
  public static int count = 0;

  public static long mapIncrease(String word) {
    Long oldValue = mapWordCounts.get(word);
    Long newValue = (oldValue == null) ? 1L : oldValue + 1;
    mapWordCounts.put(word, newValue);
    return newValue;
  }

  public static long ConcurrentMapIncrease(String word) {
    Long oldValue, newValue;
    while (true) {
      oldValue = concurrentMapWordCounts.get(word);
      if (oldValue == null) {
        newValue = 1L;
        // 已经有key了就返回放入的值，否则返回
        if (concurrentMapWordCounts.putIfAbsent(word, newValue) == null) {
          break;
        }
      } else {
        newValue = oldValue + 1;
        // 值替换，每次替换时都会比较上面拿到oldValue是否就是当前map里面的值，是才替换，否则继续获取
        if (concurrentMapWordCounts.replace(word, oldValue, newValue)) {
          break;
        }
      }
    }
    return newValue;
  }

  public static synchronized long ConcurrentMapIncreaseV2(String word) {
    Long oldValue, newValue;
    while (true) {
      oldValue = concurrentMapWordCounts.get(word);
      if (oldValue == null) {
        newValue = 0L;
        // 已经有key了就返回放入的值，否则返回空
        if (concurrentMapWordCounts.putIfAbsent(word, newValue) == null) {
          break;
        }
      } else {
        newValue = oldValue + 1;
        // 值替换，每次替换时都会比较上面拿到oldValue是否就是当前map里面的值，是才替换，否则继续获取
        if (concurrentMapWordCounts.replace(word, oldValue, newValue)) {
          break;
        }
      }
    }
    return newValue;
  }

  /*public static void mapWordCount() throws InterruptedException, ExecutionException {
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                while (count++ < 10000) ConcurrentMapWithMap.mapIncrease("work");
              }
            })
        .start();
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                while (count++ < 10000) ;
                ConcurrentMapWithMap.mapIncrease("work");
              }
            })
        .start();
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                while (count++ < 10000) ConcurrentMapWithMap.mapIncrease("work");
              }
            })
        .start();
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                while (count++ < 10000) ConcurrentMapWithMap.mapIncrease("work");
              }
            })
        .start();
  }*/

  public static void concurrentWordCount() throws InterruptedException, ExecutionException {
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                try {
                  Thread.sleep(2);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                concurrentMapWordCounts.putIfAbsent("work", -1L);
                while (count++ < 100) {
                  long work = ConcurrentMapWithMap.ConcurrentMapIncreaseV2("work");
                  System.out.println("当前线程:Tom=====值:" + work);
                }
              }
            })
        .start();
    /* new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                try {
                  Thread.sleep(5);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                concurrentMapWordCounts.putIfAbsent("work", 0L);
                while (count++ < 100) {
                  long work = ConcurrentMapWithMap.ConcurrentMapIncreaseV2("work");
                  System.out.println("当前线程:Jack=====值:" + work);
                }
                ;
              }
            })
        .start();
    new Thread(
            new Runnable() {
              public void run() {
                int count = 0;
                try {
                  Thread.sleep(10);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                concurrentMapWordCounts.putIfAbsent("work", 0L);
                while (count++ < 100) {
                  long work = ConcurrentMapWithMap.ConcurrentMapIncreaseV2("work");
                  System.out.println("当前线程:Kase=====值:" + work);
                }
                ;
              }
            })
        .start();*/
  }

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    /* ConcurrentMapWithMap.mapWordCount();
    Thread.sleep(10000);
    System.out.println(
        "final count map"
            + ConcurrentMapWithMap.mapWordCounts.get("work")); // 多线程累加，每次都少于40000，故线程不安全*/
    /* ConcurrentMapWithMap.concurrentWordCount();
    Thread.sleep(5000);
    System.out.println(
        "final count concurrentMap"
            + ConcurrentMapWithMap.concurrentMapWordCounts.get("work")); // 多线程累加，每次都是40000*/

    concurrentMapWordCounts.putIfAbsent("work", 1L);
    System.out.println(JSONObject.toJSONString(concurrentMapWordCounts));
    concurrentMapWordCounts.putIfAbsent("work", 2L);
    System.out.println(JSONObject.toJSONString(concurrentMapWordCounts));
    Integer index = 2;
    if (index == null || index < 1) {
      System.out.println(22);
    }
  }
}
