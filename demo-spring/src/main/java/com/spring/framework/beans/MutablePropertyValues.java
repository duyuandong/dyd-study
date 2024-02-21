package com.spring.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.MutablePropertyValues
 * @date ：Created in 2024/1/26 16:00
 * @description：用来存储和关联多个PropertyValue对象
 * @modified By：
 * @version:
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    //定义list集合对象.用来存储PropertyValue对象
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if(propertyValueList == null) {
            this.propertyValueList = new ArrayList<PropertyValue>();
        }else {
            this.propertyValueList = propertyValueList;
        }
    }

    //获取所有的propertyValue对象,返回以数组的形式
    public PropertyValue[] getPropertyValue(){
        //将集合转换成数组并返回
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性获取propertyValue对象
    public PropertyValue getPropertyValue(String propertyName){
        //遍历返回
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为null
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    //添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue pv){
        //判断集合中存储的PropertyValue对象是否和传递进来的重复了,如果重复进行覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            //获取集合中每一个PropertyValue对象
            PropertyValue currentPv = propertyValueList.get(i);
            if(currentPv.getName().equals(pv.getName())){
                propertyValueList.set(i,pv);
                return this; //目的就是实现链式编程
            }
        }
        this.propertyValueList.add(pv);
        return this;
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String propertyName){
        return this.getPropertyValue(propertyName) != null ? true : false;
    }


    //获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
