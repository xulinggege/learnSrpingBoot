package com.xs.c3_ioc.conditionalDB;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootTest(classes = TestDB.class)
public class TestDB {
    @Bean
    @Conditional(MysqlConditional.class)
    public IDB mysqlDB()
    {
        return new MySqlDB();
    }

    @Bean
    @Conditional(OracleCondtional.class)
    public IDB oracleDB()
    {
        return new OracleDB();
    }

    @Test
    public void testDB(@Autowired IDB db)
    {
        System.out.println(db.getClass().getName());
        db.connectDB();
    }
}
