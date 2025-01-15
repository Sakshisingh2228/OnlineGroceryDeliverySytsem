package com.clickit.controller;

import com.clickit.common.Response;
import com.clickit.model.Product;
import com.clickit.model.ProductCategory;
import com.clickit.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-category")
public class ProductCategoryController {
    @Autowired
    ProductCategoryService productCategoryService;
@PostMapping("/add-product-category")
    public ResponseEntity<Object> addProductCategory(@RequestBody ProductCategory category){
        Response response = new Response();
        ProductCategory productCategory = productCategoryService.addProductCatory(category);
        if(productCategory == null){
            response.setMessage("Category not added for this product");
            response.setStatus(HttpStatus.BAD_REQUEST);
        }else{
            response.setMessage("Category added for this product");
            response.setStatus(HttpStatus.OK);
            response.setData(productCategory);
        }
        return response.sendResponse();
    }
    @GetMapping("/{productCategoryId}")
    public ResponseEntity<Object> getProductCategoryById(@PathVariable("productCategoryId") Integer productCategoryId){
        Response response = new Response();
        ProductCategory productCategory = productCategoryService.getProductCategoryById(productCategoryId);
        if(productCategory == null){
            response.setMessage("product category not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            response.setMessage("found");
            response.setStatus(HttpStatus.OK);
            response.setData(productCategory);
        }
        return response.sendResponse();
    }

    @DeleteMapping("/{productCategoryId}")
    public ResponseEntity<Object> deleteProductCategoryById(@PathVariable("productCategoryId") Integer productCategoryId){
        Response response = new Response();
        ProductCategory productCategory = productCategoryService.getProductCategoryById(productCategoryId);
        if(productCategory == null){
            response.setMessage("product category not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            productCategoryService.deleteProductCategory(productCategory);
            response.setMessage("product category deleted");
            response.setStatus(HttpStatus.OK);
        }
        return response.sendResponse();
    }


}
