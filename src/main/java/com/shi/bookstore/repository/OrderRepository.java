package com.shi.bookstore.repository;

import com.shi.bookstore.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/28 1:17
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    /*根据用户名模糊查找*/
    @Query("select order from Order order where order.name like %?1%")
    List<Order> findOrderLike(String name);
    @Query("select order from Order order where order.id = ?1")
    List<Order> findOrderByID(String id);
    /*根据收货人查找订单*/
    @Query("select order from Order order where order.name = ?1")
    List<Order> findOrderByName(String name);
}
