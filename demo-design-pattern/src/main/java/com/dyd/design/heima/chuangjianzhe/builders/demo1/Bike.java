package com.dyd.design.heima.chuangjianzhe.builders.demo1;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo1.builders.chuangjianzhe.heima.design.Bike
 * @date ：Created in 2024/1/18 18:06
 * @description：产品类
 * @modified By：
 * @version:
 */
public class Bike {
    private String frame; //车架

    private String seat; //座椅

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
