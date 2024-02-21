package com.dyd.maindata;

import com.glacier.GlacierClient;
import segi.common.mq.push.client.Client.MqPushResponse;
import segi.common.mq.push.client.Client._MQAcceptClientDisp;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 客户端通知服务端,启动推送数据服务 起多个客户端 不要起太快了
 *
 * @author tanjun
 */
public class App implements Runnable {
  static String basecode = null; // 四格互联分给各厂商到basecode
  static String tags = null; // * 代表接收任何类型.  指定类型可以是 10,  指定多个类型  10||11
  static String iceConfigPath = null;
  static int size = 3;
  static ScheduledExecutorService es = Executors.newScheduledThreadPool(3);

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    iceConfigPath = System.getProperty("config");
    iceConfigPath = "C:/Users/Administrator/Desktop/javamqpush/iceglacier2_beta.properties";
    if (iceConfigPath == null) {
      System.err.println("未在jvm参数中指定 -Dconfig=配置文件目录");
      return;
    }
    System.out.println("连接配置文件地址：" + iceConfigPath);
    System.out.println("请输入basecode:");
    // 判断是否还有输入
    if (scan.hasNextLine()) {
      basecode = scan.nextLine();
      System.out.println("输入的basecode是:" + basecode);
    }
    System.out.println("请输入tags用于过滤数据,可以指定多个使用||分割,或者输入*表示接收全部:");
    // 判断是否还有输入
    if (scan.hasNextLine()) {
      tags = scan.nextLine();
      System.out.println("输入的tags是:" + tags);
    }
    System.out.println("请输入启动客户端线程个数:");
    // 判断是否还有输入
    if (scan.hasNextInt()) {
      size = scan.nextInt();
      System.out.println("输入客户端线程个数是:" + size);
    }
    scan.close();
    for (int i = 0; i < size; i++) {
      es.schedule(new App(), 1, TimeUnit.SECONDS);
    }
    long maxMemory = Runtime.getRuntime().maxMemory();
    System.out.print("-Xmx-最大内存(MB):" + (maxMemory / 1024 / 1024));
  }

  @Override
  public void run() {
    _MQAcceptClientDisp impl = new AcceptPushClientImpl();
    try {
      long tid = Thread.currentThread().getId();
      System.out.println("启动客户端号:" + tid);
      final GlacierClient gc = new GlacierClient(iceConfigPath, impl, tags, basecode);
      ((AcceptPushClientImpl) impl).setGlacierClient(gc, tid);
      Runnable r =
          new Runnable() {
            @Override
            public void run() {
              try {
                MqPushResponse res = gc.getResponse();
                // 只会打印现在读取的时候的状态,如果发生了断开重连,也许能打印出来,如果想记录的更清楚,把下面的任务执行的频率调高点
                System.out.println(
                    "客户端号:"
                        + tid
                        + ",客户端运行状态 code = "
                        + res.getCode()
                        + ",message = "
                        + res.getMessage());
              } catch (Exception e) { // 加异常捕获,是因为线程执行中出现异常,则会丢弃这个任务
                e.printStackTrace();
              }
            }
          };
      es.scheduleAtFixedRate(r, 1, 1, TimeUnit.SECONDS);
    } catch (Throwable e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
