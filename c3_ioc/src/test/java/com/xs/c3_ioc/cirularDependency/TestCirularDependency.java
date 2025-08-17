package com.xs.c3_ioc.cirularDependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest(classes = TestCirularDependency.class)
@ComponentScan
public class TestCirularDependency {
//    @Bean
//    public A a()
//    {
//        return new A();
//    }
//    @Bean
//    public B b(){
//        return new B();
//    }

    @Test
    public void testCirularDependency(@Autowired A a, @Autowired B b){
        System.out.println(b);
        System.out.println(a);
        System.out.println(a.b);
        System.out.println(b.a);
    }
}
