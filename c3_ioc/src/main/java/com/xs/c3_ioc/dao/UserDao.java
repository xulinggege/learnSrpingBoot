package com.xs.c3_ioc.dao;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository  // 作用等于 @Component
public class UserDao implements IUserDao {



    private String userName;

    public UserDao() {
        setUserName("我是默认的用户名");
        System.out.println("创建了UserDao的Bean");
        // 打印创建的UserDao的Bean
        System.out.println(this);
        System.out.println("userName = " + userName);

    }

    @Override
    public void getUser() {
        System.out.println(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
