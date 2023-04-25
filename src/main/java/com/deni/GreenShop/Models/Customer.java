package com.deni.GreenShop.Models;

import jakarta.persistence.*;


@Entity
@Table(name = "customer")
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int customerID;
        private String customerName;
        private String customerEmail;
        private String customerPass;
        private String customerCountry;
        private String customerCity;

    public Customer() {
    }

    public Customer(int customerID, String customerEmail, String customerPass, String customerCountry, String customerCity, String customerName) {
        this.customerID = customerID;
        this.customerEmail = customerEmail;
        this.customerPass = customerPass;
        this.customerCountry = customerCountry;
        this.customerCity = customerCity;
        this.customerName=customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        customerCity = customerCity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPass='" + customerPass + '\'' +
                ", customerCountry='" + customerCountry + '\'' +
                ", customerCity='" + customerCity + '\'' +
                '}';
    }
}
