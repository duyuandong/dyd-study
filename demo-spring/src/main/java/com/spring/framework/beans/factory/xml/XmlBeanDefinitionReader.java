package com.spring.framework.beans.factory.xml;


import com.spring.framework.beans.BeanDefinition;
import com.spring.framework.beans.MutablePropertyValues;
import com.spring.framework.beans.PropertyValue;
import com.spring.framework.beans.factory.support.BeanDefinitionReader;
import com.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.factory.xml.XmlBeanDefinitionReader
 * @date ：Created in 2024/2/20 13:48
 * @description：针对xml配置文件进行解析的类
 * @modified By：
 * @version:
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    //声明注册表对象
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return this.registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //使用dom4j进行xml配置文件的解析
        SAXReader reader = new SAXReader();
        //获取类路径下的配置文件
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        //根据document对象过期跟标签对象(beans)
        Element rootElement = document.getRootElement();
        //获取跟标签下面的所有子标签对象
        List<Element> beanElements = rootElement.elements("bean");
        //遍历集合
        for (Element beanElement : beanElements) {
            //获取id属性
            String id = beanElement.attributeValue("id");
            //获取class属性
            String className = beanElement.attributeValue("class");
            //将id属性和class属性封装到beanDefinition对象中
            //1,创建BeanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            //创建mutablePropertyValues对象
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();

            //获取Bean标签下所有的property标签对象
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name,ref,value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            //将mutablePropertyValues对象封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(mutablePropertyValues);

            //将BeanDefinition对象注册到注册表中
            registry.registerBeanDefinition(id,beanDefinition);
        }
    }
}
