package com.example.msy.service;

import com.example.msy.entity.Customers;

public interface CustomerService {

    Customers findFirstByPhone(String phone);
}
