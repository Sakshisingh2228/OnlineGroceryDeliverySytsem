package com.clickit.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.lang.reflect.Type;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    private Integer productId;

    private Integer productVarityId;

    private int quantity;

    private Long userId;

    public Cart() {
    }

    public Cart(int cartId, Integer productId, Integer productVarityId, int quantity, Long userId) {
        this.cartId = cartId;
        this.productId = productId;
        this.productVarityId = productVarityId;
        this.quantity = quantity;
        this.userId = userId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductVarityId() {
        return productVarityId;
    }

    public void setProductVarityId(Integer productVarityId) {
        this.productVarityId = productVarityId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
