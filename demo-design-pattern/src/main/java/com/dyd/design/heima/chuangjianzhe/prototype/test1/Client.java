package com.dyd.design.heima.chuangjianzhe.prototype.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.demo.prototype.chuangjianzhe.heima.design.Client
 * @date ：Created in 2024/1/18 15:14
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();

        //写名字
       /* clone.setName("小明");
        clone.show();

        citation.setName("小红");
        citation.show();*/

        Student stu = new Student();
        stu.setName("小明");
        citation.setStu(stu);

        //使用序列化操作可以使原型对象克隆后的 原引用数据不发生变化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\dyd-work\\project\\demo-service\\src\\main\\java\\com\\spring\\demo\\design\\heima\\chuangjianzhe\\prototype\\test1\\dyd.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\dyd-work\\project\\demo-service\\src\\main\\java\\com\\spring\\demo\\design\\heima\\chuangjianzhe\\prototype\\test1\\dyd.txt"));
        Citation clone = (Citation)ois.readObject();
        ois.close();
        clone.getStu().setName("小黄");

        citation.show();
        clone.show();
    }
}
