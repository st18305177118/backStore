package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.Shop;
import com.shi.bookstore.repository.ShopRepository;
import com.shi.bookstore.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 22:21
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public List<Shop> getShop(Shop shop) {
        return shopRepository.findShopName(shop.getName());
    }

    @Override
    public void deleteShop(long id) {
        shopRepository.deleteById(id);
    }

    @Override
    public Shop updateShop(Shop shop) {
        return shopRepository.save(shop);
    }
}
