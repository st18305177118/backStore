package com.shi.bookstore.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 13:47
 */
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("用户ID")
    @Column(name = "id")
    private Long Id;

    @Column(name = "username")
    @ApiModelProperty("用户名")
    private String username;

    @Column(name = "password")
    @ApiModelProperty("密码")
    private String password;

    @Column(name = "trueName")
    @ApiModelProperty("真实姓名")
    private String trueName;

    @Column(name = "address")
    @ApiModelProperty("地址")
    private String address;

    @Column(name = "Img")
    @ApiModelProperty("Img用户头像")
    private String Img;

//    @Column(name = "balance")
//    @ApiModelProperty("用户余额")
//    private double balance;

    @Column(name = "phone")
    @ApiModelProperty("手机号")
    private String phone;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

//    public double getBalance() {
//        return balance;
//    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
