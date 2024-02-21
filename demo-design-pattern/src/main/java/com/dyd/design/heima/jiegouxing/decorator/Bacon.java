package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.Bacon
 * @date ：Created in 2024/1/19 15:49
 * @description：培根 具体装饰(ConcreteDecorator) 角色
 * @modified By：
 * @version:
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
