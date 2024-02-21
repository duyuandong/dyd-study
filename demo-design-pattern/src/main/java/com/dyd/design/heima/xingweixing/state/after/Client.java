package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.after.state.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/23 11:38
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //设置当前电梯状态
        //context.setLiftState(new RunningState());
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
