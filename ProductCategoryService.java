package com.clickit.service;

import com.clickit.dao.ProductCategoryDao;
import com.clickit.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryDao categoryDao;
    public ProductCategory addProductCatory(ProductCategory category) {
        ProductCategory productCategory = categoryDao.save(category);
        return productCategory;
    }

    public ProductCategory getProductCategoryById(Integer productCategoryId) {
        Optional<ProductCategory> productCategory = categoryDao.findById(productCategoryId);
        return productCategory.orElse(null);
    }

    public void deleteProductCategory(ProductCategory productCategory) {
        categoryDao.delete(productCategory);
    }
}
