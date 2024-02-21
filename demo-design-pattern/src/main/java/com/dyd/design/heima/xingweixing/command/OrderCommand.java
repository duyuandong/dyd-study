package com.dyd.design.heima.xingweixing.command;

import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.command.xingweixing.heima.design.OrderCommand
 * @date ：Created in 2024/1/22 15:03
 * @description：具体命令类
 * @modified By：
 * @version:
 */
public class OrderCommand implements Command{
    private Order order;
    private SeniorChef receiver;

    public OrderCommand(Order order, SeniorChef receiver) {
        this.order = order;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("=========================================");
        System.out.println(order.getDiningTable() + "号桌的订单: ");
        Map<String, Integer> foodDic = order.getFoodDic();
        for (String foodName : foodDic.keySet()) {
            receiver.makeFood(foodDic.get(foodName),foodName);
        }
        System.out.println("\t" + order.getDiningTable() + "号桌的订单准备完毕!");
    }
}
