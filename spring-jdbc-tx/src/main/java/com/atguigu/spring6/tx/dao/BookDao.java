package com.atguigu.spring6.tx.dao;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.dao
 * @className: BookDao
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 19:27
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId,Integer price);
}
