package com.shi.bookstore.service;

import com.shi.bookstore.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

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
    /*更新用户*/
    User updateUser(User user);
    /*根据用户名模糊查询*/
    List<User> findLikeUsername(User user);
    /*删除用户*/
    void deleteUser(long id);
    /*显示全部订单*/
    List<User> findAllUser();
}
