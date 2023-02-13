package com.atguigu.spring6_aop.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.example
 * @className: CalculatorImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 11:00
 */
public class CalculatorLogImpl implements Calculator {

    private Logger logger = LoggerFactory.getLogger(CalculatorLogImpl.class);

    @Override
    public int add(int i, int j) {
        logger.info("[日志] add 方法开始了 参数是:{} {} ",i,j);
        int result = i + j;
        System.out.println("方法内部: result = " + result);
        logger.info("[日志] add 方法开始了 结果是: {} ",result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        logger.info("[日志] add 方法开始了 参数是:{} {} ",i,j);
        int result = i - j;
        System.out.println("方法内部: result = " + result);
        logger.info("[日志] add 方法开始了 结果是: {} ",result);

        return result;
    }

    @Override
    public int mul(int i, int j) {
        logger.info("[日志] add 方法开始了 参数是:{} {} ",i,j);
        int result = i * j;
        System.out.println("方法内部: result = " + result);
        logger.info("[日志] add 方法开始了 结果是: {} ",result);

        return result;
    }

    @Override
    public int div(int i, int j) {
        logger.info("[日志] add 方法开始了 参数是:{} {} ",i,j);
        int result = i / j;
        System.out.println("方法内部: result = " + result);
        logger.info("[日志] add 方法开始了 结果是: {} ",result);

        return result;
    }
}
