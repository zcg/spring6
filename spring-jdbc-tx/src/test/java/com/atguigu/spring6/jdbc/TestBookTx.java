package com.atguigu.spring6.jdbc;


import com.atguigu.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.jdbc
 * @className: TestBookTx
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 0:23
 */
@SpringJUnitConfig(locations = "classpath:bean-xml.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {

        bookController.buyBook(1, 1);
    }
}
