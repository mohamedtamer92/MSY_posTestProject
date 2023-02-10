package com.example.msy.entity;

import javax.persistence.*;

@Entity
@Table(name = "day")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Day_id")
    private int dayId;
    @Column(name = "Date")
    private String date;
    @Column(name = "Income")
    private int income;

    public Day() {
    }

    public Day(String date, int income) {
        this.date = date;
        this.income = income;
    }

    public Day(int dayId, String date, int income) {
        this.dayId = dayId;
        this.date = date;
        this.income = income;
    }

    public void setDayId(int dayId) {
        this.dayId = dayId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getDayId() {
        return dayId;
    }

    public String getDate() {
        return date;
    }

    public int getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Day{" +
                "dayId=" + dayId +
                ", date='" + date + '\'' +
                ", income=" + income +
                '}';
    }
}
