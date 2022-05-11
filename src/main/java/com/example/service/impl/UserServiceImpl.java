package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.User;
import com.example.service.UserService;
import com.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user(这是用户表)】的数据库操作Service实现
* @createDate 2022-03-03 12:56:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




