package com.dyd.third.shoucheng;

import lombok.Data;

import java.io.Serializable;

/**
 * 第三方请求对象
 *
 * @author michael
 * @version 1.0.0
 * @date 2020-01-03
 */
@Data
public class ParkingRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 对接AppId,统一分配 */
  private String appId;

  /** 停车场编码 */
  private String parkCode;

  /** 商户ID，如果是访问商户接口，必传。 */
  private String mchId;

  /** 默认填写 v1.0.0 */
  private String version;

  /** 请求业务数据，对象 json格式化加密 */
  private String cipherJson;

  /** 签名 */
  private String sign;

  private Object json;
}
