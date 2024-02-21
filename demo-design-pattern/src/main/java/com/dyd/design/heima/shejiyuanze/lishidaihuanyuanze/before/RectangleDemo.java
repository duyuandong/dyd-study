package com.dyd.design.heima.shejiyuanze.lishidaihuanyuanze.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.lishidaihuanyuanze.before.RectangleDemo
 * @date ：Created in 2024/1/11 17:22
 * @description：
 * @modified By：
 * @version:
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(25);
        rectangle.setLength(30);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("**************");

        Square square = new Square();
        square.setWidth(25);
        //扩宽
        resize(square);
        printLengthAndWidth(square);
    }

    //扩宽方法
    public static void resize(Rectangle rectangle){
        //判断宽如果比长小,进行扩宽
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长度
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println("长度为：" + rectangle.getLength());
        System.out.println("宽度为：" + rectangle.getWidth());
    }
}
