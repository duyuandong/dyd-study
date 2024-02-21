package com.dyd.design.heima.xingweixing.command;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.command.xingweixing.heima.design.SeniorChef
 * @date ：Created in 2024/1/22 15:00
 * @description：接收者类
 * @modified By：
 * @version:
 */
public class SeniorChef {
    public void makeFood(int num,String foodName){
        System.out.println("\t"+foodName+" : " +num +" 份");
    }
}
