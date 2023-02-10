package com.example.msy.entity;

import javax.persistence.*;

@Entity
@Table(name = "receive")
public class Receive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Receive_id")
    private int receiveId;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "Product_id")
    private Products product;

    @Column(name = "Day")
    private String day;
    @Column(name = "Amount")
    private int amount;
}
