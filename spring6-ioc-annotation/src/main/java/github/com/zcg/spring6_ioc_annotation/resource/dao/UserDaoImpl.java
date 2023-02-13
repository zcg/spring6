package github.com.zcg.spring6_ioc_annotation.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.dao
 * @className: UserDaoImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:52
 */
@Repository("myUserDao")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao....");
    }
}
