package com.deni.GreenShop.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeID;
    private String storeName;
    private String storeCountry;
    private String storeCity;
    private String storeStreet;
    private int storeNr;

    public Store() {
    }

    public Store(int storeID, String storeName, String storeCountry, String storeCity, String storeStreet, int storeNr) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeCountry = storeCountry;
        this.storeCity = storeCity;
        this.storeStreet = storeStreet;
        this.storeNr = storeNr;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreCountry() {
        return storeCountry;
    }

    public void setStoreCountry(String storeCountry) {
        this.storeCountry = storeCountry;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreStreet() {
        return storeStreet;
    }

    public void setStoreStreet(String storeStreet) {
        this.storeStreet = storeStreet;
    }

    public int getStoreNr() {
        return storeNr;
    }

    public void setStoreNr(int storeNr) {
        this.storeNr = storeNr;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", storeCountry='" + storeCountry + '\'' +
                ", storeCity='" + storeCity + '\'' +
                ", storeStreet='" + storeStreet + '\'' +
                ", storeNr=" + storeNr +
                '}';
    }
}
