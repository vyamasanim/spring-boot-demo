package com.murali.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

    private String firstName;
    private String lastName;
    private String country;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
