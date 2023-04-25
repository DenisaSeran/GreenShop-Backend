package com.deni.GreenShop.Services;

import com.deni.GreenShop.Models.Customer;
import com.deni.GreenShop.Repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServices implements CustomerServicesInterface{
    @Autowired
    public CustomersRepository customersRepository;
    @Override
    public List<Customer> showAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customersRepository.findAll()
                .forEach(customers::add);

        return customers;
    }

    @Override
    public Customer showCustomerByID(int customerID) {
        return customersRepository.findById(customerID).orElse(null);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customersRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer newCustomer) {
        Customer customerToUpdate = customersRepository.findById(newCustomer.getCustomerID()).orElse(null);
        customerToUpdate.setCustomerName(newCustomer.getCustomerName());
        customerToUpdate.setCustomerID(newCustomer.getCustomerID());
        customerToUpdate.setCustomerEmail(newCustomer.getCustomerEmail());
        customerToUpdate.setCustomerPass(newCustomer.getCustomerPass());
        customerToUpdate.setCustomerCountry(newCustomer.getCustomerCountry());
        customerToUpdate.setCustomerCity(newCustomer.getCustomerCity());
        customersRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(int customerID) {
        customersRepository.deleteById(customerID);
    }
}
