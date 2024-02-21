package com.dyd.design.heima.chuangjianzhe.single.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo1.Singleton
 * @date ：Created in 2024/1/16 13:55
 * @description：饿汉式 成员静态方法
 * @modified By：
 * @version:
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
