package com.example.mapper;

import com.example.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vo.BookVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Administrator
* @description 针对表【book】的数据库操作Mapper
* @createDate 2022-03-08 23:43:17
* @Entity com.example.entity.Book
*/
public interface BookMapper extends BaseMapper<Book> {

    List<BookVO> selectByIds(BookVO bookVO);

    List<Book> getByIds(@Param("ids") List<Integer> ids);

    int updateByBook(Book book);

    List<Book> select(Book book);

}




