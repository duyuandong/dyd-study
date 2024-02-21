package com.dyd.design.heima.jiegouxing.proxy.static_proxy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.static_proxy.proxy.jiegouxing.heima.design.ProxyPoint
 * @date ：Created in 2024/1/19 10:15
 * @description：代售点 (代理类)
 * @modified By：
 * @version:
 */
public class ProxyPoint implements SellTickets{
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("==收取代售点服务费==");
        trainStation.sell();
    }
}
