package github.com.zcg.spring6_ioc_xml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.di
 * @className: TestBook
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 10:07
 */

public class TestBook {

    // 测试set方法注入
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }

    // 测试构造器注入
    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = (Book) context.getBean("bookCon");
        System.out.println(book);
    }


}