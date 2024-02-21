package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.Egg
 * @date ：Created in 2024/1/19 15:45
 * @description：鸡蛋类 具体装饰(ConcreteDecorator) 角色
 * @modified By：
 * @version:
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() +"+"+ getFastFood().getDesc();
    }
}
