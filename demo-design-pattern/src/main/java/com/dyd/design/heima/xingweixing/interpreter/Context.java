package com.dyd.design.heima.xingweixing.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.interpreter.xingweixing.heima.design.Context
 * @date ：Created in 2024/1/25 13:54
 * @description：环境角色类
 * @modified By：
 * @version:
 */
public class Context {
    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable var,Integer value){
        map.put(var,value);
    }

    public int getValue(Variable var){
        return map.get(var);
    }
}
