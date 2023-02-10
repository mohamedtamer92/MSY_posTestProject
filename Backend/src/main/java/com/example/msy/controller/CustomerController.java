package com.example.msy.controller;
import com.example.msy.entity.Customers;
import com.example.msy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:8081"})
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController (CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customers getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/getCustomerByPhone/{phone}")
    public Customers getCustomerByPhone(@PathVariable String phone){
        return customerService.getCustomerByPhone(phone);
    }
    @GetMapping
    public List<Customers> getAllCustomers(){

        return customerService.getAllCustomers();
    }
}
