package github.com.zcg.spring6_ioc_xml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.dimap
 * @className: TestMap
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 12:50
 */
public class TestStu {

    @Test
    public void testStu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student  student = (Student) context.getBean("studentp");
        student.run();
    }
}
