package com.atguigu.spring6.tx.service.impl;

import com.atguigu.spring6.tx.dao.BookDao;
import com.atguigu.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.service.impl
 * @className: BookServiceImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 19:28
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //模拟超时

        // try {
        //     // Thread.sleep(5000);
        //     TimeUnit.SECONDS.sleep(5);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }

        // 第一步 根据id查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 图书库存减一
        bookDao.updateStock(bookId);
        // 用户余额减
        bookDao.updateBalance(userId,price);
        // System.out.println(1/0);
    }
}
