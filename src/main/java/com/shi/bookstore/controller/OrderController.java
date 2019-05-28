package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Order;
import com.shi.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/28 1:20
 */
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    /*显示所有的订单*/
    @GetMapping("/getOrderList")
    public List<Order> findOrderList(){
        return orderService.findAllOrder();
    }

    /*添加单个订单*/
    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable long id){
        orderService.deleteOrder(id);
    }

    @GetMapping("/findOrderByID/{id}")
    public Order findOrderByID(@PathVariable long id){
       return orderService.findOrderByID(id);
    }
    /*更新*/
    @PostMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    /*根据收货人查找*/
    @PostMapping("/findOrderByName")
    public List<Order> findOrderByName(@RequestBody Order order){
        List list = orderService.findOrderByName(order);
        return list;
    }
    /*根据收货人查找*/
    @PostMapping("/findLikeName")
    public List<Order> findLikeName(@RequestBody Order order){
        List list = orderService.findOrderLike(order);
        return list;
    }
}
