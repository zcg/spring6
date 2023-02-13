package github.com.zcg.spring6_ioc_xml.auto.controller;

import github.com.zcg.spring6_ioc_xml.auto.service.UserService;

/**
 * @projectName: spring6
 * @package: github.com.zcg.spring6_ioc_xml.auto.controller
 * @className: UserController
 * @author: zcg
 * @description: TODO
 * @date: 2023/2/8 17:33
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller方法执行了.....");

        //调用service中的方法
        // UserService userService = new UserServiceImpl();
        userService.addUserService();
    }
}
