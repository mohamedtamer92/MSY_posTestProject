package com.example.msy.dao;

import com.example.msy.entity.Customers;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.sql.Date;
import java.util.List;

@Repository
public class CustomerRepoImpel implements CustomerRepo{
    private EntityManager entityManager;

    @Autowired
    public CustomerRepoImpel(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    public Customers getCustomerById(int id){
        Session currentSession = entityManager.unwrap(Session.class);
        Customers customer = currentSession.get(Customers.class,id);
        return customer;
    }


    @Override
    public Customers getCustomerByPhone(String phone) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Customers> query = currentSession.createQuery("from Customers where Phone = :phone",Customers.class);
        query.setParameter("phone",phone);
        Customers customer = query.getSingleResult();
        return customer;
    }

    @Override
    public List<Customers> getAllCustomers() {
       Session currentSession = entityManager.unwrap(Session.class);
       Query<Customers> query = currentSession.createQuery("from Customers",Customers.class);
       List<Customers> customers = query.getResultList();

        return customers;
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
