package com.shi.bookstore.service;

import com.shi.bookstore.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/28 1:13
 */
@Service
public interface OrderService {
    /*显示全部订单*/
    List<Order> findAllOrder();
    /*新增订单*/
    Order addOrder(Order order);
    /*根据ID删除订单*/
    void deleteOrder(long id);
    /*编辑订单*/
    Order updateOrder(Order order);
    /*根据ID查找订单*/
    Order findOrderByID(long id);
    /*根据真实姓名模糊查询*/
    List<Order> findOrderLike(Order order);
    /*根据真实姓名查询*/
    List<Order> findOrderByName(Order order);
}
