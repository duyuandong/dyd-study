package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.after.state.xingweixing.heima.design.OpenningState
 * @date ：Created in 2024/1/23 11:14
 * @description：
 * @modified By：
 * @version:
 */
public class OpenningState extends LiftState{
    //当前状态要执行的方法
    @Override
    void open() {
        //什么都不做
        System.out.println("电梯开启...");
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
        //什么都不做
    }

    @Override
    void run() {
        //什么都不做
    }
}
