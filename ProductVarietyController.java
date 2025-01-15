package com.clickit.controller;

import com.clickit.common.Response;
import com.clickit.model.Product;
import com.clickit.model.ProductVariety;
import com.clickit.service.ProductVarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/productVariety")
public class ProductVarietyController {

    @Autowired
    ProductVarietyService productVarietyService;

    @GetMapping("/{productVarietyId}")
    public ResponseEntity<Object> getProductVariety(@PathVariable Integer productVarietyId){
        Response response = new Response();
        ProductVariety productVariety = productVarietyService.getProductVarietyById(productVarietyId);
        if(productVariety == null){
            response.setMessage("product not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            response.setMessage("found");
            response.setStatus(HttpStatus.OK);
            response.setData(productVariety);
        }
        return response.sendResponse();
    }
}
