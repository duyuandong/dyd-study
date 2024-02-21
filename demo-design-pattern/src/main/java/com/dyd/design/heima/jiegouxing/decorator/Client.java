package com.dyd.design.heima.jiegouxing.decorator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.decorator.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 15:50
 * @description：快餐店点餐
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() +":"+ food.cost() + "元");
        //在上面加个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() +":"+ food.cost() + "元");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() +":"+ food.cost() + "元");
        //再加一根培根
        food = new Bacon(food);
        System.out.println(food.getDesc() +":"+ food.cost() + "元");
        //new BufferedWriter new BufferedInputStream()

    }
}
