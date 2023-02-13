package github.com.zcg.spring6_ioc_annotation.autowired.controller;

import github.com.zcg.spring6_ioc_annotation.autowired.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_annotation.controller
 * @className: UserController
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 22:49
 */

@Controller
public class UserController {

    // 第一种注入
    //  属性注入
    // @Autowired
    // private UserService userService; // 按类型注入

    // 第二种 set方法注入
    // private UserService userService;
    //
    // @Autowired
    // public void setUserService(UserService userService) {
    //     this.userService = userService;
    // }

    // 第三种构造器注入
    // private UserService userService;
    //
    // @Autowired
    // public UserController(UserService userService) {
    //     this.userService = userService;
    // }

    //第四种形参上注入
    // private UserService userService;
    //
    // public UserController(@Autowired UserService userService) {
    //     this.userService = userService;
    // }

    //第五种构造器注入,无注解

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    public void add() {
        System.out.println("controller.....");
        userService.add();
    }
}
