package com.xs.c3_ioc.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("d")
public class C {
    public C()
    {
        System.out.println("C");
    }
}
