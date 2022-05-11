package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable, Cloneable {

    public int age;
    public String username;
    private String address;
    private Book book = new Book();

    //---------------构造方法-------------------
    //（默认的构造方法）
    Student(String str){
        System.out.println("(默认)的构造方法 s = " + str);
    }

    //无参构造方法
    public Student(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public Student(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Student(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }

    //成员方法
    public int add(int a, Integer b) {
        return a+b;
    }

    protected String info(String atr) {
        return atr+"info方法";
    }

    private int sub(Integer a, Integer b) {
        return a - b;
    }


    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: 复制此处的可变状态，这样此克隆就不能更改初始克隆的内部
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
