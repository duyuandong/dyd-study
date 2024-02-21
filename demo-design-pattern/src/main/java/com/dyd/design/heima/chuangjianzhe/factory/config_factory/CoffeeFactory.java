package com.dyd.design.heima.chuangjianzhe.factory.config_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.config_factory.factory.chuangjianzhe.heima.design.CoffeeFactory
 * @date ：Created in 2024/1/18 14:38
 * @description：
 * @modified By：
 * @version:
 */
public class CoffeeFactory {
    private static HashMap<String,Coffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream is = Client.class.getClassLoader().getResourceAsStream("application.properties");
        try {
            properties.load(is);
            Set<Object> set = properties.keySet();
            for (Object obj : set) {
                String key = (String)obj;
                if(key.startsWith("coffee_")){
                    String className = properties.getProperty(key);
                    Class clazz = Class.forName(className);
                    map.put(key,(Coffee) clazz.newInstance());
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee getCoffee(String type){
        return map.get(type);
    }
}
