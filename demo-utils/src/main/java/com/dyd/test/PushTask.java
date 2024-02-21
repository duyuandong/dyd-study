package com.dyd.test;

import com.google.common.collect.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class PushService {
  public void pushMessages(List<String> messages) {
    ExecutorService pool = Executors.newFixedThreadPool(10);
    try {
      AtomicInteger i = new AtomicInteger();
      i.set(0);
      for (String message : messages) {
        pool.submit(
            () -> {
              try {
                i.getAndIncrement();
                System.out.println("[" + Thread.currentThread().getName() + "]推送消息：" + message);
              } catch (Exception e) {

              }
            });
      }
      System.out.println(i.get());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      pool.shutdown();
    }
  }

  public static void main(String[] args) {
    //
    LinkedList<String> list = Lists.newLinkedList();
    for (int i = 0; i < 100; i++) {
      list.add("我是AI：" + i + "号");
    }
    PushService pushService = new PushService();
    pushService.pushMessages(list);
  }
}
