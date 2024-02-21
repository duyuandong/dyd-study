package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.Mac
 * @date ：Created in 2024/1/19 16:47
 * @description：扩展抽象化角色
 * @modified By：
 * @version:
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
        //System.out.println("Mac系统打开文件:"+fileName);
    }
}
