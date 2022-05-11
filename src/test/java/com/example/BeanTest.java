package com.example;

import com.example.config.BeanConfig;
import com.example.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BeanTest {

    @Test
    public void test() {
        //IOC根据配置类注入bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }

}
