package com.example.springbootsql.teacher.model;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstNAme;
    private String middleName;
    private String lastName;
    private String address;
    private String mobileNo;
    private String emailId;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;}
    public void setMiddleName(String middleName) {
        this.middleName = middleName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;}
    public void setAddress(String address) {
        this.address = address;}
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;}
    public void setEmailId(String emailId) {
        this.emailId = emailId;}

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }
}
