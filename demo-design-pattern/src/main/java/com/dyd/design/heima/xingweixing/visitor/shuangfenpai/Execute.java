package com.dyd.design.heima.xingweixing.visitor.shuangfenpai;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.shuangfenpai.visitor.xingweixing.heima.design.Execute
 * @date ：Created in 2024/1/24 18:15
 * @description：
 * @modified By：
 * @version:
 */
public class Execute {
    public void execute(Animal a){
        System.out.println("animal");
    }
    public void execute(Dog d){
        System.out.println("dog");
    }
    public void execute(Cat c){
        System.out.println("cat");
    }
}
