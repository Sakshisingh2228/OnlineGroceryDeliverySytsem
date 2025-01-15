package com.clickit.service;

import com.clickit.dao.CartDao;
import com.clickit.model.Cart;
import com.clickit.model.Product;
import com.clickit.model.ProductVariety;
import com.clickit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CartService {

    @Autowired
    CartDao cartDao;

    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;


    @Autowired
    ProductVarietyService varietyService;

    public List<Cart>getAllCartItem(){
        return cartDao.findAll();
    }
    public List<Cart> getUserCartItems(Long userId){
        return cartDao.findByUserId(userId);
    }
    public Cart addToCart(Cart cart){
        cartDao.save(cart);
        return cart;
    }

    public Cart getCartItem(Integer cartId) {
        Optional<Cart> x = cartDao.findById(cartId);
        return x.get();
    }

    public void deleteCartItem(Cart cart) {
        cartDao.delete(cart);
    }
}
