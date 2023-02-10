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

    public boolean customerPhoneExist(String phone){
        List<Customers> customers = getAllCustomers();

        for (int i = 0 ; i < customers.size() ; i++){
            if(customers.get(i).getPhone().equals(phone)){
                return true;
            }
        }
        return false;
    }
    @Override
    public Customers getCustomerById(int customerId) {
        return customersRepo.getCustomerById(customerId);
    }

    @Override
    public Customers getCustomerByPhone(String phone) {
        if(customerPhoneExist(phone))
        return customersRepo.getCustomerByPhone(phone);
        else return null;
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customersRepo.getAllCustomers();
    }

    @Override
    public boolean addCustomer(Customers customer) {
        return false;
    }

    @Override
    public boolean updateCustomer(Customers customer) {
        return false;
    }

    @Override
    public boolean deleteCustomerById(int customerId) {
        return false;
    }
}
