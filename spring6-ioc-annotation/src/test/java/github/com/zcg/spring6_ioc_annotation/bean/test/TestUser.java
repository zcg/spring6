package github.com.zcg.spring6_ioc_annotation.bean.test;


import github.com.zcg.spring6_ioc_annotation.bean.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.bean
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 20:45
 */
public class TestUser {
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean(User.class);
        System.out.println(user);
        logger.info(user.toString());

    }
}
