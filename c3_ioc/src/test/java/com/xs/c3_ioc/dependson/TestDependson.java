package com.xs.c3_ioc.dependson;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@SpringBootTest(classes = TestDependson.class)
public class TestDependson {

    @Bean
    @DependsOn("d")
    public C c()
    {
        return new C();
    }

    @Bean
    public D d()
    {
        return new D();
    }


    @Test
    public void testDependson(@Autowired D d)
    {

    }
}
