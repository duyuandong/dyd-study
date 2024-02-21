package com.dyd.design.heima.xingweixing.state.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.before.state.xingweixing.heima.design.ILift
 * @date ：Created in 2024/1/23 10:05
 * @description：
 * @modified By：
 * @version:
 */
public class Context {
    //定义四个电梯状态常量
    public final static ClosingState closingState = new ClosingState();
    public final static OpenningState openningState = new OpenningState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
}
