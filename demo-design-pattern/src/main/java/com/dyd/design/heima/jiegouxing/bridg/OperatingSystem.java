package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.OperatingSystem
 * @date ：Created in 2024/1/19 16:44
 * @description：操作系统类 (抽象化角色)
 * @modified By：
 * @version:
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String fileName);
}
