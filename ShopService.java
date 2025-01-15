package com.clickit.service;

import com.clickit.dao.ShopDao;
import com.clickit.model.Shop;
import com.clickit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopDao shopDao;

    public Shop addShop(Shop shop) {
        shopDao.save(shop);
        return shop;
    }

    public Shop getById(Integer shopId){
        Shop shop = shopDao.getOne(shopId);
        return shop;
    }

    public List<Shop> getAllShops(){
        return shopDao.findAll();
    }

    public Shop updateShopStatus(Integer shopId, String status) {
        Shop oldShop = shopDao.getById(shopId);
        oldShop.setShopStatus(status.toUpperCase());
        shopDao.save(oldShop);
        return oldShop;
    }

    public void deleteShop(Shop shop) {
        shopDao.delete(shop);
    }

    public Shop getShopByShopOwner(User user){
        Shop shop = shopDao.findByShopOwner(user);
        return shop;
    }

}
