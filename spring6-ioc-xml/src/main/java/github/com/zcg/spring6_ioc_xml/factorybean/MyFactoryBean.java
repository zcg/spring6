package github.com.zcg.spring6_ioc_xml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.factorybean
 * @className: MyFactorybean
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 17:00
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
