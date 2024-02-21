package com.dyd.design.heima.xingweixing.mediator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.mediator.xingweixing.heima.design.HouseOwner
 * @date ：Created in 2024/1/24 15:18
 * @description：具体的同事角色类
 * @modified By：
 * @version:
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息是:" + message);
    }
}
