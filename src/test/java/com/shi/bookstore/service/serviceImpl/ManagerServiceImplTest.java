package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.Manager;
import com.shi.bookstore.repository.ManagerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerServiceImplTest {
    @Autowired
    private ManagerRepository managerRepository;

    @Test
    public void saveManager() {
    }

    @Test
    public void checkLogin() {
    }


    @Test
    public void findAll() {
        List<Manager> list = managerRepository.findAll();
        System.out.println(list);
    }
}