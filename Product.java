package com.clickit.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductVariety> productVarieties;
    @OneToOne(cascade = CascadeType.ALL)
    private ProductDetails productDetail;
    @OneToOne(cascade = CascadeType.ALL)
    private  ProductCategory productCategory;

    public Product(Integer productId, String productName, List<ProductVariety> productVarieties, ProductDetails productDetail, ProductCategory productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productVarieties = productVarieties;
        this.productDetail = productDetail;
        this.productCategory = productCategory;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ProductVariety> getProductVarieties() {
        return productVarieties;
    }

    public void setProductVarities(List<ProductVariety> productVarieties) {
        this.productVarieties = productVarieties;
    }

    public ProductDetails getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetails productDetail) {
        this.productDetail = productDetail;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Product() {
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productVarieties=" + productVarieties +
                ", productDetail=" + productDetail +
                ", productCategory=" + productCategory +
                '}';
    }
}
