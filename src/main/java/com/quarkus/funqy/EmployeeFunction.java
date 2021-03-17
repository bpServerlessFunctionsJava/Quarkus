package com.quarkus.funqy;

import io.quarkus.funqy.Funq;

import javax.inject.Inject;

public class EmployeeFunction {

    @Inject
    EmployeeService service;

    @Inject
    EmployeeRepository employeeRepository;

    @Funq()
    public Iterable<Employee> getEmployees() {
        employeeRepository.saveAll(service.getEmployees());
        return employeeRepository.findAll();
    }
}
