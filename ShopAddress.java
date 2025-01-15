package com.clickit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class ShopAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String shopNo;

    private String streetNo;

    private String area;
    private String state;

    private String country;

    private String pincode;

    @CreationTimestamp
    private Date createdOn;

    public ShopAddress() {
    }

    public ShopAddress(int addressId, String shopNo, String streetNo, String area, String state, String country, String pincode, Date createdOn) {
        this.addressId = addressId;
        this.shopNo = shopNo;
        this.streetNo = streetNo;
        this.area = area;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.createdOn = createdOn;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ShopAddress{" +
                "addressId=" + addressId +
                ", shopNo='" + shopNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", area='" + area + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
