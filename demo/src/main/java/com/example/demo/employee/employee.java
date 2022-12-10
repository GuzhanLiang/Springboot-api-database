package com.example.demo.employee;

import java.time.LocalDate;

public class employee {
    private Long id;
    private String name;
    private String email;
    private LocalDate startyear;
    private String department;

    public employee() {

    }

    public employee(Long id,
            String name,
            String email,
            LocalDate startyear,
            String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.startyear = startyear;
        this.department = department;

    }

    public employee(
            String name,
            String email,
            LocalDate startyear,
            String department) {

        this.name = name;
        this.email = email;
        this.startyear = startyear;
        this.department = department;

    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public LocalDate getstartyear() {
        return startyear;
    }

    public void setstartyear(LocalDate startyear) {
        this.startyear = startyear;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "employee{" +
                "id" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", startyear=" + startyear +
                ", department=" + department + '}';
    }

}
