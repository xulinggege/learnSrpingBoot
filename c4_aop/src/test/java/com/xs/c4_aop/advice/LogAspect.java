package com.xs.c4_aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    // 添加包下面的所有方法进行AOP。且是before。的拦截，获取方法的名称和参数
    @Before("execution(* com.xs.c4_aop.advice.UserService.*())")
    public void before(JoinPoint joinPoint){
        // 添加获取参数的方法
        System.out.println("方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs()));
    }
}
