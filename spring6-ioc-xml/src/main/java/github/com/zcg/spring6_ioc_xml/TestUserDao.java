package github.com.zcg.spring6_ioc_xml;

import github.com.zcg.spring6_ioc_xml.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml
 * @className: TestUserDao
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 9:43
 */
public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据类型获取接口对应bean

        UserDao userDao = context.getBean(UserDao.class);
        userDao.run();

        //Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'github.com.zcg.spring6_ioc_xml.bean.UserDao' available:
        // expected single matching bean but found 2: UserDao,PersonDao

        // 使用接口获取实现类,当实现类只有一个就能获取,实现类是多个就会报上述错误
    }
}
