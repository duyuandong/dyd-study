package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.AVIFile
 * @date ：Created in 2024/1/19 16:42
 * @description：avi视频文件(具体实现化角色)
 * @modified By：
 * @version:
 */
public class AVIFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("解码AVI文件:"+fileName);
    }
}
