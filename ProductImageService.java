package com.clickit.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickit.dao.ProductImageDao;
import com.clickit.model.Product;
import com.clickit.model.ProductImage;
import com.clickit.model.Shop;
@Service
public class ProductImageService {
	@Autowired
	ProductImageDao productImageDao;

	public   ProductImage addProductImage(ProductImage productImage) {
		return productImageDao.save(productImage);
	}
      
	

	public ProductImage getProductImageById(Integer productId) {
	        Optional<ProductImage> productimage = productImageDao.findById(productId);
	        try {
	            return productimage.get();
	        }catch (NoSuchElementException ex){
	            return null;
	        }
	    }




	


	public void deletProductImageById(ProductImage productImage) {
		productImageDao.delete(productImage);	
		
	}



	public ProductImage updateProductImageById(ProductImage productImage) {
		
		
		
		
		return productImageDao.save(productImage);
	}




	



	}
