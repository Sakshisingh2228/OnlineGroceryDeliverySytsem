package com.clickit.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopId;

    private String shopName;

    private String GSTNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private ShopAddress shopAddress;

    private String shopStatus;

    @CreationTimestamp
    private Date addedOn;

    @OneToOne(cascade = CascadeType.ALL)
    private User shopOwner;
    @OneToOne(cascade = CascadeType.ALL)
    private BankAccountDetail bankAccount;

    public Shop() {
    }

    public Shop(Integer shopId, String shopName, String GSTNumber, ShopAddress shopAddress, String shopStatus, Date addedOn, User shopOwner, BankAccountDetail bankAccount) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.GSTNumber = GSTNumber;
        this.shopAddress = shopAddress;
        this.shopStatus = shopStatus;
        this.addedOn = addedOn;
        this.shopOwner = shopOwner;
        this.bankAccount = bankAccount;
    }

    public BankAccountDetail getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccountDetail bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getGSTNumber() {
        return GSTNumber;
    }

    public void setGSTNumber(String GSTNumber) {
        this.GSTNumber = GSTNumber;
    }

    public ShopAddress getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(ShopAddress shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public User getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(User shopOwner) {
        this.shopOwner = shopOwner;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", GSTNumber='" + GSTNumber + '\'' +
                ", shopAddress=" + shopAddress +
                ", shopStatus='" + shopStatus + '\'' +
                ", addedOn=" + addedOn +
                ", shopOwner=" + shopOwner +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
