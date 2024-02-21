package com.dyd.design.heima.xingweixing.visitor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Person
 * @date ：Created in 2024/1/24 17:18
 * @description：抽象访问者角色类
 * @modified By：
 * @version:
 */
public interface Person {
    //喂食猫
    void feed(Cat cat);
    //喂食狗
    void feed(Dog dog);
}
