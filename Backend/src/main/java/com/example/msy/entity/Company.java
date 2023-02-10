package com.example.msy.entity;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name= "company_data")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Company_id")
    private int companyId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Invoice_text")
    private String invoiceText;
    @Column(name="Branch_name")
    private String branchName;
    @Column(name = "Tax_text")
    private String taxText;

    public Company() {
    }

    public Company(String name, String invoiceText, String branchName, String taxText) {
        this.name = name;
        this.invoiceText = invoiceText;
        this.branchName = branchName;
        this.taxText = taxText;
    }

    public Company(int companyId, String name, String invoiceText, String branchName, String taxText) {
        this.companyId = companyId;
        this.name = name;
        this.invoiceText = invoiceText;
        this.branchName = branchName;
        this.taxText = taxText;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvoiceText(String invoiceText) {
        this.invoiceText = invoiceText;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setTaxText(String taxText) {
        this.taxText = taxText;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }

    public String getInvoiceText() {
        return invoiceText;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getTaxText() {
        return taxText;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", name='" + name + '\'' +
                ", invoiceText='" + invoiceText + '\'' +
                ", branchName='" + branchName + '\'' +
                ", taxText='" + taxText + '\'' +
                '}';
    }
}
