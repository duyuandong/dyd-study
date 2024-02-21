package com.spring.framework.beans.factory.support;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.beans.factory.support.BeanDefinitionReader
 * @date ：Created in 2024/2/20 13:45
 * @description：用来解析配置文件的,而该接口只是定义了规范
 * @modified By：
 * @version:
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
