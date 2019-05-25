package com.shi.bookstore.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 15:32
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("图书Id")
    private Long id;

    @ApiModelProperty("图书名")
    private String bookName;

    @ApiModelProperty("图书简介")
    private String introduce;

    @ApiModelProperty("原价")
    private String price;

    @ApiModelProperty("现价")
    private String nowPrice;

    @ApiModelProperty("作者")
    private String author;

    @ApiModelProperty("图书封面")
    private String picture;

    @ApiModelProperty("图书小类")
    private String smaType;

    @ApiModelProperty("图书大类")
    private String bigType;

}
