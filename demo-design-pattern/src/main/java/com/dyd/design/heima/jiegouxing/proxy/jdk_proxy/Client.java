package com.dyd.design.heima.jiegouxing.proxy.jdk_proxy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.jdk_proxy.proxy.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 10:33
 * @description：jdk动态代理必须要生成接口(SellTickets)
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.geProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());

        //让程序一直执行
        while (true) {
        }
    }
}
