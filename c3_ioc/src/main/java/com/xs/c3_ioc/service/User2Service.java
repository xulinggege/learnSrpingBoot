package com.xs.c3_ioc.service;
import com.xs.c3_ioc.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // 作用等于 @Component
public class User2Service implements IUserService {

//    @Autowired
    IUserDao userDao;

    @Override
    public void getUser()
    {
        System.out.println("User2Service");
        System.out.println(userDao);
        userDao.getUser();
    }

    public void setUserDaoName(String name)
    {
        this.userDao.setUserName(name);
    }
}
