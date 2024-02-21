package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.SDAdapterTF
 * @date ：Created in 2024/1/19 14:31
 * @description：适配者
 * @modified By：
 * @version:
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        return this.readTF();
    }

    @Override
    public void writeSD(String msg) {
        this.writeTF(msg);
    }
}
