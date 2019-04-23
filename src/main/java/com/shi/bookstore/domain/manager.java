package com.shi.bookstore.domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @auther shiTu
 * @date 2019/4/22 11:16
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@Table(name = "tb_manager")
public class manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("管理员ID")
    private Long id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("密码")
    private String password;
}
