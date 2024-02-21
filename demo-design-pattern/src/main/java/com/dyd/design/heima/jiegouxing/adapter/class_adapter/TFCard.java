package com.dyd.design.heima.jiegouxing.adapter.class_adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.TFCard
 * @date ：Created in 2024/1/19 14:26
 * @description：适配者接口
 * @modified By：
 * @version:
 */
public interface TFCard {
    String readTF();
    void writeTF(String msg);
}
