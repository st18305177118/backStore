package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Shop;
import com.shi.bookstore.repository.ShopRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopControllerTest {
    @Autowired
    private ShopRepository shopRepository;
    @Test
    public void addShop() {
        Shop shop = new Shop();
        shop.setBookName("童年");
        shop.setBookNumber(1);
        shop.setBookPrice(20);
        shopRepository.save(shop);
    }
    @Test
    public void findShop() {
        Shop shop = new Shop();
        shop.setName("试试");
        List list = shopRepository.findShopName(shop.getName());
        System.out.println(list);
    }
    @Test
    public void deleteShop() {
        Shop shop = new Shop();
        long l = (long)29;
        shop.setId(l);
        shopRepository.deleteById(shop.getId());
    }

    @Test
    public void updateShop() {
        Shop shop = new Shop();
        long l = (long)30;
        shop.setId(l);
        shop.setName("大学");
        shopRepository.save(shop);
    }
}