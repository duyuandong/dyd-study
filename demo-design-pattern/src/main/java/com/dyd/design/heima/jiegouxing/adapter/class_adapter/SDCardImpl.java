package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.SDCardImpl
 * @date ：Created in 2024/1/19 14:30
 * @description：
 * @modified By：
 * @version:
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg :"+msg);
    }
}
