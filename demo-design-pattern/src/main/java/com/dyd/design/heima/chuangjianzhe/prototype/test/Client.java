package com.dyd.design.heima.chuangjianzhe.prototype.test;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo.prototype.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/18 15:14
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();

        //写名字
       /* clone.setName("小明");
        clone.show();

        citation.setName("小红");
        citation.show();*/

        Student stu = new Student();
        stu.setName("小明");
        citation.setStu(stu);


        //复制奖状
        Citation clone = citation.clone();
        Student stu1 = clone.getStu();
        stu1.setName("小黄");

        citation.show();
        clone.show();
    }
}
