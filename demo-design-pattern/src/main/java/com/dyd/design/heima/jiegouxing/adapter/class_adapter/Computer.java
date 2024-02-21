package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.Computer
 * @date ：Created in 2024/1/19 14:32
 * @description：
 * @modified By：
 * @version:
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sdCard is not null");
        }
        return sdCard.readSD();
    }
}
