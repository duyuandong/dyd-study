package com.dyd.design.heima.shejiyuanze.jiekougeliyuanze.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.jiekougeli.before.DydSafetyDoor
 * @date ：Created in 2024/1/15 15:13
 * @description：
 * @modified By：
 * @version:
 */
public class DydcSafetyDoor implements AntiTheft, FireProof, WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

}
