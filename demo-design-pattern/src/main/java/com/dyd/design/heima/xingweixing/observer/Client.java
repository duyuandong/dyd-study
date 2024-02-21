package com.dyd.design.heima.xingweixing.observer;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.observer.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/23 14:25
 * @description：微信公众号
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅公众号
        subject.attach(new WeiXinUser("顺悟空"));
        subject.attach(new WeiXinUser("猪悟能"));
        subject.attach(new WeiXinUser("沙悟净"));
        //公众号更新,发出消息给订阅者(观察者对象)
        subject.notify("四格专栏更新了");
    }
}
