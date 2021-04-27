package test;

import service.Impl.UserServiceImpl;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @className: UserServiceImplTest
 * @description: TODO
 * @author: fxh
 * @date: 2021/4/24 14:54
 * @version: 1.0
 **/
class UserServiceImplTest {

    @org.junit.jupiter.api.Test
    void registeredUser() {
    }

    @org.junit.jupiter.api.Test
    void login() {
    }

    @org.junit.jupiter.api.Test
    void existUsername() {
        UserService userService =new UserServiceImpl();
        if (userService.existUsername("xxbb")){
            System.out.println("用户名存在，不可用");
        }else {
            System.out.println("用户名不存在，可用");
        }
    }
}