package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Manager;
import com.shi.bookstore.repository.ManagerRepository;
import com.shi.bookstore.service.serviceImpl.ManagerServiceImpl;
import com.shi.bookstore.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/4/23 10:45
 */
@RestController
@RequestMapping("/manager")
@CrossOrigin
public class ManagerController {
    @Autowired
    ManagerServiceImpl managerService;
    ResultGenerator generator;
    ManagerRepository managerRepository;

//    @PostMapping("/register")
//    public RestResult register(@Valid Manager manager, BindingResult bindingResult){
//        return generator.getSuccessResult("用户注册成功",managerService.saveManager(manager));
//    }

//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    public RestResult login(Manager manager){
//        Manager manager = managerService.checkLogin();
//        if(manager !=null){
//            session.setAttribute("manager",manager);
//            return generator.getSuccessResult("登陆成功",manager);
//        }
//        return generator.getFailResult("用户名/密码错误");
//    }
    @PostMapping("/login")
    public Boolean login(@RequestBody Manager manager){
        if (managerService.Login(manager)!=null){
            System.out.println("登录成功！");
            managerService.Login(manager);
            return true;
        }else {
            System.out.println("登录失败！");
            managerService.Login(manager);
            return false;
        }
    }

    @GetMapping("/list")
    public List<Manager> managerList(){
        return managerService.findAll();
    }
    /*添加*/
    @PutMapping("/addManager")
    public Boolean addManager(@RequestBody Manager manager){
        if(managerService.checkExist(manager)!=null){
            System.out.println("添加失败！");
            return false;
        }else {
            managerService.saveManager(manager);
            System.out.println("添加成功！");
            return true;
        }
    }
//    @PostMapping("/addManager")
//    public void addManager(@RequestBody Manager manager)throws Exception{
//        managerRepository.save(manager);
//    }
}
