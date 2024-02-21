package com.dyd.design.heima.chuangjianzhe.prototype.demo;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo.prototype.chuangjianzhe.heima.design.Realizetype
 * @date ：Created in 2024/1/18 15:14
 * @description：克隆类
 * @modified By：
 * @version:
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("构造对象");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("克隆对象");
        return (Realizetype)super.clone();
    }
}
