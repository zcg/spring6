package github.com.zcg.spring6_ioc_annotation.autowired.service;

import github.com.zcg.spring6_ioc_annotation.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.service
 * @className: UserServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:51
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service ...");
        userDao.add();
    }
}
