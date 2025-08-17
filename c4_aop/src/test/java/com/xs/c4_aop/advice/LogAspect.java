package com.xs.c4_aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    // 添加包下面的所有方法进行AOP。且是before。的拦截，获取方法的名称和参数
    @Before("execution(* com.xs.c4_aop.advice.UserService.*())")
    public void before(JoinPoint joinPoint){
        // 添加获取参数的方法
        System.out.println("前置通知方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs()));
    }

    // 添加包下面的所有方法进行AOP。且是after。的拦截，获取方法的名称和参数
    @After("execution(* com.xs.c4_aop.advice.UserService.*())")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs()));
    }

    // 返回通知是在后置通知之前执行
    // 添加包下面的所有方法进行AOP。且是afterReturning的拦截，获取方法的名称和参数
    @AfterReturning(value = "execution(* com.xs.c4_aop.advice.UserService.*())",returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret){
        System.out.println("返回通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs())+ "返回值是"+ret);
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.xs.c4_aop.advice.UserService.*())",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        System.out.println("异常通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs())+ "异常是"+ex);
    }
}
