package com.dyd.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.JsonPojo;
import com.example.demo.pojo.ParkingGuide;
import com.example.demo.utils.DateUtils;
import com.example.demo.utils.MD5Util;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.deploy.net.URLEncoder;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.StringUtils
 * @date ：Created in 2021/9/1 15:13
 * @description：
 * @modified By：
 * @version:
 */
public class StringUtils {

  public static String replace(String text, String searchString, String replaceString) {
    return "222";
  }

  public static void main(String[] args) throws IOException {
    /*  BigDecimal divide = new BigDecimal(1).divide(new BigDecimal(100), 0, 4);
     System.out.println(divide.toPlainString());
    String divide2 = new BigDecimal(1).divide(new BigDecimal(100)).setScale(2).toString();
     System.out.println(divide2);*/
    /* JSONObject jsonObject = new JSONObject();
            jsonObject.put("StanAmount", "0.01");
            Double money = jsonObject.getDouble("StanAmount");
            Integer multiply = new BigDecimal(money).multiply(new BigDecimal(100)).intValue();
            System.out.println(multiply);
    */
    /*  boolean b = checkNoRepeat("222,222".split(","));
    System.out.println(b);*/

    /*StringBuilder carStrings = new StringBuilder();
    carStrings.append(",").append("2222");
    System.out.println(carStrings.toString().contains(",")?carStrings.substring(1):"2");*/

    /* List<String> carNoList = new ArrayList<>() ;
    String[] carNossplit = "鄂F35".split("#");
    for (int i = 0; i < carNossplit.length; i++) {
        if(carNossplit[i].contains(",")){
            carNossplit[i] = carNossplit[i].split(",")[0];
        }
    }
    carNoList.addAll(Arrays.asList(carNossplit));
    System.out.println(JSON.toJSONString(carNoList));*/

    /*String car = "鄂-HKE311";
    System.out.println(car.substring(0,1)+car.substring(2));*/

    /*  ArrayList<Object> list = new ArrayList<>();
    list.add("鄂-HKE311");
    list.add("鄂-HKE312");
    System.out.println(list.contains("鄂-HKe312".toUpperCase()));*/
    /*  try {
      FileStreamUtils  fileStreamUtils = new FileStreamUtils();
      fileStreamUtils.doSomething();
    }catch (Exception e){

    }finally {
       */
    /* if(null != fileStreamUtils){
        try {
            fileStreamUtils.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    /*
    }*/
    /*System.out.println(Long.valueOf("1004848"));*/

    /*String ab = null;
    Integer ac = null;
    System.out.println(org.apache.commons.lang3.StringUtils.isBlank(ab) || ab.equals("ab"));
    System.out.println((ac == 0));*/

    /*  String a ="123";61 30 15 7 3 1
    System.out.println(Integer.parseInt(a)>>3);*/
    /*BigDecimal multiply = new BigDecimal("1").add(new BigDecimal("2")).multiply(new BigDecimal("3"));
    System.out.println(multiply.intValue());*/

    /*  String aa = "aa";
    List<String> strings = Arrays.asList(org.apache.commons.lang3.StringUtils.split(aa, ","));
    System.out.println(JSON.toJSONString(strings));*/
    /* String ab ="刘某";
    System.out.println(ab.length());*/
    /* Integer a =null;
    System.out.println("7500482c-bfb3-4180-bade-f5bbc05005be".length());*/

    /*  String aa = "2012-12-13 23:33:22";
    String replaceTime = org.apache.commons.lang3.StringUtils.replace(aa, " ", "_");
    System.out.println(replaceTime);*/

    /* HashSet<Long> objects = new HashSet<>();
       objects.add(1928L);
       objects.add(113L);
       objects.add(1928L);
       objects.add(123L);
       objects.add(1928L);
       objects.add(123L);
       System.out.println(JSON.toJSONString(objects));
       long[] longsToCardType = new long[objects.size()];
       Iterator<Long> iterator = objects.iterator();
       int i = 0;
       while(iterator.hasNext()){
           longsToCardType[i] = iterator.next().longValue();
           i++;
       }
       System.out.println(JSON.toJSONString(longsToCardType));

       ArrayList<String> list = Lists.newArrayList();
       list.add("123,456");
       list.add("123,789");
       list.add("234,666");
       list.add("");
       list.add("111,666");
       HashSet<String> objects1 = new HashSet<>();
       for (String car : list) {
           CopyOnWriteArraySet<String> strings = Sets.newCopyOnWriteArraySet(Arrays.asList(org.apache.commons.lang3.StringUtils.split(car, ",")));
           objects1.addAll(strings);
       }
       System.out.println(JSON.toJSONString(objects1));
    */
    /*  String aa = null + "";
    System.out.println(aa);*/
    /*

            HashMap<String, String> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put("112","冲冲冲");
            objectObjectHashMap.put("222","ccc");
            objectObjectHashMap.put("333","sss是");
            String[] strs = {"1122"};
            String parkingCodes = "";
            for (String str : strs) {
                String code = objectObjectHashMap.get(str);
                parkingCodes += org.apache.commons.lang3.StringUtils.isBlank(code) ? "" : ("," + code);
            }
            System.out.println(parkingCodes);

    */
    HashMap<String, String> objectObjectHashMap1 = new HashMap<>();
    objectObjectHashMap1.put("", "");
    System.out.println(objectObjectHashMap1.get(""));

    /* String[] strs = "".split(",");
    for (String str : strs) {
        Long aLong = Long.valueOf(str);
        System.out.println(aLong);
    }*/
    /*   HashSet<Object> objects = Sets.newHashSet();
    System.out.println(objects == null || objects.isEmpty());*/

    /* boolean sg = org.apache.commons.lang3.StringUtils.split("海文花园(69)", "(")[0].equals("海文花园");
    System.out.println(sg);*/
    /* try {
        HashMap<String, Object> maps = new HashMap<>();
        ArrayList<JsonPojo> list = Lists.newArrayList();
        JsonPojo json1 = new JsonPojo(1, "刘杰", "172882221");
        JsonPojo json2 = new JsonPojo(2, "刘杰1", "1728822214");
        JsonPojo json3 = new JsonPojo(3, "刘杰2", "1728822215");
        list.add(json1);
        list.add(json2);
        list.add(json3);
        maps.put("dataItems", list);
        maps.put("ts", "112312321");
        maps.put("sn", "2312321312");
        // System.out.println(JSON.toJSONString(maps));
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(maps.get("dataItems")));
        System.out.println(1/0);
        System.out.println(org.apache.commons.lang3.StringUtils.substringBefore("苏-AH180P", "-"));
        System.out.println(org.apache.commons.lang3.StringUtils.substringBeforeLast("苏-AH180P", "-") + org.apache.commons.lang3.StringUtils.substringAfterLast("苏-AH180P", "-"));
    }catch (Exception e){
        System.out.println("231========================2313");
    }finally {
        System.out.println("231=====2313");
        for (int i = 0; i < 3; i++) {
            System.out.println("===========================7666666666666");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
    /* System.out.println("2222222");
    if(!org.apache.commons.lang3.StringUtils.isBlank("海文花园") && !org.apache.commons.lang3.StringUtils.split("海文花园(67)","(")[0].equals("海文花园")){
        System.out.println("2222222");

    }
    try {
        TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/
    /*String aaa="{\"pno\":\"123\",\"secret\":\"456\"}";
    JSONObject jsonObject = JSONObject.parseObject(aaa);
    System.out.println(jsonObject.get("secret")+"789");*/
    String[] str = {"aaa", "bbb", null, ""};
    String collect = Stream.of(str).filter(i -> null != i).collect(Collectors.joining(""));
    System.out.println(collect);

    System.out.println(
        "#response.get('parkingspacetype') == 3 ? #response.get('parkcapacity') * #response.get('fee') : #response.get('fee')"
            .length());

    Integer a = 110010838;
    System.out.println(Long.parseLong("110010838 ".trim()));

    System.out.println("天文花[jtes-001]".equals("天文花[jtes-001]"));

    System.out.println("{ top: \"533px\", left: \" 222px\" }".length());

    String jsonArry =
        "[{\"parkingTag\":\"-1\",\"parkingImg\":\"3027\"},{\"parkingTag\":\"222\",\"parkingImg\":\"333333\"}]";
    List<ParkingGuide> parkingGuides = JSONArray.parseArray(jsonArry, ParkingGuide.class);
    System.out.println(JSON.toJSONString(parkingGuides));

    JSONObject jsonObject = new JSONObject();
    jsonObject.put("name", "");
    jsonObject.put("fee", 100000);
    String name = (String) jsonObject.get("name");
    System.out.println(name);
    System.out.println((int) jsonObject.get("fee") * 3);

    String fileUrl = "/doc/2023/03/10/xiazai.png";
    StringBuilder fileName = new StringBuilder();
    fileName.append(fileUrl.substring(fileUrl.lastIndexOf("/")).substring(1)).append(",");
    System.out.println(fileName);
    StringBuilder stringBuilder = fileName.deleteCharAt(fileName.length() - 1);
    System.out.println(stringBuilder);

    System.out.println("20211216181922484".substring(0, 14));
    System.out.println(System.currentTimeMillis());

    // System.out.println("null".substring(0, 10));
    String json =
        "{\"parkingCode\":\"593000599\",\"appid\":\"11201\",\"secretKey\":\"758158d7e69d438ab5725ce90dfb705f\"}";

    String json2 =
        "{\"parkingCode2\":\"1208\",\"appid2\":\"10685\",\"secretKey2\":\"f82e3b547cae43b1b041a05d673f8fd0\"}";

    JSONObject jsonObject2 = JSONObject.parseObject(json2);
    jsonObject2.putAll(JSONObject.parseObject(json));
    System.out.println(jsonObject2.toJSONString());
    System.out.println(Long.parseLong("0"));

    String jsonStr =
        "{\"code\":\"0\",\"message\":\"SUCCCESS\",\"requestId\":\"20211216181922484\",\"responseTime\":\"2022-03-23 16:43:43556\",\"data\":{\"data\":\"{\\\"cardName\\\":\\\"测试\\\",\\\"plateNoInfo\\\":\\\"[{\\\\\\\"etcNo\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"plateNo\\\\\\\":\\\\\\\"苏ANJKT6\\\\\\\",\\\\\\\"id\\\\\\\":5},{\\\\\\\"etcNo\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"plateNo\\\\\\\":\\\\\\\"苏ANJKTTT\\\\\\\",\\\\\\\"id\\\\\\\":2639}]\\\",\\\"validCount\\\":\\\"1\\\",\\\"roomId\\\":\\\"\\\",\\\"fullCarNoStr\\\":\\\"苏ANJKT6,苏ANJKTTT\\\",\\\"remak\\\":\\\"\\\",\\\"cardId\\\":5,\\\"lotCount\\\":1,\\\"contact\\\":\\\"测试\\\",\\\"useName\\\":\\\"测试\\\",\\\"tel\\\":\\\"123465842\\\",\\\"cardState\\\":1,\\\"carLotList\\\":\\\"[{\\\\\\\"cardType\\\\\\\":8,\\\\\\\"lotName\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"duration\\\\\\\":0,\\\\\\\"times\\\\\\\":0,\\\\\\\"carType\\\\\\\":8,\\\\\\\"areaId\\\\\\\":\\\\\\\"-1\\\\\\\",\\\\\\\"balance\\\\\\\":0,\\\\\\\"areaName\\\\\\\":\\\\\\\"所有区域\\\\\\\",\\\\\\\"validValue\\\\\\\":0,\\\\\\\"cardId\\\\\\\":5,\\\\\\\"lotCount\\\\\\\":1,\\\\\\\"id\\\\\\\":5,\\\\\\\"beginTime\\\\\\\":\\\\\\\"2021-07-23\\\\\\\",\\\\\\\"endTime\\\\\\\":\\\\\\\"2022-04-13\\\\\\\",\\\\\\\"ruleId\\\\\\\":6,\\\\\\\"carTypeName\\\\\\\":\\\\\\\"员工卡\\\\\\\"}]\\\",\\\"lastUpdateTime\\\":\\\"2022-02-22 11:21:36\\\"}\",\"resCode\":\"0\",\"resMsg\":\"成功\"}}";
    JSONObject jsonObject1 = JSONObject.parseObject(jsonStr);
    JSONObject jsonObject3 =
        JSONObject.parseObject((String) ((JSONObject) jsonObject1.get("data")).get("data"));
    System.out.println(JSON.toJSONString(jsonObject3));

    JSONObject jsonObject4 = new JSONObject();
    jsonObject4.put("aaa", 111);
    jsonObject4.put("bbb", 222);

    ArrayList<JSONObject> list = Lists.newArrayList();

    jsonObject4.put("ccc", 333);
    jsonObject4.put("ddd", new Student("xiaoxiao", 18));
    list.add(jsonObject4);
    JSONObject clone = (JSONObject) jsonObject4.clone();
    clone.put("ccc", 666);
    list.add(clone);

    System.out.println(JSON.toJSONString(list));

    System.out.println("=========================================================================");

    String jsonStrs =
        "{\"page\":{\"haveNext\":0,\"list\":[{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"小杨\",\"carOwnerNo\":\"C220323193725DTKQ\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-24 09:17:20\",\"deadline\":\"2022-05-22\",\"id\":123763777601539,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-24 09:29:12\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"19926559327\",\"regTime\":\"2022-03-24 09:17:20\",\"registerPlate\":\"鄂C87663\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"小杨\",\"carOwnerNo\":\"C220323193725DTKQ\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-24 09:17:20\",\"deadline\":\"2022-05-22\",\"id\":123763777601540,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-24 09:29:12\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"19926559327\",\"regTime\":\"2022-03-24 09:17:20\",\"registerPlate\":\"鄂P87663\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"\",\"carOwnerNo\":\"\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-21 16:47:03\",\"deadline\":\"2022-06-13\",\"id\":122595546497032,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-22 13:54:30\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-03-21 16:47:03\",\"registerPlate\":\"鄂F45512\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"陈超越\",\"carOwnerNo\":\"C122595546497025\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-21 10:28:57\",\"deadline\":\"2022-06-13\",\"id\":122595546497025,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-22 12:31:34\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-03-21 10:28:57\",\"registerPlate\":\"鄂F12379\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"陈超越\",\"carOwnerNo\":\"C122183229636610\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-15 17:44:05\",\"deadline\":\"2022-06-13\",\"id\":122183229636610,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-22 12:31:35\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-03-15 17:44:05\",\"registerPlate\":\"鄂F12345\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"陈超\",\"carOwnerNo\":\"C122183229636609\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-15 15:23:43\",\"deadline\":\"2022-04-14\",\"id\":122183229636609,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-15 15:23:43\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-03-15 15:23:43\",\"registerPlate\":\"鄂F12344\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"1\",\"carOwnerNo\":\"C120877559578625\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-03-04 13:30:32\",\"deadline\":\"2022-06-03\",\"id\":120877559578625,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-03-10 17:43:40\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-03-04 13:30:32\",\"registerPlate\":\"京QRT566\",\"remark\":\"\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"方市\",\"carOwnerNo\":\"C120533962194945\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-02-28 17:08:11\",\"deadline\":\"2022-03-27\",\"id\":120533962194945,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-02-28 17:08:11\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-02-28 17:08:11\",\"registerPlate\":\"粤B23452\",\"remark\":\"\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"测试123\",\"carOwnerNo\":\"C118334938939393\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-01-19 10:09:04\",\"deadline\":\"2022-01-18\",\"id\":118334938939393,\"idNumber\":\"350781196403079002\",\"lastUpdatedTime\":\"2022-01-19 10:09:04\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"15738816334\",\"regTime\":\"2022-01-19 10:09:04\",\"registerPlate\":\"沪AVIP99\",\"remark\":\"12323\"},{\"address\":\"\",\"balance\":0.0,\"carOwnerName\":\"张三\",\"carOwnerNo\":\"C117579024695297\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-01-14 17:32:52\",\"deadline\":\"2022-03-10\",\"id\":117579024695297,\"idNumber\":\"\",\"lastUpdatedTime\":\"2022-02-11 14:49:53\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"\",\"regTime\":\"2022-01-14 17:32:52\",\"registerPlate\":\"粤B86524\"},{\"address\":\"23\",\"balance\":0.0,\"carOwnerName\":\"1123\",\"carOwnerNo\":\"C53532472377345\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2022-01-10 14:54:38\",\"deadline\":\"2022-02-09\",\"id\":117166707834881,\"idNumber\":\"421181199110085011\",\"lastUpdatedTime\":\"2022-01-10 14:54:38\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"18520332050\",\"regTime\":\"2022-01-10 14:54:38\",\"registerPlate\":\"粤B334321\",\"remark\":\"\"},{\"address\":\"23\",\"balance\":0.0,\"carOwnerName\":\"1123\",\"carOwnerNo\":\"C53532472377345\",\"carTypeName\":\"小型车\",\"carTypeNo\":\"C51539607552001\",\"createdTime\":\"2021-03-16 16:07:42\",\"deadline\":\"2022-02-04\",\"id\":53532472377345,\"idNumber\":\"421181199110085011\",\"lastUpdatedTime\":\"2022-01-10 10:27:48\",\"onlinePay\":0,\"passType\":2,\"passportState\":0,\"passportTypeName\":\"月租车\",\"passportTypeNo\":\"C51539607552002\",\"phone\":\"18520332050\",\"regTime\":\"2021-03-16 16:07:42\",\"registerPlate\":\"粤B23456\",\"remark\":\"\"}],\"pageNum\":1,\"pageSize\":20,\"total\":12},\"parkId\":\"XhfIJc0Uv-2RZVaYnhZBj1\",\"responseCode\":\"0\",\"responseMsg\":\"SUCCESS\",\"success\":true}";
    JSONArray jsonArray =
        JSONObject.parseObject(jsonStrs).getJSONObject("page").getJSONArray("list");
    Map<Object, List<Object>> carOwnerNo =
        jsonArray.stream()
            .collect(
                Collectors.groupingBy(item -> JSON.parseObject(item.toString()).get("carOwnerNo")));
    System.out.println(carOwnerNo);

    String o =
        (String)
            jsonArray.stream()
                .filter(i -> ((JSONObject) i).get("carOwnerName").equals("小杨s"))
                .map(item -> ((JSONObject) item).get("registerPlates"))
                .findFirst()
                .orElse(null);
    System.out.println(o);

    System.out.println("1000");
    String fields =
        " carParkingCode, carNo, orderId,"
            + " inTime, outTime, stayTime, money, finalMoney, payType";

    ArrayList<String> list1 = new ArrayList<>();
    /*list1.add("1");
    list1.add("1,2,3");
    list1.add("3,4,5");
    list1.add("6");*/

    Set<Long> collect1 =
        Arrays.stream(
                list1.stream()
                    .filter(i -> !org.apache.commons.lang3.StringUtils.isBlank(i))
                    .collect(Collectors.joining(","))
                    .split(","))
            .filter(i -> !org.apache.commons.lang3.StringUtils.isBlank(i))
            .map(i -> Long.valueOf(i))
            .collect(Collectors.toSet());
    System.out.println(collect1.isEmpty());

    Integer aab = 123;
    HashMap<Long, String> map1 = Maps.newHashMap();
    map1.put(123L, "8888");
    System.out.println(map1.get(aab));

    JSONObject jsonObject5 = new JSONObject();
    jsonObject5.put("name", "jsons");
    jsonObject5.put("age", 29);
    jsonObject5.put("ok", 222);
    com.example.demo.pojo.Student student =
        JSONObject.parseObject(jsonObject5.toJSONString(), com.example.demo.pojo.Student.class);
    System.out.println(student);
    String hanhan = "车位编辑-车场(状态有效:不可-编辑，无效:可编辑)";
    System.out.println(hanhan.length());
    String s = org.apache.commons.lang3.StringUtils.substringBefore(hanhan, "-");
    System.out.println(s);

    String fast = null;
    String kap = (fast == null ? ' ' : fast) + "-";
    System.out.println(kap);
    String s1 = org.apache.commons.lang3.StringUtils.substringBefore(kap, "-");
    System.out.println(s1);

    String sng = "zMbX2b2zgL/Jl1RrO2+pxjIPwME%3D";
    System.out.println(URLEncoder.encode(sng, "UTF-8"));

    System.out.println("01003015003002003000".length());

    System.out.println("  222   jjj".trim());

    HashMap<String, Object> objectObjectHashMap = Maps.newHashMapWithExpectedSize(5);
    objectObjectHashMap.put("a", 1);
    objectObjectHashMap.put("b", 671024);
    System.out.println(Long.valueOf(String.valueOf(objectObjectHashMap.get("b"))));
    System.out.println("2022-06-13 00:00:00".substring(0, 10));
    System.out.println(String.valueOf(1.22F));

    String url = "http://10.32.2.2:8103/ipms/car/delete/{0}/{1}";
    String[] str2 = {"123", "223"};
    List<String> collect2 = Arrays.stream(str2).collect(Collectors.toList());
    String format = MessageFormat.format(url, collect2);
    System.out.println(format);

    String[] str3 = {"1", "1", "0"};
    long count = Arrays.stream(str3).filter(i -> "1".equals(i)).count();
    System.out.println(count);
    List<String> collect3 = Arrays.stream(str3).distinct().collect(Collectors.toList());
    System.out.println(collect3);
    /* List<String> patrolSpotInstChecks = null;
    List<String> collect3 =
        patrolSpotInstChecks.stream().filter(i -> "1".equals(i)).collect(Collectors.toList());
    System.out.println(collect3);*/

    System.out.println(5 - 2 + "");

    Integer aap = 0;
    System.out.println(-aap);

    String appd = null;
    System.out.println(JSONObject.toJSONString(null));

    JsonPojo niao = new JsonPojo(1, "niao", "1872881", new Date());
    JSONObject jsonsp = (JSONObject) JSONObject.toJSON(niao);
    System.out.println(jsonsp.toJSONString());
    Object dql = jsonsp.get("dql");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
    String format1 = simpleDateFormat.format(dql);
    jsonsp.put("dql", format1);
    System.out.println(jsonsp.toJSONString());

    JsonPojo aaa = new JsonPojo(1, "aaa", "213");
    JsonPojo bbb = new JsonPojo(1, "bbb", "223");
    ArrayList<JsonPojo> list2 = Lists.newArrayList();
    list2.add(aaa);
    list2.add(bbb);
    Map<Integer, String> collect4 =
        list2.stream()
            .collect(Collectors.toMap(JsonPojo::getId, JsonPojo::getTelNo, (k1, k2) -> k2));
    System.out.println(collect4);
    HashMap<String, String> ob = null;

    ob = Maps.newHashMapWithExpectedSize(1);
    // ob = null;
    System.out.println(ob.get("222"));
    String fees = "17#64990024#18#64990024#";
    System.out.println(fees.length());
    HashMap<String, String> mapFee = new HashMap<>();
    String[] split = org.apache.commons.lang3.StringUtils.split(fees, "#");
    for (int i = 0; i < split.length; i++) {
      if (i % 2 == 0) {
        mapFee.put(split[i], split[i + 1]);
      }
    }
    System.out.println(JSONObject.toJSONString(mapFee));

    System.out.println(
        new Double(9.0)
            .compareTo(Double.parseDouble(org.apache.commons.lang3.StringUtils.trim("1.0"))));

    String money = String.valueOf(new BigDecimal(1213).multiply(new BigDecimal(100)).intValue());
    System.out.println(money);

    System.out.println(String.valueOf((0.01 * 100)));

    HashMap hashMap = Maps.newHashMap();
    hashMap.put("aaa", 1234L);
    System.out.println(((int) 1234) == (long) hashMap.get("aaa"));

    System.out.println("e6c163090ca52e9f620812ef566bb46c".length());
    System.out.println("7e42e2ea56c633be16b5a28f41dd1145".length());

    Integer time = 1664467200;

    System.out.println(DateUtils.formatDateToStringYYMMDDHHmmss(new Date(time.longValue() * 1000)));

    System.out.println("THIRD_PARTY_MONTHCARD_FEEITEM_TYPE".length());

    String carNos = "鄂F鄂Q";
    System.out.println(carNos.replace(",", ":"));

    long aijd = 1654013300;
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String inTimeStr = sf.format(new Date(aijd * 1000));
    System.out.println(inTimeStr);

    Date currentDate = new Date();
    System.out.println(DateUtils.formatDateToStringYY_MM_DD(currentDate));

    Date date = DateUtils.addDateDay(currentDate, -1);
    System.out.println(DateUtils.formatDateToStringYY_MM_DD(date));

    long pa = 0L;
    System.out.println(pa == 0);

    int sames = 0;
    sames++;
    System.out.println(sames);

    System.out.println(new Date().getTime() / 1000);

    System.out.println(
        new BigDecimal(String.valueOf(1.78427486212))
            .setScale(4, BigDecimal.ROUND_HALF_UP)
            .toPlainString());

    final int[] num = {0};
    String[] arrq = {"212", "3224", "444"};

    Arrays.stream(arrq)
        .forEach(
            i -> {
              if (num[0] > 0) {
                System.out.println("2323" + i);
              }
              num[0]++;
            });

    String skal = ",0,1";
    System.out.println(skal.substring(1));

    List<String> collect5 = Arrays.stream(arrq).collect(Collectors.toList());
    Iterator<String> iterator = collect5.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().equals("3224")) {
        iterator.remove();
      }
    }
    System.out.println(collect5);
    System.out.println(collect5.contains("212"));

    String dateStr = "2022-08-16 13:02:54";
    String stayTime = "25";
    // 计算开始时间
    try {
      Date outDate = sf.parse(dateStr);
      long compareTime = outDate.getTime() - (Integer.parseInt(stayTime) * 60 * 1000); // 开始时间
      System.out.println(sf.format(new Date(compareTime)));
    } catch (ParseException e) {
      e.printStackTrace();
    }

    System.out.println((int) ((Math.random() * 9 + 1) * 10000000));

    String s2 = DateUtils.hourBetween(new Date(), -2 * 60);
    System.out.println(s2);

    ArrayList<Integer> list3 = new ArrayList<>();
    list3.add(1);
    list3.add(3);
    list3.add(2);
    Integer[] inArray = list3.toArray(new Integer[list3.size()]);
    System.out.println(inArray);

    System.out.println("TEMP_MONTHCARD_MARK" + (new Date().getTime() / 1000));

    System.out.println(
        org.apache.commons.lang3.StringUtils.substringAfterLast("222_0093_992", "_"));

    System.out.println(String.format("%04d", 23));

    HashMap<String, Integer> objectObjectHashMap2 = new HashMap<>();
    Integer aqo = 0;
    objectObjectHashMap2.put("aa", aqo++);
    System.out.println(JSONObject.toJSONString(objectObjectHashMap2));

    Date expiredDate = DateUtils.parseStringToDateYYMMDDHHmmss("0001-01-01 23:59:59");
    if (expiredDate == null || (new Date()).getTime() > expiredDate.getTime()) {
      System.out.println("guoqi");
    }

    String version = "1.21";
    double v = Double.parseDouble(org.apache.commons.lang3.StringUtils.trim(version));
    System.out.println(v);
    if (new Double(9.0).compareTo(v) > 0) {
      System.out.println("小于9.0");
      if (Double.parseDouble(version) >= new Double(1.2)
          && Double.parseDouble(version) <= new Double(2.0)) { // 1.2版本设置过期不能缴费
        System.out.println("过期不能缴费");
      }
    }

    System.out.println("粤B12345".substring(0, 2));

    // Date currentDate1 = new Date();
    String currentDate1 = "2022-09-23 00:10:00";
    String end = DateUtils.formatDateToStringYYMMDDHHmmss(currentDate);
    // 开始时间
    System.out.println(
        DateUtils.hourBetween(DateUtils.parseStringToDateYYMMDDHHmmss(currentDate1), -(2 * 60)));

    JsonPojo ccc = new JsonPojo(1, "aaa", "213");
    JsonPojo ddd = new JsonPojo(2, "bbb", "333");
    JsonPojo eee = new JsonPojo(3, "aaa", "333");
    JsonPojo fff = new JsonPojo(4, "bbb", "111");
    ArrayList<JsonPojo> jlist = Lists.newArrayList();
    jlist.add(ccc);
    jlist.add(ddd);
    jlist.add(eee);
    jlist.add(fff);

    System.out.println("201921222================================");
    Map<String, Map<String, List<JsonPojo>>> collect7 =
        jlist.stream()
            .collect(
                Collectors.groupingBy(
                    JsonPojo::getUsername, Collectors.groupingBy(JsonPojo::getTelNo)));
    System.out.println(JSON.toJSONString(collect7));

    System.out.println("201921222================================");
    Map<String, JsonPojo> collect6 =
        jlist.stream()
            .collect(
                Collectors.groupingBy(
                    JsonPojo::getUsername,
                    Collectors.collectingAndThen(
                        Collectors.maxBy(
                            Comparator.comparingInt(i -> Integer.parseInt(i.getTelNo()))),
                        Optional::get)));

    System.out.println(JSON.toJSONString(collect6));

    System.out.println(
        BigDecimal.valueOf(
                Float.parseFloat("4500.00")
                    / 15000
                    * 13000) // 1399 10592 2407  10593 2408   10592 2408
            .setScale(0, BigDecimal.ROUND_HALF_UP));

    System.out.println(new BigDecimal(9100 + 13000 - 11000));

    System.out.println(Double.parseDouble("4500.00") / 15000 * 13000);
    System.out.println(Float.parseFloat("4500.00") / 15000 * 13000);

    System.out.println(new BigDecimal((-1000.00) / 6).setScale(0, BigDecimal.ROUND_DOWN));
    System.out.println((-1000.00) % 6);
    if ((-1000.00) % 6 < 0) {
      System.out.println(1111);
    }

    String param =
        "{\"OrderNo\":\"220809151101111123411262521\",\"ParkCode\":\"140123001\",\"ParkName\":\"6.0对接测试\",\"CarNo\":\"川PYUTY5\",\"EnterTime\":\"2022-11-09 10:15:00\",\"ExitTime\":\"2022-11-09 16:00:00\",\"UserId\":\"0\",\"OrderTime\":\"2022-08-09 15:11:04\",\"TotalMoney\":15.0,\"OrderMoney\":15.0,\"CouponMoney\":0.0,\"DeduMoney\":0.0,\"PayType\":19,\"Desc\":\"车位临停费\"}";
    String s3 = MD5Util.md5(param.concat("206d98f4de9e4423b3aa42cd0c36fd84"));
    System.out.println(s3);
  }

  public static boolean isNull(Object obj) {
    if (obj == null) {
      return true;
    } else if (!(obj instanceof String)) {
      if (obj instanceof Collection) {
        return ((Collection) obj).size() == 0;
      } else if (obj instanceof Map) {
        return ((Map) obj).size() == 0;
      } else {
        return false;
      }
    } else {
      return "".equals(obj) || "null".equals(obj);
    }
  }

  private static boolean checkNoRepeat(String[] nums) {
    Set<String> numSet = new HashSet<>();
    for (String num : nums) {
      numSet.add(num.toLowerCase());
    }
    return nums.length != numSet.size();
  }
}
