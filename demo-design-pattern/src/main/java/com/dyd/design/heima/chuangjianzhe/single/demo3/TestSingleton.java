package com.dyd.design.heima.chuangjianzhe.single.demo3;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo1.TestSingleton
 * @date ：Created in 2024/1/16 13:57
 * @description：
 * @modified By：
 * @version:
 */
public class TestSingleton {
    public static void main(String[] args) {
        //创建单例对象
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if(instance == instance2){
            System.out.println("instance == instance2");
        }else{
            System.out.println("instance != instance2");
        }
    }
}
