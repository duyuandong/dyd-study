package com.dyd.pojo;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.pojo.VendorKeyDto
 * @date ：Created in 2022/3/18 9:15
 * @description：
 * @modified By：
 * @version:
 */
public class VendorKeyDto {
  private String appId;

  private String privateKey;

  private String vendorVal;

  public VendorKeyDto() {
    System.out.println("加载VendorKeyDto构造");
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public String getVendorVal() {
    return vendorVal;
  }

  public void setVendorVal(String vendorVal) {
    this.vendorVal = vendorVal;
  }

  @Override
  public String toString() {
    return "VendorKeyDto{"
        + "appId='"
        + appId
        + '\''
        + ", privateKey='"
        + privateKey
        + '\''
        + ", vendorVal='"
        + vendorVal
        + '\''
        + '}';
  }
}
