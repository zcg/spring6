package com.atguigu.spring6.tx.service;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.tx.service
 * @className: CheckoutService
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/12 22:14
 */
public interface CheckoutService {
    //买多本书的方法
    void checkout(Integer[] bookIds, Integer userid);
}
