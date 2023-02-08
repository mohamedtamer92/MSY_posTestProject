package com.example.msy.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_id")
    private Long id;

    @Column(name = "Day")
    private Date day;


    @Column(name = "Name")
    private String name;


    @Column(name = "Phone")
    private String phone ;

    @Column(name = "Discount")
    private Double discount;


    public Customers() {
    }

    public Customers(Long id, Date day, String name, String phone, Double discount) {
        this.id = id;
        this.day = day;
        this.name = name;
        this.phone = phone;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", day=" + day +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", discount=" + discount +
                '}';
    }
}
