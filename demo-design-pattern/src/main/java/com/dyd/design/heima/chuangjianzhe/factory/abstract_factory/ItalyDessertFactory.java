package com.dyd.design.heima.chuangjianzhe.factory.abstract_factory;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.abstract_factory.factory.chuangjianzhe.heima.design.ItalyDessertFactory
 * @date ：Created in 2024/1/17 18:22
 * @description：
 * @modified By：
 * @version:
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
