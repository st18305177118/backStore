package com.shi.bookstore.service;

import com.shi.bookstore.entity.User;
import org.springframework.stereotype.Service;

/**
 * @auther shiTu
 * @date 2019/4/28 16:22
 */
@Service
public interface UserService {
    /*登录*/
    User login(User user);
    /*注册*/
    User register(User user);
    /*判断用户是否已经存在*/
    User checkExist (User user);
}
