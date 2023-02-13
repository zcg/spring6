package com.atguigu.spring6.junit.junit5.test;

import com.atguigu.spring6.junit.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.junit.junit5
 * @className: SpringTestJunit5
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/11 21:05
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
// @ExtendWith(SpringExtension.class)
// @ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit5 {

    // 注入
    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println(user);
    }


}
