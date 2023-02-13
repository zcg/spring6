package com.atguigu.spring6_aop.example.test;

import com.atguigu.spring6_aop.example.Calculator;
import com.atguigu.spring6_aop.example.CalculatorImpl;
import com.atguigu.spring6_aop.example.CalculatorLogImpl;
import com.atguigu.spring6_aop.example.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.example
 * @className: TestCal
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 11:44
 */
public class TestCal {

    @Test
    public void TestAdd() {
        Calculator calculator = new CalculatorImpl();
        calculator.add(1, 2);

        System.out.println("=====================");

        Calculator calculatorlog = new CalculatorLogImpl();
        calculatorlog.add(1, 2);
    }


    @Test
    public void TestCalProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.mul(3, 2);
    }
}
