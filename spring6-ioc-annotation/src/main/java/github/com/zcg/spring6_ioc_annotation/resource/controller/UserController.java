package github.com.zcg.spring6_ioc_annotation.resource.controller;

import github.com.zcg.spring6_ioc_annotation.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.controller
 * @className: UserController
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:49
 */

@Controller("myUserController")
public class UserController {


    //不指定名字,根据属性名称注入
    // @Resource()
    // private UserService myUserService;

    //名字不一样,根据类型注入
    @Resource()
    private UserService UserService;

    public void add() {
        System.out.println("controller.....");
        UserService.add();
    }
}
