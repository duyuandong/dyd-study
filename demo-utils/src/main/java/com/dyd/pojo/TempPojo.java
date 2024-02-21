package com.dyd.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.TempPojo
 * @date ：Created in 2023/4/24 16:06
 * @description：
 * @modified By：
 * @version:
 */
@Getter
@Setter
@EqualsAndHashCode
public class TempPojo {
  private String orderNo;
  private String carNo;
  private String inTime;
  private String outTime;
  private String payType;
  private String payAmount;
  private String stayMin;
}
