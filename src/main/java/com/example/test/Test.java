package com.example.test;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    @SneakyThrows
    public static void main(String[] args) {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println("输入了:"+c);
        } while (c != 'q');

    }
}
