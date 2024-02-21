package com.dyd.design.heima.jiegouxing.bridg;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.bridg.jiegouxing.heima.design.Client
 * @date ：Created in 2024/1/19 16:38
 * @description：桥接模式  跨平台播放器
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建mac系统对象
        OperatingSystem mac = new Mac(new AVIFile());

        //使用
        mac.play("<战狼2>");
    }
}
