package com.dyd.design.heima.chuangjianzhe.factory.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/17 17:01
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee america = coffeeStore.orderCoffee("latte");
        System.out.println(america.getName());
    }
}
