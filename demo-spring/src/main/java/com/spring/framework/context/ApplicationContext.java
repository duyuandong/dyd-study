package com.spring.framework.context;

import com.spring.framework.beans.factory.BeanFactory;

/**
 * @author ：duyd@segimail.com
 * @class ：org.spring.framework.context.support.ApplicationContext
 * @date ：Created in 2024/2/20 14:18
 * @description：定义非延时加载功能
 * @modified By：
 * @version:
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
