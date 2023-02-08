package com.example.msy.service;

import com.example.msy.dao.CustomersRepository;
import com.example.msy.entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  implements  CustomerService{

    @Autowired
    private CustomersRepository customersRepository;
    @Override
    public Customers findFirstByPhone(String phone) {

        Customers result = customersRepository.findFirstByPhone(phone);
        return result;
    }
}
