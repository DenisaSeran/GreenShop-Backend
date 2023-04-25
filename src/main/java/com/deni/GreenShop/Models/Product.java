package com.deni.GreenShop.Models;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;


import java.util.Date;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;
    private int storeID;
    private String productName;
    private Date saleDate;
    private Date expDate;
    private float regularPrice;
    private float reducedPrice;
    private int productStock;

    public Product() {
    }

    public Product(int productID, int storeID, String productName, Date saleDate, Date expDate, float regularPrice, float reducedPrice, int productStock) {
        this.productID = productID;
        this.storeID = storeID;
        this.productName = productName;
        this.saleDate = saleDate;
        this.expDate = expDate;
        this.regularPrice = regularPrice;
        this.reducedPrice = reducedPrice;
        this.productStock = productStock;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public float getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(float regularPrice) {
        this.regularPrice = regularPrice;
    }

    public float getReducedPrice() {
        return reducedPrice;
    }

    public void setReducedPrice(float reducedPrice) {
        this.reducedPrice = reducedPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", storeID=" + storeID +
                ", productName='" + productName + '\'' +
                ", saleDate=" + saleDate +
                ", expDate=" + expDate +
                ", regularPrice=" + regularPrice +
                ", reducedPrice=" + reducedPrice +
                ", productStock=" + productStock +
                '}';
    }
}
