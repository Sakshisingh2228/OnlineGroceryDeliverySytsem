package com.clickit.service;

import com.clickit.dao.ProductVarietyDao;
import com.clickit.model.ProductVariety;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductVarietyService {
    @Autowired
    ProductVarietyDao productVarietyDao;
    public ProductVariety getProductVarietyById(Integer productVarietyId){
        Optional<ProductVariety> variety = productVarietyDao.findById(productVarietyId);
        return variety.get();
    }
}
