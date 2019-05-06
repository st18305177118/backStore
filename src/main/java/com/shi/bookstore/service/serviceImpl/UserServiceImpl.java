package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.User;
import com.shi.bookstore.repository.UserRepository;
import com.shi.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther shiTu
 * @date 2019/4/28 16:24
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(User user) {
        return userRepository.findByPasswordAndName(user.getUsername(),user.getPassword());
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User checkExist(User user) {
        return userRepository.findByName(user.getUsername());
    }
}
