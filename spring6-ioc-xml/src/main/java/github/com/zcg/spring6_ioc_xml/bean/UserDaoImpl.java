package github.com.zcg.spring6_ioc_xml.bean;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.bean
 * @className: UserDaoImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 9:41
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("user run....");
    }
}
