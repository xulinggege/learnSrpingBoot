package com.xs.c3_ioc;

import com.xs.c3_ioc.service.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Test
    public void test01(@Autowired User user)
    {
       System.out.println(user);
    }
}
