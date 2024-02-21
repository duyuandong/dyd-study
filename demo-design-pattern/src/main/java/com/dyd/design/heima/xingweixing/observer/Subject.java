package com.dyd.design.heima.xingweixing.observer;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.observer.xingweixing.heima.design.Subject
 * @date ：Created in 2024/1/24 10:57
 * @description：抽象主题角色类
 * @modified By：
 * @version:
 */
public interface Subject {
    //添加观察者对象
    void attach(Observer obServer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}
