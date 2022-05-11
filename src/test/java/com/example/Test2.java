package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

@SpringBootTest
@Slf4j
public class Test2 {

    @Test
    public void test() {
        Student student = new Student();
        student.setAge(23.0);
        student.setName("");
        Person person = new Person();
        person.setAge(22.0);
        person.setName("");
        System.out.println(student.getName().equals(person.getName()));
    }

    @Test
    public void test2() {
        int a = 1, b = 2;
        int temp = 33;
        Integer integer = (a > b) ? a : null;
        System.out.println(temp);
    }


    @Test
    public void test3() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
        for (Integer integer : list) {
            if (integer.equals(2)) {
                list.remove(integer);
                break;
            }
        }
        System.out.println(list);
    }

    @Test
    public void test4() throws IllegalAccessException {
        Student student = new Student();
        student.setName("张三");
        student.setRemoveStatus(1);

        Field[] declaredFields = student.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.get(student) == null) {
                declaredField.set(student, 23.3333);
            }
        }
        System.out.println(student);

    }

    @Test
    public void test5() {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Student student = new Student();
            student.setName("张三");
            student.setAge(23.23);
            student.setRemoveStatus(1);
            students.add(student);

            System.out.println(student);
            System.out.println("-----------------------");
        }
    }

    @Test
    public void test6() {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("");
            student.setAge(23.23);
            student.setRemoveStatus(1);
            students.add(student);
        }
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setName("撒旦法");
            person.setAge(23.23);
            person.setRemoveStatus(1);
            persons.add(person);
        }

        for (Student student : students) {
            for (Person person : persons) {
                boolean b = student.getName().equals(person.getName())
                        && student.getAge().equals(person.getAge())
                        && student.getRemoveStatus().equals(person.getRemoveStatus());
                if (b) {
                    students.remove(student);
                    break;
                }
            }

        }

        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Test
    public void test7() {
        double income = 0;
        double cost = 10;
        System.out.println((income-cost)/income);
    }

    @Test
    public void test8() {

    }
}
