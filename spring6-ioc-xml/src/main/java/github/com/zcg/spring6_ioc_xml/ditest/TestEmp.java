package github.com.zcg.spring6_ioc_xml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.ditest
 * @className: TestEmp
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 10:47
 */
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = (Dept) context.getBean("dept");
        dept.info();
    }
}
