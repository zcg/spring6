package github.com.zcg.spring6_ioc_xml.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.lifecycle
 * @className: TestUser
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 16:36
 */
public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 对象创建完成了,可以使用了");
        System.out.println(user);
        context.close();//
        System.out.println("8 ioc容器关闭");
    }
}

/*
*   bean对象的声明周期
*   1 bean对象的创建,调用无参数构造
*   2 给bean对象设置属性值
*   3 后置处理(初始化之前)
*   4 bean对象的初始化
*   5 后置处理(初始化之后)
*   6 bean对象可以使用
*   7 bean对象的销毁
*   8 ioc容器关闭
* */
