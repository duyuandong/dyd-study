package com.dyd.design.heima.xingweixing.template;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.template.xingweixing.heima.design.ConcreteClass_CaiXin
 * @date ：Created in 2024/1/22 11:45
 * @description：具体子类
 * @modified By：
 * @version:
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourSauce() {
        System.out.println("倒入酱油");
    }

    @Override
    public void pourVegetable() {
        System.out.println("倒入菜心!");
    }
}
