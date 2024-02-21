package com.dyd.design.heima.chuangjianzhe.prototype.test;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.test.prototype.chuangjianzhe.heima.design.Student
 * @date ：Created in 2024/1/18 15:52
 * @description：
 * @modified By：
 * @version:
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
