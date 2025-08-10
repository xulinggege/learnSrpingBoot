package com.xs.c3_ioc.dependson;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class TestDependson {

//    @Bean
//    public C c()
//    {
//        return new C();
//    }
//
//    @Bean
//    public D d()
//    {
//        return new D();
//    }


    @Test
    public void testDependson(@Autowired D d,@Autowired C c)
    {

    }
}
