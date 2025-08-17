package com.xs.c4_aop.ponintCut;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class UserService {
    // 添加增删改查的方法，并输出增删改查

    @Log("添加新用户")
    public Integer add() {
        System.out.println("添加");
        int a;
        try {
            a = 1/10;
        }catch (Exception e){
            System.out.println("异常");
            throw e;

        }
        return a;

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
