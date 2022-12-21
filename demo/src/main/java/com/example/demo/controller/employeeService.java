package com.example.demo.controller;

//import java.time.LocalDate;
//import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.employee.employee;
import com.example.demo.employee.employeeRepository;

import jakarta.transaction.Transactional;

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

    public void addNewemployee(employee employee) {
        Optional<employee> studenOptional = employeerepository.findemployeeByEmail(employee.getemail());
        if (studenOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        employeerepository.save(employee);
    }

    public void deleteemployee(Long employeeId) {

        boolean exists = employeerepository.existsById(employeeId);
        if (!exists) {
            throw new IllegalStateException(
                    "employee with id " + employeeId + "does not exist");
        } else {
            employeerepository.deleteById(employeeId);
        }
    }

    @Transactional
    public void updateemployee(Long employeeId, String name, String email) {
        employee empolyee = employeerepository.findById(employeeId)
                .orElseThrow(() -> new IllegalStateException(
                        "employee with id " + employeeId + "does not exist"));
        if (name != null && name.length() > 0 && !Objects.equals(empolyee.getname(), name)) {
            empolyee.setname(name);
        }
        if (email != null && email.length() > 0 && !Objects.equals(empolyee.getemail(), email)) {
            Optional<employee> employeeOptional = employeerepository.findemployeeByEmail(email);

            if (employeeOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            empolyee.setemail(email);
        }
    }

}
