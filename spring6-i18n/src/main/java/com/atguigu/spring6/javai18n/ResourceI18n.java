package com.atguigu.spring6.javai18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @projectName: spring6
 * @package: com.atguigu.spring6.javai18n
 * @className: ResourceI18n
 * @author: zcg
 * @description: TODO
 *
 * @date: 2023/2/13 13:27
 */
public class ResourceI18n {
    public static void main(String[] args) {
        // ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
        // String test = bundle.getString("test");
        // System.out.println(test);
        // ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        // String test1 = bundle1.getString("test");
        // System.out.println(test1);


        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"atguigu",new Date().toString()};
        String message = context.getMessage("www.atguigu.com", objs, Locale.CHINA);
        System.out.println(message);
    }
}
