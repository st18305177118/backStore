package com.shi.bookstore.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 11:16
 */
@Entity
@Data
@Table(name = "tb_manager")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("管理员ID")
    @Column(name = "id")
    private Long id;

    @ApiModelProperty("用户名")
    @Column(name = "name")
    private String name;

    @ApiModelProperty("密码")
    @Column(name = "password")
    private String password;

    public Manager(){

    }

    public Manager(String name, String password){
        this.name = name;
        this.password = password;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
