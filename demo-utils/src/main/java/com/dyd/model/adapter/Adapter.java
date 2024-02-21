package com.dyd.model.adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.model.adapter.Adapter
 * @date ：Created in 2021/12/29 15:15
 * @description：
 * @modified By：
 * @version:
 */
public class Adapter extends Source implements  Tigger {
    @Override
    public void getDog() {
        System.out.println("get one dog");
    }
}
