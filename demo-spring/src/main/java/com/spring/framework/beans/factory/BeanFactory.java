package com.spring.framework.beans.factory;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.factory.BeanFactory
 * @date ：Created in 2024/2/20 14:14
 * @description：ioc容器父接口
 * @modified By：
 * @version:
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;

    <T> T getBean(String name,Class<? extends T> clazz) throws Exception;
}
