package com.example.msy.controller;
import com.example.msy.entity.Customers;
import com.example.msy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController (CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customers getCustomerById(@PathVariable int id){
        System.out.println(id);
        return customerService.getCustomerById(id);
    }
    @GetMapping
    public List<Customers> getAllCustomers(){

        return customerService.getAllCustomers();
    }
}
