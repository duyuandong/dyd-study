package mq;

import java.io.IOException;

/**
 * @author ：duyd@segimail.com
 * @class ：mq.ReadTest
 * @date ：Created in 2024/3/7 15:42
 * @description：
 * @modified By：
 * @version:
 */
public class ReadTest {
    public static void main(String[] args) {
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("是啥");
    }
}
