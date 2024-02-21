package com.dyd.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.pojo.DemoExcel;
import com.example.demo.pojo.ParkingExcelPlate;
import com.example.demo.pojo.PorExcel;
import com.example.demo.pojo.TempPojo;
import com.example.demo.pojo.excel.CustomSheetWriteHandler;
import com.google.common.collect.Lists;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.PoiTest
 * @date ：Created in 2023/2/17 14:41
 * @description：
 * @modified By：
 * @version:
 */
public class PoiTest {

  public static void main(String[] args) {
    // getExcel();

    /*ArrayList<PorExcel> list = Lists.newArrayList();
    PorExcel porExcel = null;
    for (int i = 0; i < 10; i++) {
      porExcel = new PorExcel(i, "csss" + i);
      list.add(porExcel);
      porExcel = null;
    }
    System.out.println(JSONObject.toJSONString(list));*/

    /*String message = "sss,ssd";
    System.out.println(Arrays.stream(StringUtils.split(message, ",")).collect(Collectors.toList()));*/
    /*System.out.println(new BigDecimal("1290").divide(new BigDecimal("100")).toPlainString());
    Integer[] aa = {
      43517690, 43518202, 43518732, 43527351, 43527550, 43528543, 43576003, 43576006, 43576009,
      43576012, 43586002, 43586005, 43596037, 43596039, 43596041, 43606070, 43606072
    };
    Arrays.sort(aa);
    String anc = "";
    for (Integer integer : aa) {
      anc += integer + ",";
    }
    System.out.println(anc);

    long[] objects = Arrays.stream("123,223".split(",")).mapToLong(Long::parseLong).toArray();
    System.out.println(JSON.toJSONString(objects));*/
    JSONArray excelV2 = PoiTest.getExcelV2();
    System.out.println(JSONObject.toJSONString(excelV2));
  }

  public static void getExcel() {
    String fileName = "C:\\Users\\Administrator\\Desktop\\标准车位.xlsx";
    File file = new File("C:\\Users\\Administrator\\Desktop\\标准车位.xlsx");
    ArrayList<DemoExcel> list = new ArrayList<>();

    EasyExcel.read(
            fileName,
            DemoExcel.class,
            new PageReadListener<DemoExcel>(
                dataList -> {
                  for (int i = 0; i < dataList.size(); i++) {
                    //
                    if (i == 0) {
                      dataList.get(i).setError("字符串相应错误信息！！");
                      break;
                    }
                  }
                  list.addAll(dataList);
                }))
        .sheet()
        .doRead();
    System.out.println(list.size());
    String fileName2 = "C:\\Users\\Administrator\\Desktop\\down_parking.xlsx";
    try (ExcelWriter build = EasyExcel.write(fileName2).build()) {
      WriteSheet writeSheet1 =
          EasyExcel.writerSheet(0, "车位数据")
              .head(ParkingExcelPlate.class)
              .registerWriteHandler(new CustomSheetWriteHandler())
              .build();
      build.write(list, writeSheet1);

      WriteSheet writeSheet2 = EasyExcel.writerSheet(1, "产权车位状态").head(PorExcel.class).build();
      ArrayList<PorExcel> porList = Lists.newArrayListWithCapacity(3);

      porList.add(new PorExcel(0, "未销售未出租"));
      porList.add(new PorExcel(1, "已销售"));
      porList.add(new PorExcel(2, "未销售已出租"));
      build.write(porList, writeSheet2);

      WriteSheet writeSheet3 = EasyExcel.writerSheet(2, "产权车位状态2").head(String.class).build();
      List<String> kbc = new ArrayList<>();
      kbc.add("未销售未出租");
      kbc.add("已销售");
      kbc.add("未销售已出租");
      build.write(kbc, writeSheet3);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    /*EasyExcel.read(file).sheet().doRead();*/
  }

  public static JSONArray getExcelV2() {
    String fileName =
        "D:\\dydwx\\WXWork\\1688851332184933\\Cache\\File\\2023-04\\凌江府捷顺4.13-4.19.xls";

    JSONArray jsonArray = new JSONArray();
    EasyExcel.read(
            fileName,
            TempPojo.class,
            new PageReadListener<TempPojo>(
                dataList -> {
                  for (int i = 0; i < dataList.size(); i++) {
                    JSONObject data = new JSONObject();
                    data.put("carNo", dataList.get(i).getCarNo());
                    // data.put("carParkingCode", "carp3hw1222cc"); // beta 测试车场code第三方提供
                    data.put("carParkingCode", "88001222"); // 正式 测试车场code第三方提供
                    data.put("finalMoney", dataList.get(i).getPayAmount());
                    data.put("inTime", dataList.get(i).getInTime());
                    data.put("money", dataList.get(i).getPayAmount());
                    data.put("offset", "0");
                    data.put("orderId", dataList.get(i).getOrderNo());
                    data.put("outTime", dataList.get(i).getOutTime());
                    data.put(
                        "payType",
                        "微信".equals(dataList.get(i).getPayType())
                            ? "2"
                            : "支付宝".equals(dataList.get(i).getPayType()) ? "3" : "1");
                    data.put("stayTime", dataList.get(i).getStayMin());
                    /*data.put("telNo", "123156666662");
                    data.put("userName", "test23");*/
                    jsonArray.add(data);
                  }
                }))
        .sheet(0)
        .doRead();

    return jsonArray;
  }
}
