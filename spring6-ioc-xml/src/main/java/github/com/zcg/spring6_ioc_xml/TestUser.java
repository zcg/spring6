package github.com.zcg.spring6_ioc_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 9:28
 */
public class TestUser {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取bean
        User user = (User) context.getBean("user");
        System.out.println("1:根据id获取bean: " + user);

        // 根据类型获取bean
        // User user1 = context.getBean(User.class);
        // System.out.println("2:根据类型获取bean: " + user1);

        // 根据id和类型获取bean
        // User user2 = context.getBean("user", User.class);
        // System.out.println("3:根据id和类型获取bean: " + user2);
        // 调用对象方法
        // user.run();
        // user1.run();
        // user2.run();

    }
}
