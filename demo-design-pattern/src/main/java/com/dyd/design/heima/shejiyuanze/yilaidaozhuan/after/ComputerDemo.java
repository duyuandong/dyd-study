package com.dyd.design.heima.shejiyuanze.yilaidaozhuan.after;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.yilaidaozhuan.before.ComputerDemo
 * @date ：Created in 2024/1/15 14:44
 * @description：
 * @modified By：
 * @version:
 */
public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk xiJieHardDisk = new XiJieHardDisk();
        Cpu intelCpu = new IntelCpu();
        Memory kingstonMemory = new KingstonMemory();
        //创建计算机
        Computer computer = new Computer();
        //组装
        computer.setCpu(intelCpu);
        computer.setHardDisk(xiJieHardDisk);
        computer.setMemory(kingstonMemory);

        //运行计算机
        computer.run();
    }
}
