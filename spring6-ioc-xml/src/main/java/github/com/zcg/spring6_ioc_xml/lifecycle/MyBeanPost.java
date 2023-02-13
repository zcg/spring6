package github.com.zcg.spring6_ioc_xml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.lifecycle
 * @className: MyBeanPost
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 16:51
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 后置处理(初始化前)");
        System.out.println(bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 后置处理(初始化后)");
        System.out.println(bean);
        return bean;
    }
}
