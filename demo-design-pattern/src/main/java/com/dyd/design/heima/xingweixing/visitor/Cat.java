package com.dyd.design.heima.xingweixing.visitor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Cat
 * @date ：Created in 2024/1/24 17:20
 * @description：具体元素角色类
 * @modified By：
 * @version:
 */
public class Cat implements Animal{
    //
    @Override
    public void accept(Person person) {
        person.feed(this);//给猫喂食
        System.out.println("好好吃,喵~");
    }
}
