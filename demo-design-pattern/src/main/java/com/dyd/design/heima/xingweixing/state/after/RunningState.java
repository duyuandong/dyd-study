package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.after.state.xingweixing.heima.design.OpenningState
 * @date ：Created in 2024/1/23 11:14
 * @description：
 * @modified By：
 * @version:
 */
public class RunningState extends LiftState{
    //当前状态要执行的方法
    @Override
    void open() {

    }

    @Override
    void close() {

    }

    @Override
    void stop() {
        //修改状态
        super.context.setLiftState(Context.stoppingState);
        //调用当前状态中的context中的close方法
        super.context.stop();
    }

    @Override
    void run() {
        System.out.println("电梯正在运行...");
    }
}
