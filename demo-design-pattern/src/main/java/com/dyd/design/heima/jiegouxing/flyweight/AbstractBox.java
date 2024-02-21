package com.dyd.design.heima.jiegouxing.flyweight;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.flyweight.jiegouxing.heima.design.AbstractBox
 * @date ：Created in 2024/1/22 10:58
 * @description：抽象享元角色
 * @modified By：
 * @version:
 */
public abstract class AbstractBox {
    //获取图形方法
    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状:" + getShape() + ", 颜色: " + color);
    }
}
