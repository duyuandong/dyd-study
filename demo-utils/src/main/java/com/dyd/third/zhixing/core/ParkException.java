package com.dyd.third.zhixing.core;

public class ParkException extends RuntimeException {
  private static final long serialVersionUID = -5672517280024121392L;
  private String errCode;
  private String errDescription;
  private transient Exception rootException;

  public ParkException(String code, String desc) {
    this(code, desc, null);
  }

  public ParkException(String code, String desc, Exception ex) {
    super(desc);
    this.errCode = code;
    this.errDescription = desc;
    this.rootException = ex;
  }

  public String getErrCode() {
    return errCode;
  }

  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  public String getErrDescription() {
    return errDescription;
  }

  public void setErrDescription(String errDescription) {
    this.errDescription = errDescription;
  }

  public Exception getRootException() {
    return rootException;
  }

  public void setRootException(Exception rootException) {
    this.rootException = rootException;
  }
}
