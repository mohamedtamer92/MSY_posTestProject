package com.example.msy.dao;

import com.example.msy.entity.Customers;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepo {

    Customers getCustomerById(int id);
    List<Customers> getCustomers();
}
