package com.spring.controller;

import com.spring.framework.context.ApplicationContext;
import com.spring.framework.context.support.ClassPathXmlApplicationContext;
import com.spring.service.UserService;


/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.controller.UserController
 * @date ：Created in 2024/2/20 17:06
 * @description：
 * @modified By：
 * @version:
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        //1,创建spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2,从容器对象中获取userService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //3,调用userService方法进行业务逻辑处理
        userService.add();

    }
}
