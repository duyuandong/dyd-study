package com.dyd.test;

import com.dyd.pojo.MeterAttr;
import com.dyd.pojo.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.StreamAdd
 * @date ：Created in 2021/7/1 11:08
 * @description：
 * @modified By：
 * @version:
 */
public class StreamAdd {
  public static void main(String[] args) {
    List<Test> testList = new ArrayList<>();

    List<MeterAttr> meterAttrs = new ArrayList<>();
    MeterAttr meterAttr1 = new MeterAttr("key1", 2.00);
    MeterAttr meterAttr2 = new MeterAttr("key2", 2.00);
    MeterAttr meterAttr3 = new MeterAttr("key3", 2.00);
    meterAttrs.add(meterAttr1);
    meterAttrs.add(meterAttr2);
    meterAttrs.add(meterAttr3);
    Test test1 = new Test(1, 2.0, meterAttrs);
    testList.add(test1);

    List<MeterAttr> meterAttrs2 = new ArrayList<>();
    MeterAttr meterAttr4 = new MeterAttr("key1", 4.00);
    MeterAttr meterAttr5 = new MeterAttr("key2", 4.00);
    MeterAttr meterAttr6 = new MeterAttr("key3", 4.00);
    meterAttrs2.add(meterAttr4);
    meterAttrs2.add(meterAttr5);
    meterAttrs2.add(meterAttr6);
    Test test2 = new Test(2, 3.0, meterAttrs2);
    testList.add(test2);

    List<MeterAttr> meterAttrs3 = new ArrayList<>();
    MeterAttr meterAttr7 = new MeterAttr("key1", 5.00);
    MeterAttr meterAttr8 = new MeterAttr("key2", 6.00);
    MeterAttr meterAttr9 = new MeterAttr("key3", 6.00);
    meterAttrs3.add(meterAttr7);
    meterAttrs3.add(meterAttr8);
    meterAttrs3.add(meterAttr9);
    Test test3 = new Test(3, 1.0, meterAttrs3);
    testList.add(test3);

    String[] names = {"key1", "key2", "key3"};

    DoubleStream key1 =
        testList.stream()
            .mapToDouble(
                i ->
                    (i.getMeterAttrList().stream()
                            .filter(k -> k.getName().equals("key1"))
                            .mapToDouble(k -> k.getScore() * i.getRate()))
                        .sum());
    double sum = key1.sum();
    System.out.println(sum);
  }
}
