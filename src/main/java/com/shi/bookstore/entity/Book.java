package com.shi.bookstore.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 15:32
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Table(name = "tb_book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("图书Id")
    @Column(name = "id")
    private Long id;

    @ApiModelProperty("图书名")
    @Column(name = "bookName")
    private String bookName;

    @ApiModelProperty("图书简介")
    @Column(name = "introduce")
    private String introduce;

    @ApiModelProperty("原价")
    @Column(name = "price")
    private String price;

    @ApiModelProperty("现价")
    @Column(name = "nowPrice")
    private String nowPrice;

    @ApiModelProperty("作者")
    @Column(name = "author")
    private String author;

    @ApiModelProperty("图书封面")
    @Column(name = "picture")
    private String picture;

    @ApiModelProperty("图书小类")
    @Column(name = "smaType")
    private String smaType;

    @ApiModelProperty("图书大类")
    @Column(name = "bigType")
    private String bigType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSmaType() {
        return smaType;
    }

    public void setSmaType(String smaType) {
        this.smaType = smaType;
    }

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }
}
