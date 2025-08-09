package com.xs.service;

import com.xs.dao.IUserDao;
import com.xs.dao.User2Dao;
import com.xs.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    IUserDao userDao;

    public void getUser()
    {
        userDao.getUser();
    }
}
