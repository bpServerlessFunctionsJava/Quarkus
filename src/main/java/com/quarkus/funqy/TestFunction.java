package com.quarkus.funqy;

import io.quarkus.funqy.Funq;

import javax.inject.Inject;
import java.util.List;

public class TestFunction {

    @Inject
    PersonService service;

    @Inject
    EmployeeRepository employeeRepository;

    @Funq()
    public Iterable<Employee> getEmployees() {
        employeeRepository.saveAll(service.getEmployees());
        return employeeRepository.findAll();
    }

    /*@Funq
    public String toUpperCase(String name){
        return name.toUpperCase();
    }

    @Funq
    public String toLowerCase(String name){
        return name.toLowerCase();
    }*/
}
