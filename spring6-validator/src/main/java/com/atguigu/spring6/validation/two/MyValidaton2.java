package com.atguigu.spring6.validation.two;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation.two
 * @className: MyValidaton2
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:17
 */
@Service
public class MyValidaton2 {
    @Autowired
    private Validator validator;

    public boolean validator2(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        return bindException.hasErrors();
    }
}
