package com.dyd.design.heima.chuangjianzhe.single.demo2;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo1.Singleton
 * @date ：Created in 2024/1/16 13:55
 * @description：饿汉式 静态代码块
 * @modified By：
 * @version:
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;


    static{
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
