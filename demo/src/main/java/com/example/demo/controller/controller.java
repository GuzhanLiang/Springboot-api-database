package com.example.demo.controller;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.employee;

@RestController
@RequestMapping(path = "/api/v1/employee")
public class controller {

    private final employeeService employeeservice;

    // @Autowired
    public controller(employeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    @GetMapping
    public List<employee> getemployee() {
        return employeeservice.getemployee();
    }

    @PostMapping
    public void registerNewEmployee(@RequestBody employee employee) {
        employeeservice.addNewemployee(employee);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteemployee(@PathVariable("studentId") Long employeeId) {
        employeeservice.deleteemployee(employeeId);
    }

    @PutMapping(path = "{employeeId}")
    public void updateemployee(
            @PathVariable("employeeId") Long employeeId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email)

    {
        employeeservice.updateemployee(employeeId, name, email);

    }
}
