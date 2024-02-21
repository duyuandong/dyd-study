package com.dyd.design.heima.shejiyuanze.yilaidaozhuan.before;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.yilaidaozhuan.before.Computer
 * @date ：Created in 2024/1/15 14:30
 * @description：电脑类
 * @modified By：
 * @version:
 */
public class Computer {
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("get data:"+data);
        cpu.run();
        memory.save();
    }
}
