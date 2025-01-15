package com.clickit.dao;

import com.clickit.model.Product;
import com.clickit.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageDao extends JpaRepository<ProductImage,Integer> {
}
