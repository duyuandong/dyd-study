package com.dyd.design.heima.xingweixing.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.observer.xingweixing.heima.design.SubscriptionSubject
 * @date ：Created in 2024/1/24 11:01
 * @description：具体主题角色类
 * @modified By：
 * @version:
 */
public class SubscriptionSubject implements Subject{
    private List<Observer> list = new ArrayList<>();
    @Override
    public void attach(Observer obServer) {
        list.add(obServer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : list) {
            //调用观察者中的update方法
            observer.update(message);

        }
    }
}
