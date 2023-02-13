package com.atguigu.spring6_aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.annoapo
 * @className: LogAspct
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 15:48
 */
// 切面类
@Component// ioc容器
@Aspect // 切面注解
public class LogAspct {
    // 设置切入点和
    // 通知类型:
    // 前置@Before((value = "切入点表达式"))
    public void beforeMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知 方法名称:" + name + " 参数: " + args);
    }

    // 后置@After()
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知 方法名称:" + name);
    }

    // 返回@AfterReturning()
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知 方法名称:" + name + " 返回值: " + result);
    }

    // 异常@AfterThrowing()
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知 方法名称:" + name + " 异常: " + ex);
    }

    // 环绕@Around()
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;
        String s = Arrays.toString(args);
        try {
            System.out.println("环绕通知======目标方法之前");
            result = joinPoint.proceed();
            System.out.println("环绕通知======目标方法返回值" + result);
        } catch (Throwable e) {
            System.out.println("环绕通知======目标方法出现异常"+e.getMessage());
        } finally {
            System.out.println("环绕通知======目标方法执行完毕");
        }
        return result;

    }


}
