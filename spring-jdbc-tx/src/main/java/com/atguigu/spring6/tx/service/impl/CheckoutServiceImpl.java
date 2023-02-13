package com.atguigu.spring6.tx.service.impl;

import com.atguigu.spring6.tx.service.BookService;
import com.atguigu.spring6.tx.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.service.impl
 * @className: CheckoutServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 22:27
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    // 注入bookservice
    @Autowired
    private BookService bookService;

    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userid) {
        //买多本书
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userid);
        }
    }
}
