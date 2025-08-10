package com.xs.c3_ioc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AutowiredTestService {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    @Override
    public String toString() {
        return "AutowiredTestService{" +
                "name='" + name + '\'' +
                '}';
    }

}
