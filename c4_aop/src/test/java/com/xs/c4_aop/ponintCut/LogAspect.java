package com.xs.c4_aop.ponintCut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    /**
     * execution的参数的定义
     * 前面还有一个访问修饰符（可省略）-。省略就是匹配所有。否则需要写明public、private、protected、default
     * 1.第一个*表示返回值任意-不能省略
     * 完整限定名.包含 包和类 名。com.xs.* 的*代表名字任意，不是层级任意。*.class
     * 2...表示任意多个参数
     */
    // execution匹配到方法级别
    // 抽取一个切点表达式
    @Pointcut("execution(* com.xs.c4_aop.ponintCut.UserService.*())")
    public void pointCut(){}

    // 使用within()方法来声明一个切点表达式--匹配到类级别.类里面所有方法都会被匹配
    @Pointcut("within(com.xs.c4_aop.ponintCut.*)")
    public void pointCutWithIn(){}


    /**
     * @Annotation匹配方法上的注解
     *如果方法上没有注解，则不会匹配
     * 如果要在通知的方法上面绑定注解，则声明的是参数名称，不是注解类型。
     */
//    @Pointcut("@annotation(Log)")
//    public void pointCutWithAnnotation(){}

    // 添加包下面的所有方法进行AOP。且是before。的拦截，获取方法的名称和参数
    @Before("pointCut()&&@annotation(log)")
    public void before(JoinPoint joinPoint,Log log){
        // 添加获取参数的方法
        System.out.println(log.value());
        System.out.println("前置通知方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs()));
    }

    // 添加包下面的所有方法进行AOP。且是after。的拦截，获取方法的名称和参数
    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs()));
    }

    // 返回通知是在后置通知之前执行
    // 添加包下面的所有方法进行AOP。且是afterReturning的拦截，获取方法的名称和参数
    @AfterReturning(value = "pointCut()",returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret){
        System.out.println("返回通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs())+ "返回值是"+ret);
    }

    // 异常通知
    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        System.out.println("异常通知 方法名称：" + joinPoint.getSignature().getName()+"参数是:"+ Arrays.toString(joinPoint.getArgs())+ "异常是"+ex);
    }
}
