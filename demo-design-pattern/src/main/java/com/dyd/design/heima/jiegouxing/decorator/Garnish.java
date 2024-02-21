package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.Garnish
 * @date ：Created in 2024/1/19 15:42
 * @description：装饰者类 抽象装饰(Decorator)角色  继承 + 聚合 抽象角色
 * @modified By：
 * @version:
 */
public abstract class Garnish extends FastFood{
    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
