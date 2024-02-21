package com.dyd.design.heima.chuangjianzhe.single.demo4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.chuangjianzhe.danli.demo4.Client
 * @date ：Created in 2024/1/16 14:42
 * @description： 测试序列化/反序列化破坏单例模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) throws Exception{
//        writeFile();
        readFile();
        readFile();
    }

    public static void readFile() throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/dyd-work/project/demo-service/src/main/java/com/spring/demo/design/heima/chuangjianzhe/danli/demo4/dyd.txt"));
        Singleton instance = (Singleton)ois.readObject();
        System.out.println(instance);
        ois.close();
    }

    public static void writeFile() throws Exception{

        Singleton instance = Singleton.getInstance(); //会进行序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/dyd-work/project/demo-service/src/main/java/com/spring/demo/design/heima/chuangjianzhe/danli/demo4/dyd.txt"));
        oos.writeObject(instance);
        oos.close();
    }
}
