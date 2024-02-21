package com.dyd.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.OneMonth
 * @date ：Created in 2021/5/14 11:58
 * @description：
 * @modified By：
 * @version:
 */
public class OneMonth {
    Object replaceDate;
    public static void main(String[] args) {
      //  System.out.println(OneMonth.getOneMonthMoney());

        Object replaceDate;
        Date date = new Date();
        OneMonth oneMonth = new OneMonth();
        oneMonth.setReplaceDate(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String format = simpleDateFormat.format(oneMonth.getReplaceDate());
        replaceDate = format;

        System.out.println(replaceDate);
    }

    public Object getReplaceDate() {
        return replaceDate;
    }

    public void setReplaceDate(Object replaceDate) {
        this.replaceDate = replaceDate;
    }

    public static String getOneMonthMoney(){
        BigDecimal bigDecimal = new BigDecimal(0.01);
        for (int i = 0; i < 30; i++) {
            bigDecimal = bigDecimal.multiply(new BigDecimal(2));
        }
        return bigDecimal.setScale(4,BigDecimal.ROUND_HALF_UP).toPlainString();
    }

}
