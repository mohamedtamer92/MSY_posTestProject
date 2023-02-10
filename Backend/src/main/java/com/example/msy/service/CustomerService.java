package com.example.msy.service;

import com.example.msy.entity.Customers;

import java.util.List;

public interface CustomerService {
    Customers getCustomerById(int customerId);
    Customers getCustomerByPhone(String phone);
    List<Customers> getAllCustomers();
    boolean addCustomer(Customers customer);
    boolean updateCustomer(Customers customer);
    boolean deleteCustomerById(int customerId);
}
