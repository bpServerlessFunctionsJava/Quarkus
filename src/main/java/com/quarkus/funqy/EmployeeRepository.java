package com.quarkus.funqy;

import org.springframework.data.repository.CrudRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}