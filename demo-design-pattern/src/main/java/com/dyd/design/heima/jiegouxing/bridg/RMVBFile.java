package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.RMVBFile
 * @date ：Created in 2024/1/19 16:43
 * @description：rmvb视频文件(具体实现化角色)
 * @modified By：
 * @version:
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("解码RMVB文件:"+fileName);
    }
}
