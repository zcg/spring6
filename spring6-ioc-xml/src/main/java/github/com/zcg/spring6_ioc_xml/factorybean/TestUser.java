package github.com.zcg.spring6_ioc_xml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.factorybean
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 17:02
 */
public class TestUser {
    public static void main(String[] args) {
        // 获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
