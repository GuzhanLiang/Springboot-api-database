package com.example.demo.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.employee.employee;

@Service
public class employeeService {
    public List<employee> getemployee() {
        return List.of(
                new employee(
                        1l,
                        "john",
                        "john.123google.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "Sales"

                ));
    }
}
