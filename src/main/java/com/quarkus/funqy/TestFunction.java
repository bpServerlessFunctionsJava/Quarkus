package com.quarkus.funqy;

import io.quarkus.funqy.Funq;

import javax.inject.Inject;
import java.util.List;

public class TestFunction {

    @Inject
    PersonService service;

    @Funq()
    public List<Employee> getEmployees() {
        return service.getEmployees();
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
