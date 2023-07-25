package com.deni.GreenShop.Services;

import com.deni.GreenShop.Errors.CustomerNotFoundException;
import com.deni.GreenShop.Errors.DeleteCustomerNotFoundException;
import com.deni.GreenShop.Models.Customer;

import java.util.List;

public interface CustomerServicesInterface{
    List<Customer> showAllCustomers();
    Customer showCustomerByID(int customerID) throws CustomerNotFoundException;
    Customer addCustomer(Customer customer);
    void updateCustomer( Customer newCustomer);

    void deleteCustomer(int customerID) throws DeleteCustomerNotFoundException;
}
