package com.example.msy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @Column(name="Product_id")
    private int productId;
    @Column(name="Name")
    private String name;
    @Column(name="Price")
    private String price;
    @Column(name="Discount")
    private int discount;
    @Column(name="Stock")
    private int stock;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy="product" ,cascade=  {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Sales> salesOfProduct ;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy="product" ,cascade=  {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Receive> receivesOfProduct ;

    public Products(int productId, String name, String price, int discount, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
    }

    public Products(String name, String price, int discount, int stock) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
    }

    public Products() {
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", discount=" + discount +
                ", stock=" + stock +
                '}';
    }
}
