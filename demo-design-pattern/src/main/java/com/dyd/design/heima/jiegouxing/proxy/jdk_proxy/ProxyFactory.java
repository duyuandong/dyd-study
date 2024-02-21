package com.dyd.design.heima.jiegouxing.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *@author: duyd@segimail.com
 *@Description:
 *@Param:
 *@Return:
 *@Date: 2024/1/19 10:24
 */
public class ProxyFactory {

    //被代理对象
    private TrainStation trainStation = new TrainStation();
    //获取代理对象
    public SellTickets geProxyObject(){
        /*
         ClassLoader loader, 类加载器 ,加载代理类
         Class<?>[] interfaces, 代理类实现的字节码对象
         InvocationHandler h 代理对象的调用处理程序
        */
        SellTickets tickets = (SellTickets)Proxy
                .newProxyInstance(trainStation.getClass().getClassLoader(),
                        trainStation.getClass().getInterfaces(),
                        new InvocationHandler() {
                            /*
                             *  proxy  代理对象 基本用不到
                             *  method    对接口中的方法进行封装的method对象(sell)
                             *  args  调用sell方法的实际参数
                             *  返回值 就是sell方法的返回值
                             */
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                System.out.println("代售点收取一定的服务费用 -- jdk动态代理");
                                Object invoke = method.invoke(trainStation, args);
                                return invoke;
                            }
                        });
        return tickets;
    }
}
