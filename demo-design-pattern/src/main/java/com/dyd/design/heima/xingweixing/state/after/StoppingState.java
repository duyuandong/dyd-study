package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.after.state.xingweixing.heima.design.OpenningState
 * @date ：Created in 2024/1/23 11:14
 * @description：
 * @modified By：
 * @version:
 */
public class StoppingState extends LiftState{
    //当前状态要执行的方法
    @Override
    void open() {
        //修改状态
        super.context.setLiftState(Context.openningState);
        //调用当前状态中的context中的close方法
        super.context.open();
    }

    @Override
    void close() {
        //修改状态
        super.context.setLiftState(Context.closingState);
        //调用当前状态中的context中的close方法
        super.context.close();
    }

    @Override
    void stop() {
        System.out.println("电梯停止了...");
    }

    @Override
    void run() {
        //修改状态
        super.context.setLiftState(Context.runningState);
        //调用当前状态中的context中的close方法
        super.context.run();
    }
}
