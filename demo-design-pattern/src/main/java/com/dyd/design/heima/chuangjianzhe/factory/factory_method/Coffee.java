package com.dyd.design.heima.chuangjianzhe.factory.factory_method;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.factory.simple_factory.Coffe
 * @date ：Created in 2024/1/17 16:54
 * @description：
 * @modified By：
 * @version:
 */
public abstract class Coffee {

    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }

    public void addSuger(){
        System.out.println("加糖");
    }
}
