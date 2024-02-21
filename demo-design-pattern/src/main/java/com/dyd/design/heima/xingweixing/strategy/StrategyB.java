package com.dyd.design.heima.xingweixing.strategy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.strategy.xingweixing.heima.design.StrategyA
 * @date ：Created in 2024/1/22 14:14
 * @description：具体策略类
 * @modified By：
 * @version:
 */
public class StrategyB implements Strategy{

    @Override
    public void show() {
        System.out.println("这是B类活动");
    }
}
