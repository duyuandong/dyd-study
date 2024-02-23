package com.dyd.third.shoucheng;

import com.alibaba.fastjson.JSONObject;
import com.dyd.third.SignatureUtils;
import com.dyd.utils.MD5Util;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.third.shoucheng.TestShouCheng
 * @date ：Created in 2022/4/20 18:27
 * @description：
 * @modified By：
 * @version:
 */
public class TestShouCheng {

  private static final RestTemplate restTemplate = new RestTemplate();
  private static final HttpHeaders httpHeaders = new HttpHeaders();

  public static void main(String[] args) {
    // ****请求业务参数内容
    // JSONObject json = getTmp(); // 临停查询
    // JSONObject json = addTmp(); // 临停缴费

    // JSONObject json = getMonthCard(); // 月租查询
    // JSONObject json = rechargeMonthCard(); // 月租缴费

    JSONObject json = getSurplusParking(); // 剩余车位查询
    // ****签名
    ParkingRequestConfig parkingRequestConfig =
        new ParkingRequestConfig(
            "T900000004ZBBB",
            "ThyYap58tejXXSt",
            "S100000010",
            "9767b3bdc96b749957671e56f82c3450",
            "GimqTxH7d2OpK4uikp7F9A==",
            "v1.0.0",
            json.getString("url"));
    EncryptAndSignReqBean en = new EncryptAndSignReqBean();
    en.setTripleDESKey(parkingRequestConfig.getDesKey());
    en.setPlain(json.toJSONString());
    en.setMd5SaltKey(parkingRequestConfig.getSaltMd5Key());
    String sign = null;
    String desText = null;
    try {
      desText = TripleDES.encrypt(en.getPlain(), parkingRequestConfig.getDesKey(), "UTF-8");
      String strSignText = SignatureUtils.getSign(json);
      sign = MD5Util.md5(strSignText + en.getMd5SaltKey());
    } catch (Exception e) {
      e.printStackTrace();
    }

    ParkingRequest parkingRequest = new ParkingRequest();
    // ****AppId
    parkingRequest.setAppId(parkingRequestConfig.getAppId());
    // ****接口版本号
    parkingRequest.setVersion(parkingRequestConfig.getVersion());
    // ****停车场编码
    parkingRequest.setParkCode(parkingRequestConfig.getParkCode());
    // ****置加密的业务数据
    parkingRequest.setCipherJson(desText);
    // ****设置签名
    parkingRequest.setSign(sign);

    JSONObject jsonObject = new JSONObject();
    json.put("sjakjd", 11111);
    json.put("1321412", 424);
    parkingRequest.setJson(jsonObject);

    HttpEntity<Object> objectHttpEntity = new HttpEntity<>(parkingRequest, httpHeaders);
    ResponseEntity<JSONObject> jsonObjectResponseEntity =
        restTemplate.postForEntity(
            parkingRequestConfig.getParkingInfoUrl(), objectHttpEntity, JSONObject.class);

    JSONObject body = jsonObjectResponseEntity.getBody();
    System.out.println(body.toJSONString());

    String cipherJson = String.valueOf(body.get("cipherJson"));
    if (!"null".equals(cipherJson)) {
      try {
        String decrypt = TripleDES.decrypt(cipherJson, parkingRequestConfig.getDesKey(), "UTF-8");
        System.out.println(decrypt);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  private static JSONObject getTmp() {
    JSONObject json = new JSONObject();
    json.put("url", "http://ptest.scsonic.cn/api/ext/lgh/getParkingInfo");
    json.put("carLicense", "京GG2222");
    return json;
  }

  private static JSONObject addTmp() {
    JSONObject json = new JSONObject();
    json.put("url", "https://ptest.scsonic.cn/api/xpcb/lgh/payCallBack");
    json.put("carLicense", "苏AA3333");
    json.put("recordId", "03fcc1cb9b7a43debe1fc1441e94e4b9");
    json.put("entranceTime", "2022-04-21 10:48:41");
    json.put("exitTime", "2022-04-24 16:58:33");
    json.put("payTime", "2022-04-24 16:58:33");
    json.put("tradeNo", "11123141212224556");
    json.put("amountTotal", "0.1");
    json.put("amountDiscount", "0");
    json.put("amountPayed", "0.1");
    json.put("sceneType", "103Y1013");
    return json;
  }

  private static JSONObject getMonthCard() {
    // 京AA1234 京Q34567
    JSONObject json = new JSONObject();
    json.put("url", "http://ptest.scsonic.cn/api/ext/vip/getMonthInfo");
    json.put("carLicense", "京A22118");
    return json;
  }

  private static JSONObject rechargeMonthCard() {
    JSONObject json = new JSONObject();
    json.put("url", "https://ptest.scsonic.cn/api/ext/vip/monthPayCallBack");
    json.put("dataId", "ee9d3f55f95f4d13a2d345fc512ca259");
    json.put("tradeId", "0fd99eeefdec4213a05c6bc5496176y7");
    json.put("sceneType", "102Y7004");
    json.put("ruleName", "通州月租01");
    json.put("payTime", "2021-04-26 10:55:13");
    json.put("isExt", 1);
    json.put("startDate", "2021-04-26 00:00:00");
    json.put("endDate", "2021-05-25 23:59:59");
    json.put("amountCurrentPay", "1.00");
    return json;
  }

  private static JSONObject getSurplusParking() {
    JSONObject json = new JSONObject();
    json.put("url", "http://ptest.scsonic.cn/api/ext/vip/getParkInfo");
    json.put("parkCode", "ThyYap58tejXXSt");
    return json;
  }
}
