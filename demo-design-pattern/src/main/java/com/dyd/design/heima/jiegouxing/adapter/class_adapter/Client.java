package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 14:31
 * @description：类适配器模式违背了合成复用原则。类适配器是客户类有一个接口规范的情况下可用，反之不可用
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        //适配TFCard
        System.out.println("====================");
        String msg2 = computer.readSD(new SDAdapterTF());
        System.out.println(msg2);
    }
}
