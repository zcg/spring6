package github.com.zcg.spring6_ioc_xml.scope;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.scope
 * @className: TestOrders
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 16:02
 */
public class TestOrders {
    // 创建logger对象
    private Logger logger =  LoggerFactory.getLogger(TestOrders.class);
    @Test
    public  void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = (Orders) context.getBean("orders");
        System.out.println(orders);
        logger.info(orders.toString());
        Orders orders1 = (Orders) context.getBean("orders");
        System.out.println(orders1);
        logger.info(orders1.toString());
    }
}
