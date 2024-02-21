package com.dyd.third.shoucheng;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 开放平台访问测试参数配置
 *
 * @author michael
 * @version 1.0.0
 * @date 2020-01-03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingRequestConfig {

  private String appId;

  private String parkCode;

  private String mchId;

  private String desKey;

  private String saltMd5Key;

  private String version;

  private String parkingInfoUrl;
}
