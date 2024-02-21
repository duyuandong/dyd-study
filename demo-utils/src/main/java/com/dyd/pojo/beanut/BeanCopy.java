package com.dyd.pojo.beanut;

import com.example.demo.pojo.MeterAttr;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.beanut.BeanCopy
 * @date ：Created in 2022/5/11 18:49
 * @description：
 * @modified By：
 * @version:
 */
public class BeanCopy {

  private String age;

  private MeterAttr meterAttr;

  public BeanCopy(String age, MeterAttr meterAttr) {
    this.age = age;
    this.meterAttr = meterAttr;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public MeterAttr getMeterAttr() {
    return meterAttr;
  }

  public void setMeterAttr(MeterAttr meterAttr) {
    this.meterAttr = meterAttr;
  }
}
