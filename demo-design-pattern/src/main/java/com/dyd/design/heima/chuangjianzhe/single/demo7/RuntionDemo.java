package com.dyd.design.heima.chuangjianzhe.single.demo7;


import java.io.InputStream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo7.RuntionDemo
 * @date ：Created in 2024/1/17 15:53
 * @description：测试runtime使用了 单例模式
 * @modified By：
 * @version:
 */
public class RuntionDemo {

    public static void main(String[] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process ipConfig = runtime.exec("ipconfig");
        InputStream is = ipConfig.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        int len = is.read(arr);//返回读到的字节个数
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
