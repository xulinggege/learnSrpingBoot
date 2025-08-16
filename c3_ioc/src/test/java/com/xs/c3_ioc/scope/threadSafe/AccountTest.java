package com.xs.c3_ioc.scope.threadSafe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootTest(classes = AccountTest.class)
public class AccountTest {

    @Bean
    @Scope("prototype")
    public AccountService accountService()
    {
        return new AccountService();
    }

    @Test
    public void test(@Autowired AccountService accountService,@Autowired AccountService accountService1) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                accountService.add(500);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                accountService1.subtract(500);
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(3000);
        System.out.println("余额：" + accountService.balance + "，余额2：" + accountService1.balance);
    }
}
