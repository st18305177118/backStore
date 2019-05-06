package com.shi.bookstore.repository;

import com.shi.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @auther shiTu
 * @date 2019/4/28 16:21
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /*登录*/
    @Query("select user from User user where user.username=?1 and user.password=?2")
    User findByPasswordAndName(String name, String password);
    /*注册*/
    @Query("select user from User user where user.username=?1")
    User findByName(String name);
}
