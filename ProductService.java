package com.clickit.service;

import com.clickit.dao.ProductDao;
import com.clickit.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public Product addProduct(Product product) {
        return productDao.save(product);
    }

    public Product getProductById(Integer productId) {
        Optional<Product> product = productDao.findById(productId);
        try {
            return product.get();
        }catch (NoSuchElementException ex){
            return null;
        }
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
}
