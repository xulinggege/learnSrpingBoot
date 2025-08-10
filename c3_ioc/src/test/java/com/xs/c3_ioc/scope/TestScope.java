package com.xs.c3_ioc.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootTest(classes = TestScope.class)
public class TestScope {
    @Bean
    @Scope("prototype")
    public F f(){
        return new F();
    }

    @Test
    public void testScope(@Autowired F f, @Autowired F f1){
        System.out.println(f);
        System.out.println(f1);
    }
}
