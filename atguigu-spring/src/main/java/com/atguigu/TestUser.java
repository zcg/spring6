package com.atguigu;

import com.atguigu.bean.AnnotationApplicationContext;
import com.atguigu.bean.ApplicationContext;
import com.atguigu.service.UserService;

/**
 * @projectName: spring6
 * @package: com.atguigu
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 9:37
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
