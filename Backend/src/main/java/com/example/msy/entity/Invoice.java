package com.example.msy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Invoice_id")
    private int invoiceId;
    @Column(name="Day")
    private String day;
    @Column(name = "Subtotal")
    private int subTotal;
    @Column(name = "Discount")
    private int discount;
    @Column(name="Total")
    private int total;
    @Column(name = "Discount_type")
    private int discountType;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "Customer_id")
    private Customers customer;


    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "User_id")
    private Users user;


    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "Promo_id")
    private Promo promo;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy="invoice" ,cascade=  {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Sales> salesOfInvoice ;

    public Invoice(int invoiceId, String day, int subTotal, int discount, int total, int discountType, Customers customer, Users user, Promo promo) {
        this.invoiceId = invoiceId;
        this.day = day;
        this.subTotal = subTotal;
        this.discount = discount;
        this.total = total;
        this.discountType = discountType;
        this.customer = customer;
        this.user = user;
        this.promo = promo;
    }

    public Invoice(String day, int subTotal, int discount, int total, int discountType, Customers customer, Users user, Promo promo) {
        this.day = day;
        this.subTotal = subTotal;
        this.discount = discount;
        this.total = total;
        this.discountType = discountType;
        this.customer = customer;
        this.user = user;
        this.promo = promo;
    }

    public Invoice() {
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setDiscountType(int discountType) {
        this.discountType = discountType;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setPromo(Promo promo) {
        this.promo = promo;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public String getDay() {
        return day;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public int getDiscount() {
        return discount;
    }

    public int getTotal() {
        return total;
    }

    public int getDiscountType() {
        return discountType;
    }

    public Customers getCustomer() {
        return customer;
    }

    public Users getUser() {
        return user;
    }

    public Promo getPromo() {
        return promo;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", day='" + day + '\'' +
                ", subTotal=" + subTotal +
                ", discount=" + discount +
                ", total=" + total +
                ", discountType=" + discountType +
                ", customer=" + customer +
                ", user=" + user +
                ", promo=" + promo +
                '}';
    }
}
