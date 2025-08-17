package com.xs.c4_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// 使用切面需要注明为@Component和@Aspect
@Aspect
@Component
public class LogAspect {

    // 记录方法用时时间-- Around 环绕通知 和切点匹配execution
    @Around("execution(* com.xs.c4_aop.UserService.*())")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("方法用时：" + (end - start));
        return null;
    }
}
