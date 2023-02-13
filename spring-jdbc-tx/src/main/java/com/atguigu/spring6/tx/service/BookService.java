package com.atguigu.spring6.tx.service;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.service
 * @className: BookService
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 19:27
 */
public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}
