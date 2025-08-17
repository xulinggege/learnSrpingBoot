package com.xs.c4_aop.advice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // 添加增删改查的方法，并输出增删改查
    public void add() {
        System.out.println("添加");
    }
    public void delete() {
        System.out.println("删除");
    }
    public void update() {
        System.out.println("修改");
    }
    public void query() {
        System.out.println("查询");
    }
}
