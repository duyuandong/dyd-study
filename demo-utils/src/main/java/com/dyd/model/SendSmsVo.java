package com.dyd.model;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.carparking.sendsms.vo.SendSmsVo
 * @date ：Created in 2022/9/20 17:02
 * @description：
 * @modified By：
 * @version:
 */
public class SendSmsVo {

  private Integer custId;

  private Integer communityId;

  private String phone;

  private Integer organId;

  private String message;

  private Integer auditFlag; // 0:不通过；1:通过

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getOrganId() {
    return organId;
  }

  public void setOrganId(Integer organId) {
    this.organId = organId;
  }

  public Integer getAuditFlag() {
    return auditFlag;
  }

  public void setAuditFlag(Integer auditFlag) {
    this.auditFlag = auditFlag;
  }

  public Integer getCustId() {
    return custId;
  }

  public void setCustId(Integer custId) {
    this.custId = custId;
  }

  public Integer getCommunityId() {
    return communityId;
  }

  public void setCommunityId(Integer communityId) {
    this.communityId = communityId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SendSmsVo(Integer custId, Integer communityId) {
    this.custId = custId;
    this.communityId = communityId;
  }

  public SendSmsVo(Integer custId, Integer communityId, String message, Integer auditFlag) {
    this.custId = custId;
    this.communityId = communityId;
    this.message = message;
    this.auditFlag = auditFlag;
  }

  public SendSmsVo() {}
}
