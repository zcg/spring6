package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;

/**
 * @projectName: spring6
 * @package: com.atguigu.service.impl
 * @className: UserServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/9 23:20
 */
@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service add ...");
        userDao.add();
    }
}
