package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.TFCardImpl
 * @date ：Created in 2024/1/19 14:27
 * @description：
 * @modified By：
 * @version:
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :"+msg);
    }
}
