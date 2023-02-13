package com.atguigu.spring6.validation.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.validation.two
 * @className: ValidationConfig
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/13 14:09
 */
@Configuration
@ComponentScan("com.atguigu.spring6.validation.two")
public class ValidationConfig {


    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
}
