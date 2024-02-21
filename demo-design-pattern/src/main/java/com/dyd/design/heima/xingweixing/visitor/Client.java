package com.dyd.design.heima.xingweixing.visitor;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/24 16:28
 * @description：访问者模式  列:给宠物喂食
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建home对象
        Home home = new Home();
        //添加元素到home对象中
        home.add(new Cat());
        home.add(new Dog());

        //创建一个主人对象
        Owner owner = new Owner();
        //让主人喂食
        home.action(owner);
    }
}
