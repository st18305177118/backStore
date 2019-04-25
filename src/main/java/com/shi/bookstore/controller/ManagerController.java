package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Manager;
import com.shi.bookstore.entity.RestResult;
import com.shi.bookstore.service.serviceImpl.ManagerServiceImpl;
import com.shi.bookstore.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * @auther shiTu
 * @date 2019/4/23 10:45
 */
@RestController
@RequestMapping("/manager")
@CrossOrigin
public class ManagerController {
//    @Autowired
//    ManagerRepository managerRepository;
//    @GetMapping(value = "/managerList")
//    private List<Manager> managerList(){
//        return managerRepository.findAll();
//    }
    @Autowired
    ManagerServiceImpl managerService;
    ResultGenerator generator;

    @RequestMapping("/register")
    public RestResult register(@Valid Manager manager, BindingResult bindingResult){
        return generator.getSuccessResult("用户注册成功",managerService.saveManager(manager));
    }

    @RequestMapping(value = "/login/",method = RequestMethod.POST)
    public RestResult login(String name, String password, HttpSession session){
        Manager manager = managerService.checkLogin(name,password);
        if(manager !=null){
            session.setAttribute("manager",manager);
            return generator.getSuccessResult("登陆成功",manager);
        }
        return generator.getFailResult("用户名/密码错误");
    }

    @GetMapping("/list")
    public List<Manager> managerList(){
        return managerService.findAll();
    }
}
