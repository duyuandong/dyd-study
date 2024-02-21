package com.dyd.design.heima.chuangjianzhe.single.demo3;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo1.Singleton
 * @date ：Created in 2024/1/16 13:55
 * @description：懒汉式 线程不安全 /安全
 * @modified By：
 * @version:
 */
public class Singleton {
    private Singleton() {
    }

    //private static Singleton instance;

    //volatile 禁止进行指令重排序
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     *双层检查锁
     */
    public static Singleton getInstance3() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null ) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
