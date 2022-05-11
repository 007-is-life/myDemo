package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Book;
import com.example.entity.User;
import com.example.vo.UserVO;
import com.example.vo.UserVO2;
import org.apache.ibatis.annotations.Select;

/**
* @author Administrator
* @description 针对表【user(这是用户表)】的数据库操作Mapper
* @createDate 2022-03-03 12:56:54
* @Entity com.example.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    //联表查询 一对一
    UserVO getUserById(Integer id);
    //联表查询 一对多
    UserVO2 getUserOVByBookcaseid(Integer id);

    UserVO getUserVOByIdLazy(Integer id);

    Book getBookById(Integer id);

    @Select("select * from user where user_id=#{id}")
    User getUserById2(Integer id);
}




