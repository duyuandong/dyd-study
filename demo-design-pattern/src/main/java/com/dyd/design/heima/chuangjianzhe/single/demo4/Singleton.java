package com.dyd.design.heima.chuangjianzhe.single.demo4;

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
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时,会自动调用该方法,将该方法的值直接返回不进行反序列化
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
