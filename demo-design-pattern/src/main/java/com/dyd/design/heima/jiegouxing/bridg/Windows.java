package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.Windows
 * @date ：Created in 2024/1/19 16:46
 * @description：扩展抽象化角色
 * @modified By：
 * @version:
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
        //System.out.println("windows系统打开:"+fileName);
    }
}
