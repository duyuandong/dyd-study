/*
 * ***************************************************************************************
 * Copyright (c) 2015.
 * Shenzhen SEGI information technology co., LTD
 * All rights reserved.
 * ****************************************************************************************
 */

package com.dyd.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/** ******* 车场异常接口类 */
@SuppressWarnings("serial")
public class ParkingException extends RuntimeException {

  private Throwable wrappedThrowable = null;

  private String code;

  public ParkingException() {
    super();
  }

  public ParkingException(String code, String message) {
    super(message);
    this.code = code;
  }

  public ParkingException(String message) {
    super(message);
  }

  public ParkingException(Throwable wrappedThrowable) {
    super();
    this.wrappedThrowable = wrappedThrowable;
  }

  public ParkingException(String message, Throwable wrappedThrowable) {
    super(message);
    this.wrappedThrowable = wrappedThrowable;
  }

  public Throwable getWrappedThrowable() {
    return wrappedThrowable;
  }

  public void printStackTrace() {
    printStackTrace(System.err);
  }

  public void printStackTrace(PrintStream out) {
    super.printStackTrace(out);
    if (wrappedThrowable != null) {
      out.println("Nested Exception: ");
      wrappedThrowable.printStackTrace(out);
    }
  }

  public void printStackTrace(PrintWriter out) {
    super.printStackTrace(out);
    if (wrappedThrowable != null) {
      out.println("Nested Exception: ");
      wrappedThrowable.printStackTrace(out);
    }
  }

  public String getCode() {
    return code;
  }

  public String toString() {
    StringBuilder buf = new StringBuilder();
    String message = super.getMessage();
    if (message != null) {
      buf.append(message).append(": ");
    }
    if (wrappedThrowable != null) {
      buf.append("\n  -- caused by: ").append(wrappedThrowable);
    }

    return buf.toString();
  }

  public enum ErrorEnum {
    PARKING_ADD_CUST("200011", "车场调用新增客户接口失败!"),
    PARKING_UPDATE_CUST("200011", "车场调用修改客户接口失败!"),
    PARKING_CARD_CODE_REPETITION("200012", "卡编码已被使用,请重新输入"),
    PARKING_REL_HAVEN_EXIST("200013", "车已存在绑定关系"),
    PARKING_CAR_CARD_FORBID_CHANGE("200014", "车辆跟车卡不能同时变更"),
    PARKING_CARD_NOT_EXIST("200015", "月卡信息不存在"),
    PARKING_CARD_PLACE_ID_NOT_EXIST("200016", "月卡placeId不存在"),
    PAY_INFO_NOT_EXIST("200017", "找不到相应欠费信息,缴费失败!"),
    CARD_CAR_REL_NOT_EXIST("200018", "月卡车辆关系信息不存在"),
    CARD_CAR_NOT_EXIST("200019", "月卡车辆信息不存在"),
    CAR_NO_EXIST("200020", "车牌号已重复，不能重新添加"),
    CARD_USE_EXP_DATE_NULL("200021", "月卡有效期不能为空"),
    PARKING_USED("200022", "车位已经被占用");

    private String code;

    private String message;

    ErrorEnum(String code, String message) {
      this.code = code;
      this.message = message;
    }

    public String getCode() {
      return code;
    }

    public String getMessage() {
      return message;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("ErrorEnum{");
      sb.append("code=").append(code);
      sb.append(", message='").append(message).append('\'');
      sb.append('}');
      return sb.toString();
    }
  }
}
