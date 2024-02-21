package com.dyd.design.heima.xingweixing.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.command.xingweixing.heima.design.Waitor
 * @date ：Created in 2024/1/22 15:05
 * @description：请求者类
 * @modified By：
 * @version:
 */
public class Waitor {
    private List<Command> list = new ArrayList<>();
    
    public void setCommand(Command cmd){
        list.add(cmd);
    }
    
    public void orderUp(){
        System.out.println("美女服务员: 大厨,新订单来了...");
        for (Command command : list) {
            if(command != null){
                command.execute();
            }
        }
    }
}
