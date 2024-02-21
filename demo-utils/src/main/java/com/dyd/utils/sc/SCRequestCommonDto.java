package com.dyd.utils.sc;

import com.example.demo.utils.DateUtils;
import com.google.common.collect.Lists;
import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Months;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;

/** @Description: @Author: luzhiwei @Date: 2022/6/299:41 */
@Data
public class SCRequestCommonDto<T> {
  /** 解密前的报文 */
  String requestBody;
  /** 加密参数 */
  private String signatureString;

  /** 解密后的明文字符串 */
  private String requestBodyOfDecoded;

  public static void main(String[] args) {
    System.out.println("通话".hashCode());
    System.out.println("重地".hashCode());
    System.out.println("通话".equals("重地"));
    System.out.println("通话".compareTo("重地"));
    System.out.println("通话" == "通话");
    ArrayList<String> list = Lists.newArrayList();
    list.add("123");
    list.add("234");
    if (list.contains("235")) {
      System.out.println(112);
    }
    String apsc = "科拓2.0";
    try {
      String userNo = URLDecoder.decode(apsc, "utf-8");
      System.out.println(userNo);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

    String abg =
        "{\"empleeId\":\"-1\",\"taskType\":\"150\",\"method\":\"nobillpay\",\"payAttrCode\":\"湘A59LY2\",\"billInfo\":[{\"houseId\":\"-1\",\"feeItemTypeId\":\"9250\",\"orderId\":\"\",\"resInstName\":\"湘A59LY2\",\"fee\":\"500.0\",\"otBillId\":\"-1\",\"initVal\":\"-1\",\"endVal\":\"-1\",\"resInstId\":\"\",\"acctItemTypeId\":\"3027\",\"receivableDate\":\"\",\"custId\":\"-1\",\"paidLfree\":\"\",\"billStart\":\"\",\"resInstType\":\"28\",\"resInstCode\":\"湘A59LY2\",\"amount\":\"1\",\"syncFlag\":\"0\",\"unitStr\":\"\",\"billType\":\"2\",\"billEnd\":\"\",\"paidFee\":\"\",\"rateStr\":\"\",\"feeItemTypeName\":\"电费\",\"billingCycle\":\"\",\"lfree\":\"0\"}],\"payObjCode\":\"\",\"channel\":\"23\",\"businessId\":\"PAK2021060922105942762745320\",\"communityId\":\"67\",\"operType\":19,\"taskId\":\"20210609221102520\"}";
    System.out.println(abg.length() * 514);

    Calendar instance = Calendar.getInstance();
    instance.setTime(DateUtils.parseStringToDate("20230202", "yyyyMMdd"));
    instance.add(Calendar.MONTH, 82);
    System.out.println(DateUtils.formatDateToStringYYMMDD(instance.getTime()));

    int months =
        Months.monthsBetween(
                new DateTime(DateUtils.parseStringToDate("20230202", "yyyyMMdd").getTime()),
                new DateTime(DateUtils.parseStringToDate("20300101", "yyyyMMdd").getTime()))
            .getMonths();
    System.out.println(months);
  }
}
