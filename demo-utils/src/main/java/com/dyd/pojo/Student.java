package com.dyd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.Student
 * @date ：Created in 2022/2/18 17:49
 * @description：
 * @modified By：
 * @version:
 */
@Data
@AllArgsConstructor
public class Student {
  private String name;
  private Integer age;
  private Boolean isMan;
  private Float hight; // 米
  private String likeFood;
}
