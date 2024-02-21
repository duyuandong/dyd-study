package com.dyd.design.heima.xingweixing.mediator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.mediator.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/24 11:39
 * @description：中介者模式  房屋中介案例
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure ms = new MediatorStructure();
        //创建租房者对象
        Tenant te = new Tenant("李四",ms);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",ms);

        //中介者要知道具体的房主和租客
        ms.setHouseOwner(houseOwner);
        ms.setTenant(te);

        te.constact("我要租三居室的房子!!!");
        houseOwner.constact("我这里有三居室的房子,你要租吗?");
    }
}
