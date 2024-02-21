package com.dyd.design.heima.chuangjianzhe.prototype.demo;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo.prototype.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/18 15:14
 * @description：
 *              对象的创建非常复杂，可以使用原型模式快捷的创建对象
 *              性能和安全要求比较高.
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println("克隆对象是否是构造而来?(true or false):"+ (realizetype == clone));
    }
}
