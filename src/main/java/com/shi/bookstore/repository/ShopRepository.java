package com.shi.bookstore.repository;

import com.shi.bookstore.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 22:23
 */
public interface ShopRepository extends JpaRepository<Shop, Long> {
    /*根据用户名进行购物车查找*/
    @Query("select shop from Shop shop where shop.name = ?1")
    List<Shop> findShopName(String name);


}
