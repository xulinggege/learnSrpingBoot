package com.xs.c3_ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredService {

    @Autowired(required = false)
    AutowiredTestService autowiredTestService2;

    @Override
    public String toString()
    {
        if (autowiredTestService2 != null){
            return "AutowiredService{" +
                    "autowiredTestService2=" + autowiredTestService2 +
                    '}';
        }else {
            return  "我是null";
        }
    }


    private ProductService productService;


    private StockService stockService;

    private UserService userService;

    public AutowiredService() {
        System.out.println("默认的无餐构造函数被调用");
    }

    // required = false 表示这个对象可以为null,但是在构造函数上面使用会无效。
    public AutowiredService(@Autowired(required = false) ProductService productService) {
        System.out.println(productService);
        this.productService = productService;
    }





    public void setUserService(UserService userService) {
        System.out.println("我来设置UserService");
        System.out.println(userService);
        this.userService = userService;
    }

    @Autowired
    public void setStockService(StockService stockService) {
        System.out.println("我来设置StockService");
        System.out.println(stockService);
        this.stockService = stockService;
    }
}
