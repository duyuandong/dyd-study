package com.dyd.design.heima.xingweixing.visitor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Animal
 * @date ：Created in 2024/1/24 17:19
 * @description：抽象元素角色类
 * @modified By：
 * @version:
 */
public interface Animal {
    //接收访问者访问的功能
    void accept(Person person);
}
