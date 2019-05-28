package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.Order;
import com.shi.bookstore.repository.OrderRepository;
import com.shi.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/28 1:18
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findOrderByID(long id) {
        return orderRepository.getOne(id);
    }

//    @Override
//    public List<Order> findOrderByID(long id) {
//        List list = orderRepository.findOrderByID(id);
//        return list;
//    }

    @Override
    public List<Order> findOrderLike(Order order) {
        return orderRepository.findOrderLike(order.getName());
    }

    @Override
    public List<Order> findOrderByName(Order order) {
        return orderRepository.findOrderByName(order.getName());
    }

}
