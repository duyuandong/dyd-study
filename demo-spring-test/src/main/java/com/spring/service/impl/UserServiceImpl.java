package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.service.impl.UserServiceImpl
 * @date ：Created in 2024/2/20 17:04
 * @description：逻辑层
 * @modified By：
 * @version:
 */
public class UserServiceImpl implements UserService {
    //声明一个dao的变量
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserService被创建了");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userService ....");
        userDao.add();
    }
}
