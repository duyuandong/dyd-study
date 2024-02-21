package com.dyd.web.controller;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.controller.DemoController
 * @date ：Created in 2023/10/11 17:56
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/testData")
    public Map<String,Object> TestMethod(){
        HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put("code","0");
        objectObjectHashMap.put("message","success");
        return objectObjectHashMap;
    }
}
