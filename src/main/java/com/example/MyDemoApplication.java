package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableScheduling
public class MyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }

}
