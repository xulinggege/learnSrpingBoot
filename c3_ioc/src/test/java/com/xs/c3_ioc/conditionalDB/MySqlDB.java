package com.xs.c3_ioc.conditionalDB;

public class MySqlDB implements IDB{

    @Override
    public void connectDB()
    {
        System.out.println("连接MySql数据库");
    }
}
