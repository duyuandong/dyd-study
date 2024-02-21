package com.dyd.third;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * netty http 客户端
 *
 * @author tanjun
 */
public class TestDemo3 {
  /**
   * 发送http请求
   *
   * @param param 参数json字符串
   * @param server_context 连接上下文
   * @param interName 访问的接口名称
   * @throws IOException
   * @throws ClientProtocolException
   * @throws HttpException
   */
  public static String exe(String miyao, String param, String server_context, String interName)
      throws ClientProtocolException, IOException, HttpException {
    HttpPost httpRequst = new HttpPost(server_context + "/" + interName);
    // 解决中文乱码问题
    StringEntity entity = new StringEntity(param, "utf-8");
    entity.setContentEncoding("UTF-8");
    entity.setContentType("application/json");
    httpRequst.setEntity(entity);
    httpRequst.setHeader(new BasicHeader("signature", SignatureUtils.signature(param, miyao)));
    CloseableHttpClient httpclient = HttpClients.createDefault();
    CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
    String msg = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
    if (httpResponse.getStatusLine().getStatusCode() == 200) {
      return msg;
    } else { // 请求异常
      throw new HttpException("错误信息:" + msg);
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 1; i++) {
      JSONObject param = new JSONObject();
      param.put("appKey", "67b25f65899b2f2d3bb8d9fe2e7aa7cc");
      param.put("requestTime", "1682388965000");
      param.put("requestId", "1682388965000");
      param.put("noncestr", "1682388965000");
      param.put("apiVersion", "1.0");

      //
      JSONObject data = new JSONObject();
      data.put("baseCode", "WBTS");
      /* data.put("carParkingCode", "838D24167EDD223455"); // 车场增删改
      data.put("communityId", "67");
      data.put("carParkingName", "主数据测试车场223333");
      data.put("portType", "1");
      //data.put("thirdCarParkingId","2132aaa");
      data.put("carParkingId", "888888943");*/

      /*data.put("carParkingId", "888888943"); // 区域增删改
      data.put("communityId", "67");
      data.put("parkingAreaCode", "area-code-05");
      data.put("parkingAreaName", "area-code-05");
      data.put("portType", "1");
      // data.put("parkingAreaId", "888888947");
      data.put("thirdParkingAreaId", "15543");*/

      data.put("placeId", "888888943"); // 车位增删改
      data.put("communityId", "67");
      data.put("code", "parking-code-05");
      data.put("name", "parking-code-05");
      data.put("portType", "1");
      data.put("parkingAreaId", "888888948");
      // data.put("parkingId", "110040002");
      data.put("threadParkingId", "990195");

      // 这个data里面还要其它参数,一切参数按接口详情文档来
      param.put("data", data);
      System.out.println(param.toJSONString());
      String miyao =
          "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCWtLSSNGPkL44BP5h17evj7X7GZJ4T5ubSzSc6KF8TxMxot10VI9Go+IgKXxdaCyIrvfEJuiftJdqB2vn0sgNy3skL+FUqXEfjNqIxXDNgKHwpUTDAy5A/hI6KHsapGU7sKt8tZ2xY+LvoY2Za/2E+NdJANY+Nts+BhjEU0XBjgwIDAQAB";
      try {
        String msg =
            exe(
                miyao,
                param.toJSONString(),
                "http://beta.uhomecp.com/maindata-api-netty", // 测试环境，生产环境需重新配置
                "saveParkingPush");
        System.out.println(msg);
      } catch (Throwable e) {
        e.printStackTrace();
        return;
      }
    }
  }
}
