package com.dyd.design.heima.chuangjianzhe.factory.factory_method;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/17 17:01
 * @description：
 *              优点:
 *                  用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程:
 *                  在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则缺点;
 *              缺点:
 *              每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度
 *              成员(抽象产品\具体产品\抽象工厂\具体工厂)
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        //coffeeStore.setFactory(new AmericaCoffeeFactory());
        coffeeStore.setFactory(LatteCoffee::new);
        Coffee america = coffeeStore.orderCoffee();
        System.out.println(america.getName());
    }
}
