package com.dyd.test;

import java.util.Calendar;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.TestCalendar
 * @date ：Created in 2021/8/23 15:05
 * @description：
 * @modified By：
 * @version:
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.set(2020,0,31);
        System.out.println(cal.getTime());
        cal.add(Calendar.MONTH,1);
        System.out.println(cal.getTime());
    }
}
