package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class employeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(employeeRepository repository) {

        return args -> {

            employee john = new employee(
                    1L,
                    "john",
                    "john.john.google.com",
                    LocalDate.of(2000, Month.JANUARY, 5));
            employee alex = new employee(
                    2L,
                    "alex",
                    "alex.alex.google.com",
                    LocalDate.of(2004, Month.JANUARY, 2));
            repository.saveAll(
                    List.of(john, alex));
            // repository.saveAll(List.of(alex));
        };
    }
}
