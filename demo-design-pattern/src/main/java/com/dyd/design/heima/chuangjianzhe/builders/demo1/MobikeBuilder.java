package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.MobikeBuilder
 * @date ：Created in 2024/1/18 18:10
 * @description：具体建造者类-摩拜
 * @modified By：
 * @version:
 */
public class MobikeBuilder extends Builder{
    @Override
    protected void createFrame() {
        bike.setFrame("摩拜车架");
        //System.out.println("摩拜车架");
    }

    @Override
    protected void createSeat() {
        bike.setSeat("摩拜座椅");
        //System.out.println("摩拜座椅");
    }

    @Override
    protected Bike createBike() {
        return bike;
    }
}
