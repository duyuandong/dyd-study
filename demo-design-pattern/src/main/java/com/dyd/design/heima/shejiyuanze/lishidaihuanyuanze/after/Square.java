package com.dyd.design.heima.shejiyuanze.lishidaihuanyuanze.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.lishidaihuanyuanze.after.Square
 * @date ：Created in 2024/1/11 17:43
 * @description：正方形
 * @modified By：
 * @version:
 */
public class Square implements Quadrilateral{

    private double side;

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
