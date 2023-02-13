package github.com.zcg.spring6_ioc_xml.bean;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.bean
 * @className: PersonDaoImpl
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 9:46
 */
public class PersonDaoImpl implements UserDao {

    @Override
    public void run() {
        System.out.println("person run...");
    }
}
