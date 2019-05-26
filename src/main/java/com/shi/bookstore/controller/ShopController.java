package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Shop;
import com.shi.bookstore.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 22:25
 */
@RestController
@RequestMapping("/shop")
@CrossOrigin
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping("/addShop")
    public Shop addShop(@RequestBody Shop shop){
        return shopService.addShop(shop);
    }

    @PostMapping("/findShop")
    public List<Shop> findShop(@RequestBody Shop shop){
        List list = shopService.getShop(shop);
        return list;
    }

    @DeleteMapping("/deleteShop/{id}")
    public void deleteShop(@PathVariable long id){
        shopService.deleteShop(id);
    }

    /*更新*/
    @PostMapping("/updateShop")
    public Shop updateShop(@RequestBody Shop shop){
        return shopService.updateShop(shop);
    }
}
