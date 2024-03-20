package com.dyd.test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.CalculateBit
 * @date ：Created in 2021/5/17 16:31
 * @description：计算场馆卖票总价
 * @modified By：
 * @version:
 */
public class CalculateBit {

    //票价
    private static int[] tickets = {280,380,480,680,980,1280,1680};

    //场馆容量
    private static int capacity = 30000;

    private static final BigDecimal sumT = new BigDecimal(10000) ;
    public static void main(String[] args) {
        int sum = sumT.intValue();
        int changes = 1;
        BigDecimal currentNum;
        BigDecimal bigDecimal = new BigDecimal(0);
        BigDecimal bigDecimal1 = new BigDecimal(capacity);
        int money = 0;
        for (int i = 0; i < tickets.length; i++) {
            if(i == (tickets.length-1)) {
                BigDecimal sumBd = new BigDecimal(sum);
                currentNum = sumBd.divide(sumT).setScale(4,BigDecimal.ROUND_HALF_UP);
                bigDecimal = bigDecimal.add(currentNum);
                money = new BigDecimal(money).add(bigDecimal1.multiply(currentNum).multiply(new BigDecimal(tickets[i]))).intValue();
                break;
            }
            System.out.println("随机区间：【"+(changes)+","+sum+"】 单价:【"+tickets[i]+"】");
            int  intRandom = getDoubleRandom(changes, sum);
            sum = sum - intRandom;
            BigDecimal intRandomBd = new BigDecimal(intRandom);
            currentNum = intRandomBd.divide(sumT).setScale(4,BigDecimal.ROUND_HALF_UP);
            System.out.println("随机占比率:"+currentNum);
            bigDecimal = bigDecimal.add(currentNum);
            money = new BigDecimal(money).add(bigDecimal1.multiply(currentNum).multiply(new BigDecimal(tickets[i]))).intValue();
            System.out.println("------------------------");
        }
        System.out.println("=======================");
        System.out.println(bigDecimal);
        System.out.println("总金额：￥："+money+" 元");
    }


    public static int getDoubleRandom(int startNum,int finishNum){
        Random random = new Random();
        return (random.nextInt(finishNum-startNum)+startNum);
    }
}
