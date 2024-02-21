package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.FriedNoodles
 * @date ：Created in 2024/1/19 15:41
 * @description：炒面 具体构件(Concrete Component)角色
 * @modified By：
 * @version:
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles(){
        super(15,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
