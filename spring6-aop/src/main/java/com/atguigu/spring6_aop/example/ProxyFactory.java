package com.atguigu.spring6_aop.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.example
 * @className: ProxyFactory
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 15:10
 */
public class ProxyFactory {

    // 日志对象
    private Logger logger = LoggerFactory.getLogger(ProxyFactory.class);

    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * proxy：代理对象
                 * method：代理对象需要实现的方法，即其中需要重写的方法
                 * args：method所对应方法的参数
                 */
                Object result = null;
                try {
                    logger.info("[动态代理][日志]: {} ，参数：{}" , method.getName() , Arrays.toString(args));
                    // System.out.println("[动态代理][日志] " + method.getName() + "，参数：" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    logger.info("[动态代理][日志]: {} ，结果：{}" , method.getName() ,result);
                    // System.out.println("[动态代理][日志] " + method.getName() + "，结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.info("[动态代理][日志]: {}, 异常：{}" , method.getName() ,  e.getMessage());
                    // System.out.println("[动态代理][日志] " + method.getName() + "，异常：" + e.getMessage());
                } finally {
                    logger.info("[动态代理][日志]: {} ，方法执行完毕" , method.getName());

                    // System.out.println("[动态代理][日志] " + method.getName() + "，方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
