package com.dyd.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.carparking.carinfo.model.AdjustDetail
 * @date ：Created in 2023/9/25 18:17
 * @description： 调整退款明细
 * @modified By：
 * @version:
 */
public class AdjustDetail {
    private String acctItemId; //账单id
    private String realAcctItemIds; //关联的正负账单ID，多个逗号拼接
    private String fee; //应收金额
    private String paidFee; //已收费用
    private Integer feeBefore; //退款前金额(分)
    private Integer feeAfter; //退款后金额(分)
    private Integer adjustFee; //调整金额(分)
    private String adjustDesc;
    @JSONField(serialize = false)
    private Integer payLimitId;

    public Integer getPayLimitId() {
        return payLimitId;
    }

    public void setPayLimitId(Integer payLimitId) {
        this.payLimitId = payLimitId;
    }

    public String getAcctItemId() {
        return acctItemId;
    }

    public void setAcctItemId(String acctItemId) {
        this.acctItemId = acctItemId;
    }

    public String getRealAcctItemIds() {
        return realAcctItemIds;
    }

    public void setRealAcctItemIds(String realAcctItemIds) {
        this.realAcctItemIds = realAcctItemIds;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = String.valueOf(new BigDecimal(fee).intValue());
    }

    public String getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(String paidFee) {
        this.paidFee = paidFee;
    }

    public Integer getFeeBefore() {
        return feeBefore;
    }

    public void setFeeBefore(Integer feeBefore) {
        this.feeBefore = feeBefore;
    }

    public Integer getFeeAfter() {
        return feeAfter;
    }

    public void setFeeAfter(Integer feeAfter) {
        this.feeAfter = feeAfter;
    }

    public Integer getAdjustFee() {
        return adjustFee;
    }

    public void setAdjustFee(Integer adjustFee) {
        this.adjustFee = adjustFee;
    }

    public String getAdjustDesc() {
        return adjustDesc;
    }

    public void setAdjustDesc(String adjustDesc) {
        this.adjustDesc = adjustDesc;
    }

    public static void feeAvgEveryMonth(List<AdjustDetail> adjustDetailList, Integer cancelFeeInt){
        int avgFee =  cancelFeeInt / adjustDetailList.size();
        BigDecimal bigDecimal = new BigDecimal("100");
        int sum = 0;
        for (int i = 0; i < adjustDetailList.size(); i++) {
            adjustDetailList.get(i).setFeeBefore(Integer.parseInt(adjustDetailList.get(i).getPaidFee()));
            if(i == adjustDetailList.size() - 1){
                adjustDetailList.get(i).setAdjustFee(-(cancelFeeInt - sum ));
            }else {
                //若费用不是整月交的话,直接用当前费用
                int paidFee = Integer.parseInt(adjustDetailList.get(i).getPaidFee());
                if(avgFee > paidFee){
                    sum += paidFee;
                    adjustDetailList.get(i).setAdjustFee(-paidFee);
                }else {
                    sum += avgFee;
                    adjustDetailList.get(i).setAdjustFee(-avgFee);
                }
            }
            adjustDetailList.get(i).setFeeAfter(adjustDetailList.get(i).getFeeBefore() + adjustDetailList.get(i).getAdjustFee());
            adjustDetailList.get(i).setAdjustDesc("退还已收" + new BigDecimal(-adjustDetailList.get(i).getAdjustFee()).divide(bigDecimal).setScale(2, BigDecimal.ROUND_HALF_UP) + "元");
        }
    }
}
