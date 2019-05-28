package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.User;
import com.shi.bookstore.repository.UserRepository;
import com.shi.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findLikeUsername(User user) {
        return userRepository.findLikeUsername(user.getUsername());
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
