package com.deni.GreenShop.Services;

import com.deni.GreenShop.Errors.CustomerNotFoundException;
import com.deni.GreenShop.Errors.DeleteCustomerNotFoundException;
import com.deni.GreenShop.Models.Customer;
import com.deni.GreenShop.Repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Customer showCustomerByID(int customerID) throws CustomerNotFoundException {
        Optional<Customer> customer = customersRepository.findById(customerID);

        if(!customer.isPresent()){
            throw new CustomerNotFoundException("Customer with the ID of "+ customerID + " not found");
        }
        return customer.get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customersRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer newCustomer){
        Customer customerToUpdate = customersRepository.findById(newCustomer.getCustomerid()).orElse(null);
            customerToUpdate.setCustomerName(newCustomer.getCustomerName());
            customerToUpdate.setCustomerid(newCustomer.getCustomerid());
            customerToUpdate.setCustomerEmail(newCustomer.getCustomerEmail());
            customerToUpdate.setCustomerPass(newCustomer.getCustomerPass());
            customerToUpdate.setCustomerCountry(newCustomer.getCustomerCountry());
            customerToUpdate.setCustomerCity(newCustomer.getCustomerCity());
            customersRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(int customerID) throws DeleteCustomerNotFoundException {
        Optional<Customer> customer = customersRepository.findById(customerID);

        if(!customer.isPresent()){
            throw new DeleteCustomerNotFoundException("Customer to be deleted with the ID of " + customerID + " does not exist");
        }
        customersRepository.deleteById(customerID);
    }
}
