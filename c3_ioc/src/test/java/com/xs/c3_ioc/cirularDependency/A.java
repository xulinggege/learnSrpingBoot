package com.xs.c3_ioc.cirularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class A {
    @Lazy
    public A(B b)
    {
        this.b = b;
    }

    public B b;


}
