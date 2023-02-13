package github.com.zcg.spring6_ioc_xml.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.jdbc
 * @className: TestJdbc
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 15:50
 */
public class TestJdbc {
    @Test
    public void demo1() {
        try (DruidDataSource dataSource = new DruidDataSource()) {
            dataSource.setUrl("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        }
    }

    @Test
    public void demo2() {
            ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dataSource = context.getBean(DruidDataSource.class);
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getDriverClassName());

    }
}
