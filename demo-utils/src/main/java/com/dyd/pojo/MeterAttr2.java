package com.dyd.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.MeterAttr
 * @date ：Created in 2021/7/1 11:12
 * @description：
 * @modified By：
 * @version:
 */
public class MeterAttr2 implements Serializable {

  private BigDecimal name;

  private Double score;

  private String ak;

  private String url;

  public MeterAttr2(BigDecimal name, Double score, String url) {
    this.name = name;
    this.score = score;
    this.url = url;
  }

  public MeterAttr2() {}

  public String getAk() {
    return ak;
  }

  public void setAk(String ak) {
    this.ak = ak;
  }

  public BigDecimal getName() {
    return name;
  }

  public void setName(BigDecimal name) {
    this.name = name;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
