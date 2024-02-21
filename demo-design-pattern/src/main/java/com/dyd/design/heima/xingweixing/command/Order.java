package com.dyd.design.heima.xingweixing.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.command.xingweixing.heima.design.Order
 * @date ：Created in 2024/1/22 14:58
 * @description：接收者类 (订单类)
 * @modified By：
 * @version:
 */
public class Order {
    //餐桌号码
    private int diningTable;
    //餐品及份数
    private Map<String,Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name,int num) {
        foodDic.put(name,num);
    }
}
