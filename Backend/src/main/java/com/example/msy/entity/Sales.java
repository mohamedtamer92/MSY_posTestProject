package com.example.msy.entity;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sale_id")
    private int saleId;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "Product_id")
    private Products product;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "Invoice_id")
    private Invoice invoice;

    @Column(name = "Name")
    private String productName;
    @Column(name = "Price")
    private int price;
    @Column(name = "Discount")
    private int discount;
    @Column(name="Totalprice")
    private int totalPrice;
    @Column(name = "Number")
    private int number;

    public Sales(Products product, Invoice invoice, String productName, int price, int discount, int totalPrice, int number) {
        this.product = product;
        this.invoice = invoice;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.number = number;
    }

    public Sales(int saleId, Products product, Invoice invoice, String productName, int price, int discount, int totalPrice, int number) {
        this.saleId = saleId;
        this.product = product;
        this.invoice = invoice;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.totalPrice = totalPrice;
        this.number = number;
    }

    public Sales() {

    }



    public int getSaleId() {
        return saleId;
    }

    public Products getProduct() {
        return product;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    @Override
    public String toString() {
        return "Sales{" +
                "saleId=" + saleId +
                ", product=" + product +
                ", invoice=" + invoice +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                ", number=" + number +
                '}';
    }
}
