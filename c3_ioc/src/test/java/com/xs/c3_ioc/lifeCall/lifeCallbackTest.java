package com.xs.c3_ioc.lifeCall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest(classes = lifeCallbackTest.class)
public class lifeCallbackTest {
    @Bean(initMethod = "init2",destroyMethod = "destroy1")
    public XuShuService xuShuService(){
        return new XuShuService();
    }

    @Test
    public void testLifeCallback(@Autowired XuShuService xuShuService)
    {
        System.out.println(xuShuService);
    }
}
