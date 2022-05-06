package com.example.demo.customer;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class Customer {

    private Long id;
    private String name;
    private LocalDate inspectionDate;
    private String email;

    public Customer(Long id,
                    String name,
                    LocalDate inspectionDate,
                    String email) {
        this.id = id;
        this.name = name;
        this.inspectionDate = inspectionDate;
        this.email = email;
    }

    public Customer(String name,
                    LocalDate inspectionDate,
                    String email) {
        this.name = name;
        this.inspectionDate = inspectionDate;
        this.email = email;
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

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inspectionDate=" + inspectionDate +
                ", email='" + email + '\'' +
                '}';
    }
}
