package com.clickit.dao;

import com.clickit.model.Cart;
import com.clickit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartDao extends JpaRepository<Cart,Integer> {
    public List<Cart> findByUserId(Long userId);
}
