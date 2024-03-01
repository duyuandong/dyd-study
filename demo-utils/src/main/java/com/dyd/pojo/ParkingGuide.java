package com.dyd.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Base64;
import java.util.HashMap;

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

  @Override
  public String toString() {
    return "ParkingGuide{" +
            "parkingTag='" + parkingTag + '\'' +
            ", parkingImg='" + parkingImg + '\'' +
            '}';
  }

  public static void main(String[] args) throws IllegalAccessException, UnsupportedEncodingException {
    HashMap map1 = new HashMap();
    HashMap map2 = new HashMap();
    map1.put("param",map2);
    ParkingGuide parkingGuide = new ParkingGuide();
    parkingGuide.setParkingImg("sja");
    parkingGuide.setParkingTag("jiaia");
    Field[] declaredFields = ParkingGuide.class.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      declaredField.setAccessible(true);
      Object o = declaredField.get(parkingGuide);
      map2.put(declaredField.getName(),o);
    }
    System.out.println(JSON.toJSONString(map1));

    String app = null;
    String outt = Base64.getEncoder().encodeToString(JSON.toJSONString(app).getBytes("utf-8"));
    System.out.println(outt);

    System.out.println(1 << 4);
  }
}
