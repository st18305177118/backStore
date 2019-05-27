package com.shi.bookstore.controller;

import com.shi.bookstore.entity.User;
import com.shi.bookstore.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void findUser() {
        User user = new User();
        user.setUsername("admin");
        User user1=userRepository.findByName(user.getUsername());
        System.out.println(user1);
    }
}