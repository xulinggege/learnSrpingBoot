package com.xs.c3_ioc.conditionalDB;

public class OracleDB implements IDB {

    @Override
    public void connectDB() {
        System.out.println("连接Oracle数据库");
    }

}
