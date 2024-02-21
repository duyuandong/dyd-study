package com.spring.framework.utils;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.utils.StringUtils
 * @date ：Created in 2024/2/20 14:47
 * @description：
 * @modified By：
 * @version:
 */
public class StringUtils {
    private StringUtils() {
    }

    // userDao ==> setUserDao
    public static String getSetterMethodFieldName(String fieldName){
        String methodName = "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
        return methodName;
    }
}
