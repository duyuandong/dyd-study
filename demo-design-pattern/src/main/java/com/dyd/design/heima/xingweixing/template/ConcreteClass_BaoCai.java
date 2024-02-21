package com.dyd.design.heima.xingweixing.template;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.template.xingweixing.heima.design.ConcreteClass_BaoCai
 * @date ：Created in 2024/1/22 11:45
 * @description：具体子类
 * @modified By：
 * @version:
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourSauce() {
        System.out.println("倒入醋");
    }

    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }
}
