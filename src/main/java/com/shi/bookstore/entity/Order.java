package com.shi.bookstore.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/5/28 1:00
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("订单ID")
    @Column(name = "id")
    private Long id;

    @ApiModelProperty("收货人")
    @Column(name = "name")
    private String name;

    @ApiModelProperty("手机号")
    @Column(name = "phone")
    private String phone;

    @ApiModelProperty("地址")
    @Column(name = "address")
    private String address;

    @ApiModelProperty("图书名称")
    @Column(name = "bookName")
    private String bookName;

    @ApiModelProperty("数量")
    @Column(name = "number")
    private int number;

    @ApiModelProperty("总额")
    @Column(name = "totalPrice")
    private String totalPrice;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
