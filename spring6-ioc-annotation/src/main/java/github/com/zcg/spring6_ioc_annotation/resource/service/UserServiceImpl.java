package github.com.zcg.spring6_ioc_annotation.resource.service;

import github.com.zcg.spring6_ioc_annotation.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.service
 * @className: UserServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:51
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {


    @Resource()
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service ...");
        myUserDao.add();
    }
}
