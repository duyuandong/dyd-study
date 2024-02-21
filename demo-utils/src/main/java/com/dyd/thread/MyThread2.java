package com.dyd.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.thread.MyThread2
 * @date ：Created in 2023/9/8 10:34
 * @description：
 * @modified By：
 * @version:
 */
public class MyThread2 {
    public static void main(String[] args) {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("parking-card-collection-%d").build();
        ExecutorService singleThreadPool   = new ThreadPoolExecutor(5, 20, 60L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 10; i++) {
            singleThreadPool.execute( () -> {
                System.out.println("=====当前线程名:"+Thread.currentThread().getName());
            });
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
