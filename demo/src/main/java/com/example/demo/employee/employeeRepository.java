package com.example.demo.employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

//@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {

    @Query("SELECT s FROM employee s WHERE s.email = ?1")
    Optional<employee> findemployeeByEmail(String email);
}
