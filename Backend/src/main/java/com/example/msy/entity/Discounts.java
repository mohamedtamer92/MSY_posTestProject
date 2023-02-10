package com.example.msy.entity;

import javax.persistence.*;

@Entity
@Table(name = "discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Discount_id")
    private int discountId;
    @Column(name = "description")
    private String description;
    @Column(name = "Start_date")
    private String startDate;
    @Column(name = "End_date")
    private String endDate;
    @Column(name = "Percentage")
    private int percentage;
    @Column(name = "Value")
    private int value;

    public Discounts() {
    }

    public Discounts(String description, String startDate, String endDate, int percentage, int value) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.percentage = percentage;
        this.value = value;
    }

    public Discounts(int discountId, String description, String startDate, String endDate, int percentage, int value) {
        this.discountId = discountId;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.percentage = percentage;
        this.value = value;
    }

    public int getDiscountId() {
        return discountId;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getPercentage() {
        return percentage;
    }

    public int getValue() {
        return value;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Discounts{" +
                "discountId=" + discountId +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", percentage=" + percentage +
                ", value=" + value +
                '}';
    }
}
