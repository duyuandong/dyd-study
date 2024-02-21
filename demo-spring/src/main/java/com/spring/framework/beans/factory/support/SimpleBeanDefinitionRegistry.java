package com.spring.framework.beans.factory.support;



import com.spring.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry
 * @date ：Created in 2024/2/20 11:37
 * @description：注册表接口的子实现类
 * @modified By：
 * @version:
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry{
    //定义一个容器,用来存储BeanDefinition对象
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String,BeanDefinition>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beaName) throws Exception {
        return beanDefinitionMap.get(beaName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
