package com.example.msy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_id")
    private int userId;
    @Column(name="Name")
    private String name;
    @Column(name="Password")
    private String password;
    @Column(name="Group_id")
    private int groupId;
    @Column(name = "Connected")
    private int connected;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY,mappedBy="user" ,cascade=  {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Invoice> userInvoices ;

    public Users() {
    }

    public Users(String name, String password, int groupId, int connected) {
        this.name = name;
        this.password = password;
        this.groupId = groupId;
        this.connected = connected;
    }

    public Users(int userId, String name, String password, int groupId, int connected) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.groupId = groupId;
        this.connected = connected;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getConnected() {
        return connected;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", groupId=" + groupId +
                ", connected=" + connected +
                '}';
    }
}
