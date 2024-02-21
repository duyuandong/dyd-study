package com.spring.framework.beans;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.PropertyValue
 * @date ：Created in 2024/1/26 15:55
 * @description：用来封装bean标签下的property标签的属性
 *              name 属性
 *              ref 属性
 *              value 属性 给基本数据类型及String类型数据赋的值
 * @modified By：
 * @version:
 */
public class PropertyValue {
    private String name;
    private String ref;
    private String value;
    public PropertyValue(){}
    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
