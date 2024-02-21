package com.dyd.design.heima.jiegouxing.flyweight;

import java.util.HashMap;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.flyweight.jiegouxing.heima.design.BoxFactory
 * @date ：Created in 2024/1/22 11:01
 * @description：
 * @modified By：
 * @version:
 */
public class BoxFactory {

    private static BoxFactory factory = new BoxFactory();

    private HashMap<String,AbstractBox> map;
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }

    public static BoxFactory getInstance(){
        return factory;
    }
}
