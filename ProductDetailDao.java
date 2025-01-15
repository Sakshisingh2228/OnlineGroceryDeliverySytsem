package com.clickit.dao;

import com.clickit.model.Product;
import com.clickit.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailDao extends JpaRepository<ProductDetails,Integer> {
}
