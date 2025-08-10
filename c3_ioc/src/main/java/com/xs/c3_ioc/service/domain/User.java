package com.xs.c3_ioc.service.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource(value = "classpath:user.properties",encoding = "UTF-8")
public class User {
    @Value("${name}")
    private String name;
    @Value("${age:90}")
    private int age;
    // spel 复杂类型
    @Value("#{{'语文':'90','数学':'80'}}")
    private Map<String, String> score;
    @Value("#{'唱歌,跳舞,打球'}")
    private List<String> hobbies;

    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", hobbies=" + hobbies +
                '}';
    }
}
