package com.dyd.test;

import IceExt.IceClientUtil;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import segi.customer.inner.CustomerDetailV2Ice;
import segi.customer.inner.CustomerInfoV2IceRsp;
import segi.customer.inner.CustomerServiceInfPrx;
import segi.datacachesvr.queryCustomInfo.CCustomInfoIPrx;
import segi.datacachesvr.queryInfo.CCommonIPrx;
import segi.datacachesvr.queryparkingsys.ParkingSystemIPrx;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.PayCenterApiTest
 * @date ：Created in 2023/8/9 11:48
 * @description：
 * @modified By：
 * @version:
 */
public class PayCenterApiTest {
    public static final Logger logger = LoggerFactory.getLogger(PayCenterApiTest.class);
    private static ParkingSystemIPrx getParkingSystemIPrx() {return IceClientUtil.getServicePrxByClass(ParkingSystemIPrx.class);}

    private static CCommonIPrx getCCommonIPrx() {return IceClientUtil.getServicePrxByClass(CCommonIPrx.class);}

    private static CCustomInfoIPrx getCCustomInfoIPrx() {return IceClientUtil.getServicePrxByClass(CCustomInfoIPrx.class);}

    private static CustomerServiceInfPrx getCustomerServiceInfPrx(){return IceClientUtil.getServicePrxByClass(CustomerServiceInfPrx.class);}

    public static void main(String[] args) {
        /*reqPayDictInfoByOpts reqPayDictInfoByOpts = new reqPayDictInfoByOpts();
        //reqPayDictInfoByOpts.setDictCode();
        reqPayDictInfoByOpts.setDictType("PAY_METHOD");
        retPayDictInfoByOpts retPayDictInfoByOpts = getCCommonIPrx().queryPayDictInfoByOpts(reqPayDictInfoByOpts, 0, 1);
        System.out.println(JSONObject.toJSONString(retPayDictInfoByOpts.data));
        retPayChannelInfoByOpts retPayChannelInfoByOpts = getCCommonIPrx().queryPayChannelInfoByOpts(new reqPayChannelInfoByOpts(), 0, 1);
        System.out.println(JSONObject.toJSONString(retPayChannelInfoByOpts.data));
        reqPayChannelMethodByOpts reqPayChannelMethodByOpts = new reqPayChannelMethodByOpts();
        reqPayChannelMethodByOpts.setPayStatus(new long[]{1});
        retPayChannelMethodByOpts retPayChannelMethodByOpts = getCCommonIPrx().queryPayChannelMethodByOpts(reqPayChannelMethodByOpts, 0, 1);
        System.out.println(JSONObject.toJSONString(retPayChannelMethodByOpts.data));
        retCustomerDetail retCustomerDetail = getCCustomInfoIPrx().queryCustInfoByCustIdV4(
                Integer.parseInt("112513120"), 0, 1);
        System.out.println(JSONObject.toJSONString(retCustomerDetail));
        TCustomInfo tCustomInfo = getCCustomInfoIPrx().queryCustInfoByCustId(67, 112513120, 0, 1);
        System.out.println(JSONObject.toJSONString(tCustomInfo));*/

        /*retParkingCardTypeParkingRelList retParkingCardTypeParkingRelList = getParkingSystemIPrx().queryParkingCardTypeParkingRelListByOpt(110000579, 67, 0, 0, 0, 1);
        System.out.println(retParkingCardTypeParkingRelList.data.length);
        System.out.println(JSON.toJSONString(retParkingCardTypeParkingRelList));

        stuBillParkingCard stuBillParkingCard = getParkingSystemIPrx().queryBillParkingCardByID(110001403);
        System.out.println(JSON.toJSONString(stuBillParkingCard));*/

        //访客插入
        CustomerDetailV2Ice custIce = new CustomerDetailV2Ice();
        custIce.setCommunityId(String.valueOf(67));
        custIce.setCustName("刘叉叉2");
        custIce.setCustPubType("1");//paramSb.append("&personType=").append("1");//1：个人 2：企业
        custIce.setCustState("1");
        custIce.setCustPhone("15652345116");
        custIce.setCustDesc("车场访客月卡办理");
        custIce.setCertiType("1");
        custIce.setCertiNbr("2233");
        custIce.setCompanyName("刘叉叉公司2test");//公司
        custIce.setCompanyAddress("刘叉叉公司dizhi2test");//地址
        logger.debug("新增访客入参=====》[{}]", JSON.toJSONString(custIce));
        logger.debug("新增访客入参=====》[{}]", 110614190);
        CustomerInfoV2IceRsp custRsp = IceClientUtil.getServicePrxByClass(CustomerServiceInfPrx.class).addOrUpdateCustomer(custIce, "110614190");
        logger.debug("新增访客返回值custRsp=====》[{}]", JSON.toJSONString(custRsp));
        //end

        //月卡查询
      /*  stuBillParkingCard card = getParkingSystemIPrx().queryBillParkingCardByID(110001867);
        System.out.println(JSONObject.toJSONString(card));*/

     /*   AddCustHouseRelParamsIce paramsIce = new AddCustHouseRelParamsIce();
        paramsIce.setCustId("110910013");
        paramsIce.setCommunityId("67");
        paramsIce.setCustStatus("1003");
        paramsIce.setRelType("18");//月卡资源
        paramsIce.setObjId("110001887");
        paramsIce.setCustType("1000");//写死
        logger.debug("===============调用客户关系addCustHouseRel接口:request:{}", JSON.toJSONString(paramsIce));
        RpcResp rpcResp = IceClientUtil.getServicePrxByClass(CustomerServiceInfPrx.class).addCustHouseRel(paramsIce,"-1");
        logger.debug("===============调用客户关系addCustHouseRel接口:response:{}",JSON.toJSONString(rpcResp));
*/
        /*CustHouseInfoV4 custHouseInfoV4 = IceClientUtil.getServicePrxByClass(CCustomInfoIPrx.class).queryCustomInfoByOption(67, "15652345110", 0, 0, 0, null, null, null);
        TCustHouseV4[] dataV4 = custHouseInfoV4.getData();
        logger.info("====手机号和项目id查询=====================custHouseInfo:{}",JSON.toJSONString(custHouseInfoV4));*/

        /*OrderInnerQueryInfPrx servicePrxByClass = IceClientUtil.getServicePrxByClass(OrderInnerQueryInfPrx.class);
        QueryTempByOrganidRsp tempInstListByOrgan = servicePrxByClass.getTempInstListByOrganId(671024, 2);
        logger.info("查询该小区已经开通的服务模板信息:{}", JSON.toJSONString(tempInstListByOrgan));
        BusiTypeListRsp busiTypeInfo = servicePrxByClass.getBusiTypeInfo(671024, 110004110);
        logger.info("根据模版ID获取已授权的模版子类列表:{}", JSON.toJSONString(busiTypeInfo));*/

        /*
        QueryTempByOrganidRsp tempInfoByTemplateCode = servicePrxByClass.getTempInfoByTemplateCode(671024, 1, "Equipment");
        logger.debug("getTempInfoByTemplateCode出参：{}",JSON.toJSONString(tempInfoByTemplateCode));*/

    }
}
