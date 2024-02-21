package com.dyd.third;

import com.alibaba.fastjson.JSONArray;
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
public class TestDemo {
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
      param.put("requestTime", "1665559567484");
      param.put("requestId", "1665559567484");
      param.put("noncestr", "1665559567484");
      param.put("apiVersion", "1.0");

      JSONObject dataBase = new JSONObject();
      dataBase.put("baseCode", "WBTS"); // 每个接口文档中都会要求填这个参数,这个是固定的.
      // 临停上报其它参数
      JSONObject data = new JSONObject();
      data.put("carNo", "粤A12327");
      data.put("carParkingCode", "838D24167EDD"); // 车场code第三方提供
      data.put("finalMoney", "100");
      data.put("inTime", "2023-03-17 06:00:00");
      data.put("money", "100");
      data.put("offset", "0");
      data.put("orderId", "202212181533444413");
      data.put("outTime", "2023-03-17 08:00:00");
      data.put("payType", "1");
      data.put("stayTime", "120");
      data.put("telNo", "123156666662");
      data.put("userName", "test23");
      JSONObject data2 = new JSONObject();
      data2.put("carNo", "粤A12328");
      data2.put("carParkingCode", "838D24167EDD"); // 车场code第三方提供
      data2.put("finalMoney", "100");
      data2.put("inTime", "2023-03-17 06:00:00");
      data2.put("money", "100");
      data2.put("offset", "0");
      data2.put("orderId", "2022121815334441123");
      data2.put("outTime", "2023-03-17 08:00:00");
      data2.put("payType", "1");
      data2.put("stayTime", "120");
      data2.put("telNo", "123156666662");
      data2.put("userName", "test23");

      JSONArray jsonArray = new JSONArray();
      jsonArray.add(data);
      jsonArray.add(data2);
      dataBase.put("list", jsonArray);
      // 这个data里面还要其它参数,一切参数按接口详情文档来
      param.put("data", dataBase);
      System.out.println(param.toJSONString());
      String miyao =
          "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCWtLSSNGPkL44BP5h17evj7X7GZJ4T5ubSzSc6KF8TxMxot10VI9Go+IgKXxdaCyIrvfEJuiftJdqB2vn0sgNy3skL+FUqXEfjNqIxXDNgKHwpUTDAy5A/hI6KHsapGU7sKt8tZ2xY+LvoY2Za/2E+NdJANY+Nts+BhjEU0XBjgwIDAQAB";
      try {
        String msg =
            exe(
                miyao,
                param.toJSONString(),
                "http://beta.uhomecp.com/maindata-api-netty", // 测试环境，生产环境需重新配置
                "v1/car/paypush/tempParkingRecord");
        System.out.println(msg);
      } catch (Throwable e) {
        e.printStackTrace();
        return;
      }
    }
  }
}
