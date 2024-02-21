package com.dyd.design.heima.xingweixing.state.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.before.state.xingweixing.heima.design.Lift
 * @date ：Created in 2024/1/23 10:05
 * @description：电梯类
 * @modified By：
 * @version:
 */
public class Lift implements ILift{

    //声明一个记录当前电梯的状态
    private int state;
    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state){ //当前电梯状态
            case OPENING_STATE:
                //什么事都不做
                break;
            case CLOSING_STATE:
                setTip(OPENING_STATE,"电梯打开了...");
                break;
            case STOPPING_STATE:
                setTip(OPENING_STATE,"电梯打开了...");
                break;
            case RUNNING_STATE:
                break;
        }
    }

    private void setTip(int state,String content){
        System.out.println(content);
        setState(state);
    }

    @Override
    public void close() {
        switch (state){ //当前电梯状态
            case OPENING_STATE:
                setTip(CLOSING_STATE,"电梯关闭了...");
                break;
            case CLOSING_STATE:
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state){ //当前电梯状态
            case OPENING_STATE:
                setTip(STOPPING_STATE,"电梯停止了...");
                break;
            case CLOSING_STATE:
                setTip(STOPPING_STATE,"电梯停止了...");
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                setTip(STOPPING_STATE,"电梯停止了...");
                break;
        }
    }

    @Override
    public void run() {
        switch (state){ //当前电梯状态
            case OPENING_STATE:
                setTip(OPENING_STATE,"电梯运行了...");
                break;
            case CLOSING_STATE:
                setTip(OPENING_STATE,"电梯运行了...");
                break;
            case STOPPING_STATE:
                setTip(OPENING_STATE,"电梯运行了...");
                break;
            case RUNNING_STATE:
                break;
        }
    }
}
