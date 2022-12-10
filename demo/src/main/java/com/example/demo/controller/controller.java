package com.example.demo.controller;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.employee;

@RestController
@RequestMapping(path = "/api/v1/employee")
public class controller {

    private final employeeService employeeservice;

    @Autowired
    public controller(employeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping
    public List<employee> getemployee() {
        return employeeservice.getemployee();
    }
}
