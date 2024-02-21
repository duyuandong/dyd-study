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
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.third.TestDemo2
 * @date ：Created in 2022/4/19 9:55
 * @description：
 * @modified By：
 * @version:
 */
public class TestDemo2 {
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
      param.put("requestTime", "1667977374310");
      param.put("requestId", "1667977374310");
      param.put("noncestr", "1667977374310");
      param.put("apiVersion", "0.1");

      JSONObject dataBase = new JSONObject();
      dataBase.put("baseCode", "WBTS"); // 每个接口文档中都会要求填这个参数,这个是固定的.
      // 月卡上报其它参数
      JSONObject data = new JSONObject();
      data.put("carNo", "粤B11231W");
      data.put("carParkingCode", "838D24167EDD"); // 车场code第三方提供
      data.put("cardId", "asd22121334");
      data.put("cardcycle", "3");
      data.put("effdate", "2021-11-20");
      data.put("expdate", "2022-02-19");
      data.put("finalMoney", "20000");
      data.put("money", "25000");
      data.put("orderId", "98eee909-16dc-4458-92e3-33413331");
      data.put("payDate", "2022-10-20 17:18:03");
      data.put("payType", "2");
      data.put("telNo", "13828813681");
      data.put("userName", "何子聪2");
      data.put("isSplitBill", 1);

      JSONArray jsonArray = new JSONArray();
      jsonArray.add(data);
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
                "v1/car/paypush/monthCardParkingRecord");
        System.out.println(msg);
      } catch (Throwable e) {
        e.printStackTrace();
        return;
      }
    }
  }
}
