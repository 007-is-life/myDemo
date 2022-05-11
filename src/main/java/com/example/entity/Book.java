package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName book
 */
@TableName(value ="book")
@Data
public class Book implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "author")
    private String author;

    /**
     * 
     */
    @TableField(value = "publish")
    private String publish;

    /**
     * 
     */
    @TableField(value = "pages")
    private Integer pages;

    /**
     * 
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 
     */
    @TableField(value = "bookcaseid")
    private Integer bookcaseid;

    /**
     * 
     */
    @TableField(value = "abled")
    private Integer abled;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}