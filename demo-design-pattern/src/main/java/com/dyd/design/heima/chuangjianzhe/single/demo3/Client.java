package com.dyd.design.heima.chuangjianzhe.single.demo3;

import java.lang.reflect.Constructor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo4.Client
 * @date ：Created in 2024/1/16 14:42
 * @description： 测试反射破坏单例模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Class clazz = Singleton.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        for (int i = 0; i < 2; i++) {
            Singleton singleton = (Singleton) declaredConstructor.newInstance();
            System.out.println(singleton);
        }

    }
}
