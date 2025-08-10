package com.xs.c3_ioc.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.List;

// 这样的配置，启动类就是TestOrder.class,这样能过扫描到当前目录下面的类。这个A和B才能生成Bean。
@SpringBootTest(classes = TestOrder.class)
public class TestOrder {
    @Bean
//    @Order(1)
    public A a()
    {
        return new A();
    }

    @Bean
//    @Order(0)
    public B b(){
        return new B();
    }


    // 这个时候通过List接收可以接收到两个对象
    @Test
    public void testOrder(@Autowired List<I> i){
        System.out.println(i);
    }
}
