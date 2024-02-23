package com.dyd.test;

import com.dyd.utils.MD5Util;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.test.AuthenticationTest
 * @date ：Created in 2021/12/24 15:21
 * @description：
 * @modified By：
 * @version:
 */
public class AuthenticationTest {

    public static void main(String[] args) {
        String s = JinjiJieShun();
        System.out.println(s);
    }


    public static String JinjiJieShun(){
        String dataItems = "[{\"userTypeId\":\"62e0606f3d0811ebbc39b8cb299b7f2c\",\"parkName\":\"南京国创园\",\"parkInId\":\"ea4e0ba4de324b779909ba8117838b68\",\"ysMoney\":10.0,\"yhMoney\":0.0,\"equipmentId\":\"22222222222222222222222222222222\",\"operatorName\":\"超级管理员\",\"replaceDeduct\":0,\"carNumber\":\"苏-A3U11R\",\"inTime\":\"2021-12-22 13:05:58\",\"itemId\":\"64a7cb8e11194639b1152e8b9eed6651\",\"payType\":\"ZFB\",\"netDiscountMoney\":0.0,\"payFrom\":\"jieshun\",\"feesTime\":\"2021-12-22 14:34:31\",\"parkCode\":\"p201127336\",\"ssMoney\":10.0,\"operatorId\":\"62e1199a3d0811ebbc39b8cb299b7f2c\",\"hgMoney\":0.0},{\"userTypeId\":\"62e0606f3d0811ebbc39b8cb299b7f2c\",\"parkName\":\"南京国创园\",\"parkInId\":\"ea4e0ba4de324b779909ba8117838b68\",\"ysMoney\":10.0,\"yhMoney\":0.0,\"equipmentId\":\"22222222222222222222222222222222\",\"operatorName\":\"超级管理员\",\"replaceDeduct\":0,\"carNumber\":\"苏-A3U23R\",\"inTime\":\"2021-12-22 13:05:58\",\"itemId\":\"64a7cb8e1119463911333e8b9eed6651\",\"payType\":\"ZFB\",\"netDiscountMoney\":0.0,\"payFrom\":\"jieshun\",\"feesTime\":\"2021-12-22 14:34:31\",\"parkCode\":\"p201127336\",\"ssMoney\":10.0,\"operatorId\":\"62e1199a3d0811ebbc39b8cb299b7f2c\",\"hgMoney\":0.0}]";
        String currentSign = MD5Util.md5("3b47363469f046cc9e51d2e7460a41d9" + "20211222143442313" + dataItems).toUpperCase();
        return currentSign;
    }
}
