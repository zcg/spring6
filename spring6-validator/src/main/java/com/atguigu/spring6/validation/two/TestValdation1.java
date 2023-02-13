package com.atguigu.spring6.validation.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation.two
 * @className: TestValdation1
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:20
 */
public class TestValdation1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidaton1 myService = context.getBean(MyValidaton1.class);
        User user = new User();
        user.setAge(-1);
        boolean validator = myService.validator(user);
        System.out.println(validator);
    }
}
