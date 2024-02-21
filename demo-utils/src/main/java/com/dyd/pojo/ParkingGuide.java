package com.dyd.pojo;

import java.io.Serializable;

/**
 * @author ：duyd@segimail.com
 * @class ：com.segi.uhomecp.carparking.parkingvisitor.model.ParkingGuide
 * @date ：Created in 2022/3/3 16:13
 * @description：
 * @modified By：
 * @version:
 */
public class ParkingGuide implements Serializable,Cloneable {

  private String parkingTag;

  private String parkingImg;

  public String getParkingTag() {
    return parkingTag;
  }

  public void setParkingTag(String parkingTag) {
    this.parkingTag = parkingTag;
  }

  public String getParkingImg() {
    return parkingImg;
  }

  public void setParkingImg(String parkingImg) {
    this.parkingImg = parkingImg;
  }
}
