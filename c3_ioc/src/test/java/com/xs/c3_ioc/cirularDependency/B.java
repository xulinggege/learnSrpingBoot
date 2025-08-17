package com.xs.c3_ioc.cirularDependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    public A a;
    public B(A a)
    {
        this.a = a;
        System.out.println("B()");
    }

}
