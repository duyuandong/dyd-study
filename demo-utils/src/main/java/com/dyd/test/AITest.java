package com.dyd.test;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.AITest
 * @date ：Created in 2023/12/4 17:04
 * @description：
 * @modified By：
 * @version:
 */
public class AITest {
    //判断一个字符串是否是邮箱
    public static boolean isEmail(String email) {
        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(AITest.isEmail("1582qq.com"));

    }

}
