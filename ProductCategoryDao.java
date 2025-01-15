package com.clickit.dao;

import com.clickit.model.Product;
import com.clickit.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
}
