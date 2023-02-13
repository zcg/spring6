package github.com.zcg.spring6_ioc_annotation.bean.test;

import github.com.zcg.spring6_ioc_annotation.config.SpringConfig;
import github.com.zcg.spring6_ioc_annotation.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.bean.test
 * @className: TestController
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:57
 */
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
        logger.info("执行成功");
    }
}
