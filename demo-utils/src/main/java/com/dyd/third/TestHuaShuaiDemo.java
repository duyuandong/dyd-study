package com.dyd.third;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.third.TestHuaShuaiDemo
 * @date ：Created in 2022/3/15 9:08
 * @description：
 * @modified By：
 * @version:
 */
public class TestHuaShuaiDemo {

  private static RestTemplate restTemplate;

  private static HttpHeaders headers;

  private static String URL = "/open/api/owner/sync/plate/batch"; // 车辆批量同步

  private static String URL2 = "/open/api/owner/plate/page"; // 车辆注册列表-分页查询

  private static String URL3 = "/open/api/query/order/page"; // 6-1 查询车场缴费记录

  public static void initHttpHeaders() {
    if (null == headers) {
      headers = new HttpHeaders();
      headers.setContentType(MediaType.parseMediaType("application/json"));
    }
    if (null == restTemplate) {
      restTemplate = new RestTemplate();
    }
  }

  public static void main(String[] args) {
    initHttpHeaders();
    HttpEntity httpEntity = new HttpEntity(getParamsV2(), headers);
    ResponseEntity<String> stringResponseEntity =
        restTemplate.postForEntity("http://test.wlyk.com:8888" + URL2, httpEntity, String.class);
    String body = stringResponseEntity.getBody();
    System.out.println(body.replace("\\", ""));
  }

  private static String getDateStr() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    String format = dateFormat.format(new Date()).concat((int) (Math.random() * 10000) + "");
    return format;
  }

  public static String getParams() {
    Map data = new HashMap<String, String>();
    // JSONObject jsonObject = new JSONObject();
    String dateStr = getDateStr();
    System.out.println("dateStr :" + dateStr);
    data.put("appid", "1626231063");
    data.put("time", dateStr.substring(0, 14)); // 车场code第三方提供
    data.put("nonce", getDateStr());
    JSONObject jsonData = new JSONObject(true);
    jsonData.put("parkId", "XhfIJc0Uv-2RZVaYnhZBj1");
    jsonData.put("secretKey", "1626231062");
    JSONArray jsonArray = new JSONArray();
    for (int i = 0; i < 2; i++) {
      JSONObject data2 = new JSONObject(true);
      data2.put("carOwnerName", "陈超");
      data2.put("carOwnerNo", "");
      if (i % 2 == 1) {
        data2.put("plateNumber", "鄂F12345");
      } else {
        data2.put("plateNumber", "鄂F12344");
      }
      data2.put("operateType", 1);
      data2.put("carOwnerNo", "");
      data2.put("rechargeUnit", 2);
      data2.put("rechargeQuantity", 1);
      data2.put("startDate", "2022-03-15");
      data2.put("deadline", "2022-04-14");
      data2.put("payMethod", 0);
      data2.put("payMoney", "100");

      jsonArray.add(data2);
    }
    jsonData.put("list", jsonArray);

    data.put("data", jsonData.toJSONString());

    String sign = SignatureUtils.getSign(data).concat("&signKey=1626231062&reqUri=" + URL);
    System.out.println("加密串：" + sign);

    String signs = SignatureUtils.salt32Md5(sign);
    System.out.println("秘钥：" + signs);
    data.put("sign", signs.toUpperCase());

    return JSONObject.toJSONString(data);
  }

  public static String getParamsV2() {
    Map data = new HashMap<String, String>();
    String dateStr = getDateStr();
    System.out.println("dateStr :" + dateStr);
    data.put("appid", "1626231063");
    data.put("time", dateStr.substring(0, 14)); // 车场code第三方提供
    data.put("nonce", getDateStr());
    JSONObject data2 = new JSONObject();
    data2.put("pageNum", 1);
    data2.put("pageSize", 10);
    data2.put("parkId", "XhfIJc0Uv-2RZVaYnhZBj1");
    data.put("data", data2);

    String sign = SignatureUtils.getSign(data).concat("&signKey=1626231062&reqUri=" + URL2);
    System.out.println("加密串：" + sign);

    String signs = SignatureUtils.salt32Md5(sign);
    System.out.println("秘钥：" + signs);
    data.put("sign", signs.toUpperCase());
    data.put("data", data2);
    return JSONObject.toJSONString(data);
  }

  public static String getParamsV3() {
    Map data = new HashMap<String, String>();
    String dateStr = getDateStr();
    System.out.println("dateStr :" + dateStr);
    data.put("appid", "1626231063");
    data.put("time", dateStr.substring(0, 14)); // 车场code第三方提供
    data.put("nonce", getDateStr());
    JSONObject data2 = new JSONObject(true);
    data2.put("pageNum", 1);
    data2.put("pageSize", 10);
    data2.put("start", "2022-03-15 11:54:51");
    data2.put("end", "2022-03-10 20:54:51");
    data2.put("parkId", "XhfIJc0Uv-2RZVaYnhZBj1");
    data2.put("secretKey", "1626231062");
    data.put("data", data2.toJSONString());

    String sign = SignatureUtils.getSign(data).concat("&signKey=1626231062&reqUri=" + URL3);
    System.out.println("加密串：" + sign);

    String signs = SignatureUtils.salt32Md5(sign);
    System.out.println("秘钥：" + signs);
    data.put("sign", signs.toUpperCase());
    return JSONObject.toJSONString(data);
  }
}
