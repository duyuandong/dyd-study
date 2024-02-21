package com.dyd.test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.StringUtilsTest2
 * @date ：Created in 2023/8/9 11:20
 * @description：
 * @modified By：
 * @version:
 */
public class StringUtilsTest2 {
    public static void main(String[] args) {
//        HashMap<String, String> objectObjectHashMap = Maps.newHashMap();
//        ParkingGuide parkingGuide = new ParkingGuide();
//        parkingGuide.setParkingImg("");
//        //parkingGuide.setParkingTag("dsadsad22");
//        objectObjectHashMap.put("name","jack");
//        objectObjectHashMap.putAll(JSON.parseObject(JSONObject.toJSONString(parkingGuide),new TypeReference<Map<String,String>>(){}));
//        System.out.println(objectObjectHashMap);
//        Integer a= 2;
//        long b = 2;
//        System.out.println(a == b);
//        String str = "1701446399000";
//        Date date = new Date(Long.valueOf(str));
//        System.out.println(DateUtils.formatDateToStringYYMMDDHHmmss(date));
//
//        String demos = "[{\"parkingTag\":\"djsa1\",\"parkingImg\":\"ksidjsjdia\"},{\"parkingTag\":\"djsa2\",\"parkingImg\":\"ksidjsjdia2\"}]";
//
//        List<ParkingGuide> parkingGuides = JSONArray.parseArray(demos).toJavaList(ParkingGuide.class);
//
//        LinkedHashMap<String, Object> map = Maps.newLinkedHashMap();
//        map.put("parkingGuides",parkingGuides);
//        List<ParkingGuide> parkingGuides1 = (List<ParkingGuide>) map.get("parkingGuides");
//        System.out.println(JSONObject.toJSONString(parkingGuides1));
//
//        long aap =100L;
//        Integer bbp = 100;
//        System.out.println(aap == bbp);
//        System.out.println(Math.min(10 * 1, 100));
//
//        String asda = "";
//        ParkingGuide parkingGuide1 = JSONObject.parseObject(asda, ParkingGuide.class);
//        if(parkingGuide1 == null){
//            parkingGuide1 = new ParkingGuide();
//        }
//        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(parkingGuide1, SerializerFeature.WriteNullStringAsEmpty));
//        for (Map.Entry<String, Object> maps : jsonObject.entrySet()) {
//            jsonObject.put(maps.getKey(),"");
//        }
//        HashMap<String, Object> hashMap = new HashMap<>();
//        hashMap.putAll(jsonObject);
//        System.out.println(JSONObject.toJSONString(hashMap));
//
//
//        String sk ="1570030,230004,230004,65070004,230004,9248,280001,63960004,63990002,64350010,280001,64430510,64310012,64480003,64700004,64930036,64740097,65070004,9248";
//        String[] split = sk.split(",");
//        HashSet<Integer> set = new HashSet();
//        for (String utp : split) {
//            set.add(Integer.parseInt(utp));
//        }
//        System.out.println(JSONObject.toJSONString(set));
//
//        HttpResponse<Map<String, String>> response = new HttpResponse<Map<String, String>>();
//        String testData = "{\"code\":\"0\", \"message\":\"success\", \"data\":{\"paySerialNbr\":\"PAK2023082815305498213451442\"} }";
//        Map<String, String> rspMap = JSONObject.parseObject(testData, Map.class);
//        String code = null;
//        String msg = null;
//        String result = null;
//        String rspSign = null;
//        code = String.valueOf(rspMap.get(IfsConstant._FLAG));
//        msg = rspMap.get(IfsConstant._MSG);
//        result = rspMap.get(IfsConstant._RESULT);
//        rspSign = rspMap.get(IfsConstant._SIGNATURE);
//
//        response.setCode(code);
//        response.setMsg(msg);
//        response.setEntity(rspMap);
//        String codes = NullUtil.isNull(response.getCode()) ? response.getEntity().get("code") : response.getCode();
//
//        String val = "123.45";
//        System.out.println(new BigDecimal(val).negate().toPlainString());
//
//        BigDecimal allCosting = new BigDecimal("3300").divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
//        System.out.println(allCosting.add(new BigDecimal("33")));
//
//        String jsonList = "[{\"payLimitName\":\"正常\",\"amount\":1,\"houseId\":\"18704060\",\"billObjType\":\"2\",\"feeItemTypeId\":\"1200004\",\"resInstName\":\"产权测试专用车场_CQCW-0000001\",\"fee\":\"3300\",\"billEnd\":\"20230831235959\",\"realCycle\":\"202308\",\"detailId\":\"266833801\",\"custName\":\"测试1118\",\"rateStr\":\"33\",\"initVal\":-1,\"endVal\":-1,\"resInstId\":\"45092124\",\"totalFee\":\"3300\",\"acctItemTypeId\":\"3025\",\"billingCycle\":\"202308\",\"custId\":\"27536148\",\"billStart\":\"20230801000000\",\"lfree\":\"0\",\"feeItemName\":\"停车费(月卡)\",\"payLimitId\":\"11\",\"communityId\":\"13811480\"},{\"payLimitName\":\"正常\",\"amount\":1,\"houseId\":\"18704060\",\"billObjType\":\"2\",\"feeItemTypeId\":\"1200004\",\"resInstName\":\"产权测试专用车场_CQCW-0000001\",\"fee\":\"3300\",\"billEnd\":\"20230930235959\",\"realCycle\":\"202309\",\"detailId\":\"266833802\",\"custName\":\"测试1118\",\"rateStr\":\"33\",\"initVal\":-1,\"endVal\":-1,\"resInstId\":\"45092124\",\"totalFee\":\"3300\",\"acctItemTypeId\":\"3025\",\"billingCycle\":\"202309\",\"custId\":\"27536148\",\"billStart\":\"20230901000000\",\"lfree\":\"0\",\"feeItemName\":\"停车费(月卡)\",\"payLimitId\":\"2\",\"communityId\":\"13811480\"}]";
//        List<BillInfoDto> billInfoDtos = JSONArray.parseArray(jsonList, BillInfoDto.class);
//        Long sumFee = 0L;
//        String currentDate = DateUtils.formatDateToStringYYYYMMDD(new Date());
//        for (BillInfoDto billInfoDto : billInfoDtos) {
//            if(Long.valueOf(billInfoDto.getBillStart().substring(0,6)) < Long.valueOf(currentDate.substring(0,6))){
//                sumFee += Long.parseLong(billInfoDto.getFee());//分
//            }
//        }
//        System.out.println(sumFee);
//
//
//        String ska= "{\"baseCode\":\"\",\"changeID\":\"cardId\",\"changeType\":\"2\",\"data\":[{\"authAreaIds\":\"45007495\",\"carList\":[{\"houseId\":\"994501\",\"carNo\":\"粤BK455M\",\"carRelId\":\"155694\",\"carId\":\"214251\",\"status\":\"1\"}],\"cardCode\":\"DFHYXQCC0447\",\"cardId\":\"148352\",\"cardTypeCode\":\"\",\"cardTypeId\":\"11545\",\"cardTypeName\":\"月卡A\",\"changeType\":2,\"communityId\":\"1006559\",\"companyAddress\":\"\",\"effDate\":\"2023-09-01 00:00:00\",\"expDate\":\"2023-10-31 23:59:59\",\"isPropertyCar\":0,\"mobile\":\"13686409188\",\"paid\":\"378.00\",\"parkingCode\":\"DFHYXQCC01\",\"parkingIds\":\"45016168\",\"payDate\":\"2023-09-15 14:32:44\",\"payMethod\":\"8\",\"payMonth\":\"1\",\"userName\":\"王冰\"}],\"dataArea\":\"push_monthcard_to_third\"}";
//        ParkingMainDataPushMsgBodyDto parkingMainDataPushMsgBodyDto = JSONObject.parseObject(ska, ParkingMainDataPushMsgBodyDto.class);
//        System.out.println(JSONObject.toJSONString(parkingMainDataPushMsgBodyDto,SerializerFeature.WriteEnumUsingToString));
//        System.out.println(FastjsonUtils.toJsonString(parkingMainDataPushMsgBodyDto));
//
//        System.out.println(new BigDecimal("0").compareTo(new BigDecimal(0)) == 1);
//
//        System.out.println(DateUtils.formatDateToStringYYMMDD(DateTimeUtils.addDayByMonth(DateUtils.parseStringToDateYYMMDDHHmmss("2023-09-15 23:59:59"),0)));
//
//
//        String jsonString = "[{\"version\":null,\"acctItemId\":75088275,\"communityId\":671024,\"realCommunityId\":null,\"houseId\":0,\"userId\":null,\"acctItemTypeId\":3027,\"fee\":9600.00,\"amount\":null,\"unitType\":null,\"billingCycle\":202309,\"createDate\":null,\"stateDate\":null,\"billDateStart\":\"2023-09-19\",\"billDateEnd\":\"2023-09-30\",\"billDateStart1\":null,\"billDateEnd1\":null,\"payLimitId\":33,\"istrans\":null,\"lockTime\":null,\"paySerialId\":null,\"state\":null,\"lfree\":0.00,\"channel\":null,\"synTime\":null,\"taskId\":null,\"payUserid\":112594219,\"billFlag\":null,\"invoicePrintStatus\":null,\"noticeFlag\":null,\"taskType\":null,\"taxRate\":13.00,\"taxFee\":null,\"lfreeTaxRate\":null,\"lfreeTaxFee\":null,\"feeItemTypeId\":230004,\"paidLfree\":0,\"paidFee\":9600,\"businessType\":null,\"ruleInstId\":null,\"oweSync\":null,\"lfreeBeginDate\":null,\"lfreeRateId\":null,\"initVal\":null,\"endVal\":null,\"srcAcctItemId\":null,\"adjustCount\":0,\"objId\":null,\"billRuleId\":null,\"resInstId\":null,\"billObjType\":28,\"dataBatch\":null,\"rateStr\":null,\"realCycle\":202309,\"houseName\":\"\",\"custName\":\"张三002\",\"feeItemTypeName\":\"AA停车费\",\"realAcctItemIds\":\"75088275\",\"payLimitIdCur\":null,\"organId\":null,\"resInstCode\":\"CARD00YUEZY018-鄂B01015\",\"resInstName\":\"CARD00YUEZY018-鄂B01015\",\"buildId\":null,\"unitId\":null,\"buildName\":null,\"unitName\":null,\"objType\":23,\"objCode\":\"\",\"objName\":null,\"receivableDate\":null,\"lfreeHangupFlag\":null,\"lfreeHangupFlagCur\":null,\"houseStatus\":null,\"houseStatusName\":null,\"houseStatusType\":null,\"houseStatusTypeName\":null,\"lfreeTotal\":0.00,\"amountAdjustment\":null,\"receivableAdjustment\":null,\"belongResId\":null,\"acctItemIdList\":null,\"operatingId\":-1,\"operatingName\":\"\"},{\"version\":null,\"acctItemId\":75088276,\"communityId\":671024,\"realCommunityId\":null,\"houseId\":0,\"userId\":null,\"acctItemTypeId\":3027,\"fee\":25000.00,\"amount\":null,\"unitType\":null,\"billingCycle\":202310,\"createDate\":null,\"stateDate\":null,\"billDateStart\":\"2023-10-01\",\"billDateEnd\":\"2023-10-31\",\"billDateStart1\":null,\"billDateEnd1\":null,\"payLimitId\":0,\"istrans\":null,\"lockTime\":null,\"paySerialId\":null,\"state\":null,\"lfree\":0.00,\"channel\":null,\"synTime\":null,\"taskId\":null,\"payUserid\":112594219,\"billFlag\":null,\"invoicePrintStatus\":null,\"noticeFlag\":null,\"taskType\":null,\"taxRate\":13.00,\"taxFee\":null,\"lfreeTaxRate\":null,\"lfreeTaxFee\":null,\"feeItemTypeId\":230004,\"paidLfree\":0,\"paidFee\":25000,\"businessType\":null,\"ruleInstId\":null,\"oweSync\":null,\"lfreeBeginDate\":null,\"lfreeRateId\":null,\"initVal\":null,\"endVal\":null,\"srcAcctItemId\":null,\"adjustCount\":0,\"objId\":null,\"billRuleId\":null,\"resInstId\":null,\"billObjType\":28,\"dataBatch\":null,\"rateStr\":null,\"realCycle\":202310,\"houseName\":\"\",\"custName\":\"张三002\",\"feeItemTypeName\":\"AA停车费\",\"realAcctItemIds\":\"75088276\",\"payLimitIdCur\":null,\"organId\":null,\"resInstCode\":\"CARD00YUEZY018-鄂B01015\",\"resInstName\":\"CARD00YUEZY018-鄂B01015\",\"buildId\":null,\"unitId\":null,\"buildName\":null,\"unitName\":null,\"objType\":23,\"objCode\":\"\",\"objName\":null,\"receivableDate\":null,\"lfreeHangupFlag\":null,\"lfreeHangupFlagCur\":null,\"houseStatus\":null,\"houseStatusName\":null,\"houseStatusType\":null,\"houseStatusTypeName\":null,\"lfreeTotal\":0.00,\"amountAdjustment\":null,\"receivableAdjustment\":null,\"belongResId\":null,\"acctItemIdList\":null,\"operatingId\":-1,\"operatingName\":\"\"}]";
//        List<AdjustDetail> adjustDetails = JSONArray.parseArray(jsonString, AdjustDetail.class).stream().filter(i -> i.getPayLimitId() == 0).collect(Collectors.toList());
//        AdjustDetail.feeAvgEveryMonth(adjustDetails,11111);
//        System.out.println(JSONObject.toJSONString(adjustDetails));
//        Map<String, Object> paramMap = Maps.newHashMap();
//        paramMap.put("comunity",1);
//        paramMap.put("list",JSONArray.parseArray(JSONObject.toJSONString(adjustDetails),Map.class));
//        System.out.println(paramMap);
//
//        System.out.println(Lists.newArrayList(1,0).contains(2));
//        int aos = 0 ;
//        aos++;
//        System.out.println(aos);
//
//        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5);
//        ArrayList<Integer> objects = Lists.newArrayList();
//        for (int i = 0; i < integers.size(); i++) {
//            Integer p = null;
//            p=integers.get(0);
//            objects.add(p);
//            p = null;
//        }
//        System.out.println(objects);
//       /* Integer ap = new Integer(0);
//        HashMap<String, Object> maps = new HashMap<>();
//        StringUtilsTest2.getNum(ap,maps);
//        System.out.println(ap);
//        System.out.println(maps);*/
//
//       /* ArrayList<JsonPojo> objects1 = Lists.newArrayList();
//        JsonPojo sjis = new JsonPojo(123, "sjis", "9882");
//        objects1.add(sjis);
//        sjis = null;
//        System.out.println(JSONObject.toJSONString(objects1));*/
//        System.out.println(StringUtilsTest2.charsReplace("粤F12341,  \n" +
//                "粤K23242"));
//        String organName = "海文化园";
//        String fileName = organName+"信息报表";// 需要下载的文件名字
//        String sheetName = organName+"信息报表";// sheet名字
////        if ("1".equals(Constants.JINYU_FLAG)) {
//            fileName = StringUtils.replace(fileName,"报障","保养维修");
//            sheetName = StringUtils.replace(sheetName,"报障","保养维修");
////        }
//        System.out.println(fileName);
//        System.out.println(sheetName);
//        Random random = new Random();
//        int i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
//        i = random.nextInt(10);
//        System.out.println(i);
        ArrayList<String> list = new ArrayList<>();
        list.add("黄金#1");
        list.add("白银#2");
       /* Map<String, String> jumpReasonMap = list.stream().collect(Collectors.toMap(i -> StringUtils.substringAfter(i, "#"), j -> StringUtils.substringBefore(j, "#"), (k1, k2) -> k1));
        Set<String> set = new HashSet<>();
        set.add("1");
        Iterator<String> iterator = jumpReasonMap.keySet().iterator();
        while (iterator.hasNext()){
            if(!set.contains(iterator.next())) iterator.remove();
        }
        System.out.println(JSON.toJSONString(jumpReasonMap));*/

        System.out.println("该巡更点已经\"跳过\"了!");
        HashMap<String, Object> map = Maps.newHashMap();
        HashMap<String, String> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put("sss","");
        objectObjectHashMap.put("bbb","234");
        map.put("data",objectObjectHashMap);
        map.put("ysh","hjdus");
        map.put("kks","");

        System.out.println(JSON.toJSONString(map));


        String ids = StringUtils.substringBefore("1000626,671024,40244579", ",");
        System.out.println(ids);

        System.out.println("01003015003002003000".length());
    }

    public static void getNum(Integer ap,HashMap<String, Object> map){
        ap = 4;
        map.put("sss",1921);
    }

    private static String charsReplace(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }
        if(str.contains("\n")){
            return str.replace("\n","");
        }
        return str.trim();
    }


}
