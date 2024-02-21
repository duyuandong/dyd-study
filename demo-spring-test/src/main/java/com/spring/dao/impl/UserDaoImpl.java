package com.spring.dao.impl;

import com.spring.dao.UserDao;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.dao.impl.UserDaoImpl
 * @date ：Created in 2024/2/20 17:03
 * @description：实现
 * @modified By：
 * @version:
 */
public class UserDaoImpl implements UserDao {

    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("UserDao被创建了");
    }

    public void add() {
        System.out.println("userdao ...." + userName + "=" + password);
    }
}
