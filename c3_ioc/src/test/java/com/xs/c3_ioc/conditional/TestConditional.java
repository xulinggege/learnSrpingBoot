package com.xs.c3_ioc.conditional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootTest (classes = TestConditional.class)
public class TestConditional {
    @Bean
    @Conditional(myConditional.class)
    public ConditionalService conditionalService(){
        return new ConditionalService();
    }

    @Test
    public void testConditional(@Autowired ConditionalService conditionalService){
        System.out.println(conditionalService);
    }
}
