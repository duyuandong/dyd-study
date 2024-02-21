package com.dyd.design.heima.shejiyuanze.jiekougeliyuanze.after;

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
        DydcSafetyDoor safetyDoor = new DydcSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireProof();
        safetyDoor.waterProof();

        // DydbSafetyDoor safetyDoor = new DydbSafetyDoor();
        DydbSafetyDoor dydbSafetyDoor = new DydbSafetyDoor();
        dydbSafetyDoor.antiTheft();
        dydbSafetyDoor.fireProof();
    }
}
