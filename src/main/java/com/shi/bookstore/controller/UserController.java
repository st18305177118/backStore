package com.shi.bookstore.controller;

import com.shi.bookstore.entity.User;
import com.shi.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther shiTu
 * @date 2019/4/28 16:31
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Boolean login(@RequestBody User user){
        if (userService.login(user)!=null){
            userService.login(user);
            System.out.println("登录成功！");
            return true;
        }else {
            System.out.println("登录失败！");
            return false;
        }
//        return managerService.Login(manager);

    }
    @PostMapping("/register")
    public Boolean addUser(@RequestBody User user){
        if(userService.checkExist(user)!=null){
            return false;
        }else {
            userService.register(user);
            return true;
        }
    }
    /*根据用户名进行查找信息*/
    @PostMapping("/findUser")
    public User findUser(@RequestBody User user){
        return userService.checkExist(user);
    }
}
