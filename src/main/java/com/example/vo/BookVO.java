package com.example.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@TableName(value ="book")
@Data
public class BookVO implements Serializable {
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private List<Integer> ids;

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