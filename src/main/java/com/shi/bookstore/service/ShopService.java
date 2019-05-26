package com.shi.bookstore.service;

import com.shi.bookstore.entity.Shop;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 22:11
 */
@Service
public interface ShopService {
    /*新增到购物车中*/
    Shop addShop(Shop shop);
    /*根据用户名进行查找*/
    List<Shop> getShop(Shop shop);
    /*删除*/
    void deleteShop(long id);
    /*跟新*/
    Shop updateShop(Shop shop);
}
