package com.dyd.design.heima.xingweixing.visitor.shuangfenpai;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.shuangfenpai.visitor.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/24 18:17
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        Execute execute = new Execute();
        a.accept(execute);
        d.accept(execute);
        c.accept(execute);
    }
}
