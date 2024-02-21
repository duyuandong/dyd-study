package com.dyd.design.heima.xingweixing.strategy;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.strategy.xingweixing.heima.design.SalesMan
 * @date ：Created in 2024/1/22 14:16
 * @description：环境类
 * @modified By：
 * @version:
 */
public class SalesMan {
    private Strategy strategy;


    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void saleManShow(){
        strategy.show();
    }
}
