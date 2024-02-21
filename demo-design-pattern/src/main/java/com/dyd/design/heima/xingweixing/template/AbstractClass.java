package com.dyd.design.heima.xingweixing.template;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.template.xingweixing.heima.design.AbstractClass
 * @date ：Created in 2024/1/22 11:38
 * @description：抽象类
 * @modified By：
 * @version:
 */
public abstract class AbstractClass {

    //模版方法定义
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil(){
        System.out.println("倒入油!");
    }

    public void heatOil(){
        System.out.println("热油!");
    }

    public abstract void pourSauce();

    public void fry(){
        System.out.println("进行翻炒!");
    }
    //倒蔬菜
    public abstract void pourVegetable();
}
