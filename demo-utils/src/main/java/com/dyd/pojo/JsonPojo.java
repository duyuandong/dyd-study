package com.dyd.pojo;

import java.util.Date;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.JsonPojo
 * @date ：Created in 2021/12/21 16:48
 * @description：
 * @modified By：
 * @version:
 */
public class JsonPojo {

  private Integer id;

  private String username;

  private String telNo;

  private Date dql;

  public Date getDql() {
    return dql;
  }

  public void setDql(Date dql) {
    this.dql = dql;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getTelNo() {
    return telNo;
  }

  public void setTelNo(String telNo) {
    this.telNo = telNo;
  }

  public JsonPojo(Integer id, String username, String telNo) {
    this.id = id;
    this.username = username;
    this.telNo = telNo;
  }

  public JsonPojo(Integer id, String username, String telNo, Date dql) {
    this.id = id;
    this.username = username;
    this.telNo = telNo;
    this.dql = dql;
  }
}
