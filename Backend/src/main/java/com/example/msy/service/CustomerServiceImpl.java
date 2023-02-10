package com.example.msy.service;

import com.example.msy.dao.CustomerRepo;
import com.example.msy.entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl  implements  CustomerService{

    private CustomerRepo customersRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customersRepo){
        this.customersRepo = customersRepo;
    }

    @Override
    public Customers getCustomerById(int id) {
        System.out.println("From Services : "+id);
        Customers c = customersRepo.getCustomerById(id);
        System.out.println("From Data : "+c.getId());
        return c;
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customersRepo.getCustomers();
    }

    @Override
    public Customers findFirstByPhone(String phone) {
        return null;
    }
}
