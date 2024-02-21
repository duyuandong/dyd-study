package com.dyd.design.heima.xingweixing.iterator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.Student
 * @date ：Created in 2024/1/24 15:54
 * @description：
 * @modified By：
 * @version:
 */
public class Student {
    private String name;
    private String number;

    public Student() {
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
