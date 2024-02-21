package com.dyd.design.heima.jiegouxing.facade;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.facade.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 17:21
 * @description：外观模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        SmartApplicancesFacade sf = new SmartApplicancesFacade();

        sf.say("打开家电");
        System.out.println("===================");
        sf.say("关闭家电");
    }
}
