package com.dyd.model;

import java.util.List;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.charge.dto.ParkingPushMsgDto
 * @date ：Created in 2022/8/12 15:08
 * @description：
 * @modified By：
 * @version:
 */
public class ParkingPushMsgDto {

    private Integer changeType;

    private String cardId;

    private List<Map<String,String>> carList;

    private String parkingIds;

    private String communityId;

    private String cardCode;

    private String cardTypeId;

    private String cardTypeCode;

    private String cardTypeName;

    private String parkingCode;

    private String authAreaIds;

    private Integer isPropertyCar;

    private String effDate;

    private String expDate;

    private String paid;

    private String payMonth;

    private String payMethod;

    private String paySerial;

    private String payDate;

    private String userName;

    private String mobile;

    private String roomNo;

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public List<Map<String,String>> getCarList() {
        return carList;
    }

    public void setCarList(List<Map<String,String>> carList) {
        this.carList = carList;
    }

    public String getParkingIds() {
        return parkingIds;
    }

    public void setParkingIds(String parkingIds) {
        this.parkingIds = parkingIds;
    }

    public String getAuthAreaIds() {
        return authAreaIds;
    }

    public void setAuthAreaIds(String authAreaIds) {
        this.authAreaIds = authAreaIds;
    }

    public Integer getIsPropertyCar() {
        return isPropertyCar;
    }

    public void setIsPropertyCar(Integer isPropertyCar) {
        this.isPropertyCar = isPropertyCar;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeCode() {
        return cardTypeCode;
    }

    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public String getParkingCode() {
        return parkingCode;
    }

    public void setParkingCode(String parkingCode) {
        this.parkingCode = parkingCode;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getPaySerial() {
        return paySerial;
    }

    public void setPaySerial(String paySerial) {
        this.paySerial = paySerial;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
