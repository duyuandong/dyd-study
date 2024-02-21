package com.dyd.design.heima.jiegouxing.facade;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.facade.jiegouxing.heima.design.SmartApplicancesFacade
 * @date ：Created in 2024/1/19 17:16
 * @description：外观类
 * @modified By：
 * @version:
 */
public class SmartApplicancesFacade {
    //聚合各种子类
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String msg){
        //通过语音控制
        if(msg.contains("打开")){
            on();
        }else if(msg.contains("关闭")){
            off();
        }else{
            System.out.println("我还听不懂你说的");
        }
    }

    //一建打开
    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    //一建关闭
    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
