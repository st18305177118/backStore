package com.shi.bookstore.service;

import com.shi.bookstore.entity.Manager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/4/23 14:56
 */
@Service
public interface ManagerService {
    /*注册*/
    Manager saveManager(Manager manager);
    /*登录*/
    Manager Login(Manager manager);
    /*全部信息*/
    List<Manager>findAll();

}
