package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.before.state.xingweixing.heima.design.ILift
 * @date ：Created in 2024/1/23 10:05
 * @description：
 * @modified By：
 * @version:
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context){
        this.context=context;
    }

    //电梯操作功能
    abstract void open();
    abstract void close();
    abstract void stop();
    abstract void run();
}
