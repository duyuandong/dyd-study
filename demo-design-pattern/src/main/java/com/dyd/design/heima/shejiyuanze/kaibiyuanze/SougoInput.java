package com.dyd.design.heima.shejiyuanze.kaibiyuanze;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.openclose.SougoInput
 * @date ：Created in 2024/1/11 16:58
 * @description：sougo输入
 * @modified By：
 * @version:
 */
public class SougoInput {
    private  AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.displaySkin();
    }
}
