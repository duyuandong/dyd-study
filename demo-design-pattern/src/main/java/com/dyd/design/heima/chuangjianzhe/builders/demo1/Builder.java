package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.Builder
 * @date ：Created in 2024/1/18 18:08
 * @description：抽象建造者类
 * @modified By：
 * @version:
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    protected abstract void createFrame();//创建车架

    protected abstract void createSeat();//创建座椅

    protected abstract Bike createBike();//创建自行车

    //这里如果指挥类创建对象不是太复杂的话 可以放到抽象建造者中来创建
    /*public Bike construct(){
        this.createFrame();
        this.createSeat();
        return this.createBike();
    }*/
}
