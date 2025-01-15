package com.clickit.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductVariety {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productVarietyId;
    private String unit;
    private Integer price;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductImage> images;

    public ProductVariety() {
    }

    public ProductVariety(Integer productVarityId, String unit, Integer price, List<ProductImage> images) {
        this.productVarietyId = productVarityId;
        this.unit = unit;
        this.price = price;
        this.images = images;
    }

    public Integer getProductVarietyId() {
        return productVarietyId;
    }

    public void setProductVarietyId(Integer productVarietyId) {
        this.productVarietyId = productVarietyId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "ProductVariety{" +
                "productVarietyId=" + productVarietyId +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", images=" + images +
                '}';
    }
}

