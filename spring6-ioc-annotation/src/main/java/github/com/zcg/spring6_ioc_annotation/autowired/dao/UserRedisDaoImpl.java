package github.com.zcg.spring6_ioc_annotation.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.service
 * @className: UserRedisServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 23:17
 */
@Repository
public class UserRedisDaoImpl implements UserDao
{
    @Override
    public void add() {
        System.out.println("user redis dao ....");
    }
}
