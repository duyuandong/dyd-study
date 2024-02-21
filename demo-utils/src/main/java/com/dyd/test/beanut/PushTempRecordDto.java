package com.dyd.test.beanut;

/**
 * @author zhangyang@segimail.com
 * @title: PushTempRecordDto
 * @projectName 3.3.6
 * @description: 临停上报
 * @date 2020/3/13 0013下午 6:55
 */
public class PushTempRecordDto {
  private String communityId;
  private String carParkingId;
  private String carParkingCode;
  private String carNo;
  private String custId;
  private String orderId;
  private String inTime;
  private String outTime;
  private String stayTime;
  private String money;
  private String offset;
  private String finalMoney;
  // 缴费方式：1现金，2微信，3支付宝，4其他
  private String payType;
  private String payDate;

  private String userName;
  private String telNo;
  // 是否是临停车，有些厂商的接口临停和月卡费用混合了。
  private String isTempCar;

  public String getPayDate() {
    return payDate;
  }

  public void setPayDate(String payDate) {
    this.payDate = payDate;
  }

  public String getIsTempCar() {
    return isTempCar;
  }

  public void setIsTempCar(String isTempCar) {
    this.isTempCar = isTempCar;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getTelNo() {
    return telNo;
  }

  public void setTelNo(String telNo) {
    this.telNo = telNo;
  }

  public String getCommunityId() {
    return communityId;
  }

  public void setCommunityId(String communityId) {
    this.communityId = communityId;
  }

  public String getCarParkingId() {
    return carParkingId;
  }

  public void setCarParkingId(String carParkingId) {
    this.carParkingId = carParkingId;
  }

  public String getCarParkingCode() {
    return carParkingCode;
  }

  public void setCarParkingCode(String carParkingCode) {
    this.carParkingCode = carParkingCode;
  }

  public String getCarNo() {
    return carNo;
  }

  public void setCarNo(String carNo) {
    this.carNo = carNo;
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getInTime() {
    return inTime;
  }

  public void setInTime(String inTime) {
    this.inTime = inTime;
  }

  public String getOutTime() {
    return outTime;
  }

  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }

  public String getStayTime() {
    return stayTime;
  }

  public void setStayTime(String stayTime) {
    this.stayTime = stayTime;
  }

  public String getMoney() {
    return money;
  }

  public void setMoney(String money) {
    this.money = money;
  }

  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public String getFinalMoney() {
    return finalMoney;
  }

  public void setFinalMoney(String finalMoney) {
    this.finalMoney = finalMoney;
  }

  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  @Override
  public String toString() {
    return "PushTempRecordDto{"
        + "communityId='"
        + communityId
        + '\''
        + ", carParkingId='"
        + carParkingId
        + '\''
        + ", carParkingCode='"
        + carParkingCode
        + '\''
        + ", carNo='"
        + carNo
        + '\''
        + ", custId='"
        + custId
        + '\''
        + ", orderId='"
        + orderId
        + '\''
        + ", inTime='"
        + inTime
        + '\''
        + ", outTime='"
        + outTime
        + '\''
        + ", stayTime='"
        + stayTime
        + '\''
        + ", money='"
        + money
        + '\''
        + ", offset='"
        + offset
        + '\''
        + ", finalMoney='"
        + finalMoney
        + '\''
        + ", payType='"
        + payType
        + '\''
        + '}';
  }
}
