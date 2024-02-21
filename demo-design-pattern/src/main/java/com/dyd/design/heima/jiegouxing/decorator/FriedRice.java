package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.FriedRice
 * @date ：Created in 2024/1/19 15:39
 * @description：炒饭 具体构件(Concrete Component)角色
 * @modified By：
 * @version:
 */
public class FriedRice extends FastFood{
    public FriedRice(){
        super(10,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
