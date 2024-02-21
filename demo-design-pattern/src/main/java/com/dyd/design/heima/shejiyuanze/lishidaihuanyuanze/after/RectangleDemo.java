package com.dyd.design.heima.shejiyuanze.lishidaihuanyuanze.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.lishidaihuanyuanze.after.RectangleDemo
 * @date ：Created in 2024/1/11 17:47
 * @description：测试类
 * @modified By：
 * @version:
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        //
        resize(rectangle);

        printLengthAndWidth(rectangle);
    }
    //扩宽
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小,进行扩宽
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void  printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("Length: " + quadrilateral.getLength());
        System.out.println("Width: " + quadrilateral.getWidth());
    }
}
