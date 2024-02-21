package com.dyd.design.heima.jiegouxing.proxy.jdk_proxy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.static_proxy.proxy.jiegouxing.heima.design.TrainStation
 * @date ：Created in 2024/1/19 10:14
 * @description：火车站  ()
 * @modified By：
 * @version:
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
