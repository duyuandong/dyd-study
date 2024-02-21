package com.dyd.design.heima.chuangjianzhe.factory.simple_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.CoffeeStore
 * @date ：Created in 2024/1/17 16:58
 * @description：
 * @modified By：
 * @version:
 */
public class CoffeeStore {
    /*public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.produceCoffee(type);
        //加料
        coffee.addMilk();
        coffee.addSuger();

        return coffee;
    }*/

    //静态简单工厂
    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.produceCoffee(type);
        //加料
        coffee.addMilk();
        coffee.addSuger();

        return coffee;
    }
}
