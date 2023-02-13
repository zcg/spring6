package com.atguigu.spring6_aop.xmlaop;

import org.springframework.stereotype.Component;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.example
 * @className: CalculatorImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 11:00
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部: result = " + result);
        // int a = 1 / 0;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部: result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("方法内部: result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部: result = " + result);
        return result;
    }
}
