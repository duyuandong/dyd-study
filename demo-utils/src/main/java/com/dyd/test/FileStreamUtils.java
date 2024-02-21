package com.dyd.test;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.FileStreamUtils
 * @date ：Created in 2021/11/26 16:57
 * @description：
 * @modified By：
 * @version:
 */
public class FileStreamUtils implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("资源关闭");
    }

    public void doSomething(){
        System.out.println("do do do!");
    }
}
