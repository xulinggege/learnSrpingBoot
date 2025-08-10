package com.xs.c3_ioc.service;
import com.xs.c3_ioc.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service  // 作用等于 @Component//@Primary
public class UserService implements IUserService {

//    @Autowired
    IUserDao userDao;

    public UserService(IUserDao userDao)
    {
        System.out.println("我的旧名字--"+userDao.getUserName());
        userDao.setUserName("我有一个新的名字");
        System.out.println(userDao);
        this.userDao = userDao;
        System.out.println("UserService() 构造函数调用了，设置一个userDao");
    }
    @Override
    public void getUser()
    {
        userDao.getUser();
    }
}
