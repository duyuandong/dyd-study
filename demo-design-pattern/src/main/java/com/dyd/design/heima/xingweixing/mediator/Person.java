package com.dyd.design.heima.xingweixing.mediator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.mediator.xingweixing.heima.design.Person
 * @date ：Created in 2024/1/24 11:44
 * @description：抽象同事类
 * @modified By：
 * @version:
 */
public abstract class Person {
    //租房者或房主姓名
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
