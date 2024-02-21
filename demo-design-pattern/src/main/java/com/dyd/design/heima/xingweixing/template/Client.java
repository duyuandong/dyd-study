package com.dyd.design.heima.xingweixing.template;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.template.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/22 11:44
 * @description：炒菜  (模版方法 反向控制 列如:InputStream类)
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass ab = new ConcreteClass_BaoCai();
        ab.cookProcess();

        System.out.println("======================");
        AbstractClass ab2 = new ConcreteClass_CaiXin();
        ab2.cookProcess();
    }
}
