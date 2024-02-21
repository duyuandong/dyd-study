package com.dyd.design.heima.chuangjianzhe.factory.abstract_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.abstract_factory.factory.chuangjianzhe.heima.design.AmericanDessertFactory
 * @date ：Created in 2024/1/17 18:21
 * @description：
 * @modified By：
 * @version:
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
