package github.com.zcg.spring6_ioc_xml.auto.dao;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.auto.dao
 * @className: UserDao
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 17:35
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("UserDao方法执行了....");
    }
}
