package com.atguigu.spring6.jdbc;

import com.atguigu.spring6.tx.config.SpringConfig;
import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.jdbc
 * @className: TestAnno
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 23:18
 */
public class TestAnno {

    @Test
    public void testTxAllAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean(BookController.class);
        Integer[] bookids = {1, 2};
        accountService.checkout(bookids, 1);
    }
}

