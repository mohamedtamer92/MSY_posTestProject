package com.example.msy.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @NonNull
    @GeneratedValue( strategy =GenerationType.IDENTITY)
    @Column(name = "Customer_id")
    private int id;

    @Column(name = "Day")
    private String day;


    @Column(name = "Name")
    private String name;


    @Column(name = "Phone")
    private String phone ;

    @Column(name = "Discount")
    private Double discount;


    public Customers() {
    }

    public Customers(int id, String day, String name, String phone, Double discount) {
        this.id = id;
        this.day = day;
        this.name = name;
        this.phone = phone;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
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
