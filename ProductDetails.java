package com.clickit.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productDetailsId;
    @Column(length = 355)
    @JsonProperty("Key Feature")
    private String keyfeature;
    @Column(length = 355)
    @JsonProperty("Ingredients")
    private String ingredients;

    @JsonProperty("Self Life")
    private String selfLife;
    @JsonProperty("Manufacturor Details")
    private String manufacturorDetails;
    @JsonProperty("Marketed By")
    private  String marketedBy;
    @JsonProperty("FSSAI Licence")
    private String fssaiLicence;
    @JsonProperty("Country Of Origin")
    private String countryOfOrigin;
    @JsonProperty("Customer Care Details")
    private String customerCareDetails;
    @Column(length = 1023)
    @JsonProperty("Return Policy")
    private String returnPolicy;
    @Column(length = 1023)
    private String productDescription;
    @Column(length = 1023)
    @JsonProperty("Desclaimer")
    private String Desclaimer;
    @JsonProperty("Expiry Date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date expiryDate;
    @JsonProperty("Manufactured Date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date mfd;

    public ProductDetails() {
    }

    public ProductDetails(Integer productDetailsId, String keyfeature, String ingredients, String selfLife, String manufacturorDetails, String marketedBy, String fssaiLicence, String countryOfOrigin, String customerCareDetails, String returnPolicy, String productDescription, String desclaimer, Date expiryDate, Date mfd) {
        this.productDetailsId = productDetailsId;
        this.keyfeature = keyfeature;
        this.ingredients = ingredients;
        this.selfLife = selfLife;
        this.manufacturorDetails = manufacturorDetails;
        this.marketedBy = marketedBy;
        this.fssaiLicence = fssaiLicence;
        this.countryOfOrigin = countryOfOrigin;
        this.customerCareDetails = customerCareDetails;
        this.returnPolicy = returnPolicy;
        this.productDescription = productDescription;
        Desclaimer = desclaimer;
        this.expiryDate = expiryDate;
        this.mfd = mfd;
    }

    public Integer getProductDetailsId() {
        return productDetailsId;
    }

    public void setProductDetailsId(Integer productDetailsId) {
        this.productDetailsId = productDetailsId;
    }

    public String getKeyfeature() {
        return keyfeature;
    }

    public void setKeyfeature(String keyfeature) {
        this.keyfeature = keyfeature;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getSelfLife() {
        return selfLife;
    }

    public void setSelfLife(String selfLife) {
        this.selfLife = selfLife;
    }

    public String getManufacturorDetails() {
        return manufacturorDetails;
    }

    public void setManufacturorDetails(String manufacturorDetails) {
        this.manufacturorDetails = manufacturorDetails;
    }

    public String getMarketedBy() {
        return marketedBy;
    }

    public void setMarketedBy(String marketedBy) {
        this.marketedBy = marketedBy;
    }

    public String getFssaiLicence() {
        return fssaiLicence;
    }

    public void setFssaiLicence(String fssaiLicence) {
        this.fssaiLicence = fssaiLicence;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCustomerCareDetails() {
        return customerCareDetails;
    }

    public void setCustomerCareDetails(String customerCareDetails) {
        this.customerCareDetails = customerCareDetails;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getDesclaimer() {
        return Desclaimer;
    }

    public void setDesclaimer(String desclaimer) {
        Desclaimer = desclaimer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getMfd() {
        return mfd;
    }

    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productDetailsId=" + productDetailsId +
                ", keyfeature='" + keyfeature + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", selfLife='" + selfLife + '\'' +
                ", manufacturorDetails='" + manufacturorDetails + '\'' +
                ", marketedBy='" + marketedBy + '\'' +
                ", fssaiLicence='" + fssaiLicence + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", customerCareDetails='" + customerCareDetails + '\'' +
                ", returnPolicy='" + returnPolicy + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", Desclaimer='" + Desclaimer + '\'' +
                ", expiryDate=" + expiryDate +
                ", mfd=" + mfd +
                '}';
    }
}
