package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.Director
 * @date ：Created in 2024/1/18 18:15
 * @description：指挥者类
 * @modified By：
 * @version:
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.createFrame();
        builder.createSeat();
        return builder.createBike();
    }
}
