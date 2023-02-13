package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;

/**
 * @projectName: spring6
 * @package: com.atguigu.dao.impl
 * @className: UserDaoImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/9 23:20
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("user dao ....");
    }
}
