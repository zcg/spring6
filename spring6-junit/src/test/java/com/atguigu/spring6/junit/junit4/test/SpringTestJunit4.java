package com.atguigu.spring6.junit.junit4.test;

import com.atguigu.spring6.junit.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.junit.junit4.test
 * @className: SpringTestJunit4
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 21:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit4 {

    // 注入
    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println(user);
    }
}
