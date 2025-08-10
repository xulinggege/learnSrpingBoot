package com.xs.c3_ioc.config;

import com.xs.c3_ioc.dao.IUserDao;
import com.xs.c3_ioc.dao.UserDao;
import com.xs.c3_ioc.service.AutowiredTestService;
import com.xs.c3_ioc.service.IUserService;
import com.xs.c3_ioc.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
* @Bean：将返回值，作为bean对象，添加到spring容器中
* 且需要放在方法上面
* 方法必须是配置类里面的方法
* */

@Configuration  // 这些都是放在类上面的
//@Component
public class SpringConfig {

//    @Bean
//    public IUserService getUserService()
//    {
//        // 如果使用Configuration注解，那么重复调用userDao使用的是同一个Bean。
//        // 但是如果使用Component注解，那么每次调用都会创建一个新的Bean。
////        IUserDao iUserDao = userDao() ;
//        return new UserService();
//    }
//
//    @Bean
//    public IUserDao userDao()
//    {
//        System.out.println("创建了UserDao的Bean");
//        UserDao userDao = new UserDao();
//        userDao.setUserName("小三");
//        return userDao;
//    }
    @Primary
    @Bean
    public IUserService userService2(IUserDao userDao)
    {
        System.out.println("创建了UserService的Bean");
        UserService userService;
        userService = new UserService(userDao);
        userDao.setUserName("小三");
        return userService;
    }

    @Bean
    public AutowiredTestService autowiredTestService3(IUserService userService){
        System.out.println("创建了AutowiredTestService的Bean");
        AutowiredTestService autowiredTestService =  new AutowiredTestService();
        autowiredTestService.setName("@Bean");
        return  autowiredTestService;
    }
}
