package com.deni.GreenShop.Controllers;

import com.deni.GreenShop.Errors.CustomerNotFoundException;
import com.deni.GreenShop.Errors.DeleteCustomerNotFoundException;
import com.deni.GreenShop.Models.Customer;
import com.deni.GreenShop.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/home"})
@RestController
public class CustomerController {
    @Autowired
    private CustomerServices customerService;

    @GetMapping("/customers")
    public List<Customer> showAllCustomers(){
        return customerService.showAllCustomers();
    }

    @GetMapping("/customer/{customerID}")
    public Customer showCustomerByID(@PathVariable int customerID) throws CustomerNotFoundException {
        return customerService.showCustomerByID(customerID);
    }

    @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4200/home"})
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }


    @PutMapping("/updateCustomer")
    public void updateCustomer( @RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/deleteCustomer/{customerID}")

    public void deleteCustomer(@PathVariable int customerID) throws DeleteCustomerNotFoundException {

        customerService.deleteCustomer(customerID);
    }
}
