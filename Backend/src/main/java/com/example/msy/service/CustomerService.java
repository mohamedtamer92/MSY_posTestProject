package com.example.msy.service;

import com.example.msy.entity.Customers;

import java.util.List;

public interface CustomerService {
    Customers getCustomerById(int id);
    List<Customers> getAllCustomers();
    Customers findFirstByPhone(String phone);
}
