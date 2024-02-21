package com.dyd.model.adapter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.model.adapter.Wapper
 * @date ：Created in 2021/12/29 15:18
 * @description：
 * @modified By：
 * @version:
 */
public class Wrapper implements Tigger {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void getCat() {
        source.getCat();
    }

    @Override
    public void getDog() {
        System.out.println("get two dogs");
    }
}
