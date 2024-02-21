package com.dyd.design.heima.jiegouxing.adapter.obj_adapter;



/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.class_adapter.adapter.jiegouxing.heima.design.SDAdapterTF
 * @date ：Created in 2024/1/19 14:31
 * @description： 这里对象适配器 直接就不继承TF实现类 ,直接用对象引用就可以适配
 * @modified By：
 * @version:
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
