package com.dyd.design.heima.xingweixing.strategy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.strategy.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/22 14:10
 * @description：策略模式  促销活动; JDK中很多地方使用此模式 如Arrays中的sort方法
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.saleManShow();
        System.out.println("==============================");
        salesMan.setStrategy(new StrategyB());
        salesMan.saleManShow();

        System.out.println("==============================");
        salesMan.setStrategy(new StrategyC());
        salesMan.saleManShow();
    }
}
