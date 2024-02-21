package com.dyd.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.HttpTest
 * @date ：Created in 2022/7/26 13:40
 * @description：
 * @modified By：
 * @version:
 */
public class HttpTest {

  public static void main(String[] args) {

    /*System.out.println(Test());*/
    /*HttpPost httpRequst =
        new HttpPost(
            "http://testlpn.ebopark.com/partnerService/QueryMonthCarFeeV2?partnerid=test&sign=7db59fe3ddf56876c4efbcda8d98caaf");
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("parkCode", "140123001");
    jsonObject.put("carNo", "浙AQAZW1");
    jsonObject.put("count", 1);
    jsonObject.put("secretKey", "206d98f4de9e4423b3aa42cd0c36fd84");
    StringEntity entity = new StringEntity(jsonObject.toJSONString(), "utf-8");
    entity.setContentEncoding("UTF-8");
    entity.setContentType("application/json");
    httpRequst.setEntity(entity);
    CloseableHttpClient httpclient = HttpClients.createDefault();
    CloseableHttpResponse httpResponse = null;
    try {
      httpResponse = httpclient.execute(httpRequst);
      String msg = EntityUtils.toString(httpResponse.getEntity(), "GBK");
      System.out.println(msg);
    } catch (IOException e) {
      e.printStackTrace();
    }*/

    JSONArray excelV2 = PoiTest.getExcelV2();
    List<Object> list = excelV2.subList(0, 2);
    /*int leg = 1;
    if (excelV2.size() > 200) {
      leg = excelV2.size() / 200 + 1;
    }
    List<Object> tempList = null;
    for (int i = 0; i < leg; i++) {
      try {
        if (i > 0) {
          Thread.sleep(5 * 1000);
        }
        if (i == excelV2.size() / 200) {
          System.out.println("=============最后一页======start");
          tempList = excelV2.subList(i * 200, excelV2.size());
          System.out.println(((JSONObject) (tempList.get(0))).get("orderId"));
          System.out.println(((JSONObject) (tempList.get(tempList.size() - 1))).get("orderId"));
          System.out.println("=============最后一页======end");
        } else {
          System.out.println("=============第{" + (i + 1) + "}页======start");
          tempList = excelV2.subList(i * 200, (i + 1) * 200);
          System.out.println(((JSONObject) (tempList.get(0))).get("orderId"));
          System.out.println(((JSONObject) (tempList.get(199))).get("orderId"));
          System.out.println("=============第{" + (i + 1) + "}页======end");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }*/
    // System.out.println(JSONObject.toJSONString(tempList));

    TempTest(list);
  }

  public static void TempTest(List dataList) {
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.parseMediaType("application/json; charset=UTF-8"));
    HttpEntity httpEntity = new HttpEntity(dataList, headers);

    ResponseEntity<String> response =
        restTemplate.postForEntity(
            // "http://127.0.0.1:8083/car-parking-api"
            "http://www.uhomecp.com/car-parking-api"
                + "/rest-api/v1/thirdRecordPushController/pushTempParkingRecordV2.json",
            httpEntity,
            String.class);
    System.out.println(response.getBody());
  }

  public static String Test() {
    //
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.add("Content-Type", "application/json");
    httpHeaders.add("Accept", "*/*");
    httpHeaders.add("Accept-Encoding", "gzip,deflate");
    httpHeaders.add("Content-Encoding", "UTF-8");
    RestTemplate restTemplate = new RestTemplate();
    /* restTemplate
    .getMessageConverters()
    .set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));*/
    /* List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
    Iterator<HttpMessageConverter<?>> iterator = messageConverters.iterator();
    while (iterator.hasNext()) {
      HttpMessageConverter<?> next = iterator.next();
      if (messageConverters instanceof StringHttpMessageConverter) {
        ((StringHttpMessageConverter) next).setDefaultCharset(StandardCharsets.UTF_8);
      }
    }*/

    try {
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("parkCode", "140123001");
      jsonObject.put("carNo", "浙AQAZW1");
      jsonObject.put("count", 2);
      jsonObject.put("secretKey", "206d98f4de9e4423b3aa42cd0c36fd84");
      HttpEntity<Object> entity = new HttpEntity<>(jsonObject, httpHeaders);
      ResponseEntity<byte[]> exchange =
          restTemplate.postForEntity(
              "http://testlpn.ebopark.com/partnerService/QueryMonthCarFeeV2?partnerid=test&sign=e6c163090ca52e9f620812ef566bb46c",
              entity,
              byte[].class);

      GZIPInputStream gzip = new GZIPInputStream(new ByteArrayInputStream(exchange.getBody()));
      InputStreamReader isr = new InputStreamReader(gzip);
      BufferedReader br = new BufferedReader(isr);
      StringBuilder sb = new StringBuilder();
      String temp;
      while ((temp = br.readLine()) != null) {
        sb.append(temp);
        sb.append("\r\n");
      }
      isr.close();
      gzip.close();

      return sb.toString();

      // String uncompress = GzipUtil.uncompress(new ByteArrayInputStream(exchange.getBody()));
      // String string = new String(exchange.getBody().getBytes(), Charset.forName("UTF-8"));
      // System.out.println(uncompress);
      // return uncompressString("string");

      /* if ((exchange != null) && exchange.getHeaders().get("Content-Encoding").contains("gzip")) {
        GZIPInputStream gzip =
            new GZIPInputStream(new ByteArrayInputStream(exchange.getBody().getBytes()));
        InputStreamReader isr = new InputStreamReader(gzip);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String temp;
        while ((temp = br.readLine()) != null) {
          sb.append(temp);
          sb.append("\r\n");
        }
        isr.close();
        gzip.close();

        return sb.toString();
      } else {
        return exchange.getBody();
      }*/
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  /**
   * GZIP解压字符串 解决Content-Encoding: gzip 的问题
   *
   * @param str 源字符串
   * @return
   * @throws IOException
   */
  public static String uncompressString(String str) throws IOException {
    if (str == null || str.length() == 0) {
      return str;
    }
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
    GZIPInputStream gunzip = new GZIPInputStream(in);
    byte[] buffer = new byte[256];
    int n;
    while ((n = gunzip.read(buffer)) >= 0) {
      out.write(buffer, 0, n);
    }
    return out.toString();
  }
}
