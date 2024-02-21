package com.dyd.design.heima.shejiyuanze.lishidaihuanyuanze.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.lishidaihuanyuanze.after.Rectangle
 * @date ：Created in 2024/1/11 17:45
 * @description：长方形
 * @modified By：
 * @version:
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;


    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
