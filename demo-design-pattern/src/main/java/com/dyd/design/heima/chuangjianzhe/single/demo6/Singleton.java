package com.dyd.design.heima.chuangjianzhe.single.demo6;

import java.io.Serializable;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo1.Singleton
 * @date ：Created in 2024/1/16 13:55
 * @description：懒汉式 静态内部类
 * @modified By： 推荐使用
 * @version:
 */
public class Singleton implements Serializable {
    private static boolean flag = false;
    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {//非第一访问
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
