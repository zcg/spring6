package github.com.zcg.spring6.resourceloader;

import github.com.zcg.spring6.di.ResourceBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6.resourceloader
 * @className: TestPrefix
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 11:10
 */
public class TestPrefix {

    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans*.xml");
        ResourceBean bean = context.getBean(ResourceBean.class);
        System.out.println(bean.getResource().getDescription());
    }
}
