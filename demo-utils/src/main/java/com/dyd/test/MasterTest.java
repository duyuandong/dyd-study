package com.dyd.test;

import com.example.demo.pojo.MeterAttr;
import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author ：duyd@segimail.com
 * @date ：Created in 2021/4/16 15:56
 * @description：
 * @modified By：
 * @version: $
 */
public class MasterTest {
  public static void main(String[] args) {
    //            String a = "hhiijk";
    //            String b = "jk";
    //        System.out.println(a.charAt(2));
    //        System.out.println(a.indexOf(b));
    //        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    //        String a = (String)objectObjectHashMap.get("a");
    //        System.out.println(a);
    /* String a = "";
    a = MasterTest.isNull(a)? "1":a;
    BigDecimal bigDecimal2 = new BigDecimal(a);
    BigDecimal bigDecimal1 = new BigDecimal(0);
    BigDecimal bigDecimal ;
    bigDecimal = bigDecimal1.subtract(bigDecimal2);
    bigDecimal= bigDecimal.multiply(new BigDecimal(1));
    System.out.println(bigDecimal);*/
    // BigDecimal multiply = bigDecimal.multiply(new BigDecimal(2));
    /*String a = null;
    Integer b = null;
    String s = b+"";
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("sadada");
    stringBuffer.append(a);
    stringBuffer.append("-");
    stringBuffer.append("sadada");
    stringBuffer.append("-");
    String substring = stringBuffer.substring(0,stringBuffer.length()-1);
    System.out.println(substring);*/

    BigDecimal fee = new BigDecimal("10000");
    BigDecimal days = new BigDecimal("30");
    BigDecimal dailyRate = fee.divide(days, 4, RoundingMode.HALF_UP); // 精确到小数点后4位
    BigDecimal cost =
        dailyRate
            .multiply(new BigDecimal("12"))
            .setScale(2, RoundingMode.HALF_EVEN); // 精确到小数点后两位，采用银行家舍入法

    System.out.println(cost); // 输出：40.00
    Integer a = 67;
    Integer b = 67;
    List<Integer> lists = new ArrayList<>();
    lists.add(67);

    System.out.println(
        !a.equals(b)
            || (!CollectionUtils.isEmpty(lists) && lists.size() > 1)
            || (!CollectionUtils.isEmpty(lists) && !lists.contains(b)));

    MeterAttr meterAttr = new MeterAttr("小红", 23.23);
    MeterAttr meterAttr2 = new MeterAttr("小红", 23.23);
    System.out.println(meterAttr.equals(meterAttr2));
    HashMap<MeterAttr, String> mapMet = new HashMap<>();
    mapMet.put(meterAttr, "a");
    mapMet.put(meterAttr2, "b");
    System.out.println(mapMet.size());

    System.out.println(meterAttr.hashCode());
    System.out.println(meterAttr2.hashCode());

    MeterAttr[] poiTests = (MeterAttr[]) Lists.newArrayListWithCapacity(1).toArray();
    System.out.println(poiTests.length);
  }

  public static boolean isNull(Object obj) {
    if (obj == null) return true;
    if ((obj instanceof String)) return ("".equals(obj)) || ("null".equals(obj));
    if ((obj instanceof Collection)) return ((Collection) obj).size() == 0;
    if ((obj instanceof Map)) {
      return ((Map) obj).size() == 0;
    }

    return false;
  }
}
