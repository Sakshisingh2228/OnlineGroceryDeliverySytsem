package com.clickit.controller;

import com.clickit.common.Response;
import com.clickit.model.Cart;
import com.clickit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping("/add-to-cart")
    public ResponseEntity<Object> addToCart(@RequestBody Cart cart){
        Response response = new Response();
        try {
            if (cart == null) {
                response.setMessage("");
                response.setStatus(HttpStatus.BAD_REQUEST);
                return response.sendResponse();
            }

            cart = cartService.addToCart(cart);
        }catch (Exception e){
            e.printStackTrace();
            response.setMessage(e.getMessage());
            response.setStatus(HttpStatus.BAD_REQUEST);
        }

        return response.sendResponse();
    }
}
