package com.deni.GreenShop.Services;

import com.deni.GreenShop.Models.Customer;

import java.util.List;

public interface CustomerServicesInterface{
    List<Customer> showAllCustomers();
    Customer showCustomerByID(int customerID);
    Customer addCustomer(Customer customer);
    void updateCustomer(Customer newCustomer);
    void deleteCustomer(int customerID);
}
