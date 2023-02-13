package com.atguigu.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @projectName: spring6
 * @package: com.atguigu.anno
 * @className: Di
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/10 11:29
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Di {
}
