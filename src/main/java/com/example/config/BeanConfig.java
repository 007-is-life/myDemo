package com.example.config;

import com.example.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean
    @Scope("protoType")
    public Student a() {
        Student student = new Student();
        student.setAge(23);
        student.setAddress("gz");
        return student;
    }
}
