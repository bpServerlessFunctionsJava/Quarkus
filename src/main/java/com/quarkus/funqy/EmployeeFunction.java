package com.quarkus.funqy;

import io.quarkus.funqy.Funq;

import javax.inject.Inject;

public class EmployeeFunction {

    @Inject
    EmployeeRepository employeeRepository;

    @Funq()
    public Iterable<Employee> getEmployees(Input input) {
        return employeeRepository.findAll();
    }
}
