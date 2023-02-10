package com.example.msy.dao;

import com.example.msy.entity.Customers;

import java.util.List;


public interface CustomerRepo {

    Customers getCustomerById(int customerId);
    Customers getCustomerByPhone(String phone);
    List<Customers> getAllCustomers();
    boolean addCustomer(Customers customer);
    boolean updateCustomer(Customers customer);
    boolean deleteCustomerById(int customerId);

}
