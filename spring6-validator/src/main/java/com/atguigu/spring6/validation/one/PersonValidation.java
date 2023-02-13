package com.atguigu.spring6.validation.one;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation
 * @className: PersonValidation
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 13:56
 */
public class PersonValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // name不能为空
        ValidationUtils.rejectIfEmpty(errors, "name", "name is null");
        // age不能小于0大于100
        Person person = (Person) target;
        if (person.getAge()<0||person.getAge()>100){
            errors.rejectValue("age","age.value.error","age is not real");
        }
    }
}
