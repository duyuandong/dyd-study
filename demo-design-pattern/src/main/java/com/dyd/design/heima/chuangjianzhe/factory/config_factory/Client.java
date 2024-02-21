package com.dyd.design.heima.chuangjianzhe.factory.config_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/17 17:01
 * @description： 静态工厂类改进 ,也符合开闭原则 ; coffee实例直接配置在配置文件当中即可解耦
 *
 * @modified By：
 * @version:
 */
public class Client {

    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.getCoffee("coffee_american");
        //Coffee coffee = CoffeeFactory.getCoffee("coffee_latte");
        coffee.addMilk();
        coffee.addSuger();
        System.out.println(coffee.getName());
    }
}
