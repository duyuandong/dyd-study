package com.dyd.design.heima.chuangjianzhe.prototype.test1;

import java.io.Serializable;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.test.prototype.chuangjianzhe.heima.design.Citation
 * @date ：Created in 2024/1/18 15:20
 * @description：
 * @modified By：
 * @version:
 */
public class Citation implements Cloneable, Serializable {
   /* private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName() + "荣获三好学生!");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }
}
