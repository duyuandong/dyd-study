package com.dyd.design.heima.xingweixing.observer;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.observer.xingweixing.heima.design.WeiXinUser
 * @date ：Created in 2024/1/24 11:04
 * @description：具体的观察者角色类
 * @modified By：
 * @version:
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
