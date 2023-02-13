package com.atguigu.spring6_aop.example;


/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.example
 * @className: CalculatorImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 11:00
 */
public class CalculatorStaticProxy implements Calculator {

    // 将被代理目标对象传递过来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        return calculator.add(i, j);
    }

    @Override
    public int sub(int i, int j) {
        return calculator.sub(i,j);
    }

    @Override
    public int mul(int i, int j) {
        return calculator.sub(i,j);
    }

    @Override
    public int div(int i, int j) {
        return calculator.sub(i,j);
    }
}
