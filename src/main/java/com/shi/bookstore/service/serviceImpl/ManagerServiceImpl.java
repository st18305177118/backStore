package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.Manager;
import com.shi.bookstore.repository.ManagerRepository;
import com.shi.bookstore.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/4/23 14:59
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public Manager saveManager(Manager manager) {
        return managerRepository.save(manager);
    }

    @Override
    public Manager Login(Manager manager) {
        return managerRepository.findByPasswordAndName(manager.getName(),manager.getPassword());
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }
}
