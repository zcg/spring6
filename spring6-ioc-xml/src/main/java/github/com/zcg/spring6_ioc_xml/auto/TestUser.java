package github.com.zcg.spring6_ioc_xml.auto;

import github.com.zcg.spring6_ioc_xml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.auto
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 18:35
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController controller = context.getBean("userController", UserController.class);
        controller.addUser();
    }
}
