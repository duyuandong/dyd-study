package com.dyd.pojo;

import java.io.Serializable;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.MeterAttr
 * @date ：Created in 2021/7/1 11:12
 * @description：
 * @modified By：
 * @version:
 */
public class MeterAttr implements Serializable, Cloneable {

  private String name;

  private Double score;

  private Long ak;

  public MeterAttr(String name, Double score) {
    this.name = name;
    this.score = score;
  }

  public MeterAttr() {};

  public Long getAk() {
    return ak;
  }

  public void setAk(Long ak) {
    this.ak = ak;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }
}
