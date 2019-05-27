package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Order;
import com.shi.bookstore.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTest {
    @Autowired
    private OrderRepository orderRepository;
    @Test
    public void findOrderList() {
    }

    @Test
    public void addOrder() {
        Order order = new Order();
        order.setAddress("羊山北路一号");
        order.setBookName("童年");
        order.setName("李四");
        order.setNumber(1);
        order.setPhone("15686966325");
        order.setTotalPrice("50");
        orderRepository.save(order);
    }

    @Test
    public void deleteShop() {
    }

    @Test
    public void findOrderByID() {
        long l = (long)46;
        orderRepository.findById(l);
        System.out.println();
    }

    @Test
    public void updateOrder() {
    }
}