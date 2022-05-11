package com.example;

import com.example.entity.Student;
import com.example.mapper.UserMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.*;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class MyDemoApplicationTests {
    @Resource
    private UserMapper userMapper;

//   @SneakyThrows
//   @Test1
//   public void test() {
//       Student student = new Student();
//       student.age = 23;
//       student.username = "zhangSan";
//       student.setAddress("广州");
//
//       Class<Student> studentC = Student.class;
//       //获取成员字段
////       System.out.println(studentC.getDeclaredField("age").getType() == Integer.class);
////       Field addressField = studentC.getDeclaredField("address");
////       addressField.setAccessible(true);
////       System.out.println(addressField.get(student));
//       //获取成员方法
//       Method addMethod = studentC.getDeclaredMethod("add", int.class, Integer.class);
////       System.out.println(addMethod.getModifiers());
//       System.out.println(addMethod.invoke(student, 1, 2));
//       System.out.println(
//               Student.class.getDeclaredMethod("add", int.class, Integer.class).invoke(student, 2, 3)
//       );
//       System.out.println(addMethod.getReturnType());
//       System.out.println(addMethod.getModifiers());
//       System.out.println(Arrays.toString(addMethod.getParameterTypes()));
//       System.out.println(addMethod.isVarArgs());
//       //获取包路径
//       Package studentCPackage = studentC.getPackage();
//       System.out.println(studentCPackage);
//   }

   @Test
   public void test2() {
       Student student = new Student();
       student.age = 23;
       student.username = "zhangSan";
       student.setAddress("广州");

       Student student1 = student.clone();
       System.out.println(student1==student);
       System.out.println(student1.equals(student1));
       System.out.println(student);
       System.out.println(student1);
   }

   @SneakyThrows
   @Test
   public void test3() {
       File file = new File("f:/a");
       if (file.exists()) {
           file.delete();
           file.mkdir();
       }
           BufferedWriter writer = new BufferedWriter(new FileWriter("f:/a/1.txt"));
           writer.write("hello world,你好，世界");
           writer.close();

   }

   @SneakyThrows
   @Test
   public void test4() {
       new File(new File("f:/aa/a"), "2.txt").createNewFile();
   }

    @SneakyThrows
    @Test
    public void test5() {
        if (new File("f:/b").mkdirs()) {
            File file = new File("f:/b/1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("我是一只小毛驴".getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = fileInputStream.read(bytes);
            System.out.println(new String(bytes, 0, len));
        }

    }

    @SneakyThrows
    @Test
    public void test6() {
        Student student = new Student();
        student.age = 23;
        student.username = "zhangSan";
        student.setAddress("广州");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("f:/student.txt"));
        objectOutputStream.writeObject(student);

    }

    @Test
    @SneakyThrows
    public void test7() {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("f:/student.txt"));
        System.out.println(objectInputStream.readObject());
    }
}
