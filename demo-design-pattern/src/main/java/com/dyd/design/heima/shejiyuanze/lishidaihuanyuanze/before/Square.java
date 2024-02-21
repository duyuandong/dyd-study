package com.dyd.design.heima.shejiyuanze.lishidaihuanyuanze.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.lishidaihuanyuanze.before.Square
 * @date ：Created in 2024/1/11 17:19
 * @description：正方形
 * @modified By：
 * @version:
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
