package com.dyd.design.heima.chuangjianzhe.factory.factory_method;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.factory_method.factory.chuangjianzhe.heima.design.AmericaCoffeeFactory
 * @date ：Created in 2024/1/17 17:36
 * @description：
 * @modified By：
 * @version:
 */
public class AmericaCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }
}
