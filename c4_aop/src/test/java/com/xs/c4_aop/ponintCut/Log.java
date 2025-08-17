package com.xs.c4_aop.ponintCut;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 注解的保留
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Log {
    String value() default "";  // 用来记录方法是干什么的。
}
