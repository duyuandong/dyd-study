package com.dyd.design.heima.jiegouxing.proxy.static_proxy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.static_proxy.proxy.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 10:17
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint(new TrainStation());
        proxyPoint.sell();
    }
}
