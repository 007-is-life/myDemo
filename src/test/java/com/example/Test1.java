package com.example;


import com.example.entity.Book;
import com.example.vo.BookVO;
import com.example.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
public class Test1 {

    @Resource
    private BookMapper bookMapper;

    @Test
    public void test() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        Integer first = map.get("first");
        System.out.println(map.containsValue(1));
    }
    //测试foreach标签
    @Test
    public void test2() {
        BookVO bookVO = new BookVO();
        bookVO.setIds(Arrays.asList(1,2,3));
        List<BookVO> bookVOS = bookMapper.selectByIds(bookVO);
        System.out.println(bookVOS);
    }
    //测试foreach标签
    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println(bookMapper.getByIds(list));
    }

    //测试set标签
    @Test
    public void test4() {
        Book book = new Book();
        book.setId(123);
        book.setPublish("电子工业出版社");
        book.setAuthor("张三");
        book.setPages(454);

        bookMapper.updateByBook(book);
    }

    //测试trim标签
    @Test
    public void test5() {
        Book book = new Book();
        book.setId(123);
        book.setPublish("电子工业出版社");
        book.setAuthor("张三");
        book.setPages(454);

        System.out.println(bookMapper.select(book));
    }

    @Test
    public void test6() {
        HashSet<Integer> set = new HashSet<>();
    }
}
