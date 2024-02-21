package com.dyd.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import segi.basicreport.model.RouteQuery;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.LinkOtherUrlUtils
 * @date ：Created in 2021/12/28 11:44
 * @description：
 * @modified By：
 * @version:
 */
public class LinkOtherUrlUtils {

  private static final RestTemplate restTemplate = new RestTemplate();
  private static final HttpHeaders httpHeaders = new HttpHeaders();

  public static <List> void main(String[] args) {
    /* String[] strs = {"list[0]"};
     JSONObject tempObject = new JSONObject();
    tempObject.getJSONArray(strs[0].replace("[]", ""));
    System.out.println(tempObject.toJSONString());*/

    // getHttpData();
    /* String url ="http://10.10.10.22:9999/carparking/[ZX_XL]/车辆管理.xls";
    try {
        String fileName = new String(url.getBytes("UTF-8"), "ISO8859-1");
        System.out.println(fileName);
        String encode = URLEncoder.encode(url, "UTF-8");
        System.out.println(encode);
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }*/
    /* Student student = new Student("dy", 15);
    Student student2 = new Student("dy3", 15);
    ArrayList<Student> list = Lists.newArrayList();
    list.add(student);
    list.add(student2);

    Set<Double> collect = list.stream().map(Student::getAge).collect(Collectors.toSet());
    ArrayList<Double> doubles = Lists.newArrayList(collect);
    System.out.println(doubles);

    System.out.println(MD5Util.md5("HUASHUAI:1.0").toUpperCase());

    System.out.println(Arrays.asList("carNo"));
    System.out.println(0.00 / 0 * 0);*/

    //getHttpDataV2();
    RouteQuery routeQuery = new RouteQuery();
    routeQuery.setOrganId("671024");
    routeQuery.setBeginDate("2023-10-01");
    routeQuery.setEndDate("2024-02-17");
    routeQuery.setPageNo("1");
    routeQuery.setPageLength("10");
    JSONObject result = asyncExportTaskRun(routeQuery, "ASYNC_DT_ROUTE_DIMENSION_SINGLE_EXPORT", "1000279");
    System.out.println(JSON.toJSONString(result));
  }

  public static JSONObject asyncExportTaskRun(RouteQuery req, String taskCode, String upOrganId){
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    headers.add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers.add("Cookie","JSESSIONID=109A58FA46DD43D824214FED8C09C37D; __utmz=240734992.1696730128.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmz=145589872.1698721656.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=145589872.437594172.1698721656.1703123038.1703139304.8; XXL_JOB_LOGIN_IDENTITY=7b226964223a312c22757365726e616d65223a2261646d696e222c2270617373776f7264223a226531306164633339343962613539616262653536653035376632306638383365222c22726f6c65223a312c227065726d697373696f6e223a6e756c6c7d; __utmc=240734992; __utma=240734992.892087486.1696730128.1706499920.1706592795.58; io=vUgbsSxKzet7qrekAAfJ; _segiupt_ts=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJleHBpcmVzX2luIjoyNDE5MjAwLCJpYXQiOjE3MDgyMjU0MjcsInNhbHQiOiI0Ym5wJCY0eUVGe2dxKG9lIiwidHlwZSI6InNlc3Npb25fdG9rZW4iLCJ1c2VybmFtZSI6IkJFVEFfQl8xOTgwMDE5ODAwMSJ9.uFG9O6PLHM35emYwsFrN8xHaQ7VzVCzimGkwfdD4rVMLTVavmcTju7Suxdpc5aSkz4-xrGBSyFw48iqquoSbTA; _segiupt_as=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJjbGllbnRfaWQiOiJiZXRhIiwiZXhwaXJlc19pbiI6ODY0MDAwLCJpYXQiOjE3MDgyMjU0MjcsInNhbHQiOiJLcz88U2olT101ZjhORndtIiwic2NvcGUiOiJzX2FkbWluIiwidHlwZSI6ImFjY2Vzc190b2tlbiIsInVzZXJfaWQiOiJCRVRBX0JfMTEwNjE0MTkwIiwidXNlcm5hbWUiOiJCRVRBX0JfMTk4MDAxOTgwMDEifQ.J05d_QKYBVIAWy3QOUGTZHrwCnBl1srlfPVdKwer_Dp2occX56IrolIA79vK2PE3qBkHdWkWJdsa0tM44q5aOw; _segiupt_ci=beta; _segiupt_ty=BETA_B_; aid=110614190; oid=1000279; cid=0");
    HashMap<String, Object> map = new HashMap<>();
    //若是导出是多下属项目,则将第一个organId作为请求的organId传参
    if(upOrganId != null){
      map.put("organId",upOrganId);
    }else{
      map.put("organId",req.getOrganId());
    }
    //int communityId = IceClientUtil.getServicePrxByClass(COrginfoIPrx.class).queryCommunityIdByOrganid(Integer.valueOf(req.getOrganId()));
    map.put("communityId","67");
    map.put("taskType","1");//导出
    map.put("taskCode",taskCode);//异步任务编码
    map.put("systemCode","patrol");
    map.put("data",req);
    MultiValueMap<String, Object> reqMap = new LinkedMultiValueMap<>();
    reqMap.add("reqParam", JSON.toJSONString(map));
    HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(reqMap, headers);
    ResponseEntity<String> response = restTemplate.postForEntity("https://beta.uhomecp.com/async-common-batch" + "/rest-api/v1/async/common/createAsyncTask.json", httpEntity, String.class);
    return JSON.parseObject(response.getBody());
  }

  public static void getHttpData() {
    httpHeaders.add("Content-Type", "application/json;charset=UTF-8");
    httpHeaders.add("appid", "fujica_8b091164efc1fc14");
    httpHeaders.add("appSecret", "3189a044f75f420a8265c9db02799b98");
    httpHeaders.add("timestamp", "1639649964");
    httpHeaders.add("sn", "222");
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("timestamp", "1639649964");
    jsonObject.put("ParkingCode", "22000107560501");
    jsonObject.put("CarNo", "闽D98764");
    HttpEntity<Object> objectHttpEntity = new HttpEntity<>(jsonObject, httpHeaders);
    ResponseEntity<JSONObject> jsonObjectResponseEntity =
        restTemplate.postForEntity(
            "http://api.mops.fujica.com.cn/v2/Api/Park/GetMonthCardInfoByCarNo",
            objectHttpEntity,
            JSONObject.class);
    System.out.println(jsonObjectResponseEntity.getBody());
  }

  public static void getHttpDataV2() {
    httpHeaders.add("Content-Type", "application/json;charset=UTF-8");
    httpHeaders.add("appid", "fujica_8b091164efc1fc14");
    httpHeaders.add("appSecret", "3189a044f75f420a8265c9db02799b98");
    httpHeaders.add("sn", "222");
    Student student = new Student("dy", 15);
    try {
      BusinessFieldRemoveUtil.removeFields(student);
    } catch (Exception e) {
      e.printStackTrace();
    }
    Student student2 = new Student("dy3", 15);
    ArrayList<Student> list = Lists.newArrayList();
    list.add(student);
    list.add(student2);
    System.out.println(JSONObject.toJSONString(list));
    /* HttpEntity<Object> objectHttpEntity = new HttpEntity<>(list, httpHeaders);
    ResponseEntity<JSONObject> jsonObjectResponseEntity =
        restTemplate.postForEntity(
            "http://api.mops.fujica.com.cn/v2/Api/Park/GetMonthCardInfoByCarNo",
            objectHttpEntity,
            JSONObject.class);
    System.out.println(jsonObjectResponseEntity.getBody());*/
  }
}
