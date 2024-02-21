package com.dyd.design.heima.xingweixing.visitor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Owner
 * @date ：Created in 2024/1/24 17:23
 * @description：具体访问者角色类(其他人)
 * @modified By：
 * @version:
 */
public class SomeOne implements Person{

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
