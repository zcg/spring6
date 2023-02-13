package com.atguigu.spring6.validation.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation
 * @className: Testperson
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:01
 */
public class Testperson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(101);
        DataBinder dataBinder = new DataBinder(person);
        dataBinder.setValidator(new PersonValidation());
        dataBinder.validate();
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);
    }
}
