package com.dyd.design.heima.chuangjianzhe.factory.factory_method;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.CoffeeStore
 * @date ：Created in 2024/1/17 16:58
 * @description：
 * @modified By：
 * @version:
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        //加料
        coffee.addMilk();
        coffee.addSuger();

        return coffee;
    }
}
