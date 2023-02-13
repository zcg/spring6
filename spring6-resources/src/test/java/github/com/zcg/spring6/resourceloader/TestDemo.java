package github.com.zcg.spring6.resourceloader;

import github.com.zcg.spring6.resourceloaderaware.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resourceloader
 * @className: TestDemo
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 10:55
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean resource = context.getBean("testBean", TestBean.class);
        ResourceLoader resourceLoader = resource.getResourceLoader();
        System.out.println(resourceLoader==context);
    }
}
