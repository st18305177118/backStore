package com.shi.bookstore.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/5/25 21:58
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Table(name = "tb_shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("购物车Id")
    @Column(name = "id")
    private Long id;

    @ApiModelProperty("用户名")
    @Column(name = "name")
    private String name;

    @ApiModelProperty("图书名称")
    @Column(name = "bookName")
    private String bookName;

    @ApiModelProperty("数量")
    @Column(name = "bookNumber")
    private int bookNumber;

    @ApiModelProperty("小计")
    @Column(name = "bookPrice")
    private double bookPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
