package com.dyd.strings;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.dyd.string.StringTest1
 * @date ：Created in 2024/2/22 9:52
 * @description：
 * @modified By：
 * @version:
 */
public class StringTest1 {
    public static void main(String[] args) {
        String s = StringUtils.joinWith(",", "22", "33,44");
        System.out.println(s);
        String ksis = "";
        Map map = JSONObject.parseObject(ksis, Map.class);
        System.out.println(map);
    }
}
