package com.atguigu.spring6.validation.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation.two
 * @className: TestValdation2
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:21
 */
public class TestValdation2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidaton2 myService = context.getBean(MyValidaton2.class);
        User user = new User();
        user.setName("lucy");
        // user.setAge(130);
        user.setAge(-1);
        boolean validator = myService.validator2(user);
        System.out.println(validator);
    }
}
