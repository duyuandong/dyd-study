package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.OfoBuilder
 * @date ：Created in 2024/1/18 18:14
 * @description：具体建造者类-ofo
 * @modified By：
 * @version:
 */
public class OfoBuilder extends Builder{

    @Override
    protected void createFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    protected void createSeat() {
        bike.setSeat("ofo座椅");
    }

    @Override
    protected Bike createBike() {
        return bike;
    }
}
