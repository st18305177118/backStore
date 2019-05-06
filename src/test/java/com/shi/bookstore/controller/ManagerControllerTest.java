package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Manager;
import com.shi.bookstore.repository.ManagerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerControllerTest {
    @Autowired
    private ManagerRepository managerRepository;
    @Test
    public void addManager() {
        Manager manager = new Manager();
        manager.setName("shitu");
        manager.setPassword("shitu");
        managerRepository.save(manager);
    }
}