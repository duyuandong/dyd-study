package com.spring.framework.beans.factory.support;


import com.spring.framework.beans.BeanDefinition;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.factory.support.BeanDefinitionRegistry
 * @date ：Created in 2024/2/20 11:31
 * @description：注册表对象
 * @modified By：
 * @version:
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;
    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beaName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
