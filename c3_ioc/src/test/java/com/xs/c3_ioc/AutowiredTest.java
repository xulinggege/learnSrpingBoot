package com.xs.c3_ioc;

import com.xs.c3_ioc.service.AutowiredService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AutowiredTest {
    @Autowired
    AutowiredService autowiredService2;

    @Test
    public  void  test01()
    {
        System.out.println(autowiredService2);
    }
}
