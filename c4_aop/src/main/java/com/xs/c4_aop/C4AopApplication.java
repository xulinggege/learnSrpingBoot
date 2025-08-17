package com.xs.c4_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动类自动帮我门增加了@Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class C4AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(C4AopApplication.class, args);
    }

}
