package com.dyd.design.heima.jiegouxing.proxy.static_proxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.static_proxy.proxy.jiegouxing.heima.design.ProxyPoint
 * @date ：Created in 2024/1/19 10:15
 * @description：代售点 (代理类)
 * @modified By：
 * @version:
 */
public class ProxyPoint implements SellTickets{
    private TrainStation target;

    public ProxyPoint(TrainStation target) {
        this.target = target;
    }

    @Override
    public void sell() {
        System.out.println("==收取代售点服务费==");
        this.target.sell();
        System.out.println("==收取代售点服务费1==");

        List<Integer> integers = Arrays.asList(2222,3333);
        integers.forEach( i -> System.out.println(i));
    }
}
