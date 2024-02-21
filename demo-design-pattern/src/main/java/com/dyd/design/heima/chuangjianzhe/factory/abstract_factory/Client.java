package com.dyd.design.heima.chuangjianzhe.factory.abstract_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/17 17:01
 * @description：
             * 优点:
             * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
             * 缺点:
             * 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //DessertFactory factory = new AmericanDessertFactory();
        DessertFactory factory = new ItalyDessertFactory();
                Coffee coffee = factory.createCoffee();
        coffee.addSuger();
        coffee.addMilk();
        System.out.println(coffee.getName());
        Dessert dessert = factory.createDessert();
        dessert.show();

    }
}
