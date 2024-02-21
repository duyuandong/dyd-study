package com.dyd.design.heima.shejiyuanze.jiekougeliyuanze.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.jiekougeli.after.DydbSafetyDoor
 * @date ：Created in 2024/1/15 15:22
 * @description：
 * @modified By：
 * @version:
 */
public class DydbSafetyDoor implements AntiTheft, FireProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
