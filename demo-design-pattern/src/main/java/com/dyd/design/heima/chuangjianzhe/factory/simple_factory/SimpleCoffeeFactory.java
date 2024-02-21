package com.dyd.design.heima.chuangjianzhe.factory.simple_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.simple_factory.factory.chuangjianzhe.heima.design.SimpleCoffeeFactory
 * @date ：Created in 2024/1/17 17:09
 * @description：
 * @modified By：
 * @version:
 */
public class SimpleCoffeeFactory{

    /*
     * 简单工厂模式
     */
   /* public Coffee produceCoffee(String type){
        Coffee coffee = null;
        if("america".equals(type)){
            coffee = new AmericaCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("no this coffee");
        }
        return coffee;
    }*/

    /*
     * 静态工厂模式
     */
    public static Coffee produceCoffee(String type){
        Coffee coffee = null;
        if("america".equals(type)){
            coffee = new AmericaCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("no this coffee");
        }
        return coffee;
    }
}
