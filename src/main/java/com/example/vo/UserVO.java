package com.example.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.entity.Book;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    private Integer bookId;

    private Book book;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
