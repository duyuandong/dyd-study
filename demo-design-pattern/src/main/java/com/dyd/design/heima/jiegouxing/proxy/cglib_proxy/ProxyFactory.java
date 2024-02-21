package com.dyd.design.heima.jiegouxing.proxy.cglib_proxy;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *@author: duyd@segimail.com
 *@Description:
 *@Param:
 *@Return:
 *@Date: 2024/1/19 10:24
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyobject(){
        //创建Enhancer对象 ,类似于JDK代理的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象(设置代理类父类)
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);

        //创建代理对象
        TrainStation proxyObject = (TrainStation)enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理中增强业务=====cglib");
        return method.invoke(station,objects);
    }
}
