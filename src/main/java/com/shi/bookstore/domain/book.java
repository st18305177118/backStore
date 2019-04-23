package com.shi.bookstore.domain;

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
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("图书Id")
    private Long id;

    @ApiModelProperty("图书名")
    private String bookName;

    @ApiModelProperty("图书简介")
    private String introduce;



}
