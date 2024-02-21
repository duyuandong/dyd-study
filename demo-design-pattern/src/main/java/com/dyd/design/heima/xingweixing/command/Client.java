package com.dyd.design.heima.xingweixing.command;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.command.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/22 14:57
 * @description：命令模式   Runable类使用该模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建订单对象
        Order or1 = new Order();
        or1.setDiningTable(1);
        or1.setFoodDic("西红柿鸡蛋面",1);
        or1.setFoodDic("小杯可乐",2);

        Order or2 = new Order();
        or2.setDiningTable(2);
        or2.setFoodDic("尖椒肉丝盖饭",1);
        or2.setFoodDic("小杯雪碧",1);

        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(or1,receiver);
        OrderCommand cmd2 = new OrderCommand(or2,receiver);

        //创建调用者(服务员对象)
        Waitor invoke = new Waitor();
        invoke.setCommand(cmd1);
        invoke.setCommand(cmd2);

        //让服务员发起命令
        invoke.orderUp();
    }
}
