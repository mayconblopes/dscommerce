package com.mike.dscommerce.entities;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birgDate;
    private String password;

    public User(){}

    public User(Long id, String name, String email, String phone, LocalDate birgDate, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birgDate = birgDate;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirgDate() {
        return birgDate;
    }

    public void setBirgDate(LocalDate birgDate) {
        this.birgDate = birgDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
