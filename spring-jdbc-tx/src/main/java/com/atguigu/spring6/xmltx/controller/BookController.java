package com.atguigu.spring6.xmltx.controller;

import com.atguigu.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.controller
 * @className: BookController
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 19:27
 */
@Controller
@Transactional
public class BookController {

    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId) {
        // 调用service方法
        bookService.buyBook(bookId,userId);

    }
}
