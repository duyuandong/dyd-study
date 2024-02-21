package com.dyd.design.heima.chuangjianzhe.single.demo5;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo5.TestSingleton
 * @date ：Created in 2024/1/16 14:38
 * @description：
 * @modified By：
 * @version:
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        if(instance == instance2){
            System.out.println("instance == instance2");
        }else{
            System.out.println("instance != instance2");
        }
    }
}
