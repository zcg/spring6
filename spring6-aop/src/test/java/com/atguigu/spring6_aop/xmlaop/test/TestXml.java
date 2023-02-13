package com.atguigu.spring6_aop.xmlaop.test;

import com.atguigu.spring6_aop.xmlaop.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6_aop.annoaop.test
 * @className: TestAop
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 16:07
 */
public class TestXml {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-aop.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1, 2);
    }
}
