package com.spring.vo;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.vo.User
 * @date ：Created in 2024/2/20 17:26
 * @description：
 * @modified By：
 * @version:
 */
public class User {
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
