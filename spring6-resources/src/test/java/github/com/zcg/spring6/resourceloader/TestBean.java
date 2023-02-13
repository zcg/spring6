package github.com.zcg.spring6.resourceloader;

import github.com.zcg.spring6.di.ResourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resourceloader
 * @className: TestBean
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 11:06
 */
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean bean = context.getBean(ResourceBean.class);
        bean.parse();
    }
}
