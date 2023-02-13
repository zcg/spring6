package github.com.zcg.spring6_ioc_xml.auto.service;

import github.com.zcg.spring6_ioc_xml.auto.dao.UserDao;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.auto.service
 * @className: UserServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 17:35
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userservice方法执行了...");
        // UserDao userDao = new UserDaoImpl();
        userDao.addUserDao();
    }
}
