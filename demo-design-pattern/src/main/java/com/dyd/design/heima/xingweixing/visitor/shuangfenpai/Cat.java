package com.dyd.design.heima.xingweixing.visitor.shuangfenpai;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.shuangfenpai.visitor.xingweixing.heima.design.Animal
 * @date ：Created in 2024/1/24 18:14
 * @description：
 * @modified By：
 * @version:
 */
public class Cat extends Animal{
    public void accept(Execute exe){
        exe.execute(this);
    }
}
