package com.dyd.design.heima.chuangjianzhe.factory.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.CoffeeStore
 * @date ：Created in 2024/1/17 16:58
 * @description：
 * @modified By：
 * @version:
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("america".equals(type)){
            coffee = new AmericaCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("no this coffee");
        }

        //加料
        coffee.addMilk();
        coffee.addSuger();

        return coffee;
    }
}
