package com.dyd.design.heima.chuangjianzhe.builders.demo2;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo2.builders.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/19 9:47
 * @description：建造者模式更加实用的方式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("sany")
                .mainboard("huasuo")
                .memory("haidaochuan")
                .build();
        System.out.println(phone);
    }
}
