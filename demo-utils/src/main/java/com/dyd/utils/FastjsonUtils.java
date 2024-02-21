//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.dyd.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public final class FastjsonUtils {
    public static final Logger logger = LoggerFactory.getLogger(FastjsonUtils.class);

    public FastjsonUtils() {
    }

    public static <T> String toJsonString(T entity) {
        if (entity == null) {
            return null;
        } else {
            try {
                return JSON.toJSONString(entity, new SerializerFeature[]{SerializerFeature.DisableCircularReferenceDetect});
            } catch (Exception var2) {
                logger.error("实体转换JSON字符串出错。实体类类型:{},出错原因:{}", entity.getClass().getName(), var2);
                return null;
            }
        }
    }

    public static <T> T parseObject(String jsonString, Class<T> clazz) {
        if (!StringUtils.isEmpty(jsonString) && clazz != null) {
            try {
                return JSON.parseObject(jsonString, clazz);
            } catch (Exception var3) {
                logger.error("将JSON字符串转化对应的class类对象出错。JSON字符串:{},出错原因:{}", jsonString, var3);
                return null;
            }
        } else {
            return null;
        }
    }

    public static <T> List<T> parseArray(String jsonString, Class<T> clazz) {
        if (!StringUtils.isEmpty(jsonString) && clazz != null) {
            try {
                return JSON.parseArray(jsonString, clazz);
            } catch (Exception var3) {
                logger.error("将JSON字符串转化对应的集合class类对象出错。JSON字符串:{},出错原因:{}", jsonString, var3);
                return null;
            }
        } else {
            return null;
        }
    }

    public static JSONObject parseObject(String jsonString) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        } else {
            try {
                return JSON.parseObject(jsonString);
            } catch (Exception var2) {
                logger.error("将JSON字符串转化对应的class类对象出错。JSON字符串:{},出错原因:{}", new Object[]{jsonString, var2});
                return null;
            }
        }
    }

    public static String getString(JSONObject object, String key) {
        if (object != null && !StringUtils.isEmpty(key)) {
            try {
                return object.getString(key);
            } catch (Exception var3) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static JSONObject getJSONObject(JSONObject object, String key) {
        if (object != null && !StringUtils.isEmpty(key)) {
            try {
                return object.getJSONObject(key);
            } catch (Exception var3) {
                return null;
            }
        } else {
            return null;
        }
    }

    public static JSONArray getJSONArray(JSONObject object, String key) {
        if (object != null && !StringUtils.isEmpty(key)) {
            try {
                return object.getJSONArray(key);
            } catch (Exception var3) {
                return null;
            }
        } else {
            return null;
        }
    }
}
