package com.xs.c3_ioc.scope.threadSafe;

public class AccountService {
    public  Integer balance = 1000;

    // 存钱
    public void add(int money){
        int newMoney = balance + money;
        System.out.println("线程：" + Thread.currentThread().getName() + "，取钱：" + money + "，余额：" + balance);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance = newMoney;
    }

    // 取钱
    public void subtract(int money){
         int newMoney = balance - money;

         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         balance = newMoney;
    }
}
