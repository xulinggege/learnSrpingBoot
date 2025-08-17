package com.xs.c4_aop.advice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootTest(classes = TestAdvice.class)
@ComponentScan
@EnableAspectJAutoProxy
public class TestAdvice {
    @Test
    public void testAdvice(@Autowired UserService userService){
        userService.add();
    }
}
