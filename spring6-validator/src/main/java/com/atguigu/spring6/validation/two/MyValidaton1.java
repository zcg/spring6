package com.atguigu.spring6.validation.two;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation.two
 * @className: MyValidaton1
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:12
 */

@Service
public class MyValidaton1 {

    @Autowired
    private Validator validator;

    public boolean validator(User user){
        Set<ConstraintViolation<User>> sets =  validator.validate(user);
        return sets.isEmpty();
    }
}
