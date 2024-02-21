package com.dyd.model;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.charge.dto.BillInfoDto
 * @date ：Created in 2023/2/28 10:27
 * @description：
 * @modified By：
 * @version:
 */
public class BillInfoDto {

    private String detailId;//账单ID
    private String custId;//客户ID
    private String custName;//客户名称
    private String houseId;//房屋ID
    private String feeItemTypeId;//费用科目ID
    private String feeItemName;//费用科目名称
    private String fee;//欠费金额，单位：分
    private String lfree; //滞纳金，单位：分
    private String amount;//用量/面积
    private String billStart;//费用时段-开始时间 yyyyMMddHHssmm
    private String billEnd;//费用时段-结束时间 yyyyMMddHHssmm
    private String billingCycle;//账期
    private String initVal;//上次读数
    private String endVal;//本次读数
    private String totalFee;//账单总金额，单位：分
    private String rateStr;//单价
    private String payLimitId; //账单状态
    private String payLimitName;//账单状态名称

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getFeeItemTypeId() {
        return feeItemTypeId;
    }

    public void setFeeItemTypeId(String feeItemTypeId) {
        this.feeItemTypeId = feeItemTypeId;
    }

    public String getFeeItemName() {
        return feeItemName;
    }

    public void setFeeItemName(String feeItemName) {
        this.feeItemName = feeItemName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getLfree() {
        return lfree;
    }

    public void setLfree(String lfree) {
        this.lfree = lfree;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBillStart() {
        return billStart;
    }

    public void setBillStart(String billStart) {
        this.billStart = billStart;
    }

    public String getBillEnd() {
        return billEnd;
    }

    public void setBillEnd(String billEnd) {
        this.billEnd = billEnd;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getInitVal() {
        return initVal;
    }

    public void setInitVal(String initVal) {
        this.initVal = initVal;
    }

    public String getEndVal() {
        return endVal;
    }

    public void setEndVal(String endVal) {
        this.endVal = endVal;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getRateStr() {
        return rateStr;
    }

    public void setRateStr(String rateStr) {
        this.rateStr = rateStr;
    }

    public String getPayLimitId() {
        return payLimitId;
    }

    public void setPayLimitId(String payLimitId) {
        this.payLimitId = payLimitId;
    }

    public String getPayLimitName() {
        return payLimitName;
    }

    public void setPayLimitName(String payLimitName) {
        this.payLimitName = payLimitName;
    }

    @Override
    public String toString() {
        return "BillInfoDto{" +
                "detailId='" + detailId + '\'' +
                ", custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", houseId='" + houseId + '\'' +
                ", feeItemTypeId='" + feeItemTypeId + '\'' +
                ", feeItemName='" + feeItemName + '\'' +
                ", fee='" + fee + '\'' +
                ", lfree='" + lfree + '\'' +
                ", amount='" + amount + '\'' +
                ", billStart='" + billStart + '\'' +
                ", billEnd='" + billEnd + '\'' +
                ", billingCycle='" + billingCycle + '\'' +
                ", initVal='" + initVal + '\'' +
                ", endVal='" + endVal + '\'' +
                ", totalFee='" + totalFee + '\'' +
                ", rateStr='" + rateStr + '\'' +
                ", payLimitId='" + payLimitId + '\'' +
                ", payLimitName='" + payLimitName + '\'' +
                '}';
    }
}
