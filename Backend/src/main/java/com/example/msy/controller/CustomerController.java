package com.example.msy.controller;


import com.example.msy.entity.Customers;
import com.example.msy.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Customers findCustomerByPhone(@RequestParam String phone){

        return customerService.findFirstByPhone(phone);
    }
}
