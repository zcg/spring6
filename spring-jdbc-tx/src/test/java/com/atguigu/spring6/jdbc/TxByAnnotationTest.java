package com.atguigu.spring6.jdbc;

import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.jdbc
 * @className: TxByAnnotationTest
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 20:54
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TxByAnnotationTest {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {

        // bookController.buyBook(1, 1);

        Integer[] bookid = {1, 2};

        bookController.checkout(bookid, 1);
    }


}
