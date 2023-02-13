package github.com.zcg.spring6.test;

import github.com.zcg.spring6.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.test
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/7 16:15
 */
public class TestUser {

    // 创建logger对象
    private Logger logger =  LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testuserobject() {
        // 加载spring的配置文件,对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取对象
        User user = (User) context.getBean("user");
        System.out.print("1:");
        System.out.println(user);


        // 使用对象的方法进行测试
        System.out.print("2:");
        user.add();

        //手动写日志
        logger.info("执行调用功能######");
        logger.error("这是一个报错");
    }

    // 反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        // 获取class对象
        Class<?> clazz = Class.forName("github.com.zcg.spring6.User");

        // 调用方法创建对象
        // Object o = clazz.newInstance(); 已经过时
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.print("1:");
        System.out.println(user);

        // 调用对象方法
        System.out.print("2:");
        user.add();
    }
}
