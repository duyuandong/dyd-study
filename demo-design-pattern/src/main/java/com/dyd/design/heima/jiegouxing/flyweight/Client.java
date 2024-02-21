package com.dyd.design.heima.jiegouxing.flyweight;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.flyweight.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/22 11:07
 * @description：俄罗斯方块 图形构建
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox iBoxInstance = BoxFactory.getInstance().getShape("I");
        iBoxInstance.display("灰色");

        //获取L图形对象
        AbstractBox lBoxInstance = BoxFactory.getInstance().getShape("L");
        lBoxInstance.display("蓝色");

        //获取O图形对象
        AbstractBox oBoxInstance = BoxFactory.getInstance().getShape("O");
        oBoxInstance.display("紫色");

        AbstractBox oBoxInstance2 = BoxFactory.getInstance().getShape("O");
        oBoxInstance2.display("红色");
        System.out.println(oBoxInstance == oBoxInstance2);
    }
}
