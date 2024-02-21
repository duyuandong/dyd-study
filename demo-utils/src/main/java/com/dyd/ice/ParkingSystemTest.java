package com.dyd.ice;

import IceExt.IceClientUtil;
import com.alibaba.fastjson.JSON;
import segi.common.organ.COrginfoIQueryRpcClient;
import segi.datacachesvr.queryCustomInfo.CCustomInfoIPrx;
import segi.datacachesvr.queryInfo.*;
import segi.datacachesvr.queryparkingsys.ParkingSystemIPrx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.ice.ParkingSystemTest
 * @date ：Created in 2023/7/6 11:31
 * @description：
 * @modified By：
 * @version:
 */
public class ParkingSystemTest {

    private static ParkingSystemIPrx getParkingSystemIPrx() {return IceClientUtil.getServicePrxByClass(ParkingSystemIPrx.class);}

    private static CCommonIPrx getCCommonIPrx() {return IceClientUtil.getServicePrxByClass(CCommonIPrx.class);}

    private static CCustomInfoIPrx getCCustomInfoIPrx() {return IceClientUtil.getServicePrxByClass(CCustomInfoIPrx .class);}

    private static CCommunityIPrx getCCommunityIPrx() {return IceClientUtil.getServicePrxByClass(CCommunityIPrx.class);}

    public static void main(String[] args) {
        reqPayDictInfoByOpts reqPayDictInfoByOpts = new reqPayDictInfoByOpts();
        //reqPayDictInfoByOpts.setDictCode();
        /*reqPayDictInfoByOpts.setDictType("PAY_METHOD");
        retPayDictInfoByOpts retPayDictInfoByOpts = getCCommonIPrx().queryPayDictInfoByOpts(reqPayDictInfoByOpts, 0, 1);
        System.out.println(JSONObject.toJSONString(retPayDictInfoByOpts.data));
        retPayChannelInfoByOpts retPayChannelInfoByOpts = getCCommonIPrx().queryPayChannelInfoByOpts(new reqPayChannelInfoByOpts(), 0, 1);
        System.out.println(JSONObject.toJSONString(retPayChannelInfoByOpts.data));
        reqPayChannelMethodByOpts reqPayChannelMethodByOpts = new reqPayChannelMethodByOpts();
        reqPayChannelMethodByOpts.setPayStatus(new long[]{1});
        retPayChannelMethodByOpts retPayChannelMethodByOpts = getCCommonIPrx().queryPayChannelMethodByOpts(reqPayChannelMethodByOpts, 0, 1);
        System.out.println(JSONObject.toJSONString(retPayChannelMethodByOpts.data));*/
        /*retCustomerDetail retCustomerDetail = getCCustomInfoIPrx().queryCustInfoByCustIdV4(
                Integer.parseInt("112513120"), 0, 1);
        System.out.println(JSONObject.toJSONString(retCustomerDetail));
        TCustomInfo tCustomInfo = getCCustomInfoIPrx().queryCustInfoByCustId(67, 112513120, 0, 1);
        System.out.println(JSONObject.toJSONString(tCustomInfo));*/
/*
        BigDecimal sumFee = new BigDecimal("0");
        BigDecimal addFee = new BigDecimal("2000");
        for (int i = 0; i < 5; i++) {
            sumFee = sumFee.add(addFee);
        }
        System.out.println(sumFee);
        System.out.println((3.8 * 100000000 * 60 * 60 * 24 * 365)/1000 + "km");
        System.out.println(0.00000000000339 * (3.8 * 100000000 * 60 * 60 * 24 * 365));

        System.out.println("2020-06-24 05:05:37".substring(0,10));
        BigDecimal ab = new BigDecimal("100");
        System.out.println(ab.add(new BigDecimal("100")));*/

        List<Map> position = getPosition();
        System.out.println(JSON.toJSONString(position));
    }

    public static List<Map> getPosition(){
        List<Map> resultList = new ArrayList<Map>();
        PositionV2[] positionV2s = getCCommunityIPrx().queryPositionListByCommuIdV2(67, COrginfoIQueryRpcClient.nOrganID, COrginfoIQueryRpcClient.channel);
        List<Long> upPositionIds = new ArrayList<Long>();
        for (PositionV2 positionV2 : positionV2s) {
            if(positionV2.getPositionType() == 1 && positionV2.getSubPositionType() == 2) {
                upPositionIds.add(Long.parseLong(positionV2.getUpPositionId()+""));
            }
        }
        long[] upPosIds = new long[upPositionIds.size()];
        for (int i = 0; i < upPositionIds.size(); i++) {
            upPosIds[i] = upPositionIds.get(i);
        }
        retPositionListV3 retPositionList = getCCommunityIPrx().queryPositionListByIds(upPosIds, COrginfoIQueryRpcClient.nOrganID, COrginfoIQueryRpcClient.channel);
        PositionV3[] positions = null;
        if(retPositionList.getCode() == 0) {
            positions = retPositionList.getData();
        }

        for (PositionV2 positionV2 : positionV2s) {
            StringBuilder sb = new StringBuilder();
            if(positionV2.getPositionType() == 1 && positionV2.getSubPositionType() == 2 && positions != null) {
                for (PositionV3 position : positions) {
                    if (positionV2.getUpPositionId() == position.getPositionId()) {
                        sb.append(position.getPositionName());
                        break;
                    }
                }
            }
            sb.append(" ").append(positionV2.getPositionName());

            resultList.add(createMapByTextValue(sb.toString(), positionV2.getPositionId()));
        }
        return resultList;
    }

    private static Map createMapByTextValue(Object text, Object value) {
        Map resMap = new HashMap();
        resMap.put("C_TEXT", text);
        resMap.put("C_VALUE", value);
        return resMap;
    }
}

