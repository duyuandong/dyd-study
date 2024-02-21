package com.dyd.design.heima.xingweixing.state.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.before.state.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/23 10:02
 * @description：电梯状态
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.RUNNING_STATE);

        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
