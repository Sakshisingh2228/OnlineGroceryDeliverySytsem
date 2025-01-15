package com.clickit.controller;

import com.clickit.common.Response;
import com.clickit.model.Shop;
import com.clickit.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController()
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping(value = "/register")
    public ResponseEntity<Object> registerShop(@RequestBody Shop shop){
        Response response = new Response();
        try{
            shop.setShopStatus("PENDING");
            shop.getShopOwner().setUserType("SHOP_OWNER");
            shopService.addShop(shop);
            response.setStatus(HttpStatus.OK);
            response.setData(shop);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response.sendResponse();
    }

    @GetMapping(value = "/{shopId}")
    public ResponseEntity<Object> getShopById(@PathVariable Integer shopId){
        Response response = new Response();
        try{
            Shop shop = shopService.getById(shopId);
            response.setStatus(HttpStatus.OK);
            response.setData(shop);
        }catch (Exception e){
            response.setMessage(e.getMessage());
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response.sendResponse();
    }


}
