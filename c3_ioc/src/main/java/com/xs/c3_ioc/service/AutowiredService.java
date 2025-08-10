package com.xs.c3_ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredService {

    @Autowired(required = false)
    AutowiredTestService autowiredTestService2;

    @Override
    public String toString()
    {
        if (autowiredTestService2 != null){
            return "AutowiredService{" +
                    "autowiredTestService2=" + autowiredTestService2 +
                    '}';
        }else {
            return  "我是null";
        }
    }
}
