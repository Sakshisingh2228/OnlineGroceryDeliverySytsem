package com.clickit.dao;

import com.clickit.model.Shop;
import com.clickit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopDao extends JpaRepository<Shop,Integer> {
    public Shop findByShopName(String shopName);
    public  Shop findByShopOwner(User user);
}
