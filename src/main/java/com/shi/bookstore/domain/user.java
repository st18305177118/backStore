package com.shi.bookstore.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 13:47
 */
@Entity
@Table(name = "tb_user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("用户ID")
    private Long Id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("trueName")
    private String trueName;

    @ApiModelProperty("address")
    private String address;

    @ApiModelProperty("Img用户头像")
    private String Img;

    @ApiModelProperty("用户余额")
    private String balance;


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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
