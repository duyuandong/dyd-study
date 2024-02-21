package com.dyd.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.model.ModelTest
 * @date ：Created in 2022/9/23 14:00
 * @description：
 * @modified By：
 * @version:
 */
public class ModelTest {
  public static void main(String[] args) throws UnsupportedEncodingException {
    //
    List<Map<String, Object>> items = Lists.newArrayList();
    Map<String, Object> map = Maps.newHashMap();
    map.put("daily", "2018-01-10");
    map.put("count", 20);
    items.add(map);
    map = Maps.newHashMap();
    map.put("daily", "2018-01-11");
    map.put("count", 80);
    items.add(map);
    map = Maps.newHashMap();
    map.put("daily", "2018-01-12");
    map.put("count", 21);
    items.add(map);
    map = Maps.newHashMap();
    map.put("daily", "2018-01-10");

    Map<Object, Long> count =
        items.stream().collect(Collectors.groupingBy(i -> i.get("count"), Collectors.counting()));

    String af = "1.00";
    int i = Double.valueOf(af).intValue();
    System.out.println(i);

    System.out.println("B_MONTHCARD_AUDIT_NOT_PASSED_SMS_TIP".length());

    String paranm = "[{\"aa\":\"111\"},{\"bb\":\"111\"}]";
    JSONArray jsonArray = new JSONArray();
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("aa", "2222");
    jsonObject.put("bb", null);
    JSONObject jsonObject2 = new JSONObject();
    jsonObject2.put("aa", "1");
    jsonObject2.put("bb", "2222");
    jsonArray.add(jsonObject);
    jsonArray.add(jsonObject2);

    List<LO> los = jsonArray.toJavaList(LO.class);
    Iterator<LO> iterator = los.iterator();
    while (iterator.hasNext()) {
      LO next = iterator.next();
      if ("2222".equals(next.getAa())) {
        iterator.remove();
      }
      next.setAa("111");
    }
    System.out.println(JSONObject.toJSONString(los));

    List<PushTempRecordDto> pushTempRecordDtos =
        JSONArray.parseArray(
            "[{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220918181946950-DCF730\",\"carNo\":\"闽DCF730\",\"stayTime\":\"141\",\"isTempCar\":\"5901\",\"remark\":\"5901\",\"outTime\":\"2022-09-18 20:41:42\",\"payDate\":\"2022-09-18 20:41:42\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"13.00\",\"finalMoney\":\"13.00\",\"orderId\":\"20220918103821454-D568BX\",\"carNo\":\"闽D568BX\",\"stayTime\":\"607\",\"isTempCar\":\"5901\",\"remark\":\"5901\",\"outTime\":\"2022-09-18 20:45:39\",\"payDate\":\"2022-09-18 20:45:39\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"200.00\",\"finalMoney\":\"200.00\",\"stayTime\":\"0\",\"isTempCar\":\"5904\",\"remark\":\"5904\",\"outTime\":\"2022-09-18 21:26:37\",\"payDate\":\"2022-09-18 21:26:37\"},{\"payType\":\"79001\",\"carParkingId\":\"7rqn1scr\",\"money\":\"9.00\",\"finalMoney\":\"0.00\",\"orderId\":\"20220918145556089-DB6B60\",\"carNo\":\"闽DB6B60\",\"stayTime\":\"396\",\"isTempCar\":\"5901\",\"remark\":\"5901\",\"outTime\":\"2022-09-18 21:32:29\",\"payDate\":\"2022-09-18 21:32:29\"},{\"payType\":\"79003\",\"carParkingId\":\"7rqn1scr\",\"money\":\"5.00\",\"finalMoney\":\"5.00\",\"orderId\":\"20220918212204823-D966FC\",\"carNo\":\"闽D966FC\",\"stayTime\":\"96\",\"isTempCar\":\"5901\",\"remark\":\"5901\",\"outTime\":\"2022-09-18 22:58:46\",\"payDate\":\"2022-09-18 22:58:46\"}]",
            PushTempRecordDto.class);
    System.out.println(JSONObject.toJSONString(pushTempRecordDtos));
    System.out.println(getPayMethodByJieHuiTong("ZFB"));

    System.out.println(Long.parseLong("110002196"));

    Byte aa = 1;
    System.out.println(aa == 1);

    HashMap<String, String> map1 = new HashMap<>();
    map1.put("1", "ssss");
    System.out.println(map1.get(aa));

    BigDecimal bigDecimal = BigDecimal.valueOf(0.9882);
    System.out.println(bigDecimal.toPlainString());


    System.out.println("---------------------------Model--------------------Resevet----end:");
    int randomNumber = (int) ((Math.random() * 9 + 1) * 1000);
    System.out.println(randomNumber);

    System.out.println(URLEncoder.encode("http://ssss.ccd.cn?app=2021-10-13 10:23:00.", "GBK"));

    ArrayList<String> list = Lists.newArrayListWithCapacity(1);
    list.add("1");
    list.add("2");
    list.add("3");
    System.out.println(list);

    HashMap<Integer, String> objectObjectHashMap = Maps.newHashMap();
    objectObjectHashMap.put(new Integer(1), "222");
    int aap = 1;
    System.out.println(objectObjectHashMap.get(aap));

    double apos = 254.269999999999;
    String s = BigDecimal.valueOf(apos).setScale(4, BigDecimal.ROUND_HALF_UP).toPlainString();
    System.out.println(s);

    System.out.println(StringUtils.substringAfterLast("ffff", "/"));

    System.out.println(StringUtils.substringBeforeLast("JF-EPAY2022112430502#", "#"));
    System.out.println("JF-EPAY2022112430502".indexOf("#"));

    DecimalFormat format = new DecimalFormat("0.00");
    String str = "1100";
    String a = format.format(new BigDecimal(str));
    System.out.println(a);

    System.out.println(new BigDecimal("1100.0000").compareTo(new BigDecimal("1100")));

    long[] placeIds = {Long.parseLong("212123213" + "")};
    System.out.println(placeIds[0]);
    String sa = null;
    sa = "223ss";
    System.out.println(sa);
  }

  public static String getPayMethodByJieHuiTong(String payMethod) {
    // 【PayType】【4微信】【5支付宝】，其他均归为【69其他】；现金【1现金】，若选为POS则【2银行卡】
    switch (payMethod) {
      case "ZFB":
        return "3"; // 支付宝
      case "WX":
        return "2"; // 微信
      case "YL":
        return "out_1"; // 银联
      default:
        return "10"; // 现金
    }
  }
}
