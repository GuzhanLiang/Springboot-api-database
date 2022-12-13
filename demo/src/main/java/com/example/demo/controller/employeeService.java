package com.example.demo.controller;

//import java.time.LocalDate;
//import java.time.Month;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.employee.employee;
import com.example.demo.employee.employeeRepository;

@Service
public class employeeService {

    private final employeeRepository employeerepository;

    // @Autowired
    employeeService(employeeRepository employeerepository) {
        this.employeerepository = employeerepository;
    }

    public List<employee> getemployee() {
        return employeerepository.findAll();
    }
}
