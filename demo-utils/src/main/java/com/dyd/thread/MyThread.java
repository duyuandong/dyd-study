package com.dyd.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.thread.MyThread
 * @date ：Created in 2021/5/6 18:39
 * @description：
 * @modified By：
 * @version:
 */
public class MyThread {

  public static void getCachedTreadPool() {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    for (int i = 0; i < 20; i++) {
      int finalI = i;
      executorService.execute(
          () -> {
            if (finalI % 2 == 0) {
              try {
                Thread.sleep(5000);
                System.out.println(
                    Thread.currentThread().getName()
                        + ":=====================5s线程==================");
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
            System.out.println(Thread.currentThread().getName() + ": " + finalI);
          });
    }
    executorService.shutdown();
  }

  public static void main(String[] args) {
    // getCachedTreadPool();
    /* List<Student> collect =
        Stream.concat(
                Stream.of(new Student("jack", 18, true, 3.22f, "tina")),
                Stream.of(new Student("jack2", 14, true, 3.22f, "tina")))
            .collect(Collectors.toList());
    System.out.println(collect);*/
    //System.out.println(new BigDecimal("70").compareTo(new BigDecimal("0")));
  }
}
