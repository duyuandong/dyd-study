package com.dyd.design.heima.shejiyuanze.jiekougeliyuanze.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.jiekougeli.before.SafetyDoorDemo
 * @date ：Created in 2024/1/15 15:14
 * @description：
 * @modified By：
 * @version:
 */
public class SafetyDoorDemo {
    public static void main(String[] args) {
        DydSafetyDoor dydSafetyDoor = new DydSafetyDoor();
        dydSafetyDoor.antiTheft();
        dydSafetyDoor.fireProof();
        dydSafetyDoor.waterProof();
    }
}
