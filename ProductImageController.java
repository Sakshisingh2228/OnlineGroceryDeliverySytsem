package com.clickit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clickit.common.Response;
import com.clickit.model.Product;
import com.clickit.model.ProductCategory;
import com.clickit.model.ProductImage;
import com.clickit.service.ProductImageService;
@CrossOrigin
@Controller
@RequestMapping("/productImageController")
public class ProductImageController {
	@Autowired
	ProductImageService productImageService;
    
	@PostMapping("/add-product-image")
	public ResponseEntity<Object> addProductImage(@RequestBody ProductImage productImage){
        Response response = new Response();
        ProductImage product1 = new ProductImage();
        product1 =productImageService.addProductImage(productImage);
       
        if(product1 == null){
        	 
            response.setMessage("productimage not added");
            response.setStatus(HttpStatus.BAD_REQUEST);
        }
        else{
            response.setMessage("productimage added succesfull");
            response.setStatus(HttpStatus.CREATED);
            response.setData(product1);
        }
        return response.sendResponse();
    }
	@GetMapping("/{productimage-Id}")
    public ResponseEntity<Object> getProductImageById(@PathVariable("productimage-Id") Integer productId){
        Response response = new Response();
        ProductImage productimage = productImageService.getProductImageById(productId);
        if(productimage == null){
            response.setMessage("productimage  not found");
            response.setStatus(HttpStatus.OK);
        }
        else{
            response.setMessage("found");
            response.setStatus(HttpStatus.OK);
            response.setData(productimage);
        }
        return response.sendResponse();
    }
	
	
@PutMapping("/{productimage1}")	
  public ResponseEntity<Object> updateProductImageById(@RequestHeader("productimage1") Integer  productId, @RequestBody ProductImage newProductImage)
  {
	  Response response = new Response();
	  ProductImage productImage=productImageService.getProductImageById(productId);
	  if(productImage==null)
	  {
		  response.setMessage("productImage not found");
          response.setStatus(HttpStatus.OK);
		  
	  }
	  else
	  {
		  productImage.setImageUrl(newProductImage.getImageUrl());
			productImageService.updateProductImageById(productImage);
			response.setMessage("Your Product image  is succesfully Updated");
			response.setStatus(HttpStatus.OK);
	  }
	  
	  
	  return response.sendResponse();
	  
  }
        
        
        @DeleteMapping("/{productImageId}")
        public ResponseEntity<Object> deleteProductImageById(@PathVariable("productImageId") Integer productImageId){
            Response response = new Response();
            ProductImage productImage = productImageService.getProductImageById(productImageId);
            if(productImage == null){
                response.setMessage("product image  not found");
                response.setStatus(HttpStatus.OK);
            }
            else{
                productImageService.deletProductImageById(productImage);
                response.setMessage("product image  deleted");
                response.setStatus(HttpStatus.OK);
            }
            return response.sendResponse();
        }
		
}
