package com.example.msy.dao;

import com.example.msy.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
   Customers findFirstByPhone(String phone);


}