package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Double age;
    private Integer removeStatus = 1;

    public Student(Double age) {
        this.age = age;
    }

    public Student(String name, Double age) {
        this.name = name;
        this.age = age;
    }
}
