package com.dyd.test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.CalculateBit
 * @date ：Created in 2021/5/17 16:31
 * @description：
 * @modified By：
 * @version:
 */
public class CalculateBit {

    private static int[] tickets = {280,380,480,680,980,1280,1680};

    private static int capacity = 30000;

    private static final BigDecimal sumT = new BigDecimal(100000000) ;
    public static void main(String[] args) {
        int sum = 100000000;
        int changes = 1;
        BigDecimal currentNum;
        BigDecimal bigDecimal = new BigDecimal(0);
        BigDecimal bigDecimal1 = new BigDecimal(capacity);
        int money = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i == (tickets.length-1)) {
                BigDecimal sumBd = new BigDecimal(sum);
                System.out.println(sumBd);
                System.out.println(sumT);
                currentNum = sumBd.divide(sumT).setScale(4,BigDecimal.ROUND_HALF_UP);
                System.out.println(currentNum);
                bigDecimal = bigDecimal.add(currentNum);
                money = new BigDecimal(money).add(bigDecimal1.multiply(currentNum).multiply(new BigDecimal(tickets[i]))).intValue();
                break;
            }
            int  intRandom = getDoubleRandom(changes, sum);
            sum = sum - intRandom;
            BigDecimal intRandomBd = new BigDecimal(intRandom);
            System.out.println(intRandomBd);
            System.out.println(sumT);
            currentNum = intRandomBd.divide(sumT).setScale(4,BigDecimal.ROUND_HALF_UP);
            System.out.println(currentNum);
            bigDecimal = bigDecimal.add(currentNum);
            money = new BigDecimal(money).add(bigDecimal1.multiply(currentNum).multiply(new BigDecimal(tickets[i]))).intValue();
        }
        System.out.println("=======================");
        System.out.println(bigDecimal);
        System.out.println("总金额：￥："+money+" 元");
    }


    public static int getDoubleRandom(int startNum,int finishNum){
        System.out.println("区间：【"+(startNum)+","+finishNum+"】");
        Random random = new Random();
        return (random.nextInt(finishNum-startNum)+startNum);
    }
}
