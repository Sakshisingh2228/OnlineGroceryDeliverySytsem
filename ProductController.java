package com.clickit.controller;

import com.clickit.common.Response;
import com.clickit.model.Product;
import com.clickit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add-product")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        Response response = new Response();
        Product product1 = new Product();
        product1 =productService.addProduct(product);
        if(product1 == null){
            response.setMessage("product not added");
            response.setStatus(HttpStatus.BAD_REQUEST);
        }
        else{
            response.setMessage("product added");
            response.setStatus(HttpStatus.CREATED);
            response.setData(product1);
        }
        return response.sendResponse();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Object> getProductById(@PathVariable("productId") Integer productId){
        Response response = new Response();
        Product product = productService.getProductById(productId);
        if(product == null){
            response.setMessage("product not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            response.setMessage("found");
            response.setStatus(HttpStatus.OK);
            response.setData(product);
        }
        return response.sendResponse();
    }

    @GetMapping("/")
    public ResponseEntity<Object> getProducts(){
        Response response = new Response();
        List<Product> products = productService.getAllProducts();
        if(products == null){
            response.setMessage("product not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            response.setMessage("found");
            response.setStatus(HttpStatus.OK);
            response.setData(products);
        }
        return response.sendResponse();
    }
}
