package com.clickit.dao;

import com.clickit.model.ShopAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopAddressDao extends JpaRepository<ShopAddress, Integer> {
}
