package com.xs.c3_ioc.lifeCall;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class XuShuService implements InitializingBean, DisposableBean {
    public XuShuService()
    {
        System.out.println("XuShuService 构造函数");
    }

    // 基于实现InitializingBean的方法来call init方法
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("XuShuService afterPropertiesSet--初始化");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("XuShuService destroy--销毁- 通过实现DisposableBean里面的接口来实现");
    }

    // 基于@PostConstruct注解来完成初始化
    @PostConstruct
    public void init()
    {
        System.out.println("XuShuService init--初始化--@PostConstruct注解修饰的方法");
    }

    // 基于@PreDestroy注解来完成销毁
    @PreDestroy
    public void destroy2()
    {
        System.out.println("XuShuService destroy2--@PreDestroy注解修饰的方法");
    }

    // 基于@Bean的initMethod属性来完成初始化
    public void init2()
    {
        System.out.println("XuShuService init2--@Bean的initmethod属性来初始化");
    }

    // 基于@Bean的destroyMethod属性来完成销毁
    public void destroy1(){
        System.out.println("XuShuService destroy1--@Bean的destroyMethod属性来销毁");
    }
}
