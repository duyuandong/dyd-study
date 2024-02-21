package com.dyd.design.heima.jiegouxing.proxy.cglib_proxy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.jdk_proxy.proxy.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 10:33
 * @description：final类不能使用,因为子代理类不能继承  jdk效率1.8的时候效率要比
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        TrainStation proxyobject = proxyFactory.getProxyobject();

        proxyobject.sell();
        System.out.println(proxyobject.getClass());
        while (true){

        }
    }
}
