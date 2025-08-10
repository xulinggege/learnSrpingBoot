package com.xs.c3_ioc;

import com.xs.c3_ioc.dao.UserDao;
import com.xs.c3_ioc.service.IUserService;
import com.xs.c3_ioc.service.User2Service;
import com.xs.c3_ioc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class C3IocApplicationTests {

    @Autowired
    UserService userService5;

//    @Autowired
    User2Service user2Service;
    @Test
    void contextLoads() {
//        user2Service.getUser();
//        UserDao userDao = new UserDao();
//        userService5 = new UserService(userDao);
        userService5.getUser();

//        user2Service.setUserDaoName("我是大哥");
//        userService.getUser();
    }

}
