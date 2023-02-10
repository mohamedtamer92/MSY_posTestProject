package com.example.msy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "promo")
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Promo_id")
    private int promoId;
    @Column(name = "Promo")
    private String promoCode;
    @Column(name = "Description")
    private String description;
    @Column(name = "GreaterThan")
    private int greaterThan;
    @Column(name = "Percentage")
    private int percentage;
    @Column(name = "Value")
    private int value;
    @Column(name= "Start_date")
    private String startDate;
    @Column(name = "End_date")
    private String endDate;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy="promo" ,cascade=  {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Invoice> promoInvoices ;


    public Promo() {
    }

    public Promo(String promoCode, String description, int greaterThan, int percentage, int value, String startDate, String endDate) {
        this.promoCode = promoCode;
        this.description = description;
        this.greaterThan = greaterThan;
        this.percentage = percentage;
        this.value = value;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promo(int promoId, String promoCode, String description, int greaterThan, int percentage, int value, String startDate, String endDate) {
        this.promoId = promoId;
        this.promoCode = promoCode;
        this.description = description;
        this.greaterThan = greaterThan;
        this.percentage = percentage;
        this.value = value;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setPromoId(int promoId) {
        this.promoId = promoId;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGreaterThan(int greaterThan) {
        this.greaterThan = greaterThan;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPromoId() {
        return promoId;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getDescription() {
        return description;
    }

    public int getGreaterThan() {
        return greaterThan;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getValue() {
        return value;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Promo{" +
                "promoId=" + promoId +
                ", promoCode='" + promoCode + '\'' +
                ", description='" + description + '\'' +
                ", greaterThan=" + greaterThan +
                ", percentage=" + percentage +
                ", value=" + value +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
