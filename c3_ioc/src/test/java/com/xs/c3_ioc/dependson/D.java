package com.xs.c3_ioc.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class D {
    public D()
    {
        System.out.println("D");
    }
}
